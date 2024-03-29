/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.DAO.PropriedadesDao;
import br.edu.utfpr.entidades.Propriedades;
import br.edu.utfpr.funcoes.Cep;
import br.edu.utfpr.funcoes.Mensagens;
import br.edu.utfpr.model.PropriedadesListModel;
import java.util.List;

/**
 *
 * @author ferlo
 */
public class EditarPropriedades extends javax.swing.JInternalFrame {
    List<Propriedades> ListaPropriedade;
    PropriedadesListModel propriedadesListModel;
    
    CadastroDePropriedades cadastroDePropriedades;
    
    // Conexão com banco
    PropriedadesDao propriedadesDao = new PropriedadesDao();
    
    // Funcoes para mensagens
    Mensagens mensagens = new Mensagens();
    
    int idPropriedade;
    
    public EditarPropriedades(List<Propriedades> ListaPropriedade, CadastroDePropriedades cadastroDePropriedades) {
        initComponents();
        this.ListaPropriedade = ListaPropriedade;
        this.cadastroDePropriedades = cadastroDePropriedades;
        alimentaCampos();
    }
    
    public void alimentaCampos() {
        propriedadesListModel = new PropriedadesListModel(ListaPropriedade);
        
        idPropriedade = Integer.parseInt(propriedadesListModel.getValueAt(0, 0).toString());
        jTextFieldNomePropriedade.setText(propriedadesListModel.getValueAt(0, 1).toString());
        jFormattedTextFieldDataAquisicao.setText(propriedadesListModel.getValueAt(0, 2).toString());
        jFormattedTextFieldCEP.setText(propriedadesListModel.getValueAt(0, 3).toString());
        jTextFieldEstado.setText(propriedadesListModel.getValueAt(0, 4).toString());
        jTextFieldCidade.setText(propriedadesListModel.getValueAt(0, 5).toString());
        jTextFieldBairro.setText(propriedadesListModel.getValueAt(0, 6).toString());
        jTextFieldEndereco.setText(propriedadesListModel.getValueAt(0, 7).toString());
        jTextFieldNumero.setText(propriedadesListModel.getValueAt(0, 8).toString());
        jTextFieldComplemento.setText(propriedadesListModel.getValueAt(0, 9).toString());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEstado = new javax.swing.JLabel();
        jFormattedTextFieldDataAquisicao = new javax.swing.JFormattedTextField();
        jLabelCidade = new javax.swing.JLabel();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldCidade = new javax.swing.JTextField();
        jButtonFecharAba1 = new javax.swing.JButton();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelNomePropriedade = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelDataAquisicao = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar Propriedades");

        jLabelEstado.setText("Estado *");

        jFormattedTextFieldDataAquisicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabelCidade.setText("Cidade *");

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

        jLabelEndereco.setText("Endereço *");

        jLabelBairro.setText("Bairro *");

        jLabelNumero.setText("Número *");

        jLabelComplemento.setText("Complemento");

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonFecharAba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba1.setText("Cancelar");
        jButtonFecharAba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba1ActionPerformed(evt);
            }
        });

        jLabelNomePropriedade.setText("Nome da Propriedade *");

        jLabelDataAquisicao.setText("Data de Aquisição *");

        jLabelCEP.setText("CEP *");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComplemento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFecharAba1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndereco)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNomePropriedade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomePropriedade, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDataAquisicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePropriedade)
                    .addComponent(jLabelDataAquisicao)
                    .addComponent(jTextFieldNomePropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCEP)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFecharAba1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            
            propriedades.setIdPropriedades(idPropriedade);
            
            // Gravação no banco
            propriedadesDao.alterar(propriedades);
            
            listagemDeDados("");
            
            super.dispose();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonFecharAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba1ActionPerformed

    private void listagemDeDados(String nome) {
        cadastroDePropriedades.listagemDeDados(nome);
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
    private javax.swing.JButton jButtonFecharAba1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataAquisicao;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDataAquisicao;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNomePropriedade;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
