/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.DAO.EntradaLotesDao;
import br.edu.utfpr.DAO.GranjasDao;
import br.edu.utfpr.entidades.EntradaLotes;
import br.edu.utfpr.entidades.Granjas;
import br.edu.utfpr.funcoes.Mensagens;
import br.edu.utfpr.model.EntradaDeLotesListModel;
import br.edu.utfpr.model.GranjasListModel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ferlo
 */
public class EditarEntradaDeLotes extends javax.swing.JInternalFrame {
    // Guarda os codigos das granjas do combobox
    Integer[] codigosGranjas;
    
    // Guarda as quantidades de frangos das granjas do combobox
    Integer[] quantidadesFrangosGranjas;
    
    // Conexão com banco
    GranjasDao granjasDao = new GranjasDao();
    GranjasListModel granjasListModel;
    
    // Conexão com banco
    EntradaLotesDao entradaLotesDao = new EntradaLotesDao();
    EntradaDeLotesListModel entradaLotesListModel;
    
    List<EntradaLotes> ListaEntradaLotes;
    EntradaDeLotes entradaDeLotes;
    
    // Funcoes para mensagens
    Mensagens mensagens = new Mensagens();
    
    int idLote;
    
    public EditarEntradaDeLotes(List<EntradaLotes> ListaEntradaLotes, EntradaDeLotes entradaDeLotes) {
        initComponents();
        
        this.ListaEntradaLotes = ListaEntradaLotes;
        this.entradaDeLotes = entradaDeLotes;
        
        alimentaComboBoxGranjas();
        alimentaCampos();
    }
    
    public void alimentaCampos() {
        entradaLotesListModel = new EntradaDeLotesListModel(ListaEntradaLotes);
        
        idLote = Integer.parseInt(entradaLotesListModel.getValueAt(0, 0).toString());
        jTextFieldIdentificador.setText(entradaLotesListModel.getValueAt(0, 1).toString());
        jComboBoxGranjas.setSelectedIndex(indexComboBoxPeloCodigo(entradaLotesDao.codGranjaPeloCodLote(idLote)));
        jFormattedTextFieldQuantidadeFrangos.setText(entradaLotesListModel.getValueAt(0, 3).toString());
        jFormattedTextFieldValorEntrada.setText(entradaLotesListModel.getValueAt(0, 4).toString().replace(".", ","));
        jFormattedTextFieldDataEntrada.setText(entradaLotesListModel.getValueAt(0, 5).toString());
    }
    
    private void alimentaComboBoxGranjas() {
        
        List<Granjas> listaGranjas = granjasDao.listar();
        granjasListModel = new GranjasListModel(listaGranjas);
        
        // Cria um array com os itens para a ComboBox
        String[] nomesGranjas = new String[granjasListModel.getRowCount()+1];
        
        codigosGranjas = new Integer[granjasListModel.getRowCount()];
        quantidadesFrangosGranjas = new Integer[granjasListModel.getRowCount()];
        
        for (int i=0; i<=granjasListModel.getRowCount(); i++) {
            if (i==0) {
                nomesGranjas[i] = "Selecione a Granja";
            } else {
                nomesGranjas[i] = granjasListModel.getValueAt(i-1, 1).toString();
                codigosGranjas[i-1] = Integer.parseInt(granjasListModel.getValueAt(i-1, 0).toString());
                quantidadesFrangosGranjas[i-1] = Integer.parseInt(granjasListModel.getValueAt(i-1, 4).toString());
            }
        }
        
        // Cria um modelo de dados para a ComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(nomesGranjas);

        // Define o modelo de dados
        jComboBoxGranjas.setModel(model);
    }
    
    private int indexComboBoxPeloCodigo(int codigo) {
        int index = 0;
        for (int i=0; i<codigosGranjas.length; i++) {
            if (codigosGranjas[i] == codigo) {
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

        jLabelDataEntrada = new javax.swing.JLabel();
        jButtonFecharAba1 = new javax.swing.JButton();
        jFormattedTextFieldDataEntrada = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jLabelIdentificador = new javax.swing.JLabel();
        jLabelQuantidadeFrangos = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jComboBoxGranjas = new javax.swing.JComboBox<>();
        jFormattedTextFieldQuantidadeFrangos = new javax.swing.JFormattedTextField();
        jLabelGranja = new javax.swing.JLabel();
        jLabelValorEntrada = new javax.swing.JLabel();
        jFormattedTextFieldValorEntrada = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar Entrada de Lotes");

        jLabelDataEntrada.setText("Data da Entrada *");

        jButtonFecharAba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fechar.png"))); // NOI18N
        jButtonFecharAba1.setText("Cancelar");
        jButtonFecharAba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAba1ActionPerformed(evt);
            }
        });

        jFormattedTextFieldDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelIdentificador.setText("Identificador *");

        jLabelQuantidadeFrangos.setText("Quantidade de Frangos *");

        jComboBoxGranjas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Granja", "Granja Teste" }));

        jFormattedTextFieldQuantidadeFrangos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

        jLabelGranja.setText("Granja *");

        jLabelValorEntrada.setText("Valor de Entrada do Lote *");

        jFormattedTextFieldValorEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFecharAba1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIdentificador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdentificador))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelGranja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxGranjas, 0, 409, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQuantidadeFrangos)
                            .addComponent(jLabelValorEntrada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldValorEntrada)
                            .addComponent(jFormattedTextFieldQuantidadeFrangos)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDataEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataEntrada)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificador)
                    .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGranjas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGranja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldQuantidadeFrangos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidadeFrangos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorEntrada)
                    .addComponent(jFormattedTextFieldValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataEntrada)
                    .addComponent(jFormattedTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFecharAba1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAba1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButtonFecharAba1ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (validaCampos()) {
            EntradaLotes entradaLotes = new EntradaLotes(
                jTextFieldIdentificador.getText(),
                codigosGranjas[jComboBoxGranjas.getSelectedIndex()-1],
                jComboBoxGranjas.getSelectedItem().toString(),
                Integer.parseInt(jFormattedTextFieldQuantidadeFrangos.getText().toString().replace(".", "")),
                Float.parseFloat(jFormattedTextFieldValorEntrada.getText().toString().replace(".", "").replace(",", ".")),
                jFormattedTextFieldDataEntrada.getText().toString()
            );
            
            entradaLotes.setIdLote(idLote);
            
            // Gravação no banco
            entradaLotesDao.alterar(entradaLotes);
            
            listagemDeDados("");
            
            super.dispose();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void listagemDeDados(String nome) {
        entradaDeLotes.listagemDeDados(nome);
    }
    
    private boolean validaCampos() {
        if (jTextFieldIdentificador.getText().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Identificador");
            jTextFieldIdentificador.requestFocus();
            return false;
        } else if (jComboBoxGranjas.getSelectedIndex() == 0) {
            mensagens.errorMessage("Campo Inválido","Selecione uma Granja");
            jComboBoxGranjas.requestFocus();
            return false;
        } else if (jFormattedTextFieldQuantidadeFrangos.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Quantidade de Frangos");
            jFormattedTextFieldQuantidadeFrangos.requestFocus();
            return false;
        } else if (jFormattedTextFieldQuantidadeFrangos.getText().toString().equals("0")) {
            mensagens.errorMessage("Campo Inválido","Preencha uma Quantidade maior que 0");
            jFormattedTextFieldQuantidadeFrangos.requestFocus();
            return false;
        } else if (Integer.parseInt(jFormattedTextFieldQuantidadeFrangos.getText().toString().replace(".", ""))>quantidadesFrangosGranjas[jComboBoxGranjas.getSelectedIndex()-1]) {
            mensagens.errorMessage("Campo Inválido","Capacidade da Granja excedida, preencha uma Quantidade de Frangos menor ou igual a "+quantidadesFrangosGranjas[jComboBoxGranjas.getSelectedIndex()-1].toString()+" frangos");
            jFormattedTextFieldQuantidadeFrangos.requestFocus();
            return false;
        } else if (jFormattedTextFieldValorEntrada.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Valor de Entrada do Lote");
            jFormattedTextFieldValorEntrada.requestFocus();
            return false;
        } else if (jFormattedTextFieldValorEntrada.getText().toString().equals("0,00")) {
            mensagens.errorMessage("Campo Inválido","Preencha um Valor de Entrada do Lote maior que 0");
            jFormattedTextFieldValorEntrada.requestFocus();
            return false;
        } else if (jFormattedTextFieldDataEntrada.getText().toString().isEmpty()) {
            mensagens.errorMessage("Campo Inválido","Preencha o campo Data da Entrada");
            jFormattedTextFieldDataEntrada.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFecharAba1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxGranjas;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldQuantidadeFrangos;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorEntrada;
    private javax.swing.JLabel jLabelDataEntrada;
    private javax.swing.JLabel jLabelGranja;
    private javax.swing.JLabel jLabelIdentificador;
    private javax.swing.JLabel jLabelQuantidadeFrangos;
    private javax.swing.JLabel jLabelValorEntrada;
    private javax.swing.JTextField jTextFieldIdentificador;
    // End of variables declaration//GEN-END:variables
}
