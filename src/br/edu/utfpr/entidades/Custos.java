/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author ferlo
 */
public class Custos {
    Integer idRegistroCustos;
    Integer lote;
    Integer produto;
    Float quantidade;
    Float valor;
    String descricaoMotivo;
    String data;
    
    public Custos(Integer lote, Integer produto, Float quantidade, Float valor, String descricaoMotivo, String data) {
        this.lote = lote;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.descricaoMotivo = descricaoMotivo;
        this.data = data;
    }
    
    public Integer getIdRegistroCustos() {
        return idRegistroCustos;
    }

    public void setIdRegistroCustos(Integer idRegistroCustos) {
        this.idRegistroCustos = idRegistroCustos;
    }
    
    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }
    
    public Integer getProduto() {
        return produto;
    }

    public void setProduto(Integer produto) {
        this.produto = produto;
    }
    
    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }
    
    public Float getvalor() {
        return valor;
    }

    public void setvalor(Float valor) {
        this.valor = valor;
    }
    
    public String getDescricaoMotivo() {
        return descricaoMotivo;
    }

    public void setDescricaoMotivo(String descricaoMotivo) {
        this.descricaoMotivo = descricaoMotivo;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void salvar() { 
            
    }
}
