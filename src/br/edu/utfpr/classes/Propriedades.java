/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.classes;

/**
 *
 * @author ferlo
 */
public class Propriedades {
    Integer idPropriedades;
    String nomePropriedade;
    String dataAquisicao;
    String cep;
    String cidade;
    String estado;
    String enderedo;
    String numero;
    String complemento;
    
    public Propriedades(String nomePropriedade, String dataAquisicao, String cep, String cidade,
    String estado, String enderedo, String numero, String complemento) {
        this.nomePropriedade = nomePropriedade;
        this.dataAquisicao = dataAquisicao;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.enderedo = enderedo;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    public Integer getIdPropriedades() {
        return idPropriedades;
    }

    public void setIdPropriedades(Integer idPropriedades) {
        this.idPropriedades = idPropriedades;
    }
    
    public String getNomePropriedade() {
        return nomePropriedade;
    }

    public void setNomePropriedade(String nomePropriedade) {
        this.nomePropriedade = nomePropriedade;
    }
    
    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getEnderedo() {
        return enderedo;
    }

    public void setEnderedo(String enderedo) {
        this.enderedo = enderedo;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public void salvar() { 
            
    }
}
