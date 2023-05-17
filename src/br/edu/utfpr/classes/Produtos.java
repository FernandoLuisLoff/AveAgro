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
public class Produtos {
    Integer idProdutos;
    String produto;
    String categoria;
    Float quantidadeVolume;
    String unidadeMedida;
    Float valor;
            
    public Produtos(String produto, String categoria, Float quantidadeVolume, String unidadeMedida, Float valor) {
        this.produto = produto;
        this.categoria = categoria;
        this.quantidadeVolume = quantidadeVolume;
        this.unidadeMedida = unidadeMedida;
        this.valor = valor;
    }
    
    public Integer getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(Integer idProdutos) {
        this.idProdutos = idProdutos;
    }
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public Float getQuantidadeVolume() {
        return quantidadeVolume;
    }

    public void setQuantidadeVolume(Float quantidadeVolume) {
        this.quantidadeVolume = quantidadeVolume;
    }
    
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    public void salvar() { 
            
    }
}
