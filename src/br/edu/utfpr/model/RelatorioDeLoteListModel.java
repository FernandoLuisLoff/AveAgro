/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.entidades.EntradaLotes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferlo
 */
public class RelatorioDeLoteListModel  extends AbstractTableModel {
    private List<EntradaLotes> listaEntradaLotes;
    
    private String[] colunas = new String[]{"Código", "Identificador", "Data da Entrada"};
    
    
     public EntradaDeLotesListModel(List<EntradaLotes> listaEntradaLotes) {
        this.listaEntradaLotes = listaEntradaLotes;
    }

    @Override
    public int getRowCount() {
        return listaEntradaLotes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        EntradaLotes entradaLotes = listaEntradaLotes.get(row);
        switch (column) {
            case 0:
                return entradaLotes.getIdLote();
            case 1:
                return entradaLotes.getIdentificador();
            case 2:
                return entradaLotes.getGranja();
            case 3:
                return entradaLotes.getQuantidadeFrangos();
            case 4:
                return entradaLotes.getValorEntradaLote();
            case 5:
                return entradaLotes.getDataEntrada();
            default:
                break;
        }
        return listaEntradaLotes;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(EntradaLotes entradaLotes) {
        listaEntradaLotes.add(entradaLotes);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaEntradaLotes.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha,EntradaLotes entradaLotes) {
        listaEntradaLotes.set(indiceLinha, entradaLotes);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
    
}
