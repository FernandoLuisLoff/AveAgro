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
    public boolean inserir(Granjas granjas) {
        String sql = "INSERT INTO "+getNomeTabela()+"(tbgranjas_identificador, tbgranjas_propriedade, tbgranjas_data_ini_atvs, tbgranjas_qtd_frangos_suportada)";
        sql += " VALUES(?, ?, ?, ?)";
        try {

            stmt = connection.prepareStatement(sql);
            stmt.setString(1, granjas.getIdentificador());
            stmt.setInt(2, granjas.getCodPropriedade());
            stmt.setString(3, granjas.getDataIniAtividades());
            stmt.setInt(4, granjas.getQuantidadeFrangosSuportada());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean remover(int id) {
        String sql = "DELETE FROM "+getNomeTabela()+" WHERE tbgranjas_codigo=?";
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
    public boolean alterar(Granjas granjas) {
        String sql = "UPDATE "+getNomeTabela()+" SET tbgranjas_identificador=?, tbgranjas_propriedade=?, tbgranjas_data_ini_atvs=?, tbgranjas_qtd_frangos_suportada=? WHERE tbgranjas_codigo=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, granjas.getIdentificador());
            stmt.setInt(2, granjas.getCodPropriedade());
            stmt.setString(3, granjas.getDataIniAtividades());
            stmt.setInt(4, granjas.getQuantidadeFrangosSuportada());
            stmt.setInt(5, granjas.getIdGranja());
            stmt.execute();
        return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }
    
    @Override
    public List<Granjas> buscarPorCodigo(int codigo) {
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
    
    public boolean verificaLotesVinculados(int codigo) {
        String sql = "SELECT count(tblotes_codigo) AS lotesVinculados FROM tblotes";
        sql += " WHERE tblotes_granja = ?";
        int lotesVinculadas = 0;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               ResultSet resultSet = rs;
               lotesVinculadas = resultSet.getInt("lotesVinculados");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return lotesVinculadas>0;
    }
    
    public int codPropriedadePeloCodGranja(int codigo) {
        String sql = "SELECT tbgranjas_propriedade FROM "+getNomeTabela();
        sql += " WHERE tbgranjas_codigo = ?";
        int codPropriedade = 0;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               ResultSet resultSet = rs;
               codPropriedade = resultSet.getInt("tbgranjas_propriedade");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return codPropriedade;
    }
}
