/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas.view;

import jpa_per.dao.*;
import javax.swing.DefaultListModel;
import javax.swing.*;
import Modelos.*;

/**
 *
 * @author Jennifer Ebertz
 */
public class TelaMedicamentos extends javax.swing.JFrame {

    PersistenciaJPA jpa;
    /**
     * Creates new form TelaMedicamentos
     */
    public TelaMedicamentos() {
        initComponents();

        jpa = new PersistenciaJPA();
        carregarMedicamentosCadastrados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblBuscaDescricao = new javax.swing.JLabel();
        txtBuscaDescricao = new javax.swing.JTextField();
        btnNovoMedicamento = new javax.swing.JButton();
        btnEditarMedicamento = new javax.swing.JButton();
        btnRemoverMedicamento = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstMedicamentos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitulo.setText("Medicamentos Cadastrados");

        lblBuscaDescricao.setText("Descrição:");

        txtBuscaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaDescricaoActionPerformed(evt);
            }
        });
        txtBuscaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaDescricaoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaDescricaoKeyReleased(evt);
            }
        });

        btnNovoMedicamento.setText("Novo");
        btnNovoMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoMedicamentoActionPerformed(evt);
            }
        });

        btnEditarMedicamento.setText("Editar");
        btnEditarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMedicamentoActionPerformed(evt);
            }
        });

        btnRemoverMedicamento.setText("Remover");
        btnRemoverMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMedicamentoActionPerformed(evt);
            }
        });

        lstMedicamentos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lstMedicamentosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(lstMedicamentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscaDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnRemoverMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaDescricao)
                    .addComponent(txtBuscaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarMedicamento)
                    .addComponent(btnRemoverMedicamento)
                    .addComponent(btnNovoMedicamento))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaDescricaoActionPerformed

    private void txtBuscaDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaDescricaoKeyPressed

    }//GEN-LAST:event_txtBuscaDescricaoKeyPressed

    private void txtBuscaDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaDescricaoKeyReleased
        if(txtBuscaDescricao.getText().trim().isEmpty()){
            carregarMedicamentosCadastrados();
        } else{
            jpa.conexaoAberta();
            DefaultListModel modeloLista = new DefaultListModel();
            modeloLista.addAll(jpa.getMedicamentos(txtBuscaDescricao.getText().trim()));
            System.out.println("Medicamentos carregados: "+jpa.getMedicamentos(txtBuscaDescricao.getText().trim()));
            lstMedicamentos.setModel(modeloLista);

            jpa.fecharConexao();
        }
    }//GEN-LAST:event_txtBuscaDescricaoKeyReleased

    private void btnNovoMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoMedicamentoActionPerformed
        TelaCadastroMedicamentos telaCadastro
        = new TelaCadastroMedicamentos(this, rootPaneCheckingEnabled);
        telaCadastro.setVisible(true);

        carregarMedicamentosCadastrados();
    }//GEN-LAST:event_btnNovoMedicamentoActionPerformed

    private void btnEditarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMedicamentoActionPerformed
        Medicamentos medicamentoSel = lstMedicamentos.getSelectedValue();
        if (medicamentoSel != null) {
            TelaCadastroMedicamentos telaEdt = new TelaCadastroMedicamentos(this, rootPaneCheckingEnabled);
            telaEdt.setMedicamento(medicamentoSel);
            telaEdt.setVisible(true);

            carregarMedicamentosCadastrados();

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Medicamento para Editar");
        }
    }//GEN-LAST:event_btnEditarMedicamentoActionPerformed

    private void btnRemoverMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMedicamentoActionPerformed
        Medicamentos medicamentoSel = lstMedicamentos.getSelectedValue();
        if (medicamentoSel != null) {
            System.out.println("Medicamento: " + medicamentoSel.getId());
            try {
                jpa.conexaoAberta();

                int delOp = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja remover " + medicamentoSel.getDescricao() + "?");
                if (delOp == JOptionPane.YES_OPTION) {
                    jpa.remover(medicamentoSel);
                }

                jpa.fecharConexao();
                carregarMedicamentosCadastrados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "Erro ao remover medicamento " + medicamentoSel + "\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um medicamento para remover");
        }
    }//GEN-LAST:event_btnRemoverMedicamentoActionPerformed

    private void lstMedicamentosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstMedicamentosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lstMedicamentosAncestorAdded

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
            java.util.logging.Logger.getLogger(TelaMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMedicamentos().setVisible(true);
            }
        });
    }
        public void carregarMedicamentosCadastrados(){
        jpa.conexaoAberta();
        
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(jpa.getMedicamentos());
        lstMedicamentos.setModel(modeloLista);
        
        jpa.fecharConexao();
        
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarMedicamento;
    private javax.swing.JButton btnNovoMedicamento;
    private javax.swing.JButton btnRemoverMedicamento;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBuscaDescricao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Medicamentos> lstMedicamentos;
    private javax.swing.JTextField txtBuscaDescricao;
    // End of variables declaration//GEN-END:variables
}
