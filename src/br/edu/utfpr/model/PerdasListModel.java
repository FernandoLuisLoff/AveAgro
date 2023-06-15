/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.entidades.Perdas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferlo
 */
public class PerdasListModel extends AbstractTableModel {
    private List<Perdas> listaPerdas;
    
    private String[] colunas = new String[]{"Código", "Lote", "Descrição/Motivo", "Contagem", "Data da Contagem"};
    
    
     public PerdasListModel(List<Perdas> listaPerdas) {
        this.listaPerdas = listaPerdas;
    }

    @Override
    public int getRowCount() {
        return listaPerdas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Perdas perdas = listaPerdas.get(row);
        switch (column) {
            case 0:
                return perdas.getIdRegistroPerdas();
            case 1:
                return perdas.getLote();
            case 2:
                return perdas.getDescricaoMotivo();
            case 3:
                return perdas.getContagemPerdas();
            case 4:
                return perdas.getDataContagem();
            default:
                break;
        }
        return listaPerdas;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Perdas perdas) {
        listaPerdas.add(perdas);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaPerdas.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Perdas perdas) {
        listaPerdas.set(indiceLinha, perdas);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
    
}
