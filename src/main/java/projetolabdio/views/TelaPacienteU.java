/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetolabdio.views;

import java.awt.Color;
import javax.swing.JOptionPane;
import projetolabdio.controllers.PacienteController;

/**
 * Screen for update Paciente
 * @author Gabriel Siqueira
 * @since 18/11/2022
 * @version 1.0
 */
public class TelaPacienteU extends javax.swing.JFrame {

    
    // Attributes
    private String cpf_user; // Cpf of this Paciente
    
    /**
     * Creates new form TelaPacienteU
     * @param cpf 
     */
    public TelaPacienteU(String cpf) {
        initComponents();
        cpf_user = cpf;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserTel_txtField = new javax.swing.JTextField();
        UserEnderc_txtField = new javax.swing.JTextField();
        Enderc_lbl = new javax.swing.JLabel();
        Tel_lbl = new javax.swing.JLabel();
        UptEnder_btn = new javax.swing.JButton();
        UptTel_btn = new javax.swing.JButton();
        Back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));

        UserTel_txtField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        UserTel_txtField.setForeground(java.awt.Color.gray);
        UserTel_txtField.setText("Novo telefone");
        UserTel_txtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserTel_txtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UserTel_txtFieldFocusLost(evt);
            }
        });

        UserEnderc_txtField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        UserEnderc_txtField.setForeground(java.awt.Color.gray);
        UserEnderc_txtField.setText("Novo endereço");
        UserEnderc_txtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserEnderc_txtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UserEnderc_txtFieldFocusLost(evt);
            }
        });

        Enderc_lbl.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Enderc_lbl.setText("Endereço");

        Tel_lbl.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Tel_lbl.setText("Telefone");

        UptEnder_btn.setBackground(new java.awt.Color(153, 204, 255));
        UptEnder_btn.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        UptEnder_btn.setText("Atualizar Endereco");
        UptEnder_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UptEnder_btnActionPerformed(evt);
            }
        });

        UptTel_btn.setBackground(new java.awt.Color(153, 204, 255));
        UptTel_btn.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        UptTel_btn.setText("Atualizar Telefone");
        UptTel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UptTel_btnActionPerformed(evt);
            }
        });

        Back_btn.setBackground(new java.awt.Color(204, 204, 255));
        Back_btn.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        Back_btn.setText("Voltar para o Menu");
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UptEnder_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tel_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Enderc_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserEnderc_txtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(UserTel_txtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(UptTel_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(Tel_lbl)
                .addGap(1, 1, 1)
                .addComponent(UserTel_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UptTel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Enderc_lbl)
                .addGap(1, 1, 1)
                .addComponent(UserEnderc_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UptEnder_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Placeholder function of UserTel_txtField
     * Remove the placeholder when gain focus
     */
    private void UserTel_txtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserTel_txtFieldFocusGained
        String user = UserTel_txtField.getText();
        if("".equals(user) || "Novo telefone".equals(user)){
            UserTel_txtField.setForeground(Color.BLACK);
            UserTel_txtField.setText("");
        }
    }//GEN-LAST:event_UserTel_txtFieldFocusGained

    /**
     * Placeholder function of UserTel_txtField
     * Return the placeholder when lost focus
     */
    private void UserTel_txtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserTel_txtFieldFocusLost
        String user = UserTel_txtField.getText();
        if("".equals(user) || "Novo telefone".equals(user)){
            UserTel_txtField.setForeground(Color.GRAY);
            UserTel_txtField.setText("Novo telefone");
        }
    }//GEN-LAST:event_UserTel_txtFieldFocusLost

    /**
     * Placeholder function of UserEnderc_txtField
     * Remove the placeholder when gain focus
     */
    private void UserEnderc_txtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserEnderc_txtFieldFocusGained
        String user = UserEnderc_txtField.getText();
        if("".equals(user) || "Novo endereço".equals(user)){
            UserEnderc_txtField.setForeground(Color.BLACK);
            UserEnderc_txtField.setText("");
        }
    }//GEN-LAST:event_UserEnderc_txtFieldFocusGained

    /**
     * Placeholder function of UserEnderc_txtField
     * Return the placeholder when lost focus
     */
    private void UserEnderc_txtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserEnderc_txtFieldFocusLost
        String user = UserEnderc_txtField.getText();
        if("".equals(user) || "Novo endereço".equals(user)){
            UserEnderc_txtField.setForeground(Color.GRAY);
            UserEnderc_txtField.setText("Novo endereço");
        }
    }//GEN-LAST:event_UserEnderc_txtFieldFocusLost

    /**
     * Use PacienteController for update Paciente Endereco
     */
    private void UptEnder_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UptEnder_btnActionPerformed
        // Update Paciente Endereco
        boolean req;
        int showConfirmDialog;
        showConfirmDialog = JOptionPane.showConfirmDialog(rootPane, "Certeza que quer atualizar o endereço?", "Atualizar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if(showConfirmDialog == 0){ // Yes == 0
            PacienteController paciente = new PacienteController();
            req = paciente.updatePacienteEndereco(cpf_user, UserEnderc_txtField.getText());
            if (req){
                JOptionPane.showMessageDialog(rootPane, "Endereço atualizado com sucesso!", "Atualizar", JOptionPane.INFORMATION_MESSAGE); 
                UptEnder_btn.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Endereço não conseguiu ser atualizado!", "Atualizar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_UptEnder_btnActionPerformed

    /**
     * Use PacienteController for update Paciente Telefone
     */
    private void UptTel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UptTel_btnActionPerformed
        // Update Paciente Telefone
        boolean req;
        int showConfirmDialog;
        showConfirmDialog = JOptionPane.showConfirmDialog(rootPane, "Certeza que quer atualizar o telefone?", "Atualizar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if(showConfirmDialog == 0){ // Yes == 0
            PacienteController paciente = new PacienteController();
            req = paciente.updatePacienteTelefone(cpf_user, UserTel_txtField.getText());
            if (req){
                JOptionPane.showMessageDialog(rootPane, "Telefone atualizado com sucesso!", "Atualizar", JOptionPane.INFORMATION_MESSAGE); 
                UptTel_btn.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Telefone não conseguiu ser atualizado!", "Atualizar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_UptTel_btnActionPerformed

    /**
     * Back to the main screen of user, TelaMedico
     */
    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        // Back to TelaMedico
        TelaMedico medico = new TelaMedico();
        this.dispose();
        medico.setVisible(true);
    }//GEN-LAST:event_Back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPacienteU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPacienteU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPacienteU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPacienteU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String cpf = null;
                new TelaPacienteU(cpf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JLabel Enderc_lbl;
    private javax.swing.JLabel Tel_lbl;
    private javax.swing.JButton UptEnder_btn;
    private javax.swing.JButton UptTel_btn;
    private javax.swing.JTextField UserEnderc_txtField;
    private javax.swing.JTextField UserTel_txtField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}