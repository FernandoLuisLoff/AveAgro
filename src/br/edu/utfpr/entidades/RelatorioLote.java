/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author ferlo
 */
public class RelatorioLote {
    Integer idLote;
    String identificador;
    String propriedade;
    String granja;
    Integer quantidadeFrangos;
    Integer somaPerdas;
    Float valorEntradaLote;
    Float valorCustosLote;
    Float valorSaidaLote;
    String dataEntrada;
    String dataSaida;
    
    public RelatorioLote(Integer idLote, String identificador, String propriedade, String granja, Integer quantidadeFrangos, Integer somaPerdas,
    Float valorEntradaLote, Float valorCustosLote, Float valorSaidaLote, String dataEntrada, String dataSaida) {
        this.idLote = idLote;
        this.identificador = identificador;
        this.propriedade = propriedade;
        this.granja = granja;        
        this.quantidadeFrangos = quantidadeFrangos;        
        this.somaPerdas = somaPerdas;        
        this.valorEntradaLote = valorEntradaLote;        
        this.valorCustosLote = valorCustosLote; 
        this.valorSaidaLote = valorSaidaLote;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    /**
     * @return the idLote
     */
    public Integer getIdLote() {
        return idLote;
    }

    /**
     * @param idLote the idLote to set
     */
    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the propriedade
     */
    public String getPropriedade() {
        return propriedade;
    }

    /**
     * @param propriedade the propriedade to set
     */
    public void setPropriedade(String propriedade) {
        this.propriedade = propriedade;
    }

    /**
     * @return the granja
     */
    public String getGranja() {
        return granja;
    }

    /**
     * @param granja the granja to set
     */
    public void setGranja(String granja) {
        this.granja = granja;
    }

    /**
     * @return the quantidadeFrangos
     */
    public Integer getQuantidadeFrangos() {
        return quantidadeFrangos;
    }

    /**
     * @param quantidadeFrangos the quantidadeFrangos to set
     */
    public void setQuantidadeFrangos(Integer quantidadeFrangos) {
        this.quantidadeFrangos = quantidadeFrangos;
    }

    /**
     * @return the somaPerdas
     */
    public Integer getSomaPerdas() {
        return somaPerdas;
    }

    /**
     * @param somaPerdas the somaPerdas to set
     */
    public void setSomaPerdas(Integer somaPerdas) {
        this.somaPerdas = somaPerdas;
    }

    /**
     * @return the valorEntradaLote
     */
    public Float getValorEntradaLote() {
        return valorEntradaLote;
    }

    /**
     * @param valorEntradaLote the valorEntradaLote to set
     */
    public void setValorEntradaLote(Float valorEntradaLote) {
        this.valorEntradaLote = valorEntradaLote;
    }

    /**
     * @return the valorCustosLote
     */
    public Float getValorCustosLote() {
        return valorCustosLote;
    }

    /**
     * @param valorCustosLote the valorCustosLote to set
     */
    public void setValorCustosLote(Float valorCustosLote) {
        this.valorCustosLote = valorCustosLote;
    }

    /**
     * @return the valorSaidaLote
     */
    public Float getValorSaidaLote() {
        return valorSaidaLote;
    }

    /**
     * @param valorSaidaLote the valorSaidaLote to set
     */
    public void setValorSaidaLote(Float valorSaidaLote) {
        this.valorSaidaLote = valorSaidaLote;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public String getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
}
