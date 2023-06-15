/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.entidades.Custos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferlo
 */
public class CustosListModel extends AbstractTableModel {
    private List<Custos> listaCustos;
    
    private String[] colunas = new String[]{"Código", "Lote", "Produto", "Quantidade", "Valor", "Descrição/Motivo", "Data"};
    
    
     public CustosListModel(List<Custos> listaCustos) {
        this.listaCustos = listaCustos;
    }

    @Override
    public int getRowCount() {
        return listaCustos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Custos custos = listaCustos.get(row);
        switch (column) {
            case 0:
                return custos.getIdRegistroCustos();
            case 1:
                return custos.getLote();
            case 2:
                return custos.getProduto();
            case 3:
                return custos.getQuantidade();
            case 4:
                return custos.getvalor();
            case 5:
                return custos.getDescricaoMotivo();
            case 6:
                return custos.getData();
            default:
                break;
        }
        return listaCustos;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Custos custos) {
        listaCustos.add(custos);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaCustos.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Custos custos) {
        listaCustos.set(indiceLinha, custos);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
    
}
