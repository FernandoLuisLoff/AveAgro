package br.edu.utfpr.model;

import br.edu.utfpr.entidades.Granjas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferlo
 */
public class GranjasListModel extends AbstractTableModel {
    private List<Granjas> listaGranjas;
    
    private String[] colunas = new String[]{"Código", "Identificador", "Propriedade", "Data de Inicio das Atividades", "Quantidade de Frangos Suportada"};
    
    
     public GranjasListModel(List<Granjas> listaGranjas) {
        this.listaGranjas = listaGranjas;
    }

    @Override
    public int getRowCount() {
        return listaGranjas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Granjas granja = listaGranjas.get(row);
        switch (column) {
            case 0:
                return granja.getIdGranja();
            case 1:
                return granja.getIdentificador();
            case 2:
                return granja.getPropriedade();
            case 3:
                return granja.getDataIniAtividades();
            case 4:
                return granja.getQuantidadeFrangosSuportada();
            default:
                break;
        }
        return listaGranjas;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Granjas granjas) {
        listaGranjas.add(granjas);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaGranjas.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha,Granjas granjas) {
        listaGranjas.set(indiceLinha, granjas);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
}
