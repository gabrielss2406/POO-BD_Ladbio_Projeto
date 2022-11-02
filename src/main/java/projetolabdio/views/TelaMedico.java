/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetolabdio.views;

import projetolabdio.views.TelaPacienteC;
import projetolabdio.models.Paciente;
import javax.swing.DefaultListModel;
import projetolabdio.views.user_auth.TelaLogin;

/**
 *
 * @author aluno
 */
public class TelaMedico extends javax.swing.JFrame {

    /**
     * Creates new form TelaMedico
     */
    public TelaMedico() {
        initComponents();
        
        // Fazer isso em um controller
        DefaultListModel m = new DefaultListModel();
        m.addElement("a");
        m.addElement("b");
        m.addElement("c");
        Pacientes_jList.setModel(m);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Pacientes_jList = new javax.swing.JList<>();
        List_lbl = new javax.swing.JLabel();
        Pac_Create_btn = new javax.swing.JButton();
        Logout_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        Pacientes_jList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pacientes_jListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Pacientes_jList);

        List_lbl.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        List_lbl.setForeground(new java.awt.Color(255, 255, 255));
        List_lbl.setText("Lista de Pacientes");

        Pac_Create_btn.setBackground(new java.awt.Color(102, 255, 102));
        Pac_Create_btn.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        Pac_Create_btn.setText("Adicionar novo paciente");
        Pac_Create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pac_Create_btnActionPerformed(evt);
            }
        });

        Logout_btn1.setBackground(new java.awt.Color(204, 204, 255));
        Logout_btn1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        Logout_btn1.setText("Logout");
        Logout_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(List_lbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(Pac_Create_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(Logout_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(722, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(List_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pac_Create_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(Logout_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(545, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pacientes_jListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pacientes_jListMouseClicked
        // DoubleClick in elements
        if (evt.getClickCount() == 2) {
            int index = Pacientes_jList.locationToIndex(evt.getPoint());
            System.out.println(index);
            
            // Isso aqui tem q ir pro controllers
            Paciente p = new Paciente(12, "1231231", Pacientes_jList.getSelectedValue(), "232131231", "endereco", 123);
            TelaPacienteR read = new TelaPacienteR(p);
            this.dispose();
            read.setVisible(true);
        }
    }//GEN-LAST:event_Pacientes_jListMouseClicked

    private void Pac_Create_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pac_Create_btnActionPerformed
        // Create paciente
        TelaPacienteC pac_create = new TelaPacienteC();
        this.dispose();
        pac_create.setVisible(true);
    }//GEN-LAST:event_Pac_Create_btnActionPerformed

    private void Logout_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_btn1ActionPerformed
        // Back to login
        TelaLogin login = new TelaLogin();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_Logout_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel List_lbl;
    private javax.swing.JButton Logout_btn1;
    private javax.swing.JButton Pac_Create_btn;
    private javax.swing.JList<String> Pacientes_jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
