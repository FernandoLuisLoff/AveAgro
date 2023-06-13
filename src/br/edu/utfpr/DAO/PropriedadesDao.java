/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.entidades.Propriedades;
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
public class PropriedadesDao extends AbstractDaoImpl<Propriedades>{
    Mensagens mensagem = new Mensagens();
    private Connection connection;
    private Logger logger = Logger.getLogger("ProdutoDao");
    ResultSet rs;
    PreparedStatement stmt;

    public PropriedadesDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "tbpropriedades";
    }
    
    @Override
    public List<Propriedades> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        List<Propriedades> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Propriedades propriedade = mapResultSetToEntity(rs);
                retorno.add(propriedade);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }

    @Override
    protected Propriedades mapResultSetToEntity(ResultSet rs) {
        try{
            Propriedades propriedades = new Propriedades(
                rs.getString("tbpropriedades_nome_propriedade"),
                rs.getString("tbpropriedades_data_aquisicao"),
                rs.getString("tbpropriedades_cep"),
                rs.getString("tbpropriedades_cidade"),
                rs.getString("tbpropriedades_estado"),
                rs.getString("tbpropriedades_bairro"),
                rs.getString("tbpropriedades_endereco"),
                rs.getString("tbpropriedades_numero"),
                rs.getString("tbpropriedades_complemento")
            );
            propriedades.setIdPropriedades(rs.getInt("tbpropriedades_codigo"));
            return propriedades;
        }catch (SQLException ex) {
            mensagem.errorMessage("Erro", "Erro ao criar propriedade: " + ex.getMessage());
            return null;
        }
    }

    @Override
    protected List<Propriedades> buscarPorCodigo(int codigo) {
        String sql = "SELECT * FROM produtos WHERE codigo = ?";
        List<Propriedades> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               Propriedades propriedades = mapResultSetToEntity(rs);
               retorno.add(propriedades);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
    
    public List<Propriedades> buscarPorNome(String nome) {
        String sql = "SELECT * FROM produtos WHERE nome LIKE ?";
        List<Propriedades> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Propriedades propriedades = mapResultSetToEntity(rs);
                retorno.add(propriedades);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }
}
