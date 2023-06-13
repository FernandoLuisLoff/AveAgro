/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.DAO.ConexaoDao;
import br.edu.utfpr.funcoes.Mensagens;
import java.awt.Image; 
import java.awt.Graphics; 
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ferlo
 */
public class FormularioPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FormularioPrincipal() {
        initComponents();
        super.setExtendedState(FormularioPrincipal.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon background = new ImageIcon(getClass().getResource("/br/edu/utfpr/icones/backgroundFormularioPrincipal.png"));
        Image image = background.getImage();
        jDesktopPaneFormularioPrincipal = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics img) {
                img.drawImage(image, (getWidth()-getWidth()/4)/2, (getHeight()-getHeight()/3)/2, getWidth()/4, getHeight()/3, this);
            };
        };
        jMenuBarFormularioPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemPropriedades = new javax.swing.JMenuItem();
        jMenuItemGranja = new javax.swing.JMenuItem();
        jMenuItemItens = new javax.swing.JMenuItem();
        jMenuRegistrosLotes = new javax.swing.JMenu();
        jMenuItemEntradaLote = new javax.swing.JMenuItem();
        jMenuItemSaidaLote = new javax.swing.JMenuItem();
        jMenuItemPerdas = new javax.swing.JMenuItem();
        jMenuItemCustos = new javax.swing.JMenuItem();
        jMenuItemRelatorioLote = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AveAgro");

        javax.swing.GroupLayout jDesktopPaneFormularioPrincipalLayout = new javax.swing.GroupLayout(jDesktopPaneFormularioPrincipal);
        jDesktopPaneFormularioPrincipal.setLayout(jDesktopPaneFormularioPrincipalLayout);
        jDesktopPaneFormularioPrincipalLayout.setHorizontalGroup(
            jDesktopPaneFormularioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneFormularioPrincipalLayout.setVerticalGroup(
            jDesktopPaneFormularioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/cadastro.png"))); // NOI18N
        jMenuCadastro.setText("Cadastro");

        jMenuItemPropriedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/fazenda.png"))); // NOI18N
        jMenuItemPropriedades.setText("Propriedades");
        jMenuItemPropriedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPropriedadesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemPropriedades);

        jMenuItemGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/celeiro.png"))); // NOI18N
        jMenuItemGranja.setText("Granja");
        jMenuItemGranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGranjaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemGranja);

        jMenuItemItens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/produtos.png"))); // NOI18N
        jMenuItemItens.setText("Produtos/Insumos");
        jMenuItemItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemItensActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemItens);

        jMenuBarFormularioPrincipal.add(jMenuCadastro);

        jMenuRegistrosLotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/lote.png"))); // NOI18N
        jMenuRegistrosLotes.setText("Lotes");

        jMenuItemEntradaLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/entrada.png"))); // NOI18N
        jMenuItemEntradaLote.setText("Entrada de Lote");
        jMenuItemEntradaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEntradaLoteActionPerformed(evt);
            }
        });
        jMenuRegistrosLotes.add(jMenuItemEntradaLote);

        jMenuItemSaidaLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/saida.png"))); // NOI18N
        jMenuItemSaidaLote.setText("Saída de Lote");
        jMenuItemSaidaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaidaLoteActionPerformed(evt);
            }
        });
        jMenuRegistrosLotes.add(jMenuItemSaidaLote);

        jMenuItemPerdas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/perdas.png"))); // NOI18N
        jMenuItemPerdas.setText("Registro de Perdas");
        jMenuItemPerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPerdasActionPerformed(evt);
            }
        });
        jMenuRegistrosLotes.add(jMenuItemPerdas);

        jMenuItemCustos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/custos.png"))); // NOI18N
        jMenuItemCustos.setText("Registro de Custos");
        jMenuItemCustos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCustosActionPerformed(evt);
            }
        });
        jMenuRegistrosLotes.add(jMenuItemCustos);

        jMenuItemRelatorioLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/relatorio.png"))); // NOI18N
        jMenuItemRelatorioLote.setText("Relatório de Lote");
        jMenuItemRelatorioLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioLoteActionPerformed(evt);
            }
        });
        jMenuRegistrosLotes.add(jMenuItemRelatorioLote);

        jMenuBarFormularioPrincipal.add(jMenuRegistrosLotes);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/icones/sair.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMenuSairFocusGained(evt);
            }
        });
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarFormularioPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarFormularioPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneFormularioPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneFormularioPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemGranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGranjaActionPerformed
        CadastroDeGranjas cadastrarGranja = new CadastroDeGranjas();
        
        int x = (int) (jDesktopPaneFormularioPrincipal.getWidth() - cadastrarGranja.getWidth()) / 2;
        int y = (int) (jDesktopPaneFormularioPrincipal.getHeight() - cadastrarGranja.getHeight()) / 2;

        cadastrarGranja.setLocation(x, y);
        jDesktopPaneFormularioPrincipal.add(cadastrarGranja);
        cadastrarGranja.setVisible(true);
    }//GEN-LAST:event_jMenuItemGranjaActionPerformed

    private void jMenuItemPropriedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPropriedadesActionPerformed
        CadastroDePropriedades cadastroPropriedades = new CadastroDePropriedades();
        
        int x = (int) (jDesktopPaneFormularioPrincipal.getWidth() - cadastroPropriedades.getWidth()) / 2;
        int y = (int) (jDesktopPaneFormularioPrincipal.getHeight() - cadastroPropriedades.getHeight()) / 2;

        cadastroPropriedades.setLocation(x, y);
        jDesktopPaneFormularioPrincipal.add(cadastroPropriedades);
        cadastroPropriedades.setVisible(true);
    }//GEN-LAST:event_jMenuItemPropriedadesActionPerformed

    private void jMenuItemItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemItensActionPerformed
        CadastroDeProdutos cadastroProdutos = new CadastroDeProdutos();
        
        int x = (int) (jDesktopPaneFormularioPrincipal.getWidth() - cadastroProdutos.getWidth()) / 2;
        int y = (int) (jDesktopPaneFormularioPrincipal.getHeight() - cadastroProdutos.getHeight()) / 2;

        cadastroProdutos.setLocation(x, y);
        jDesktopPaneFormularioPrincipal.add(cadastroProdutos);
        cadastroProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuItemItensActionPerformed

    private void jMenuItemEntradaLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEntradaLoteActionPerformed
        EntradaDeLotes entradaDeLotes = new EntradaDeLotes();
        
        int x = (int) (jDesktopPaneFormularioPrincipal.getWidth() - entradaDeLotes.getWidth()) / 2;
        int y = (int) (jDesktopPaneFormularioPrincipal.getHeight() - entradaDeLotes.getHeight()) / 2;

        entradaDeLotes.setLocation(x, y);
        jDesktopPaneFormularioPrincipal.add(entradaDeLotes);
        entradaDeLotes.setVisible(true);
    }//GEN-LAST:event_jMenuItemEntradaLoteActionPerformed

    private void jMenuItemSaidaLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaidaLoteActionPerformed
        SaidaDeLotes saidaDeLotes = new SaidaDeLotes();
        
        int x = (int) (jDesktopPaneFormularioPrincipal.getWidth() - saidaDeLotes.getWidth()) / 2;
        int y = (int) (jDesktopPaneFormularioPrincipal.getHeight() - saidaDeLotes.getHeight()) / 2;

        saidaDeLotes.setLocation(x, y);
        jDesktopPaneFormularioPrincipal.add(saidaDeLotes);
        saidaDeLotes.setVisible(true);
    }//GEN-LAST:event_jMenuItemSaidaLoteActionPerformed

    private void jMenuItemPerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPerdasActionPerformed
        RegistroDePerdas registroDePerdas = new RegistroDePerdas();
        
        int x = (int) (jDesktopPaneFormularioPrincipal.getWidth() - registroDePerdas.getWidth()) / 2;
        int y = (int) (jDesktopPaneFormularioPrincipal.getHeight() - registroDePerdas.getHeight()) / 2;

        registroDePerdas.setLocation(x, y);
        jDesktopPaneFormularioPrincipal.add(registroDePerdas);
        registroDePerdas.setVisible(true);
    }//GEN-LAST:event_jMenuItemPerdasActionPerformed

    private void jMenuItemCustosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCustosActionPerformed
        RegistroDeCustos registroDeCustos = new RegistroDeCustos();
        
        int x = (int) (jDesktopPaneFormularioPrincipal.getWidth() - registroDeCustos.getWidth()) / 2;
        int y = (int) (jDesktopPaneFormularioPrincipal.getHeight() - registroDeCustos.getHeight()) / 2;

        registroDeCustos.setLocation(x, y);
        jDesktopPaneFormularioPrincipal.add(registroDeCustos);
        registroDeCustos.setVisible(true);
    }//GEN-LAST:event_jMenuItemCustosActionPerformed

    private void jMenuItemRelatorioLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioLoteActionPerformed
        RelatorioDeLote relatorioDeLote = new RelatorioDeLote();
        
        int x = (int) (jDesktopPaneFormularioPrincipal.getWidth() - relatorioDeLote.getWidth()) / 2;
        int y = (int) (jDesktopPaneFormularioPrincipal.getHeight() - relatorioDeLote.getHeight()) / 2;

        relatorioDeLote.setLocation(x, y);
        jDesktopPaneFormularioPrincipal.add(relatorioDeLote);
        relatorioDeLote.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelatorioLoteActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        Mensagens mensagens = new Mensagens();
        if(mensagens.confirmMessage("Sair", "Tem certeza que deseja encerrar a aplicação?")){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuSairFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenuSairFocusGained
        
    }//GEN-LAST:event_jMenuSairFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneFormularioPrincipal;
    private javax.swing.JMenuBar jMenuBarFormularioPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCustos;
    private javax.swing.JMenuItem jMenuItemEntradaLote;
    private javax.swing.JMenuItem jMenuItemGranja;
    private javax.swing.JMenuItem jMenuItemItens;
    private javax.swing.JMenuItem jMenuItemPerdas;
    private javax.swing.JMenuItem jMenuItemPropriedades;
    private javax.swing.JMenuItem jMenuItemRelatorioLote;
    private javax.swing.JMenuItem jMenuItemSaidaLote;
    private javax.swing.JMenu jMenuRegistrosLotes;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
