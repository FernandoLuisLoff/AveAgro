package br.edu.utfpr.view;

import br.edu.utfpr.DAO.EntradaLotesDao;
import br.edu.utfpr.DAO.PerdasDao;
import br.edu.utfpr.entidades.EntradaLotes;
import br.edu.utfpr.funcoes.Mensagens;
import br.edu.utfpr.entidades.Perdas;
import br.edu.utfpr.model.EntradaDeLotesListModel;
import br.edu.utfpr.model.PerdasListModel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author ferlo
 */
public class RegistroDePerdas extends javax.swing.JInternalFrame {
    // Guarda os codigos dos lotes do combobox
    Integer[] codigosLotes;
    
    // Conexão com banco
    EntradaLotesDao entradaLotesDao = new EntradaLotesDao();
    EntradaDeLotesListModel entradaLotesListModel;
    
    // Conexão com banco
    PerdasDao perdasDao = new PerdasDao();
    PerdasListModel perdasListModel;
    
    // Funcoes para mensagens
    Mensagens mensagens = new Mensagens();
    
    public RegistroDePerdas() {
        initComponents();
        
        listagemDeDados("");
        
        alimentaComboBoxLotes();
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
    
    private boolean validaQuantidadeDePerdasDoLote(int codigoLote) {
        // Variavel para soma inicialida com o valor do campo de perdas
        int somaQuantidadeDePerdasDoLote = Integer.parseInt(jFormattedTextFieldContagemPerdas.getText().toString().replace(".", ""));
        
        // Variavel alimentada com o valor total de entrada de frangos no lote
        int quantidadeDeFrangosNaEntradaDoLote = perdasDao.buscaQuantidadeDeFrangosDoLote(codigoLote);
        
        List<Perdas> lista = perdasDao.buscarPorCodigoDoLote(codigoLote);
        perdasListModel = new PerdasListModel(lista);
        
        for (int i=0; i<perdasListModel.getRowCount(); i++) {
            somaQuantidadeDePerdasDoLote = somaQuantidadeDePerdasDoLote+Integer.parseInt(perdasListModel.getValueAt(i, 3).toString());
        }
        
        return somaQuantidadeDePerdasDoLote>quantidadeDeFrangosNaEntradaDoLote;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneRegistroPerdas = new javax.swing.JTabbedPane();
        jPanelRegistrarPerdasAba1 = new javax.swing.JPanel();
        jComboBoxLotes = new javax.swing.JComboBox<>();
        jLabelLote = new javax.swing.JLabel();
        jLabelDescricaoMotivo = new javax.swing.JLabel();
        jTextFieldDescricaoMotivo = new javax.swing.JTextField();
        jLabelContagemPerdas = new javax.swing.JLabel();
        jFormattedTextFieldContagemPerdas = new javax.swing.JFormattedTextField();
        jButtonFecharAba1 = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelDataContagem = new javax.swing.JLabel();
        jFormattedTextFieldDataContagem = new javax.swing.JFormattedTextField();
        jPanelPerdasRegistradasAba2 = new javax.swing.JPanel();
        jButtonFecharAba2 = new javax.swing.JButton();
        jScrollPaneRegistroPerda = new javax.swing.JScrollPane();
        jTableRegistroPerda = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldIdentificadorLotePesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelIdentificadorLotePesquisa = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Perdas");

        jComboBoxLotes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Lote", "Lote Teste" }));

        jLabelLote.setText("Lote * ");

        jLabelDescricaoMotivo.setText("Descrição/Motivo *");

        jLabelContagemPerdas.setText("Contagem de Perdas *");

        jFormattedTextFieldContagemPerdas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

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

        jLabelDataContagem.setText("Data da Contagem *");
        jLabelDataContagem.setToolTipText("");

        jFormattedTextFieldDataContagem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jPanelRegistrarPerdasAba1Layout = new javax.swing.GroupLayout(jPanelRegistrarPerdasAba1);
        jPanelRegistrarPerdasAba1.setLayout(jPanelRegistrarPerdasAba1Layout);
        jPanelRegistrarPerdasAba1Layout.setHorizontalGroup(
            jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarPerdasAba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarPerdasAba1Layout.createSequentialGroup()
                        .addComponent(jLabelLote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxLotes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarPerdasAba1Layout.createSequentialGroup()
                        .addGap(0, 218, Short.MAX_VALUE)
                        .addComponent(jButtonFecharAba1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(jPanelRegistrarPerdasAba1Layout.createSequentialGroup()
                        .addGroup(jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescricaoMotivo)
                            .addComponent(jLabelContagemPerdas)
                            .addComponent(jLabelDataContagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDescricaoMotivo)
                            .addComponent(jFormattedTextFieldContagemPerdas)
                            .addComponent(jFormattedTextFieldDataContagem))))
                .addContainerGap())
        );
        jPanelRegistrarPerdasAba1Layout.setVerticalGroup(
            jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarPerdasAba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLote)
                    .addComponent(jComboBoxLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricaoMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoMotivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContagemPerdas)
                    .addComponent(jFormattedTextFieldContagemPerdas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataContagem)
                    .addComponent(jFormattedTextFieldDataContagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarPerdasAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFecharAba1))
                .addContainerGap())
        );

        jTabbedPaneRegistroPerdas.addTab("Registrar Perdas", jPanelRegistrarPerdasAba1);

        jButtonFecharAba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba2.setText("Fechar");
        jButtonFecharAba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba2ActionPerformed(evt);
            }
        });

        jScrollPaneRegistroPerda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTableRegistroPerda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lote", "Descrição/Motivo", "Contagem de perdas", "Data da Contagem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneRegistroPerda.setViewportView(jTableRegistroPerda);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/editar.png"))); // NOI18N
        jButtonEditar.setText("Editar");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("Perquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabelIdentificadorLotePesquisa.setText("Identificador do Lote");

        javax.swing.GroupLayout jPanelPerdasRegistradasAba2Layout = new javax.swing.GroupLayout(jPanelPerdasRegistradasAba2);
        jPanelPerdasRegistradasAba2.setLayout(jPanelPerdasRegistradasAba2Layout);
        jPanelPerdasRegistradasAba2Layout.setHorizontalGroup(
            jPanelPerdasRegistradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerdasRegistradasAba2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPerdasRegistradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPerdasRegistradasAba2Layout.createSequentialGroup()
                        .addGap(0, 115, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFecharAba2))
                    .addComponent(jScrollPaneRegistroPerda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPerdasRegistradasAba2Layout.createSequentialGroup()
                        .addComponent(jLabelIdentificadorLotePesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdentificadorLotePesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar)))
                .addContainerGap())
        );
        jPanelPerdasRegistradasAba2Layout.setVerticalGroup(
            jPanelPerdasRegistradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPerdasRegistradasAba2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPerdasRegistradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificadorLotePesquisa)
                    .addComponent(jTextFieldIdentificadorLotePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneRegistroPerda, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPerdasRegistradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharAba2)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        jTabbedPaneRegistroPerdas.addTab("Perdas Registradas", jPanelPerdasRegistradasAba2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneRegistroPerdas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneRegistroPerdas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba1ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (validaCampos()) {
            Perdas perdas = new Perdas(
                codigosLotes[jComboBoxLotes.getSelectedIndex()-1],
                jComboBoxLotes.getSelectedItem().toString(),
                jTextFieldDescricaoMotivo.getText(),
                Integer.parseInt(jFormattedTextFieldContagemPerdas.getText().toString().replace(".", "")),
                jFormattedTextFieldDataContagem.getText().toString()
            );
            
            perdasDao.inserir(perdas);
            
            listagemDeDados("");
            
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonFecharAba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba2ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba2ActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        listagemDeDados(jTextFieldIdentificadorLotePesquisar.getText());
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int indiceTabela = jTableRegistroPerda.getSelectedRow();
        Object codPerda = perdasListModel.getValueAt(indiceTabela, 0);
        perdasDao.remover((Integer) codPerda);
        listagemDeDados("");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void limpaCampos() {
        jComboBoxLotes.setSelectedIndex(0);
        jTextFieldDescricaoMotivo.setText("");
        jFormattedTextFieldContagemPerdas.setText("");
        jFormattedTextFieldDataContagem.setText("");
    }
    
    private void listagemDeDados(String nome) {
        // Listagem na tabela
        List<Perdas> lista = perdasDao.buscarPorNome(nome);
        perdasListModel = new PerdasListModel(lista);
        jTableRegistroPerda.setModel(perdasListModel);
    }
    
    private boolean validaCampos() {
        if (jComboBoxLotes.getSelectedIndex() == 0) {
            mensagens.errorMessage("Campo Inválido","Selecione um Lote");
            jComboBoxLotes.requestFocus();
            return false;
        } else if (jTextFieldDescricaoMotivo.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Descrição/Motivo");
            jTextFieldDescricaoMotivo.requestFocus();
            return false;
        } else if (jFormattedTextFieldContagemPerdas.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido", "Preencha o campo Preencha o campo Contagem de Perdas");
            jFormattedTextFieldContagemPerdas.requestFocus();
            return false;
        } else if (jFormattedTextFieldContagemPerdas.getText().toString().equals("0")) {
            mensagens.errorMessage("Campo Inválido", "Preencha uma Contagem de Perdas maior que 0");
            jFormattedTextFieldContagemPerdas.requestFocus();
            return false;
        } else if (validaQuantidadeDePerdasDoLote(codigosLotes[jComboBoxLotes.getSelectedIndex()-1])) {
            mensagens.errorMessage("Campo Inválido", "Contagem de perdas de frangos excedidendo a contagem da entrada");
            jFormattedTextFieldContagemPerdas.requestFocus();
            return false;
        } else if (jFormattedTextFieldDataContagem.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Data da Contagem");
            jFormattedTextFieldDataContagem.requestFocus();
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
    private javax.swing.JFormattedTextField jFormattedTextFieldContagemPerdas;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataContagem;
    private javax.swing.JLabel jLabelContagemPerdas;
    private javax.swing.JLabel jLabelDataContagem;
    private javax.swing.JLabel jLabelDescricaoMotivo;
    private javax.swing.JLabel jLabelIdentificadorLotePesquisa;
    private javax.swing.JLabel jLabelLote;
    private javax.swing.JPanel jPanelPerdasRegistradasAba2;
    private javax.swing.JPanel jPanelRegistrarPerdasAba1;
    private javax.swing.JScrollPane jScrollPaneRegistroPerda;
    private javax.swing.JTabbedPane jTabbedPaneRegistroPerdas;
    private javax.swing.JTable jTableRegistroPerda;
    private javax.swing.JTextField jTextFieldDescricaoMotivo;
    private javax.swing.JTextField jTextFieldIdentificadorLotePesquisar;
    // End of variables declaration//GEN-END:variables
}
