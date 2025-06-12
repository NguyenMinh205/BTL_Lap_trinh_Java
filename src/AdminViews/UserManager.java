package AdminViews;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import repository.ProductRepositoryImpl;
import repository.UserRepositoryImpl;

public class UserManager extends javax.swing.JPanel {
    private UserRepositoryImpl userRepositoryImpl;
    private ProductRepositoryImpl productRepositoryImpl;
    
    public UserRepositoryImpl getUserRepository() {
        return this.userRepositoryImpl;
    }

    public UserManager() {
        initComponents();
        userRepositoryImpl = new UserRepositoryImpl();
        productRepositoryImpl = new ProductRepositoryImpl();
        loadUserTable();
    }
    
    
    public void addUserToTable(User user) {
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.addRow(new Object[]{
            user.getMaNV(),
            user.getTen(),
            user.getEmail(),
            user.getSdt(),
            user.getMatKhau(),
            user.getDiaChi(),
            user.getChucVu(),
            user.getGioiTinh(),
            user.getCaLam()
        });
        UserTable.setModel(model);
    }
    
    public void loadUserTable() {
        String[] columnNames = {"Mã NV", "Tên", "Email", "SĐT", "Mật khẩu", "Chức vụ", "Giới tính", "Quê quán", "Ca làm"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        List<User> users = userRepositoryImpl.findAll();
        if (users == null || users.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu người dùng!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (User user : users) {
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
        }

        UserTable.setModel(model);
    }

    public void updateUserInTable(User user) {
        DefaultTableModel model = (DefaultTableModel) this.UserTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String maNV = model.getValueAt(i, 0).toString();
            if (maNV.equals(user.getMaNV())) {
                model.setValueAt(user.getTen(), i, 1);
                model.setValueAt(user.getEmail(), i, 2);
                model.setValueAt(user.getSdt(), i, 3);
                model.setValueAt(user.getMatKhau(), i, 4);
                model.setValueAt(user.getDiaChi(), i, 5);
                model.setValueAt(user.getChucVu(), i, 6);
                model.setValueAt(user.getGioiTinh(), i, 7);
                model.setValueAt(user.getCaLam(), i, 8);
                UserTable.setModel(model);
                break;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddUser = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(37, 37, 37));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));

        AddUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddUser.setText("Thêm");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setText("Xóa");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setText("Sửa");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Search.setText("Tìm kiếm");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(AddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(37, 37, 37));

        jLabel1.setBackground(new java.awt.Color(37, 37, 37));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BẢNG NHÂN VIÊN");
        jLabel1.setPreferredSize(new java.awt.Dimension(37, 25));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Email", "Số điện thoại", "Mật khẩu", "Quê quán", "Chức vụ", "Giới tính", "Ca làm việc"
            }
        ));
        jScrollPane1.setViewportView(UserTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed
        AddUserView Scene = new AddUserView(this);
        Scene.setVisible(true);
    }//GEN-LAST:event_AddUserActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int selecRow = UserTable.getSelectedRow();
        if (selecRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn người dùng để xóa");
            return;
        }
        
        int option = JOptionPane.showConfirmDialog(
            this,
            "Bạn có chắc chắn muốn xóa người dùng này không ?",
            "Xác nhận xóa",
            JOptionPane.YES_NO_OPTION
        );
        if (option != JOptionPane.YES_OPTION) {
            return;
        }
        
        String maNV = UserTable.getValueAt(selecRow, 0).toString();
        User userToDelete = null;
        for (User u : userRepositoryImpl.findAll()) {
            if (u.getMaNV().equals(maNV)) {
                userToDelete = u;
                break;
            }
        }
        if (userToDelete != null) {
            userRepositoryImpl.delete(userToDelete);
            ((DefaultTableModel) UserTable.getModel()).removeRow(selecRow);
            JOptionPane.showMessageDialog(this, "Đã xóa người dùng thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng để xóa");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int selecRow = UserTable.getSelectedRow();
        if (selecRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn người dùng để cập nhật");
            return;
        }

        String maNV = UserTable.getValueAt(selecRow, 0).toString();
        String ten = UserTable.getValueAt(selecRow, 1).toString();
        String email = UserTable.getValueAt(selecRow, 2).toString();
        String sdt = UserTable.getValueAt(selecRow, 3).toString();
        String matKhau = UserTable.getValueAt(selecRow, 4).toString();
        String chucVu = UserTable.getValueAt(selecRow, 5).toString();
        String gioiTinh = UserTable.getValueAt(selecRow, 6).toString();
        String diaChi = UserTable.getValueAt(selecRow, 7).toString();
        String caLam = UserTable.getValueAt(selecRow, 8).toString();

        User selectedUser = new User(maNV, ten, email, sdt, matKhau, diaChi, chucVu, gioiTinh, caLam);

        EditUserView Scene = new EditUserView(selectedUser, this);
        Scene.setVisible(true);
    }//GEN-LAST:event_updateActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        FindUserView scene = new FindUserView();
        scene.setLocationRelativeTo(null);
        scene.setVisible(true);
    }//GEN-LAST:event_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUser;
    private javax.swing.JButton Search;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
