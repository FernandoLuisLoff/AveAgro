/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.entidades.Produtos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferlo
 */
public class ProdutosListModel extends AbstractTableModel {
    private List<Produtos> listaProdutos;
    
    
    private String[] colunas = new String[]{"Código", "Produto", "Categoria", "Quantidade/Volume", "Unidade de Medida", "Valor"};
    
    
     public ProdutosListModel(List<Produtos> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    @Override
    public int getRowCount() {
        return listaProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Produtos produtos = listaProdutos.get(row);
        switch (column) {
            case 0:
                return produtos.getIdProdutos();
            case 1:
                return produtos.getProduto();
            case 2:
                return produtos.getCategoria();
            case 3:
                return produtos.getQuantidadeVolume();
            case 4:
                return produtos.getUnidadeMedida();
            case 5:
                return produtos.getValor();
            default:
                break;
        }
        return listaProdutos;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Produtos produtos) {
        listaProdutos.add(produtos);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaProdutos.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha,Produtos produtos) {
        listaProdutos.set(indiceLinha, produtos);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
}
