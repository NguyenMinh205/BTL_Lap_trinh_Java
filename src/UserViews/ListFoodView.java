package UserViews;

import AdminViews.BillDetailScene;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.Bill;
import model.Product;
import repository.BillRepositoryImpl;
import repository.ProductRepositoryImpl;
import repository.UserRepositoryImpl;

/**
 *
 * @author aoshi
 */
public class ListFoodView extends javax.swing.JPanel {
    private UserRepositoryImpl userRepositoryImpl;
    private ProductRepositoryImpl productRepositoryImpl;
    /**
     * Creates new form OrderView
     */
    public ListFoodView() {
        initComponents();
        userRepositoryImpl = new UserRepositoryImpl();
        productRepositoryImpl = new ProductRepositoryImpl();
        loadProductTable();
    }
    
    public void loadProductTable() {
        try {
        List<Product> productList = productRepositoryImpl.findAll();

        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
        model.setRowCount(0);
        for (Product product : productList) {
                model.addRow(new Object[] {
                    product.getMaSP(),
                    product.getTenSP(),
                    product.getGia(),
                    product.getLoai(),
                    product.getSoLuong()
                });
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu món ăn: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void LoadTheoLoai(String loai) {
        try {
            List<Product> productList = productRepositoryImpl.findAll();

            DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
            model.setRowCount(0);
            for (Product product : productList) {
                if (product.getLoai().equals(loai)) {
                    model.addRow(new Object[]{
                        product.getMaSP(),
                        product.getTenSP(),
                        product.getGia(),
                        product.getLoai(),
                        product.getSoLuong()
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu món ăn: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        FindbyName = new javax.swing.JButton();
        locBox = new javax.swing.JComboBox<>();
        fillterBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 603));

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));

        jLabel1.setBackground(new java.awt.Color(37, 37, 37));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách món ăn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(90, 75));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tên sản phẩm:");

        FindbyName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FindbyName.setText("Tìm kiếm");
        FindbyName.setPreferredSize(new java.awt.Dimension(100, 25));
        FindbyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindbyNameActionPerformed(evt);
            }
        });

        locBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Đồ uống", "Đồ ăn" }));

        fillterBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fillterBtn.setText("Lọc");
        fillterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FindbyName, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(384, 384, 384)
                .addComponent(locBox, 0, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fillterBtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(FindbyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(locBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fillterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Giá", "Loại", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        foodTable.setMaximumSize(new java.awt.Dimension(970, 80));
        jScrollPane1.setViewportView(foodTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FindbyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindbyNameActionPerformed
         String keyword = name.getText().trim().toLowerCase();

        if (keyword.isEmpty()) {
            loadProductTable();
            return;
        }

        try {
            List<Product> productList = productRepositoryImpl.findAll();
            DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
            model.setRowCount(0);

            for (Product product : productList) {
                if (product.getTenSP().toLowerCase().contains(keyword)) {
                    model.addRow(new Object[]{
                        product.getMaSP(),
                        product.getTenSP(),
                        product.getGia(),
                        product.getLoai(),
                        product.getSoLuong()
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FindbyNameActionPerformed

    private void fillterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillterBtnActionPerformed
        if(!(locBox.getSelectedItem().toString().equals("Đồ ăn")) && !(locBox.getSelectedItem().toString().equals("Đồ uống"))){
            loadProductTable();
        }
        else{
            LoadTheoLoai(locBox.getSelectedItem().toString());
        }
    }//GEN-LAST:event_fillterBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindbyName;
    private javax.swing.JButton fillterBtn;
    private javax.swing.JTable foodTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> locBox;
    private javax.swing.JFormattedTextField name;
    // End of variables declaration//GEN-END:variables
}
