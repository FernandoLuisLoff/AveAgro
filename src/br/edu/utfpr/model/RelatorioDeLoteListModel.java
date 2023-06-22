/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.entidades.RelatorioLote;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferlo
 */
public class RelatorioDeLoteListModel  extends AbstractTableModel {
    private List<RelatorioLote> listaRelatorioLote;
    
    private String[] colunas = new String[]{"Código", "Identificador", "Data da Entrada", "Data da Saída"};
    
    
     public RelatorioDeLoteListModel(List<RelatorioLote> listaRelatorioLote) {
        this.listaRelatorioLote = listaRelatorioLote;
    }

    @Override
    public int getRowCount() {
        return listaRelatorioLote.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        RelatorioLote relatorioLote = listaRelatorioLote.get(row);
        switch (column) {
            case 0:
                return relatorioLote.getIdLote();
            case 1:
                return relatorioLote.getIdentificador();
            case 2:
                return relatorioLote.getDataEntrada();
            case 3:
                return relatorioLote.getDataSaida();
            default:
                break;
        }
        return listaRelatorioLote;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(RelatorioLote relatorioLote) {
        listaRelatorioLote.add(relatorioLote);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaRelatorioLote.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha,RelatorioLote relatorioLote) {
        listaRelatorioLote.set(indiceLinha, relatorioLote);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
    
}
