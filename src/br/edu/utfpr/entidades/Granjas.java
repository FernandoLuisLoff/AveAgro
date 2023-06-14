/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author ferlo
 */
public class Granjas {
    // Variaveis Granja
    Integer idGranja;
    String identificador;
    Integer codPropriedade;
    String propriedade;
    String dataIniAtividades;
    Integer quantidadeFrangosSuportada;
    
    public Granjas(String identificador, Integer codPropriedade, String propriedade, String dataIniAtividades, Integer quantidadeFrangosSuportada) {
        this.identificador = identificador;
        this.codPropriedade = codPropriedade;
        this.propriedade = propriedade;
        this.dataIniAtividades = dataIniAtividades;
        this.quantidadeFrangosSuportada = quantidadeFrangosSuportada;
    }
    
    public Integer getIdGranja() {
        return idGranja;
    }

    public void setIdGranja(Integer idGranja) {
        this.idGranja = idGranja;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public Integer getCodPropriedade() {
        return codPropriedade;
    }
    
    public void setCodPropriedade(Integer codPropriedade) {
        this.codPropriedade = codPropriedade;
    }
    
    public String getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(String propriedade) {
        this.propriedade = propriedade;
    }
    
    public String getDataIniAtividades() {
        return dataIniAtividades;
    }

    public void setDataIniAtividades(String dataIniAtividades) {
        this.dataIniAtividades = dataIniAtividades;
    }
    
    public Integer getQuantidadeFrangosSuportada() {
        return quantidadeFrangosSuportada;
    }

    public void setQuantidadeFrangosSuportada(Integer quantidadeFrangosSuportada) {
        this.quantidadeFrangosSuportada = quantidadeFrangosSuportada;
    }
    
    public void salvar() { 
            
    }
}

