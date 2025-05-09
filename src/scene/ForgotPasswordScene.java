/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scene;

import javax.swing.JOptionPane;
import model.User;
import repository.UserRepositoryImpl;

/**
 *
 * @author HP
 */
public class ForgotPasswordScene extends javax.swing.JFrame {
    private UserRepositoryImpl userRepositoryImpl;
    public ForgotPasswordScene() {
        initComponents();
        userRepositoryImpl = new UserRepositoryImpl();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        findPasswordField = new javax.swing.JTextField();
        findPasswordBtn = new javax.swing.JButton();
        backLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forgot Password Scene");
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nhập email tài khoản của bạn để lấy lại mật khẩu");

        findPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        findPasswordBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        findPasswordBtn.setText("Tìm mật khẩu");
        findPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPasswordBtnActionPerformed(evt);
            }
        });

        backLoginBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backLoginBtn.setText("Quay lại trang Login");
        backLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(findPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(backLoginBtn)
                        .addGap(43, 43, 43)
                        .addComponent(findPasswordBtn)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(findPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findPasswordBtn)
                    .addComponent(backLoginBtn))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLoginBtnActionPerformed
        this.dispose(); //Tự tắt chính nó
    }//GEN-LAST:event_backLoginBtnActionPerformed

    private void findPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPasswordBtnActionPerformed
        String emailFindPassword = findPasswordField.getText();
        
        if (emailFindPassword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email", "Thiếu email", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        User usedFound = userRepositoryImpl.findByEmail(emailFindPassword);
        if (usedFound != null) {
            JOptionPane.showMessageDialog(this, "Mật khẩu tài khoản của bạn là: " + usedFound.getMatKhau(), "Hiện mật khẩu", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản có email đã nhập ", "Không tìm thấy", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_findPasswordBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPasswordScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordScene().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backLoginBtn;
    private javax.swing.JButton findPasswordBtn;
    private javax.swing.JTextField findPasswordField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
