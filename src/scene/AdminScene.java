/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scene;

import java.awt.event.WindowEvent;
import java.util.List;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.User;
import repository.ProductRepositoryImpl;
import repository.UserRepositoryImpl;

public class AdminScene extends javax.swing.JFrame {
    private UserRepositoryImpl userRepositoryImpl;
    private ProductRepositoryImpl productRepositoryImpl;

    // Add this method to AdminScene class
    public UserRepositoryImpl getUserRepository() {
        return this.userRepositoryImpl;
    }

    public AdminScene() {
        initComponents();
        userRepositoryImpl = new UserRepositoryImpl();
        productRepositoryImpl = new ProductRepositoryImpl();
        this.setLocationRelativeTo(null);
        loadUserTable();
        loadProductTable();
    }

    public void addUserToTable(User user) {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.addRow(new Object[]{
            user.getMaNV(),
            user.getTen(),
            user.getEmail(),
            user.getSdt(),
            user.getMatKhau(),
            user.getChucVu(),
            user.getGioiTinh(),
            user.getDiaChi(),
            user.getCaLam()
        });
        userTable.setModel(model);
    }

    public void addProductToTable(Product product) {
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.addRow(new Object[]{
            product.getMaSP(),
            product.getTenSP(),
            product.getGia(),
            product.getLoai()
        });
    }
    
    public boolean isProductIdExists(String maSP) {
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (maSP.equals(model.getValueAt(i, 0))) { // Cột 0 là mã SP
                return true;
            }
        }
        return false;
    }
    
    public void loadUserTable() {
        String[] columnNames = {"Mã NV", "Tên", "Email", "SĐT", "Mật khẩu", "Chức vụ", "Giới tính", "Quê quán", "Ca làm"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        model.setRowCount(0);
        List<User> users = userRepositoryImpl.findAll();
        if (users == null || users.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu người dùng!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Populate table
        for (User user : users) {
            model.addRow(new Object[]{
                user.getMaNV(),
                user.getTen(),
                user.getEmail(),
                user.getSdt(),
                user.getMatKhau(), // Mask passwords for security
                user.getChucVu(),
                user.getGioiTinh(),
                user.getDiaChi(),
                user.getCaLam()
            });
        }
        userTable.setModel(model);
    }

    public void loadProductTable() {
        String[] columnNames = {"Mã SP", "Tên SP", "Giá", "Loại"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0); // 0: ban đầu chưa có dòng nào

        for (Product product : productRepositoryImpl.findAll()) {
            Object[] rowData = {
                product.getMaSP(),
                product.getTenSP(),
                product.getGia(),
                product.getLoai(),};
            model.addRow(rowData);

        }

        productTable.setModel(model);
    }

    public void updateUserInTable(User user) {
        DefaultTableModel model = (DefaultTableModel) this.userTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String maNV = model.getValueAt(i, 0).toString(); // Assuming maNV is in column 0
            if (maNV.equals(user.getMaNV())) {
                model.setValueAt(user.getTen(), i, 1);
                model.setValueAt(user.getEmail(), i, 2);
                model.setValueAt(user.getSdt(), i, 3);
                model.setValueAt(user.getMatKhau(), i, 4);
                model.setValueAt(user.getDiaChi(), i, 5);
                model.setValueAt(user.getChucVu(), i, 6);
                model.setValueAt(user.getGioiTinh(), i, 7);
                model.setValueAt(user.getCaLam(), i, 8);
                userTable.setModel(model);
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userScrollPane = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        productScrollPane = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addProductBtn = new javax.swing.JButton();
        deleteProductBtn = new javax.swing.JButton();
        editProductBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        getUserField = new javax.swing.JTextField();
        getUserBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        addUserBtn = new javax.swing.JButton();
        editUserBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Scene");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Admin Scene");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Email", "Số điện thoai", "Mật khẩu", "Quê quán", "Chức vụ", "Giới tính", "Ca làm việc"
            }
        ));
        userScrollPane.setViewportView(userTable);

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Loại", "Giá thành"
            }
        ));
        productScrollPane.setViewportView(productTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Bảng danh mục sản phẩm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Bảng danh sách nhân viên");

        addProductBtn.setText("Add product");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        deleteProductBtn.setText("Delete Product");
        deleteProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductBtnActionPerformed(evt);
            }
        });

        editProductBtn.setText("Edit Product");
        editProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email User: ");

        getUserBtn.setText("Get User");
        getUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getUserBtnActionPerformed(evt);
            }
        });

        deleteUserBtn.setText("Delete User");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setText("Log out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        editUserBtn.setText("Edit User");
        editUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(addUserBtn)
                                .addGap(50, 50, 50)
                                .addComponent(editUserBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(getUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(deleteUserBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(getUserBtn)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userScrollPane)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(addProductBtn)
                                .addGap(32, 32, 32)
                                .addComponent(editProductBtn)
                                .addGap(35, 35, 35)
                                .addComponent(deleteProductBtn)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(logoutBtn)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(getUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getUserBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addUserBtn)
                    .addComponent(editUserBtn)
                    .addComponent(deleteUserBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addProductBtn)
                    .addComponent(editProductBtn)
                    .addComponent(deleteProductBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(productScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn)
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void getUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUserBtnActionPerformed
        String getUser = getUserField.getText();

        if (getUser.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email cần tìm kiếm", "Thiếu email", JOptionPane.WARNING_MESSAGE);
            return;
        }

        User usedFound = userRepositoryImpl.findByEmail(getUser);
        if (usedFound != null) {
            JOptionPane.showMessageDialog(this, "Thông tin tài khoản có email cần tìm là: \n" + usedFound.toString(), "Hiện thông tin", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản có email đã nhập ", "Không tìm thấy", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_getUserBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        AddUserScene addUserScene = new AddUserScene(this);
        addUserScene.setVisible(true);
        addUserScene.setLocationRelativeTo(this);
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void editUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserBtnActionPerformed
        //Chọn người dùng để chỉnh sửa
        int selecRow = userTable.getSelectedRow();
        if (selecRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một người dùng để sửa");
            return;
        }
        String maNV = userTable.getValueAt(selecRow, 0).toString();
        String tenNV = userTable.getValueAt(selecRow, 1).toString();
        String email = userTable.getValueAt(selecRow, 2).toString();
        String soDT = userTable.getValueAt(selecRow, 3).toString();
        String matKhau = userTable.getValueAt(selecRow, 4).toString();
        String queQuan = userTable.getValueAt(selecRow, 5).toString();
        String chucVu = userTable.getValueAt(selecRow, 6).toString();
        String gioiTinh = userTable.getValueAt(selecRow, 7).toString();
        String caLamViec = userTable.getValueAt(selecRow, 8).toString();
        User selectUser = new User(maNV, tenNV, email, soDT, matKhau, queQuan, chucVu, gioiTinh, caLamViec);
        EditUserForm editUserForm = new EditUserForm(selectUser, this);
        editUserForm.setVisible(true);
    }//GEN-LAST:event_editUserBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        int selecRow = userTable.getSelectedRow();
        if (selecRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn người dùng để xóa");
            return;
        }
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa người dùng này không ?");
        if (option != JOptionPane.YES_OPTION) {
            return;
        }
        String maNV = userTable.getValueAt(selecRow, 0).toString();
        User userToDelete = null;
        for (User u : userRepositoryImpl.findAll()) {
            if (u.getMaNV().equals(maNV)) {
                userToDelete = u;
                break;
            }
        }
        if (userToDelete != null) {
            userRepositoryImpl.delete(userToDelete);
            ((DefaultTableModel) userTable.getModel()).removeRow(selecRow);
            JOptionPane.showMessageDialog(this, "Đã xóa người dùng thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng để xóa");
        }
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        AddProductScene addProductPanel = new AddProductScene(this);
        JDialog dialog = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Thêm sản phẩm", true);
        dialog.getContentPane().add(addProductPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addProductBtnActionPerformed

    private void editProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductBtnActionPerformed

    }//GEN-LAST:event_editProductBtnActionPerformed

    private void deleteProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductBtnActionPerformed
        int selecRow = productTable.getSelectedRow();
        if(selecRow == -1){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sản phẩm để xóa");
            return;
        }
        int chon = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa");
        if(chon != JOptionPane.YES_OPTION)
        {
            return;
        }
        String maSP = productTable.getValueAt(selecRow, 0).toString();
        Product spXoa = null;
        for(Product p : productRepositoryImpl.findAll())
        {
            if(p.getMaSP().equalsIgnoreCase(maSP))
            {
                spXoa = p;
                break;
            }
        }
        if(spXoa != null)
        {
            productRepositoryImpl.delete(spXoa);
            ((DefaultTableModel) productTable.getModel()).removeRow(selecRow);
            JOptionPane.showMessageDialog(rootPane, "Đã xóa sản phẩm thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy sản phẩm");
        }
           
    }//GEN-LAST:event_deleteProductBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminScene admin = new AdminScene();
                admin.setDefaultCloseOperation(EXIT_ON_CLOSE);
                new AdminScene().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductBtn;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton deleteProductBtn;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JButton editProductBtn;
    private javax.swing.JButton editUserBtn;
    private javax.swing.JButton getUserBtn;
    private javax.swing.JTextField getUserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JScrollPane productScrollPane;
    private javax.swing.JTable productTable;
    private javax.swing.JScrollPane userScrollPane;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
