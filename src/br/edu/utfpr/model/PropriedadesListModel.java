/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.entidades.Propriedades;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferlo
 */
public class PropriedadesListModel extends AbstractTableModel {
    private List<Propriedades> listaPropriedade;
    
    private String[] colunas = new String[]{"Código", "Nome da Propriedade", "Data de Aquisição", "CEP", "Estado", "Cidade", "Endereço", "Número", "Complemento"};
    
    
     public PropriedadesListModel(List<Propriedades> listaPropriedade) {
        this.listaPropriedade = listaPropriedade;
    }

    @Override
    public int getRowCount() {
        return listaPropriedade.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Propriedades propriedade = listaPropriedade.get(row);
        switch (column) {
            case 0:
                return propriedade.getIdPropriedades();
            case 1:
                return propriedade.getNomePropriedade();
            case 2:
                return propriedade.getDataAquisicao();
            case 3:
                return propriedade.getCep();
            case 4:
                return propriedade.getEstado();
            case 5:
                return propriedade.getCidade();
            case 6:
                return propriedade.getEndereco();
            case 7:
                return propriedade.getNumero();
            case 8:
                return propriedade.getComplemento();
            default:
                break;
        }
        return listaPropriedade;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Propriedades propriedade) {
        listaPropriedade.add(propriedade);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaPropriedade.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha,Propriedades propriedade) {
        listaPropriedade.set(indiceLinha, propriedade);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
}
