/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.DAO;

import java.util.logging.Logger;
import java.sql.*;
        
/**
 *
 * @author ferlo
 */
public class ConexaoDao {
    Connection conexao;
    private static ConexaoDao instancia = null;
    
    private Logger logger = Logger.getLogger("ConexaoDao");
    
    public ConexaoDao() {
        try {
            String url = "jdbc:postgresql://localhost:5432/AveAgro";
            String usuario = "postgres";
            String senha = "postgres";

            conexao = DriverManager.getConnection(url,usuario,senha);
            logger.info("Conexão com banco de dados estabelecida");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    static ConexaoDao getInstance() {
        if (instancia == null) {
            instancia = new ConexaoDao();
        }
        return instancia;
    }
    
    public Connection getConexao() {
        return conexao;
    }
    
    public void fecharConexao() {
        try {
            if (conexao != null) {
                conexao.close();
                logger.info("Conexão com banco de dados fechada");
            }
        } catch (SQLException e) {
            logger.warning("Erro ao fechar conexão com banco de dados: " + e.getMessage());
        }
    }
}
