/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.entidades.Granjas;
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
public class GranjasDao extends AbstractDaoImpl<Granjas>{
    Mensagens mensagem = new Mensagens();
    private Connection connection;
    private Logger logger = Logger.getLogger("ProdutoDao");
    ResultSet rs;
    PreparedStatement stmt;

    public GranjasDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "tbgranjas";
    }
    
    @Override
    public List<Granjas> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        sql += " INNER JOIN tbpropriedades ON (tbpropriedades_codigo=tbgranjas_propriedade)";
        List<Granjas> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Granjas granjas = mapResultSetToEntity(rs);
                retorno.add(granjas);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }

    @Override
    protected Granjas mapResultSetToEntity(ResultSet rs) {
        try{
            Granjas granjas = new Granjas(
                rs.getString("tbgranjas_identificador"),
                rs.getInt("tbgranjas_propriedade"),
                rs.getString("tbpropriedades_nome_propriedade"),
                rs.getString("tbgranjas_data_ini_atvs"),
                rs.getInt("tbgranjas_qtd_frangos_suportada")
            );
            granjas.setIdGranja(rs.getInt("tbgranjas_codigo"));
            return granjas;
        }catch (SQLException ex) {
            mensagem.errorMessage("Erro", "Erro ao criar granja: " + ex.getMessage());
            return null;
        }
    }

    @Override
    protected List<Granjas> buscarPorCodigo(int codigo) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tbpropriedades ON (tbpropriedades_codigo=tbgranjas_propriedade)";
        sql += " WHERE tbgranjas_codigo = ?";
        List<Granjas> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               Granjas granjas = mapResultSetToEntity(rs);
               retorno.add(granjas);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
    
    public List<Granjas> buscarPorNome(String nome) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tbpropriedades ON (tbpropriedades_codigo=tbgranjas_propriedade)";
        sql += " WHERE tbgranjas_identificador LIKE ?";
        List<Granjas> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Granjas granjas = mapResultSetToEntity(rs);
                retorno.add(granjas);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }
}
