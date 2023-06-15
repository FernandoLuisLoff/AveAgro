/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author ferlo
 */
public class Perdas {
    Integer idRegistroPerdas;
    Integer codLote;
    String lote;
    String descricaoMotivo;
    Integer contagemPerdas;
    String dataContagem;
    
    public Perdas(Integer codLote, String lote, String descricaoMotivo, Integer contagemPerdas, String dataContagem) {
        this.codLote = codLote;
        this.lote = lote;
        this.descricaoMotivo = descricaoMotivo;
        this.contagemPerdas = contagemPerdas;
        this.dataContagem = dataContagem;
    }
    
    public Integer getIdRegistroPerdas() {
        return idRegistroPerdas;
    }

    public void setIdRegistroPerdas(Integer idRegistroPerdas) {
        this.idRegistroPerdas = idRegistroPerdas;
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
    
    public String getDescricaoMotivo() {
        return descricaoMotivo;
    }

    public void setDescricaoMotivo(String descricaoMotivo) {
        this.descricaoMotivo = descricaoMotivo;
    }
    
    public Integer getContagemPerdas() {
        return contagemPerdas;
    }

    public void setContagemPerdas(Integer contagemPerdas) {
        this.contagemPerdas = contagemPerdas;
    }
    
    public String getDataContagem() {
        return dataContagem;
    }

    public void setDataContagem(String dataContagem) {
        this.dataContagem = dataContagem;
    }
    
    public void salvar() { 
            
    }
}
