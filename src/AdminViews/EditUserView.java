package AdminViews;

import AdminViews.UserManager;
import javax.swing.JOptionPane;
import model.User;
import repository.UserRepositoryImpl;

public class EditUserView extends javax.swing.JFrame {
    private User user;

    public EditUserView(User user) {
        this.user = user;
        initComponents();
        loadUserData();
    }
    
    private void loadUserData() {
        jTextField_TenNhanVien.setText(user.getTen());
        jTextField_matKhau.setText(user.getMatKhau());
        jTextField_sdt.setText(user.getSdt());
        jTextField_email.setText(user.getEmail());
        queQuan.setText(user.getDiaChi());
        jComboBox_chucVu.setSelectedItem(user.getChucVu());

        if ("Nam".equalsIgnoreCase(user.getGioiTinh())) {
            jRadioButton_nam.setSelected(true);
        } else {
            jRadioButton_nu.setSelected(true);
        }

        switch (user.getCaLam()) {
            case "Ca sáng":
                jRadioButton_CaSang.setSelected(true);
                break;
            case "Ca chiều":
                jRadioButton_caTrua.setSelected(true);
                break;
            case "Ca tối":
                jRadioButton_caToi.setSelected(true);
                break;
            default:
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_gioiTinh = new javax.swing.ButtonGroup();
        buttonGroup_caLam = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_TenNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_sdt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton_nam = new javax.swing.JRadioButton();
        jRadioButton_nu = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        queQuan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox_chucVu = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton_caToi = new javax.swing.JRadioButton();
        jRadioButton_caTrua = new javax.swing.JRadioButton();
        jRadioButton_CaSang = new javax.swing.JRadioButton();
        jTextField_matKhau = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CẬP NHẬT NGƯỜI DÙNG");

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(btnExit)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnExit))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Họ tên nhân viên:");

        jTextField_TenNhanVien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_TenNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TenNhanVienActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        jTextField_sdt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Số điện thoại:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Email:");

        jTextField_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Giới tính:");

        buttonGroup_gioiTinh.add(jRadioButton_nam);
        jRadioButton_nam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_nam.setText("Nam");
        jRadioButton_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_namActionPerformed(evt);
            }
        });

        buttonGroup_gioiTinh.add(jRadioButton_nu);
        jRadioButton_nu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_nu.setText("Nữ");
        jRadioButton_nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_nuActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Quê quán:");

        queQuan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Chức vụ:");

        jComboBox_chucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_chucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USER", "ADMIN" }));
        jComboBox_chucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_chucVuActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Ca làm việc:");

        buttonGroup_caLam.add(jRadioButton_caToi);
        jRadioButton_caToi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_caToi.setText("Ca tối");

        buttonGroup_caLam.add(jRadioButton_caTrua);
        jRadioButton_caTrua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_caTrua.setText("Ca chiều");

        buttonGroup_caLam.add(jRadioButton_CaSang);
        jRadioButton_CaSang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_CaSang.setText("Ca sáng");

        jTextField_matKhau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_matKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_matKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton_CaSang)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_caTrua)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_caToi))
                    .addComponent(queQuan)
                    .addComponent(jTextField_TenNhanVien)
                    .addComponent(jTextField_sdt)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton_nam)
                        .addGap(36, 36, 36)
                        .addComponent(jRadioButton_nu))
                    .addComponent(jComboBox_chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_matKhau))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_nam)
                    .addComponent(jRadioButton_nu))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_caToi)
                    .addComponent(jRadioButton_caTrua)
                    .addComponent(jRadioButton_CaSang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUpdate.setBackground(new java.awt.Color(199, 213, 126));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String fullName = jTextField_TenNhanVien.getText().trim();
        String password = jTextField_matKhau.getText().trim();
        String phone = jTextField_sdt.getText().trim();
        String email = jTextField_email.getText().trim();
        String address = queQuan.getText().trim();
        String role = (String) jComboBox_chucVu.getSelectedItem();

        String gender = jRadioButton_nam.isSelected() ? "Nam" : (jRadioButton_nu.isSelected() ? "Nữ" : "");
        String workShift = "";
        if (jRadioButton_CaSang.isSelected()) {
            workShift = "Ca sáng";
        } else if (jRadioButton_caTrua.isSelected()) {
            workShift = "Ca chiều";
        } else if (jRadioButton_caToi.isSelected()) {
            workShift = "Ca tối";
        }

        if (fullName.isEmpty() || password.isEmpty() || phone.isEmpty() || email.isEmpty() || gender.isEmpty() || workShift.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin bắt buộc!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        user.setTen(fullName);
        user.setMatKhau(password);
        user.setSdt(phone);
        user.setEmail(email);
        user.setDiaChi(address);
        user.setChucVu(role);
        user.setGioiTinh(gender);
        user.setCaLam(workShift);

        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User updatedUser = userRepository.update(user);

        if (updatedUser != null) {
            JOptionPane.showMessageDialog(this, "Cập nhật người dùng thành công!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại! Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void jTextField_TenNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TenNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TenNhanVienActionPerformed

    private void jRadioButton_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_namActionPerformed

    private void jRadioButton_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_nuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_nuActionPerformed

    private void jComboBox_chucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_chucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_chucVuActionPerformed

    private void jTextField_matKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_matKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_matKhauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup_caLam;
    private javax.swing.ButtonGroup buttonGroup_gioiTinh;
    private javax.swing.JComboBox<String> jComboBox_chucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_CaSang;
    private javax.swing.JRadioButton jRadioButton_caToi;
    private javax.swing.JRadioButton jRadioButton_caTrua;
    private javax.swing.JRadioButton jRadioButton_nam;
    private javax.swing.JRadioButton jRadioButton_nu;
    private javax.swing.JTextField jTextField_TenNhanVien;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_matKhau;
    private javax.swing.JTextField jTextField_sdt;
    private javax.swing.JTextField queQuan;
    // End of variables declaration//GEN-END:variables
}
