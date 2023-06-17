/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.DAO.EntradaLotesDao;
import br.edu.utfpr.DAO.SaidaLotesDao;
import br.edu.utfpr.entidades.EntradaLotes;
import br.edu.utfpr.funcoes.Mensagens;
import br.edu.utfpr.entidades.SaidaLotes;
import br.edu.utfpr.model.EntradaDeLotesListModel;
import br.edu.utfpr.model.SaidaLotesListModel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ferlo
 */
public class SaidaDeLotes extends javax.swing.JInternalFrame {

    // Guarda os codigos dos lotes do combobox
    Integer[] codigosLotes;
    
    // Conexão com banco
    EntradaLotesDao entradaLotesDao = new EntradaLotesDao();
    EntradaDeLotesListModel entradaLotesListModel;
    
    // Conexão com banco
    SaidaLotesDao saidaLotesDao = new SaidaLotesDao();
    SaidaLotesListModel saidaDeLotesListModel;
    
    public SaidaDeLotes() {
        initComponents();
        
        // Listagem na tabela
        List<SaidaLotes> lista = saidaLotesDao.listar();
        saidaDeLotesListModel = new SaidaLotesListModel(lista);
        jTableSaidaLote.setModel(saidaDeLotesListModel);
        
        alimentaComboBoxLotes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneSaidaLotes = new javax.swing.JTabbedPane();
        jPanelRegistrarSaidasLoteAba1 = new javax.swing.JPanel();
        jButtonFecharAba1 = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jComboBoxLotes = new javax.swing.JComboBox<>();
        jLabelLote = new javax.swing.JLabel();
        jLabelValorSaida = new javax.swing.JLabel();
        jFormattedTextFieldValorSaida = new javax.swing.JFormattedTextField();
        jLabelDataSaida = new javax.swing.JLabel();
        jFormattedTextFieldDataSaida = new javax.swing.JFormattedTextField();
        jPanelLotesFinalizadosAba2 = new javax.swing.JPanel();
        jButtonFecharAba2 = new javax.swing.JButton();
        jScrollPaneSaidaLote = new javax.swing.JScrollPane();
        jTableSaidaLote = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelIdentificadorLotePesquisa = new javax.swing.JLabel();
        jTextFieldIdentificadorLotePesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Saída de Lotes");

        jButtonFecharAba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba1.setText("Fechar");
        jButtonFecharAba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba1ActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jComboBoxLotes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Lote", "Lote Teste" }));

        jLabelLote.setText("Lote * ");

        jLabelValorSaida.setText("Valor de Saída do Lote *");

        jFormattedTextFieldValorSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLabelDataSaida.setText("Data da Saída *");

        jFormattedTextFieldDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jPanelRegistrarSaidasLoteAba1Layout = new javax.swing.GroupLayout(jPanelRegistrarSaidasLoteAba1);
        jPanelRegistrarSaidasLoteAba1.setLayout(jPanelRegistrarSaidasLoteAba1Layout);
        jPanelRegistrarSaidasLoteAba1Layout.setHorizontalGroup(
            jPanelRegistrarSaidasLoteAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarSaidasLoteAba1Layout.createSequentialGroup()
                        .addComponent(jLabelLote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createSequentialGroup()
                                .addGap(0, 213, Short.MAX_VALUE)
                                .addComponent(jButtonFecharAba1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvar))
                            .addComponent(jComboBoxLotes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createSequentialGroup()
                        .addComponent(jLabelValorSaida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldValorSaida))
                    .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createSequentialGroup()
                        .addComponent(jLabelDataSaida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataSaida)))
                .addContainerGap())
        );
        jPanelRegistrarSaidasLoteAba1Layout.setVerticalGroup(
            jPanelRegistrarSaidasLoteAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarSaidasLoteAba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLote)
                    .addComponent(jComboBoxLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorSaida)
                    .addComponent(jFormattedTextFieldValorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataSaida)
                    .addComponent(jFormattedTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarSaidasLoteAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFecharAba1))
                .addContainerGap())
        );

        jTabbedPaneSaidaLotes.addTab("Registrar Saída de Lote", jPanelRegistrarSaidasLoteAba1);

        jButtonFecharAba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba2.setText("Fechar");
        jButtonFecharAba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba2ActionPerformed(evt);
            }
        });

        jTableSaidaLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Lote", "Valor de Saída do Lote", "Data da Saída"
            }
        ));
        jScrollPaneSaidaLote.setViewportView(jTableSaidaLote);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/editar.png"))); // NOI18N
        jButtonEditar.setText("Editar");

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");

        jLabelIdentificadorLotePesquisa.setText("Identificador do Lote");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("Perquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLotesFinalizadosAba2Layout = new javax.swing.GroupLayout(jPanelLotesFinalizadosAba2);
        jPanelLotesFinalizadosAba2.setLayout(jPanelLotesFinalizadosAba2Layout);
        jPanelLotesFinalizadosAba2Layout.setHorizontalGroup(
            jPanelLotesFinalizadosAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLotesFinalizadosAba2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLotesFinalizadosAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneSaidaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLotesFinalizadosAba2Layout.createSequentialGroup()
                        .addComponent(jLabelIdentificadorLotePesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdentificadorLotePesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLotesFinalizadosAba2Layout.createSequentialGroup()
                        .addGap(0, 153, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFecharAba2)))
                .addContainerGap())
        );
        jPanelLotesFinalizadosAba2Layout.setVerticalGroup(
            jPanelLotesFinalizadosAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLotesFinalizadosAba2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLotesFinalizadosAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificadorLotePesquisa)
                    .addComponent(jTextFieldIdentificadorLotePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneSaidaLote, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLotesFinalizadosAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharAba2)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        jTabbedPaneSaidaLotes.addTab("Lotes Finalizados", jPanelLotesFinalizadosAba2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSaidaLotes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSaidaLotes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void jButtonFecharAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba1ActionPerformed

    private void jButtonFecharAba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba2ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba2ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (validaCampos()) {
            SaidaLotes saidaLotes = new SaidaLotes(
                codigosLotes[jComboBoxLotes.getSelectedIndex()-1],
                jComboBoxLotes.getSelectedItem().toString(),
                Float.parseFloat(jFormattedTextFieldValorSaida.getText().toString().replace(".", "").replace(",", ".")),
                jFormattedTextFieldDataSaida.getText().toString()
            );
            
            saidaLotesDao.inserir(saidaLotes);
            
            // Listagem na tabela
            List<SaidaLotes> lista = saidaLotesDao.listar();
            saidaDeLotesListModel = new SaidaLotesListModel(lista);
            jTableSaidaLote.setModel(saidaDeLotesListModel);
        
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // Listagem na tabela
        List<SaidaLotes> lista = saidaLotesDao.buscarPorNome(jTextFieldIdentificadorLotePesquisar.getText());
        saidaDeLotesListModel = new SaidaLotesListModel(lista);
        jTableSaidaLote.setModel(saidaDeLotesListModel);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void limpaCampos() {
        jComboBoxLotes.setSelectedIndex(0);
        jFormattedTextFieldValorSaida.setText("");
        jFormattedTextFieldDataSaida.setText("");
    }
    
    private boolean validaCampos() {
        Mensagens mensagens = new Mensagens();
        
        if (jComboBoxLotes.getSelectedIndex() == 0) {
            mensagens.errorMessage("Campo Inválido","Selecione um Lote");
            jComboBoxLotes.requestFocus();
            return false;
        } else if (jFormattedTextFieldValorSaida.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Valor de Saída do Lote");
            jFormattedTextFieldValorSaida.requestFocus();
            return false;
        } else if (jFormattedTextFieldValorSaida.getText().toString().equals("0,00")) {
            mensagens.errorMessage("Campo Inválido","Preencha um Valor de Saída do Lote maior que 0");
            jFormattedTextFieldValorSaida.requestFocus();
            return false;
        } else if (jFormattedTextFieldDataSaida.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Data da Saída");
            jFormattedTextFieldDataSaida.requestFocus();
            return false;
        } else {
            return true;
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFecharAba1;
    private javax.swing.JButton jButtonFecharAba2;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxLotes;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataSaida;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorSaida;
    private javax.swing.JLabel jLabelDataSaida;
    private javax.swing.JLabel jLabelIdentificadorLotePesquisa;
    private javax.swing.JLabel jLabelLote;
    private javax.swing.JLabel jLabelValorSaida;
    private javax.swing.JPanel jPanelLotesFinalizadosAba2;
    private javax.swing.JPanel jPanelRegistrarSaidasLoteAba1;
    private javax.swing.JScrollPane jScrollPaneSaidaLote;
    private javax.swing.JTabbedPane jTabbedPaneSaidaLotes;
    private javax.swing.JTable jTableSaidaLote;
    private javax.swing.JTextField jTextFieldIdentificadorLotePesquisar;
    // End of variables declaration//GEN-END:variables
}
