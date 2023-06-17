/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.entidades.Custos;
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
public class CustosDao extends AbstractDaoImpl<Custos>{
    Mensagens mensagem = new Mensagens();
    private Connection connection;
    private Logger logger = Logger.getLogger("ProdutoDao");
    ResultSet rs;
    PreparedStatement stmt;

    public CustosDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "tbcustos";
    }
    
    @Override
    public List<Custos> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbcustos_lote)";
        sql += " INNER JOIN tbprodutos ON (tbprodutos_codigo=tbcustos_produto)";
        List<Custos> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Custos custos = mapResultSetToEntity(rs);
                retorno.add(custos);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }

    @Override
    protected Custos mapResultSetToEntity(ResultSet rs) {
        try{
            Custos custos = new Custos(
                rs.getInt("tbcustos_lote"),
                rs.getString("tblotes_indicador"),
                rs.getInt("tbcustos_produto"),
                rs.getString("tbprodutos_produto"),
                rs.getFloat("tbcustos_qtd"),    
                rs.getFloat("tbcustos_valor"),
                rs.getString("tbcustos_descricao_motivo"),
                rs.getString("tbcustos_data") 
            );
            custos.setIdRegistroCustos(rs.getInt("tbcustos_codigo"));
            return custos;
        }catch (SQLException ex) {
            mensagem.errorMessage("Erro", "Erro ao criar registro de custo: " + ex.getMessage());
            return null;
        }
    }
    
    @Override
    public boolean inserir(Custos custos) {
        String sql = "INSERT INTO tbcustos(tbcustos_lote, tbcustos_produto, tbcustos_qtd, tbcustos_valor, tbcustos_descricao_motivo, tbcustos_data)";
        sql += " VALUES(?, ?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, custos.getCodLote());
            stmt.setInt(2, custos.getCodProduto());
            stmt.setFloat(3, custos.getQuantidade());
            stmt.setFloat(4, custos.getvalor());
            stmt.setString(5, custos.getDescricaoMotivo());
            stmt.setString(6, custos.getData());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }

    @Override
    protected List<Custos> buscarPorCodigo(int codigo) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbcustos_lote)";
        sql += " INNER JOIN tbprodutos ON (tbprodutos_codigo=tbcustos_produto)";
        sql += " WHERE tbcustos_codigo = ?";
        List<Custos> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               Custos custos = mapResultSetToEntity(rs);
               retorno.add(custos);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
    
    public List<Custos> buscarPorNome(String nome) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tblotes ON (tblotes_codigo=tbcustos_lote)";
        sql += " INNER JOIN tbprodutos ON (tbprodutos_codigo=tbcustos_produto)";
        sql += " WHERE tblotes_indicador LIKE ?";
        List<Custos> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Custos custos = mapResultSetToEntity(rs);
                retorno.add(custos);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }
    
    public int buscaValorProduto(int codigo) {
        String sql = "SELECT tbprodutos_valor FROM tbprodutos";
        sql += " WHERE tbprodutos_codigo = ?";
        int retorno = 0;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
                ResultSet resultSet = rs;
                retorno = resultSet.getInt("tbprodutos_valor");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
}
