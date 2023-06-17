/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.entidades.Perdas;
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
public class PerdasDao extends AbstractDaoImpl<Perdas>{
    Mensagens mensagem = new Mensagens();
    private Connection connection;
    private Logger logger = Logger.getLogger("ProdutoDao");
    ResultSet rs;
    PreparedStatement stmt;

    public PerdasDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "tbperdas";
    }
    
    @Override
    public List<Perdas> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbperdas_lote)";
        List<Perdas> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Perdas perdas = mapResultSetToEntity(rs);
                retorno.add(perdas);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }

    @Override
    protected Perdas mapResultSetToEntity(ResultSet rs) {
        try{
            Perdas perdas = new Perdas(
                rs.getInt("tbperdas_lote"),
                rs.getString("tblotes_indicador"),
                rs.getString("tbperdas_descricao_motivo"),    
                rs.getInt("tbperdas_contagem_perdas"),
                rs.getString("tbperdas_data_contagem")   
            );
            perdas.setIdRegistroPerdas(rs.getInt("tbperdas_codigo"));
            return perdas;
        }catch (SQLException ex) {
            mensagem.errorMessage("Erro", "Erro ao criar registro de perda: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public boolean inserir(Perdas perdas) {
        String sql = "INSERT INTO tbperdas(tbperdas_lote, tbperdas_descricao_motivo, tbperdas_contagem_perdas, tbperdas_data_contagem)";
        sql += " VALUES(?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, perdas.getCodLote());
            stmt.setString(2, perdas.getDescricaoMotivo());
            stmt.setInt(3, perdas.getContagemPerdas());
            stmt.setString(4, perdas.getDataContagem());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }
    
    @Override
    protected List<Perdas> buscarPorCodigo(int codigo) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbperdas_lote)";
        sql += " WHERE tbperdas_codigo = ?";
        List<Perdas> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               Perdas perdas = mapResultSetToEntity(rs);
               retorno.add(perdas);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
    
    public List<Perdas> buscarPorCodigoDoLote(int codigo) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbperdas_lote)";
        sql += " WHERE tbperdas_lote = ?";
        List<Perdas> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               Perdas perdas = mapResultSetToEntity(rs);
               retorno.add(perdas);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
    
    public List<Perdas> buscarPorNome(String nome) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbperdas_lote)";
        sql += " WHERE tblotes_indicador LIKE ?";
        List<Perdas> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Perdas perdas = mapResultSetToEntity(rs);
                retorno.add(perdas);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }
    
    public int buscaQuantidadeDeFrangosDoLote(int codigo) {
        String sql = "SELECT tblotes_qtd_frangos FROM  tblotes";
        sql += " WHERE tblotes_codigo = ?";
        int retorno = 0;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
                ResultSet resultSet = rs;
                retorno = resultSet.getInt("tblotes_qtd_frangos");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
}
