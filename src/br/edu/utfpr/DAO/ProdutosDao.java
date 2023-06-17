/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.entidades.Produtos;
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
public class ProdutosDao extends AbstractDaoImpl<Produtos>{
    Mensagens mensagem = new Mensagens();
    private Connection connection;
    private Logger logger = Logger.getLogger("ProdutoDao");
    ResultSet rs;
    PreparedStatement stmt;

    public ProdutosDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "tbprodutos";
    }
    
    @Override
    public List<Produtos> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        List<Produtos> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos produtos = mapResultSetToEntity(rs);
                retorno.add(produtos);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }

    @Override
    protected Produtos mapResultSetToEntity(ResultSet rs) {
        try{
            Produtos produtos = new Produtos(
                rs.getString("tbprodutos_produto"),
                rs.getString("tbprodutos_categoria"),
                rs.getFloat("tbprodutos_qtd_vol"),
                rs.getString("tbprodutos_un_medida"),
                rs.getFloat("tbprodutos_valor")
            );
            produtos.setIdProdutos(rs.getInt("tbprodutos_codigo"));
            return produtos;
        }catch (SQLException ex) {
            mensagem.errorMessage("Erro", "Erro ao criar produto: " + ex.getMessage());
            return null;
        }
    }
    
    @Override
    public boolean inserir(Produtos produtos) {
        String sql = "INSERT INTO tbprodutos(tbprodutos_produto, tbprodutos_categoria, tbprodutos_qtd_vol, tbprodutos_un_medida, tbprodutos_valor)";
        sql += " VALUES(?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, produtos.getProduto());
            stmt.setString(2, produtos.getCategoria());
            stmt.setFloat(3, produtos.getQuantidadeVolume());
            stmt.setString(4, produtos.getUnidadeMedida());
            stmt.setFloat(5, produtos.getValor());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }

    @Override
    protected List<Produtos> buscarPorCodigo(int codigo) {
        String sql = "SELECT * FROM "+getNomeTabela()+" WHERE tbprodutos_codigo = ?";
        List<Produtos> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               Produtos produtos = mapResultSetToEntity(rs);
               retorno.add(produtos);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return retorno;
    }
    
    public List<Produtos> buscarPorNome(String nome) {
        String sql = "SELECT * FROM "+getNomeTabela()+" WHERE tbprodutos_produto LIKE ?";
        List<Produtos> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos produtos = mapResultSetToEntity(rs);
                retorno.add(produtos);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }
}
