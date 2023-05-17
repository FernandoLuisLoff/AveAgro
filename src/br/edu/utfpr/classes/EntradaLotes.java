/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author ferlo
 */
public class EntradaLotes {
    Integer idLote;
    String identificador;
    Integer granja;
    Integer quantidadeFrangos;
    Float valorEntradaLote;
    String dataEntrada;
    
    public EntradaLotes(String identificador, Integer granja, Integer quantidadeFrangos,
    Float valorEntradaLote, String dataEntrada) {
        this.identificador = identificador;
        this.granja = granja;
        this.quantidadeFrangos = quantidadeFrangos;
        this.valorEntradaLote = valorEntradaLote;
        this.dataEntrada = dataEntrada;
    }
    
    public Integer getIdLote() {
        return idLote;
    }

    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public Integer getGranja() {
        return granja;
    }

    public void setGranja(Integer granja) {
        this.granja = granja;
    }
    
    public Integer getQuantidadeFrangos() {
        return quantidadeFrangos;
    }

    public void setQuantidadeFrangos(Integer quantidadeFrangos) {
        this.quantidadeFrangos = quantidadeFrangos;
    }
    
    public Float getValorEntradaLote() {
        return valorEntradaLote;
    }

    public void setValorEntradaLote(Float valorEntradaLote) {
        this.valorEntradaLote = valorEntradaLote;
    }
    
    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    public void salvar() { 
            
    }
}
