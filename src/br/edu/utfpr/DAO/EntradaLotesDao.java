/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import br.edu.utfpr.entidades.EntradaLotes;
import br.edu.utfpr.entidades.RelatorioLote;
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
            mensagem.errorMessage("Erro", "Erro ao criar lote: " + ex.getMessage());
            return null;
        }
    }
    
    protected RelatorioLote mapResultSetToEntity_Relatorio(ResultSet rs) {
        try{
            RelatorioLote relatorioLote = new RelatorioLote(
                rs.getInt("idLote"),
                rs.getString("identificador"),
                rs.getString("propriedade"),
                rs.getString("granja"),
                rs.getInt("quantidadeFrangos"),
                rs.getInt("somaPerdas"), 
                rs.getFloat("valorEntradaLote"),
                rs.getFloat("valorCustosLote"),
                rs.getFloat("valorSaidaLote"),
                rs.getString("dataEntrada"),
                rs.getString("dataSaida")
            );
            return relatorioLote;
        }catch (SQLException ex) {
            mensagem.errorMessage("Erro", "Erro ao criar granja: " + ex.getMessage());
            return null;
        }
    }
    
    @Override
    public boolean inserir(EntradaLotes entradaLotes) {
        String sql = "INSERT INTO "+getNomeTabela()+"(tblotes_indicador, tblotes_granja, tblotes_qtd_frangos, tblotes_valor_entrada, tblotes_data_entrada)";
        sql += " VALUES(?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, entradaLotes.getIdentificador());
            stmt.setInt(2, entradaLotes.getCodGranja());
            stmt.setFloat(3, entradaLotes.getQuantidadeFrangos());
            stmt.setFloat(4, entradaLotes.getValorEntradaLote());
            stmt.setString(5, entradaLotes.getDataEntrada());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean remover(int id) {
        String sql = "DELETE FROM "+getNomeTabela()+" WHERE tblotes_codigo=?";
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
    public boolean alterar(EntradaLotes entradaLotes) {
        String sql = "UPDATE "+getNomeTabela()+" SET tblotes_indicador=?, tblotes_granja=?, tblotes_qtd_frangos=?, tblotes_valor_entrada=?, tblotes_data_entrada=? WHERE tblotes_codigo=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, entradaLotes.getIdentificador());
            stmt.setInt(2, entradaLotes.getCodGranja());
            stmt.setFloat(3, entradaLotes.getQuantidadeFrangos());
            stmt.setFloat(4, entradaLotes.getValorEntradaLote());
            stmt.setString(5, entradaLotes.getDataEntrada());
            stmt.setInt(6, entradaLotes.getIdLote());
            stmt.execute();
        return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<EntradaLotes> buscarPorCodigo(int codigo) {
        String sql = "SELECT * FROM "+getNomeTabela();
        sql += " INNER JOIN tbgranjas ON (tbgranjas_codigo=tblotes_granja)";
        sql += " WHERE tblotes_codigo = ?";
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
    
    public boolean verificaSaidasDeLotesVinculadas(int codigo) {
        String sql = "SELECT count(tbsaidalote_lote) AS saidasVinculadas FROM tbsaidalote";
        sql += " WHERE tbsaidalote_lote = ?";
        int perdasVinculadas = 0;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               ResultSet resultSet = rs;
               perdasVinculadas = resultSet.getInt("saidasVinculadas");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return perdasVinculadas>0;
    }
    
    public boolean verificaPerdasVinculadas(int codigo) {
        String sql = "SELECT count(tbperdas_codigo) AS perdasVinculadas FROM tbperdas";
        sql += " WHERE tbperdas_lote = ?";
        int perdasVinculadas = 0;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               ResultSet resultSet = rs;
               perdasVinculadas = resultSet.getInt("perdasVinculadas");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return perdasVinculadas>0;
    }
    
    public boolean verificaCustosVinculados(int codigo) {
        String sql = "SELECT count(tbcustos_codigo) AS custosVinculados FROM tbcustos";
        sql += " WHERE tbcustos_lote = ?";
        int custosVinculadas = 0;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               ResultSet resultSet = rs;
               custosVinculadas = resultSet.getInt("custosVinculados");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return custosVinculadas>0;
    }
    
    public int codGranjaPeloCodLote(int codigo) {
        String sql = "SELECT tblotes_granja FROM "+getNomeTabela();
        sql += " WHERE tblotes_codigo = ?";
        int codGranja = 0;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               ResultSet resultSet = rs;
               codGranja = resultSet.getInt("tblotes_granja");
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }  
        return codGranja;
    }
    
    public List<RelatorioLote> buscarRelatorioDeLotePorNome(String nome) {
        String sql = "SELECT tblotes_codigo AS idLote, tblotes_indicador AS identificador, tbpropriedades_nome_propriedade AS propriedade,"
            + " tbgranjas_identificador AS granja, tblotes_qtd_frangos AS quantidadeFrangos, COALESCE(SUM(tbperdas_contagem_perdas), 0) AS somaPerdas,"
            + " tblotes_valor_entrada AS valorEntradaLote, COALESCE(SUM(tbcustos_valor), 0) AS valorCustosLote, COALESCE(tbsaidalote_valor_saida, 0) AS valorSaidaLote,"
            + " tblotes_data_entrada AS dataEntrada, COALESCE(tbsaidalote_data_saida, 'Lote não Finalizado') AS dataSaida"
            + " FROM "+getNomeTabela()
            + " INNER JOIN tbgranjas ON (tbgranjas_codigo=tblotes_granja)"
            + " INNER JOIN tbpropriedades ON (tbpropriedades_codigo=tbgranjas_propriedade)"
            + " LEFT JOIN tbperdas ON (tbperdas_lote=tblotes_codigo)"
            + " LEFT JOIN tbcustos ON (tbcustos_lote=tblotes_codigo)"
            + " LEFT JOIN tbsaidalote ON (tbsaidalote_lote=tblotes_codigo)"
            + " WHERE tblotes_indicador LIKE ?"
            + " GROUP BY idLote, identificador, propriedade, granja, quantidadeFrangos,"
            + " valorEntradaLote, valorSaidaLote, dataEntrada, dataSaida";
       
        List<RelatorioLote> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                RelatorioLote relatorioLote = mapResultSetToEntity_Relatorio(rs);
                retorno.add(relatorioLote);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }
    
    public RelatorioLote buscarRelatorioDeLotePorCodigo(int codigo) {
        String sql = "SELECT tblotes_codigo AS idLote, tblotes_indicador AS identificador, tbpropriedades_nome_propriedade AS propriedade,"
            + " tbgranjas_identificador AS granja, tblotes_qtd_frangos AS quantidadeFrangos, COALESCE(SUM(tbperdas_contagem_perdas), 0) AS somaPerdas,"
            + " tblotes_valor_entrada AS valorEntradaLote, COALESCE(SUM(tbcustos_valor), 0) AS valorCustosLote, COALESCE(tbsaidalote_valor_saida, 0) AS valorSaidaLote,"
            + " tblotes_data_entrada AS dataEntrada, COALESCE(tbsaidalote_data_saida, 'Lote não Finalizado') AS dataSaida"
            + " FROM "+getNomeTabela()
            + " INNER JOIN tbgranjas ON (tbgranjas_codigo=tblotes_granja)"
            + " INNER JOIN tbpropriedades ON (tbpropriedades_codigo=tbgranjas_propriedade)"
            + " LEFT JOIN tbperdas ON (tbperdas_lote=tblotes_codigo)"
            + " LEFT JOIN tbcustos ON (tbcustos_lote=tblotes_codigo)"
            + " LEFT JOIN tbsaidalote ON (tbsaidalote_lote=tblotes_codigo)"
            + " WHERE tblotes_codigo = ?"
            + " GROUP BY idLote, identificador, propriedade, granja, quantidadeFrangos,"
            + " valorEntradaLote, valorSaidaLote, dataEntrada, dataSaida";
       
        RelatorioLote retorno = new RelatorioLote(0, "", "", "", 0, 0, Float.parseFloat("0"), Float.parseFloat("0"), Float.parseFloat("0"), "", "");
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                RelatorioLote relatorioLote = mapResultSetToEntity_Relatorio(rs);
                retorno = relatorioLote;
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        return retorno;
    }
}
