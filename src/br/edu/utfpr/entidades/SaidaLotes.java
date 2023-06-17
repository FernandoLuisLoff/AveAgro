/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author ferlo
 */
public class SaidaLotes {
    Integer idSaidaLote;
    Integer codLote;
    String lote;
    Float valorSaidaLote;
    String dataSaida;
    
    public SaidaLotes(Integer codLote, String lote, Float valorSaidaLote, String dataSaida) {
        this.codLote = codLote;
        this.lote = lote;
        this.valorSaidaLote = valorSaidaLote;
        this.dataSaida = dataSaida;
    }
    
    public Integer getIdSaidaLote() {
        return idSaidaLote;
    }

    public void setIdSaidaLote(Integer idSaidaLote) {
        this.idSaidaLote = idSaidaLote;
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
    
    public Float getValorSaidaLote() {
        return valorSaidaLote;
    }

    public void setValorSaidaLote(Float valorSaidaLote) {
        this.valorSaidaLote = valorSaidaLote;
    }
    
    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
}
