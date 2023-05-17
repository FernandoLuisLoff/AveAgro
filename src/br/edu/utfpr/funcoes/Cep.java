/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.funcoes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author ferlo
 */
public class Cep {
    String logradouro;      
    String bairro;
    String cidade;
    String uf;
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public String getUf() {
        return uf;
    }
    
    public boolean buscarCep(String cep) 
    {
        Mensagens mensagens = new Mensagens();
        
        String json;
        Boolean verificador = true;
        
        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();


            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");


            logradouro = array[7];            
            bairro = array[15];
            cidade = array[19]; 
            uf = array[23];
            
        } catch (Exception e) {
            verificador = false;
            
            mensagens.errorMessage("Campo Inválido", "Preencha um CEP valido");
            throw new RuntimeException(e);
        }
        
        return verificador;
    }
}
