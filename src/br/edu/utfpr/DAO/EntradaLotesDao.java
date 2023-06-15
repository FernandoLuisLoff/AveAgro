/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.entidades.EntradaLotes;
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
public class EntradaLotesDao extends AbstractDaoImpl<EntradaLotes>{
    Mensagens mensagem = new Mensagens();
    private Connection connection;
    private Logger logger = Logger.getLogger("ProdutoDao");
    ResultSet rs;
    PreparedStatement stmt;

    public EntradaLotesDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "tblotes";
    }
    
    @Override
    public List<EntradaLotes> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        sql += " INNER JOIN tbgranjas ON (tbgranjas_codigo=tblotes_granja)";
        List<EntradaLotes> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                EntradaLotes entradaLotes = mapResultSetToEntity(rs);
                retorno.add(entradaLotes);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }

    @Override
    protected EntradaLotes mapResultSetToEntity(ResultSet rs) {
        try{
            EntradaLotes entradaLotes = new EntradaLotes(
                rs.getString("tblotes_indicador"),
                rs.getInt("tblotes_granja"),
                rs.getString("tbgranjas_identificador"),
                rs.getInt("tblotes_qtd_frangos"),
                rs.getFloat("tblotes_valor_entrada"),
                rs.getString("tblotes_data_entrada")    
            );
            entradaLotes.setIdLote(rs.getInt("tblotes_codigo"));
            return entradaLotes;
        }catch (SQLException ex) {
            mensagem.errorMessage("Erro", "Erro ao criar granja: " + ex.getMessage());
            return null;
        }
    }

    @Override
    protected List<EntradaLotes> buscarPorCodigo(int codigo) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tbgranjas ON (tbgranjas_codigo=tblotes_granja)";
        sql += " WHERE tblotes_granja = ?";
        List<EntradaLotes> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               EntradaLotes entradaLotes = mapResultSetToEntity(rs);
               retorno.add(entradaLotes);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
    
    public List<EntradaLotes> buscarPorNome(String nome) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tbgranjas ON (tbgranjas_codigo=tblotes_granja)";
        sql += " WHERE tblotes_indicador LIKE ?";
        List<EntradaLotes> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                EntradaLotes entradaLotes = mapResultSetToEntity(rs);
                retorno.add(entradaLotes);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }

}
