/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scene;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;
import repository.UserRepositoryImpl;

public class LoginScene extends javax.swing.JFrame {
    private UserRepositoryImpl userRepositoryImpl;
    
    public LoginScene() {
        initComponents();
        userRepositoryImpl = new UserRepositoryImpl();
        this.setLocationRelativeTo(null);
    }
    
    private boolean isPasswordValid(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$";
        return password.matches(passwordRegex);
    }
    
    public boolean isEmailValid(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(regex);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        image1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        nav = new javax.swing.JPanel();
        logInBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        forgetPasswordBtn = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        EmailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        enterBtn = new javax.swing.JButton();
        displayPassword = new javax.swing.JCheckBox();
        passwordField = new javax.swing.JPasswordField();
        TitleContent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Scene");
        setPreferredSize(new java.awt.Dimension(960, 540));

        header.setBackground(new java.awt.Color(255, 218, 185));
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scene/drink_icon.png"))); // NOI18N
        header.add(image1);

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(139, 69, 19));
        title.setText("APP QUẢN LÝ CỬA HÀNG ĐỒ ĂN - ĐỒ UỐNG HKMM");
        header.add(title);

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scene/food_icon.png"))); // NOI18N
        image2.setMinimumSize(new java.awt.Dimension(60, 80));
        image2.setPreferredSize(new java.awt.Dimension(60, 80));
        header.add(image2);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        nav.setBackground(new java.awt.Color(224, 255, 255));
        nav.setMinimumSize(new java.awt.Dimension(400, 100));
        nav.setPreferredSize(new java.awt.Dimension(350, 405));

        logInBtn.setBackground(new java.awt.Color(50, 224, 65));
        logInBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logInBtn.setText("Đăng nhập");
        logInBtn.setMargin(new java.awt.Insets(15, 30, 15, 30));

        clearBtn.setBackground(new java.awt.Color(211, 211, 211));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearBtn.setText("Xóa thông tin");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        forgetPasswordBtn.setBackground(new java.awt.Color(211, 211, 211));
        forgetPasswordBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        forgetPasswordBtn.setText("Quên mật khẩu");
        forgetPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPasswordBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forgetPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(forgetPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(nav, java.awt.BorderLayout.LINE_START);

        content.setBackground(new java.awt.Color(128, 128, 128));

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailLabel.setText("Email");

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PasswordLabel.setText("Password");

        enterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        enterBtn.setText("Nhập");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        displayPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayPassword.setText("Hiện/ Ẩn mật khẩu");
        displayPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPasswordActionPerformed(evt);
            }
        });

        TitleContent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TitleContent.setForeground(new java.awt.Color(255, 255, 255));
        TitleContent.setText("Đăng nhập");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(TitleContent, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(displayPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addComponent(enterBtn)
                        .addGap(253, 253, 253))))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(TitleContent)
                .addGap(26, 26, 26)
                .addComponent(EmailLabel)
                .addGap(6, 6, 6)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(PasswordLabel)
                .addGap(5, 5, 5)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(displayPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enterBtn)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(content, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        emailTextField.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void forgetPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPasswordBtnActionPerformed
        ForgotPasswordScene findPasswordForm = new ForgotPasswordScene(); 
        findPasswordForm.setVisible(true); 
        findPasswordForm.setLocationRelativeTo(this);
    }//GEN-LAST:event_forgetPasswordBtnActionPerformed

    private void displayPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPasswordActionPerformed
        if (displayPassword.isSelected()) {
            passwordField.setEchoChar((char) 0);
        } else {
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_displayPasswordActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        String email = emailTextField.getText();
        String password = new String(passwordField.getPassword());

        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin.", "Thiếu thông tin", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!isPasswordValid(password)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải có ít nhất 8 ký tự, bao gồm chữ thường, in hoa, số và ký tự đặc biệt!", "Mật khẩu không hợp lệ", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!isEmailValid(email)) {
            JOptionPane.showMessageDialog(this, "Định dạng email không hợp lệ.", "Email không hợp lệ", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        User user = userRepositoryImpl.findByEmailAndPassword(email, password);
        
        if (user == null) {
            JOptionPane.showMessageDialog(this, "Nhập sai thông tin email hoặc mật khẩu", "Tài khoản không hợp lệ", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        
        if (user.getChucVu().equalsIgnoreCase("ADMIN")) {
            AdminScene adminScene = new AdminScene();
            adminScene.setVisible(true);
            adminScene.setLocationRelativeTo(this);
        } else if (user.getChucVu().equalsIgnoreCase("USER")) {
            OrderScene orderScene = new OrderScene();
            orderScene.setVisible(true);
            orderScene.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_enterBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScene().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel TitleContent;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel content;
    private javax.swing.JCheckBox displayPassword;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton enterBtn;
    private javax.swing.JButton forgetPasswordBtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPanel nav;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
