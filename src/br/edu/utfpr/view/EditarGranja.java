/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.DAO.GranjasDao;
import br.edu.utfpr.DAO.PropriedadesDao;
import br.edu.utfpr.entidades.Granjas;
import br.edu.utfpr.entidades.Propriedades;
import br.edu.utfpr.funcoes.Mensagens;
import br.edu.utfpr.model.GranjasListModel;
import br.edu.utfpr.model.PropriedadesListModel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ferlo
 */
public class EditarGranja extends javax.swing.JInternalFrame {
    // Guarda os codigos das propriedades do combobox
    Integer[] codigosPropriedades;
    
    // Conexão com banco
    PropriedadesDao propriedadesDao = new PropriedadesDao();
    PropriedadesListModel propriedadesListModel;
    
    // Conexão com banco
    GranjasDao granjasDao = new GranjasDao();
    List<Granjas> ListaGranjas;
    GranjasListModel granjasListModel;
    
    int idGranja;
    
    // Funcoes para mensagens
    Mensagens mensagens = new Mensagens();
    
    CadastroDeGranjas cadastroDeGranjas;
    
    public EditarGranja(List<Granjas> ListaGranjas, CadastroDeGranjas cadastroDeGranjas) {
        initComponents();
        
        this.ListaGranjas = ListaGranjas;
        this.cadastroDeGranjas = cadastroDeGranjas;
        
        alimentaComboBoxPropriedades();
        alimentaCampos();
    }
    
    private void alimentaComboBoxPropriedades() {
        
        List<Propriedades> listaPropriedade = propriedadesDao.listar();
        propriedadesListModel = new PropriedadesListModel(listaPropriedade);
        
        // Cria um array com os itens para a ComboBox
        String[] nomesPropriedades = new String[propriedadesListModel.getRowCount()+1];
        
        codigosPropriedades = new Integer[propriedadesListModel.getRowCount()];
        
        for (int i=0; i<=propriedadesListModel.getRowCount(); i++) {
            if (i==0) {
                nomesPropriedades[i] = "Selecione a Propriedade";
            } else {
                nomesPropriedades[i] = propriedadesListModel.getValueAt(i-1, 1).toString();
                codigosPropriedades[i-1] = Integer.parseInt(propriedadesListModel.getValueAt(i-1, 0).toString());
            }
        }
        
        // Cria um modelo de dados para a ComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(nomesPropriedades);

        // Define o modelo de dados
        jComboBoxPropriedade.setModel(model);
    }

    public void alimentaCampos() {
        granjasListModel = new GranjasListModel(ListaGranjas);
        
        idGranja = Integer.parseInt(granjasListModel.getValueAt(0, 0).toString());
        jTextFieldIdentificador.setText(granjasListModel.getValueAt(0, 1).toString());
        jComboBoxPropriedade.setSelectedIndex(indexComboBoxPeloCodigo(granjasDao.codPropriedadePeloCodGranja(idGranja)));
        jFormattedTextFieldDataIniAtividades.setText(granjasListModel.getValueAt(0, 3).toString());
        jFormattedTextFieldQuantidadeFrangosSuportadas.setText(granjasListModel.getValueAt(0, 4).toString());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jFormattedTextFieldDataIniAtividades = new javax.swing.JFormattedTextField();
        jFormattedTextFieldQuantidadeFrangosSuportadas = new javax.swing.JFormattedTextField();
        jLabelIdentificador = new javax.swing.JLabel();
        jLabelIdentificadorPropriedade = new javax.swing.JLabel();
        jComboBoxPropriedade = new javax.swing.JComboBox<>();
        jLabelIdentificadorDataIniAtividades = new javax.swing.JLabel();
        jLabelFrangosSuportados = new javax.swing.JLabel();
        jButtonFecharAba1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar Granja");

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jFormattedTextFieldDataIniAtividades.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jFormattedTextFieldQuantidadeFrangosSuportadas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

        jLabelIdentificador.setText("Identificador *");
        jLabelIdentificador.setName(""); // NOI18N

        jLabelIdentificadorPropriedade.setText("Propriedade *");
        jLabelIdentificadorPropriedade.setName(""); // NOI18N

        jComboBoxPropriedade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Propriedade" }));

        jLabelIdentificadorDataIniAtividades.setText("Data de Início das Atividades * ");
        jLabelIdentificadorDataIniAtividades.setName(""); // NOI18N

        jLabelFrangosSuportados.setText("Quantidade de Frangos Suportada * ");

        jButtonFecharAba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba1.setText("Cancelar");
        jButtonFecharAba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 342, Short.MAX_VALUE)
                        .addComponent(jButtonFecharAba1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIdentificador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIdentificador))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIdentificadorDataIniAtividades)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDataIniAtividades))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFrangosSuportados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldQuantidadeFrangosSuportadas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIdentificadorPropriedade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPropriedade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificador)
                    .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificadorPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIdentificadorDataIniAtividades)
                    .addComponent(jFormattedTextFieldDataIniAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFrangosSuportados)
                    .addComponent(jFormattedTextFieldQuantidadeFrangosSuportadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharAba1)
                    .addComponent(jButtonSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int indexComboBoxPeloCodigo(int codigo) {
        int index = 0;
        for (int i=0; i<codigosPropriedades.length; i++) {
            if (codigosPropriedades[i] == codigo) {
                index = i+1;
            }
        }
        return index;
    }
            
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (validaCampos()) {
            Granjas granjas = new Granjas(
                jTextFieldIdentificador.getText(),
                codigosPropriedades[jComboBoxPropriedade.getSelectedIndex()-1],
                jComboBoxPropriedade.getSelectedItem().toString(),
                jFormattedTextFieldDataIniAtividades.getText().toString(),
                Integer.parseInt(jFormattedTextFieldQuantidadeFrangosSuportadas.getText().toString().replace(".", ""))
            );
            
            granjas.setIdGranja(idGranja);
            
            // Gravação no banco
            granjasDao.alterar(granjas);
                    
            listagemDeDados("");
            
            super.dispose();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonFecharAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba1ActionPerformed

    private void listagemDeDados(String nome) {
        cadastroDeGranjas.listagemDeDados(nome);
    }
    
    private boolean validaCampos() {
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
    private javax.swing.JButton jButtonFecharAba1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxPropriedade;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataIniAtividades;
    private javax.swing.JFormattedTextField jFormattedTextFieldQuantidadeFrangosSuportadas;
    private javax.swing.JLabel jLabelFrangosSuportados;
    private javax.swing.JLabel jLabelIdentificador;
    private javax.swing.JLabel jLabelIdentificadorDataIniAtividades;
    private javax.swing.JLabel jLabelIdentificadorPropriedade;
    private javax.swing.JTextField jTextFieldIdentificador;
    // End of variables declaration//GEN-END:variables
}
