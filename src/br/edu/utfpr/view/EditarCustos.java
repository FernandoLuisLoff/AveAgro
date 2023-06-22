/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.DAO.CustosDao;
import br.edu.utfpr.DAO.EntradaLotesDao;
import br.edu.utfpr.DAO.ProdutosDao;
import br.edu.utfpr.entidades.Custos;
import br.edu.utfpr.entidades.EntradaLotes;
import br.edu.utfpr.entidades.Produtos;
import br.edu.utfpr.funcoes.Mensagens;
import br.edu.utfpr.model.CustosListModel;
import br.edu.utfpr.model.EntradaDeLotesListModel;
import br.edu.utfpr.model.ProdutosListModel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ferlo
 */
public class EditarCustos extends javax.swing.JInternalFrame {

    // Guarda os codigos dos lotes do combobox
    Integer[] codigosLotes;
    
    // Guarda os codigos dos produtos do combobox
    Integer[] codigosProdutos;
    
    // Conexão com banco
    ProdutosDao produtosDao = new ProdutosDao();
    ProdutosListModel produtosListModel;
    
    // Conexão com banco
    EntradaLotesDao entradaLotesDao = new EntradaLotesDao();
    EntradaDeLotesListModel entradaLotesListModel;
    
    // Conexão com banco
    CustosDao custosDao = new CustosDao();
    CustosListModel custosListModel;
    List<Custos> ListaCustos;
    
    int idCusto;
    
    // Funcoes para mensagens
    Mensagens mensagens = new Mensagens();
    
    RegistroDeCustos registroDeCustos;
    
    public EditarCustos(List<Custos> ListaCustos, RegistroDeCustos registroDeCustos) {
        initComponents();
        this.ListaCustos = ListaCustos;
        this.registroDeCustos = registroDeCustos;
        alimentaComboBoxLotes();
        alimentaComboBoxProdutos();
        alimentaCampos();
    }
    
    private void alimentaComboBoxLotes() {
        
        List<EntradaLotes> listaEntradaLotes = entradaLotesDao.listar();
        entradaLotesListModel = new EntradaDeLotesListModel(listaEntradaLotes);
        
        // Cria um array com os itens para a ComboBox
        String[] nomesLotes = new String[entradaLotesListModel.getRowCount()+1];
        
        codigosLotes = new Integer[entradaLotesListModel.getRowCount()];
        
        for (int i=0; i<=entradaLotesListModel.getRowCount(); i++) {
            if (i==0) {
                nomesLotes[i] = "Selecione o Lote";
            } else {
                nomesLotes[i] = entradaLotesListModel.getValueAt(i-1, 1).toString();
                codigosLotes[i-1] = Integer.parseInt(entradaLotesListModel.getValueAt(i-1, 0).toString());
            }
        }
        
        // Cria um modelo de dados para a ComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(nomesLotes);

        // Define o modelo de dados
        jComboBoxLotes.setModel(model);
    }
    
    private void alimentaComboBoxProdutos() {
        
        List<Produtos> listaProdutos = produtosDao.listar();
        produtosListModel = new ProdutosListModel(listaProdutos);
        
        // Cria um array com os itens para a ComboBox
        String[] nomesProdutos = new String[produtosListModel.getRowCount()+1];
        
        codigosProdutos = new Integer[produtosListModel.getRowCount()];
        
        for (int i=0; i<=produtosListModel.getRowCount(); i++) {
            if (i==0) {
                nomesProdutos[i] = "Selecione o Produto";
            } else {
                nomesProdutos[i] = produtosListModel.getValueAt(i-1, 1).toString();
                codigosProdutos[i-1] = Integer.parseInt(produtosListModel.getValueAt(i-1, 0).toString());
            }
        }
        
        // Cria um modelo de dados para a ComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(nomesProdutos);

        // Define o modelo de dados
        jComboBoxProduto.setModel(model);
    }
    
    public void alimentaCampos() {
        custosListModel = new CustosListModel(ListaCustos);
        
        idCusto = Integer.parseInt(custosListModel.getValueAt(0, 0).toString());
        jComboBoxLotes.setSelectedIndex(indexComboBoxLotePeloCodigo(custosDao.codLotePeloCodCusto(idCusto)));
        jComboBoxProduto.setSelectedIndex(indexComboBoxProdutoPeloCodigo(custosDao.codProdutoPeloCodCusto(idCusto)));
        jFormattedTextFieldQuantidade.setText(custosListModel.getValueAt(0, 3).toString().replace(".", ","));
        jFormattedTextFieldValor.setText(custosListModel.getValueAt(0, 4).toString().replace(".", ","));
        jTextFieldDescricaoMotivo.setText(custosListModel.getValueAt(0, 5).toString());
        jFormattedTextFieldData.setText(custosListModel.getValueAt(0,6).toString());
    }
    
    private int indexComboBoxLotePeloCodigo(int codigo) {
        int index = 0;
        for (int i=0; i<codigosLotes.length; i++) {
            if (codigosLotes[i] == codigo) {
                index = i+1;
            }
        }
        return index;
    }
    
    private int indexComboBoxProdutoPeloCodigo(int codigo) {
        int index = 0;
        for (int i=0; i<codigosProdutos.length; i++) {
            if (codigosProdutos[i] == codigo) {
                index = i+1;
            }
        }
        return index;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelProduto = new javax.swing.JLabel();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        jFormattedTextFieldQuantidade = new javax.swing.JFormattedTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jFormattedTextFieldValor = new javax.swing.JFormattedTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonFecharAba1 = new javax.swing.JButton();
        jLabelDataContagem = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jLabelDescricaoMotivo = new javax.swing.JLabel();
        jComboBoxLotes = new javax.swing.JComboBox<>();
        jTextFieldDescricaoMotivo = new javax.swing.JTextField();
        jLabelLote = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar Custos");

        jLabelProduto.setText("Produto *");

        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Produto", "Produto Teste" }));
        jComboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutoActionPerformed(evt);
            }
        });

        jFormattedTextFieldQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedTextFieldQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldQuantidadeFocusLost(evt);
            }
        });

        jLabelQuantidade.setText("Quantidade *");

        jLabelValor.setText("Valor Total *");

        jFormattedTextFieldValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jButtonFecharAba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba1.setText("Fechar");
        jButtonFecharAba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba1ActionPerformed(evt);
            }
        });

        jLabelDataContagem.setText("Data *");
        jLabelDataContagem.setToolTipText("");

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelDescricaoMotivo.setText("Descrição/Motivo *");

        jComboBoxLotes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Lote", "Lote Teste" }));

        jLabelLote.setText("Lote * ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelDescricaoMotivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricaoMotivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDataContagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonFecharAba1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLote)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProduto)
                            .addComponent(jLabelValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldValor)
                            .addComponent(jComboBoxProduto, 0, 242, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLote)
                    .addComponent(jComboBoxLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProduto)
                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jFormattedTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValor)
                    .addComponent(jFormattedTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoMotivo)
                    .addComponent(jTextFieldDescricaoMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataContagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFecharAba1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutoActionPerformed
        cauculaValor();
    }//GEN-LAST:event_jComboBoxProdutoActionPerformed

    private void jFormattedTextFieldQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldQuantidadeFocusLost
        cauculaValor();
    }//GEN-LAST:event_jFormattedTextFieldQuantidadeFocusLost

    private void jButtonFecharAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba1ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (validaCampos()) {
            Custos custos = new Custos(
                codigosLotes[jComboBoxLotes.getSelectedIndex()-1],
                jComboBoxLotes.getSelectedItem().toString(),
                codigosProdutos[jComboBoxProduto.getSelectedIndex()-1],
                jComboBoxProduto.getSelectedItem().toString(),
                Float.parseFloat(jFormattedTextFieldQuantidade.getText().toString().replace(".", "").replace(",", ".")),
                Float.parseFloat(jFormattedTextFieldValor.getText().toString().replace(".", "").replace(",", ".")),
                jTextFieldDescricaoMotivo.getText(),
                jFormattedTextFieldData.getText().toString()
            );
            
            custos.setIdRegistroCustos(idCusto);
            
            // Gravação no banco
            custosDao.alterar(custos);
                    
            listagemDeDados("");
            
            super.dispose();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void listagemDeDados(String nome) {
        registroDeCustos.listagemDeDados(nome);
    }
    
    private void cauculaValor() {
        if (jComboBoxProduto.getSelectedIndex() != 0) {
            int codigoProduto = codigosProdutos[jComboBoxProduto.getSelectedIndex()-1];
            float valorCampo = custosDao.buscaValorProduto(codigoProduto);
            float quantidade = 0;
            
            if (!jFormattedTextFieldQuantidade.getText().toString().isEmpty()) {
                quantidade = Float.parseFloat(jFormattedTextFieldQuantidade.getText().toString().replace(".", "").replace(",", "."));
            }

            jFormattedTextFieldValor.setText(Float.toString(quantidade*valorCampo).replace(".", ","));
        } else {
            jFormattedTextFieldValor.setText("");
        }
    }
    
    private boolean validaCampos() {
        if (jComboBoxLotes.getSelectedIndex() == 0) {
            mensagens.errorMessage("Campo Inválido","Selecione um Lote");
            jComboBoxLotes.requestFocus();
            return false;
        } else if (custosDao.verificaLotesBaixado(codigosLotes[jComboBoxLotes.getSelectedIndex()-1])) {
            mensagens.errorMessage("Campo Inválido","Selecione um Lote que já não foi baixado");
            jComboBoxLotes.requestFocus();
            return false;
        } else if (jComboBoxProduto.getSelectedIndex() == 0) {
            mensagens.errorMessage("Campo Inválido","Selecione um Produto");
            jComboBoxProduto.requestFocus();
            return false;
        } else if (jFormattedTextFieldQuantidade.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido", "Preencha o campo Quantidade");
            jFormattedTextFieldQuantidade.requestFocus();
            return false;
        } else if (jFormattedTextFieldQuantidade.getText().toString().equals("0,00")) {
            mensagens.errorMessage("Campo Inválido", "Preencha uma Quantidade maior que 0");
            jFormattedTextFieldQuantidade.requestFocus();
            return false;
        } else if (jFormattedTextFieldValor.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido", "Preencha o campo Valor");
            jFormattedTextFieldValor.requestFocus();
            return false;
        } else if (jFormattedTextFieldValor.getText().toString().equals("0,00")) {
            mensagens.errorMessage("Campo Inválido", "Preencha um Valor maior que 0");
            jFormattedTextFieldValor.requestFocus();
            return false;
        }  else if (jTextFieldDescricaoMotivo.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido", "Preencha o campo Descrição/Motivo");
            jTextFieldDescricaoMotivo.requestFocus();
            return false;
        } else if (jFormattedTextFieldData.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Data");
            jFormattedTextFieldData.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFecharAba1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxLotes;
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldQuantidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldValor;
    private javax.swing.JLabel jLabelDataContagem;
    private javax.swing.JLabel jLabelDescricaoMotivo;
    private javax.swing.JLabel jLabelLote;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JTextField jTextFieldDescricaoMotivo;
    // End of variables declaration//GEN-END:variables
}
