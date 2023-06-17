/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.entidades.SaidaLotes;
import br.edu.utfpr.funcoes.Mensagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author ferlo
 */
public class SaidaLotesDao extends AbstractDaoImpl<SaidaLotes>{
    Mensagens mensagem = new Mensagens();
    private Connection connection;
    private Logger logger = Logger.getLogger("ProdutoDao");
    ResultSet rs;
    PreparedStatement stmt;

    public SaidaLotesDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "tbsaidalote";
    }
    
    @Override
    public List<SaidaLotes> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbsaidalote_lote)";
        List<SaidaLotes> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                SaidaLotes saidaLotes = mapResultSetToEntity(rs);
                retorno.add(saidaLotes);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }

    @Override
    protected SaidaLotes mapResultSetToEntity(ResultSet rs) {
        try{
            SaidaLotes saidaLotes = new SaidaLotes(
                rs.getInt("tbsaidalote_lote"),
                rs.getString("tblotes_indicador"),
                rs.getFloat("tbsaidalote_valor_saida"),
                rs.getString("tbsaidalote_data_saida")   
            );
            saidaLotes.setIdSaidaLote(rs.getInt("tbsaidalote_codigo"));
            return saidaLotes;
        }catch (SQLException ex) {
            mensagem.errorMessage("Erro", "Erro ao criar granja: " + ex.getMessage());
            return null;
        }
    }
    
    @Override
    public boolean inserir(SaidaLotes saidaLotes) {
        String sql = "INSERT INTO "+getNomeTabela()+"(tbsaidalote_lote, tbsaidalote_valor_saida, tbsaidalote_data_saida)";
        sql += " VALUES(?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, saidaLotes.getCodLote());
            stmt.setFloat(2, saidaLotes.getValorSaidaLote());
            stmt.setString(3, saidaLotes.getDataSaida());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean remover(int id) {
        String sql = "DELETE FROM "+getNomeTabela()+" WHERE tbsaidalote_codigo=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }
    
    @Override
    protected List<SaidaLotes> buscarPorCodigo(int codigo) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbsaidalote_lote)";
        sql += " WHERE tbsaidalote_codigo = ?";
        List<SaidaLotes> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               SaidaLotes saidaLotes = mapResultSetToEntity(rs);
               retorno.add(saidaLotes);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
    
    public List<SaidaLotes> buscarPorNome(String nome) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbsaidalote_lote)";
        sql += " WHERE tblotes_indicador LIKE ?";
        List<SaidaLotes> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                SaidaLotes saidaLotes = mapResultSetToEntity(rs);
                retorno.add(saidaLotes);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }
}
