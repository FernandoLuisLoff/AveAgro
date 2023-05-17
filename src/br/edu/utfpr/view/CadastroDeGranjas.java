/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.funcoes.Mensagens;
import br.edu.utfpr.classes.Granjas;

/**
 *
 * @author ferlo
 */
public class CadastroDeGranjas extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroDeGranjas
     */
    public CadastroDeGranjas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTabbedPaneGranjas = new javax.swing.JTabbedPane();
        jPanelAdicionarGranjaAba1 = new javax.swing.JPanel();
        jLabelIdentificador = new javax.swing.JLabel();
        jLabelIdentificadorPropriedade = new javax.swing.JLabel();
        jComboBoxPropriedade = new javax.swing.JComboBox<>();
        jLabelIdentificadorDataIniAtividades = new javax.swing.JLabel();
        jLabelFrangosSuportados = new javax.swing.JLabel();
        jButtonFecharAba1 = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jFormattedTextFieldDataIniAtividades = new javax.swing.JFormattedTextField();
        jFormattedTextFieldQuantidadeFrangosSuportadas = new javax.swing.JFormattedTextField();
        jPanelGranjasCadastradasAba2 = new javax.swing.JPanel();
        jButtonFecharAba2 = new javax.swing.JButton();
        jScrollPaneGranjas = new javax.swing.JScrollPane();
        jTableGranjas = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabelIdentificadorGranjaPesquisa = new javax.swing.JLabel();
        jTextFieldIdentificadorGranjaPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Granjas");

        jTabbedPaneGranjas.setToolTipText("");

        jLabelIdentificador.setText("Identificador");
        jLabelIdentificador.setName(""); // NOI18N

        jLabelIdentificadorPropriedade.setText("Propriedade");
        jLabelIdentificadorPropriedade.setName(""); // NOI18N

        jComboBoxPropriedade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Propriedade", "Propriedade Teste" }));

        jLabelIdentificadorDataIniAtividades.setText("Data de Início das Atividades ");
        jLabelIdentificadorDataIniAtividades.setName(""); // NOI18N

        jLabelFrangosSuportados.setText("Quantidade de Frangos Suportada ");

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

        jFormattedTextFieldDataIniAtividades.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jFormattedTextFieldQuantidadeFrangosSuportadas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

        javax.swing.GroupLayout jPanelAdicionarGranjaAba1Layout = new javax.swing.GroupLayout(jPanelAdicionarGranjaAba1);
        jPanelAdicionarGranjaAba1.setLayout(jPanelAdicionarGranjaAba1Layout);
        jPanelAdicionarGranjaAba1Layout.setHorizontalGroup(
            jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarGranjaAba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdicionarGranjaAba1Layout.createSequentialGroup()
                        .addGap(0, 319, Short.MAX_VALUE)
                        .addComponent(jButtonFecharAba1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(jPanelAdicionarGranjaAba1Layout.createSequentialGroup()
                        .addGroup(jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAdicionarGranjaAba1Layout.createSequentialGroup()
                                .addComponent(jLabelIdentificador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIdentificador))
                            .addGroup(jPanelAdicionarGranjaAba1Layout.createSequentialGroup()
                                .addComponent(jLabelIdentificadorDataIniAtividades)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDataIniAtividades))
                            .addGroup(jPanelAdicionarGranjaAba1Layout.createSequentialGroup()
                                .addComponent(jLabelFrangosSuportados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldQuantidadeFrangosSuportadas))
                            .addGroup(jPanelAdicionarGranjaAba1Layout.createSequentialGroup()
                                .addComponent(jLabelIdentificadorPropriedade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPropriedade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanelAdicionarGranjaAba1Layout.setVerticalGroup(
            jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarGranjaAba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificador)
                    .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificadorPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIdentificadorDataIniAtividades)
                    .addComponent(jFormattedTextFieldDataIniAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFrangosSuportados)
                    .addComponent(jFormattedTextFieldQuantidadeFrangosSuportadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAdicionarGranjaAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharAba1)
                    .addComponent(jButtonSalvar))
                .addContainerGap())
        );

        jTabbedPaneGranjas.addTab("Adicionar Granja", jPanelAdicionarGranjaAba1);

        jButtonFecharAba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba2.setText("Fechar");
        jButtonFecharAba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba2ActionPerformed(evt);
            }
        });

        jTableGranjas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificador", "Propriedade", "Data de Início das Atividades", "Quantidade de Frangos Suportada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneGranjas.setViewportView(jTableGranjas);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/editar.png"))); // NOI18N
        jButtonEditar.setText("Editar");

        jLabelIdentificadorGranjaPesquisa.setText("Identificador da Granja");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("Perquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGranjasCadastradasAba2Layout = new javax.swing.GroupLayout(jPanelGranjasCadastradasAba2);
        jPanelGranjasCadastradasAba2.setLayout(jPanelGranjasCadastradasAba2Layout);
        jPanelGranjasCadastradasAba2Layout.setHorizontalGroup(
            jPanelGranjasCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGranjasCadastradasAba2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGranjasCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGranjasCadastradasAba2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFecharAba2))
                    .addComponent(jScrollPaneGranjas, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(jPanelGranjasCadastradasAba2Layout.createSequentialGroup()
                        .addComponent(jLabelIdentificadorGranjaPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdentificadorGranjaPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar)))
                .addContainerGap())
        );
        jPanelGranjasCadastradasAba2Layout.setVerticalGroup(
            jPanelGranjasCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGranjasCadastradasAba2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGranjasCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificadorGranjaPesquisa)
                    .addComponent(jTextFieldIdentificadorGranjaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneGranjas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGranjasCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharAba2)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        jTabbedPaneGranjas.addTab("Granjas Cadastradas", jPanelGranjasCadastradasAba2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneGranjas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneGranjas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba1ActionPerformed

    private void jButtonFecharAba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba2ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba2ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        
        if (validaCampos()) {
            Granjas granjas = new Granjas(
                jTextFieldIdentificador.getText(),
                jComboBoxPropriedade.getSelectedIndex(),
                jFormattedTextFieldDataIniAtividades.getText().toString(),
                Integer.parseInt(jFormattedTextFieldQuantidadeFrangosSuportadas.getText().toString().replace(".", ""))
            );
            
            granjas.salvar();
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void limpaCampos() {
        jTextFieldIdentificador.setText("");
        jComboBoxPropriedade.setSelectedIndex(0);
        jFormattedTextFieldDataIniAtividades.setText("");
        jFormattedTextFieldQuantidadeFrangosSuportadas.setText("");
    }
    
    private boolean validaCampos() {
        Mensagens mensagens = new Mensagens();
        
        if (jTextFieldIdentificador.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido", "Preencha o campo Identificador");
            jTextFieldIdentificador.requestFocus();
            return false;
        } else if (jComboBoxPropriedade.getSelectedIndex() == 0) {
            mensagens.errorMessage("Campo Inválido", "Selecione uma Propriedade");
            jComboBoxPropriedade.requestFocus();
            return false;
        } else if (jFormattedTextFieldDataIniAtividades.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido", "Preencha o campo Data de Inicio das Atividades");
            jFormattedTextFieldDataIniAtividades.requestFocus();
            return false;
        } else if (jFormattedTextFieldQuantidadeFrangosSuportadas.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido", "Preencha o campo Preencha o campo Quantidade de Frangos Suportada");
            jFormattedTextFieldQuantidadeFrangosSuportadas.requestFocus();
            return false;
        } else if (jFormattedTextFieldQuantidadeFrangosSuportadas.getText().toString().equals("0")) {
            mensagens.errorMessage("Campo Inválido", "Preencha uma Quantidade de Frangos Suportada maior que 0");
            jFormattedTextFieldQuantidadeFrangosSuportadas.requestFocus();
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
    private javax.swing.JComboBox<String> jComboBoxPropriedade;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataIniAtividades;
    private javax.swing.JFormattedTextField jFormattedTextFieldQuantidadeFrangosSuportadas;
    private javax.swing.JLabel jLabelFrangosSuportados;
    private javax.swing.JLabel jLabelIdentificador;
    private javax.swing.JLabel jLabelIdentificadorDataIniAtividades;
    private javax.swing.JLabel jLabelIdentificadorGranjaPesquisa;
    private javax.swing.JLabel jLabelIdentificadorPropriedade;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanelAdicionarGranjaAba1;
    private javax.swing.JPanel jPanelGranjasCadastradasAba2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneGranjas;
    private javax.swing.JTabbedPane jTabbedPaneGranjas;
    private javax.swing.JTable jTableGranjas;
    private javax.swing.JTextField jTextFieldIdentificador;
    private javax.swing.JTextField jTextFieldIdentificadorGranjaPesquisar;
    // End of variables declaration//GEN-END:variables
}