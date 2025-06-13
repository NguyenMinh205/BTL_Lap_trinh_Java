package UserViews;

import model.User;
import scene.LoginScene;

public class PersonalProfile extends javax.swing.JPanel {
    private User currentUser;
    /**
     * Creates new form OrderView
     */
    public PersonalProfile(User user) {
        this.currentUser = user;
        initComponents();
        initSetUp();
}
    
    public void initSetUp() {
        if (currentUser == null) return;

        tenNV.setText(currentUser.getTen());
        phoneField.setText(currentUser.getSdt());
        email.setText(currentUser.getEmail());
        queQuan.setText(currentUser.getDiaChi());

        if (currentUser.getGioiTinh().equalsIgnoreCase("Nam")) {
            gtNam.setSelected(true);
        } else {
            gtNu.setSelected(true);
        }

        chucVu.setSelectedItem(currentUser.getChucVu());

        String ca = currentUser.getCaLam();
        if (ca != null) {
            if (ca.equalsIgnoreCase("Ca sáng")) caSang.setSelected(true);
            else if (ca.equalsIgnoreCase("Ca chiều")) caTrua.setSelected(true);
            else if (ca.equalsIgnoreCase("Ca tối")) caToi.setSelected(true);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gt = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tenNV = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gtNam = new javax.swing.JRadioButton();
        gtNu = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        queQuan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        chucVu = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        caSang = new javax.swing.JRadioButton();
        caTrua = new javax.swing.JRadioButton();
        caToi = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        chargepassword = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));

        jLabel1.setBackground(new java.awt.Color(37, 37, 37));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin cá nhân");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Họ tên nhân viên:");

        tenNV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenNVActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Số điện thoại:");

        phoneField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Email:");

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Giới tính:");

        gtNam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gtNam.setText("Nam");
        gtNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtNamActionPerformed(evt);
            }
        });

        gtNu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gtNu.setText("Nữ");
        gtNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtNuActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Quê quán:");

        queQuan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Chức vụ:");

        chucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USER", "ADMIN" }));
        chucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chucVuActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Ca làm việc:");

        buttonGroup1.add(caSang);
        caSang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caSang.setText("Ca sáng");

        buttonGroup1.add(caTrua);
        caTrua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caTrua.setText("Ca chiều");

        buttonGroup1.add(caToi);
        caToi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caToi.setText("Ca tối");

        btnUpdate.setBackground(new java.awt.Color(199, 213, 126));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        chargepassword.setBackground(new java.awt.Color(199, 213, 126));
        chargepassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chargepassword.setText("Đổi mật khẩu");
        chargepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargepasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(queQuan)
                            .addComponent(tenNV)
                            .addComponent(phoneField)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(gtNam)
                                .addGap(36, 36, 36)
                                .addComponent(gtNu))
                            .addComponent(chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(chargepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(caSang)
                                    .addGap(18, 18, 18)
                                    .addComponent(caTrua)
                                    .addGap(18, 18, 18)
                                    .addComponent(caToi))))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gtNam)
                    .addComponent(gtNu))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caToi)
                    .addComponent(caTrua)
                    .addComponent(caSang))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chargepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenNVActionPerformed

    private void gtNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gtNamActionPerformed

    private void gtNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gtNuActionPerformed

    private void chucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chucVuActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String ten = tenNV.getText().trim();
        String sdt = phoneField.getText().trim();
        String mail = email.getText().trim();
        String diaChi = queQuan.getText().trim();
        String gioiTinh = gtNam.isSelected() ? "Nam" : "Nữ";
        String chucvu = chucVu.getSelectedItem().toString();
        String caLam = "";

        if (caSang.isSelected()) caLam = "Ca sáng";
        else if (caTrua.isSelected()) caLam = "Ca chiều";
        else if (caToi.isSelected()) caLam = "Ca tối";

        currentUser.setTen(ten);
        currentUser.setSdt(sdt);
        currentUser.setEmail(mail);
        currentUser.setDiaChi(diaChi);
        currentUser.setGioiTinh(gioiTinh);
        currentUser.setChucVu(chucvu);
        currentUser.setCaLam(caLam);

        repository.UserRepositoryImpl userRepo = new repository.UserRepositoryImpl();
        userRepo.update(currentUser); // Ghi đè user cũ trong file

        javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void chargepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargepasswordActionPerformed
        chargePassWord chargepass = new chargePassWord(currentUser);
        chargepass.setVisible(true); 
    }//GEN-LAST:event_chargepasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton caSang;
    private javax.swing.JRadioButton caToi;
    private javax.swing.JRadioButton caTrua;
    private javax.swing.JButton chargepassword;
    private javax.swing.JComboBox<String> chucVu;
    private javax.swing.JTextField email;
    private javax.swing.ButtonGroup gt;
    private javax.swing.JRadioButton gtNam;
    private javax.swing.JRadioButton gtNu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField queQuan;
    private javax.swing.JTextField tenNV;
    // End of variables declaration//GEN-END:variables
}
