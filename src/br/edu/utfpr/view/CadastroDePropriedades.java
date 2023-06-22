/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.DAO.PropriedadesDao;
import br.edu.utfpr.funcoes.Mensagens;
import br.edu.utfpr.entidades.Propriedades;
import br.edu.utfpr.funcoes.Cep;
import br.edu.utfpr.model.PropriedadesListModel;
import java.util.List;

/**
 *
 * @author ferlo
 */
public class CadastroDePropriedades extends javax.swing.JInternalFrame {
    // Conexão com banco
    PropriedadesDao propriedadesDao = new PropriedadesDao();
    PropriedadesListModel propriedadesListModel;
    
    // Funcoes para mensagens
    Mensagens mensagens = new Mensagens();
    
    public CadastroDePropriedades() {
        initComponents();
        listagemDeDados("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPanePropriedades = new javax.swing.JTabbedPane();
        jPanelAdicionarPropriedadeAba1 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonFecharAba1 = new javax.swing.JButton();
        jLabelNomePropriedade = new javax.swing.JLabel();
        jLabelDataAquisicao = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jFormattedTextFieldDataAquisicao = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jPanelPropriedadesCadastradasAba2 = new javax.swing.JPanel();
        jButtonFecharAba2 = new javax.swing.JButton();
        jScrollPanelPropriedadesCadastradas = new javax.swing.JScrollPane();
        jTablePropriedadesCadastradas = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelNomePropriedadePesquisa = new javax.swing.JLabel();
        jTextFieldNomePropriedadePesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Propriedades");

        jTabbedPanePropriedades.setToolTipText("");

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonFecharAba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba1.setText("Fechar");
        jButtonFecharAba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba1ActionPerformed(evt);
            }
        });

        jLabelNomePropriedade.setText("Nome da Propriedade *");

        jLabelDataAquisicao.setText("Data de Aquisição *");

        jLabelCEP.setText("CEP *");

        jLabelEstado.setText("Estado *");

        jLabelCidade.setText("Cidade *");

        jLabelEndereco.setText("Endereço *");

        jLabelNumero.setText("Número *");

        jLabelComplemento.setText("Complemento");

        jFormattedTextFieldDataAquisicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldCEPFocusLost(evt);
            }
        });

        jLabelBairro.setText("Bairro *");

        javax.swing.GroupLayout jPanelAdicionarPropriedadeAba1Layout = new javax.swing.GroupLayout(jPanelAdicionarPropriedadeAba1);
        jPanelAdicionarPropriedadeAba1.setLayout(jPanelAdicionarPropriedadeAba1Layout);
        jPanelAdicionarPropriedadeAba1Layout.setHorizontalGroup(
            jPanelAdicionarPropriedadeAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdicionarPropriedadeAba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdicionarPropriedadeAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAdicionarPropriedadeAba1Layout.createSequentialGroup()
                        .addComponent(jLabelComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComplemento))
                    .addGroup(jPanelAdicionarPropriedadeAba1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFecharAba1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAdicionarPropriedadeAba1Layout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndereco)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAdicionarPropriedadeAba1Layout.createSequentialGroup()
                        .addComponent(jLabelNomePropriedade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomePropriedade, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDataAquisicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAdicionarPropriedadeAba1Layout.createSequentialGroup()
                        .addComponent(jLabelCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBairro)))
                .addContainerGap())
        );
        jPanelAdicionarPropriedadeAba1Layout.setVerticalGroup(
            jPanelAdicionarPropriedadeAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarPropriedadeAba1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelAdicionarPropriedadeAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePropriedade)
                    .addComponent(jLabelDataAquisicao)
                    .addComponent(jTextFieldNomePropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarPropriedadeAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCEP)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarPropriedadeAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarPropriedadeAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanelAdicionarPropriedadeAba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFecharAba1))
                .addContainerGap())
        );

        jTabbedPanePropriedades.addTab("Adicionar Propriedades", jPanelAdicionarPropriedadeAba1);

        jButtonFecharAba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba2.setText("Fechar");
        jButtonFecharAba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba2ActionPerformed(evt);
            }
        });

        jTablePropriedadesCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome da Propriedade", "Data de Aquisição ", "CEP", "Estado", "Cidade", "Endereço", "Número", "Complemento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanelPropriedadesCadastradas.setViewportView(jTablePropriedadesCadastradas);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/editar.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelNomePropriedadePesquisa.setText("Nome da Propriedade");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("Perquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPropriedadesCadastradasAba2Layout = new javax.swing.GroupLayout(jPanelPropriedadesCadastradasAba2);
        jPanelPropriedadesCadastradasAba2.setLayout(jPanelPropriedadesCadastradasAba2Layout);
        jPanelPropriedadesCadastradasAba2Layout.setHorizontalGroup(
            jPanelPropriedadesCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadesCadastradasAba2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPropriedadesCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanelPropriedadesCadastradas, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                    .addGroup(jPanelPropriedadesCadastradasAba2Layout.createSequentialGroup()
                        .addComponent(jLabelNomePropriedadePesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomePropriedadePesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPropriedadesCadastradasAba2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFecharAba2)))
                .addContainerGap())
        );
        jPanelPropriedadesCadastradasAba2Layout.setVerticalGroup(
            jPanelPropriedadesCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPropriedadesCadastradasAba2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPropriedadesCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePropriedadePesquisa)
                    .addComponent(jTextFieldNomePropriedadePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanelPropriedadesCadastradas, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPropriedadesCadastradasAba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharAba2)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        jTabbedPanePropriedades.addTab("Propriedades Cadastradas", jPanelPropriedadesCadastradasAba2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanePropriedades)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanePropriedades)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharAba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba2ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba2ActionPerformed

    private void jButtonFecharAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba1ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (validaCampos()) {
            Propriedades propriedades = new Propriedades(
                jTextFieldNomePropriedade.getText(),
                jFormattedTextFieldDataAquisicao.getText().toString(),
                jFormattedTextFieldCEP.getText().toString(),
                jTextFieldCidade.getText(),
                jTextFieldEstado.getText(),
                jTextFieldBairro.getText(),
                jTextFieldEndereco.getText(),
                jTextFieldNumero.getText(),
                jTextFieldComplemento.getText()
            );
            
            // Gravação no banco
            propriedadesDao.inserir(propriedades);
            
            listagemDeDados("");
        
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        listagemDeDados(jTextFieldNomePropriedadePesquisar.getText());
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jFormattedTextFieldCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCEPFocusLost
        // Ferramenta para busca de CEP
        Cep cep = new Cep();
        
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldBairro.setText("");
        jTextFieldEndereco.setText("");
            
        if (cep.buscarCep(jFormattedTextFieldCEP.getText().toString().replaceAll("[^0-9]+", ""))) {
            jTextFieldCidade.setText(cep.getCidade());
            jTextFieldEstado.setText(cep.getUf());
            jTextFieldBairro.setText(cep.getBairro());
            jTextFieldEndereco.setText(cep.getLogradouro());
        }
    }//GEN-LAST:event_jFormattedTextFieldCEPFocusLost

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int indiceTabela = jTablePropriedadesCadastradas.getSelectedRow();
        Object codPropriedade = propriedadesListModel.getValueAt(indiceTabela, 0);
        
        if (propriedadesDao.verificaGranjasVinculadas((Integer) codPropriedade)) {
            mensagens.errorMessage("Exclusão Inválida","Existem uma ou mais granjas vinculadas a propriedade");
        } else {
            propriedadesDao.remover((Integer) codPropriedade);
            listagemDeDados("");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if (jTablePropriedadesCadastradas.getSelectedRow() != -1) {
            int indiceTabela = jTablePropriedadesCadastradas.getSelectedRow();
            Object codPropriedade = propriedadesListModel.getValueAt(indiceTabela, 0);
            
            EditarPropriedades editarPropriedades = new EditarPropriedades(propriedadesDao.buscarPorCodigo((Integer) codPropriedade), this);

            int x = (int) (getParent().getWidth() - editarPropriedades.getWidth()) / 2;
            int y = (int) (getParent().getHeight() - editarPropriedades.getHeight()) / 2;

            editarPropriedades.setLocation(x, y);

            getParent().add(editarPropriedades);
            editarPropriedades.setVisible(true);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    public void listagemDeDados(String nome) {
        // Listagem na tabela por nome
        List<Propriedades> lista = propriedadesDao.buscarPorNome(nome);
        propriedadesListModel = new PropriedadesListModel(lista);
        jTablePropriedadesCadastradas.setModel(propriedadesListModel);
    }
        
    private void limpaCampos() {
        jTextFieldNomePropriedade.setText("");
        jFormattedTextFieldDataAquisicao.setText("");
        jFormattedTextFieldCEP.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldBairro.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
    }
    
    private boolean validaCampos() {
        if (jTextFieldNomePropriedade.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Nome Propriedade");
            jTextFieldNomePropriedade.requestFocus();
            return false;
        } else if (jFormattedTextFieldDataAquisicao.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Data Aquisição");
            jFormattedTextFieldDataAquisicao.requestFocus();
            return false;
        } else if (jFormattedTextFieldCEP.getText().toString().replaceAll("[^0-9]+", "").isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo CEP");
            jFormattedTextFieldCEP.requestFocus();
            return false;
        } else if (jTextFieldCidade.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Cidade");
            jTextFieldCidade.requestFocus();
            return false;
        } else if (jTextFieldEstado.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Estado");
            jTextFieldEstado.requestFocus();
            return false;
        } else if (jTextFieldBairro.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Bairro");
            jTextFieldBairro.requestFocus();
            return false;
        } else if (jTextFieldEndereco.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Endereço");
            jTextFieldEndereco.requestFocus();
            return false;
        } else if (jTextFieldNumero.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Numero");
            jTextFieldNumero.requestFocus();
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
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataAquisicao;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDataAquisicao;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNomePropriedade;
    private javax.swing.JLabel jLabelNomePropriedadePesquisa;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JPanel jPanelAdicionarPropriedadeAba1;
    private javax.swing.JPanel jPanelPropriedadesCadastradasAba2;
    private javax.swing.JScrollPane jScrollPanelPropriedadesCadastradas;
    private javax.swing.JTabbedPane jTabbedPanePropriedades;
    private javax.swing.JTable jTablePropriedadesCadastradas;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedadePesquisar;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}