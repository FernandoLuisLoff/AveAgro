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
    Integer codLote;
    String lote;
    Integer codProduto;
    String produto;
    Float quantidade;
    Float valor;
    String descricaoMotivo;
    String data;
    
    public Custos(Integer codLote, String lote, Integer codProduto, String produto, Float quantidade, Float valor, String descricaoMotivo, String data) {
        this.codLote = codLote;
        this.lote = lote;
        this.codProduto = codProduto;
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
    
    public Integer getCodLote() {
        return codLote;
    }

    public void setCodLote(Integer codLote) {
        this.codLote = codLote;
    }
    
    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    
    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
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
