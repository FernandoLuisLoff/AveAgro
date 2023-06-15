/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.entidades.SaidaLotes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferlo
 */
public class SaidaLotesListModel extends AbstractTableModel {
    private List<SaidaLotes> listaSaidaLotes;
    
    private String[] colunas = new String[]{"Código", "Lote", "Valor de Saída do Lote", "Data da Saída"};
    
    
     public SaidaLotesListModel(List<SaidaLotes> listaSaidaLotes) {
        this.listaSaidaLotes = listaSaidaLotes;
    }

    @Override
    public int getRowCount() {
        return listaSaidaLotes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        SaidaLotes saidaLotes = listaSaidaLotes.get(row);
        switch (column) {
            case 0:
                return saidaLotes.getIdSaidaLote();
            case 1:
                return saidaLotes.getLote();
            case 2:
                return saidaLotes.getValorSaidaLote();
            case 3:
                return saidaLotes.getDataSaida();
            default:
                break;
        }
        return listaSaidaLotes;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(SaidaLotes saidaLotes) {
        listaSaidaLotes.add(saidaLotes);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaSaidaLotes.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha,SaidaLotes saidaLotes) {
        listaSaidaLotes.set(indiceLinha, saidaLotes);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
    
}
