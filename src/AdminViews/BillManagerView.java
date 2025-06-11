package AdminViews;

import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bill;
import repository.BillRepositoryImpl;

/**
 *
 * @author aoshi
 */
public class BillManagerView extends javax.swing.JPanel {
    private BillRepositoryImpl billRepository = new BillRepositoryImpl();
    
    
    public BillManagerView() {
        initComponents();
        loadDataToTable(billRepository.findAll());
    }

    private void loadDataToTable(List<Bill> bills) {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        for (Bill bill : bills) {
            model.addRow(new Object[]{
                bill.getMaHD(),
                bill.getTen(),
                bill.getSdt(),
                bill.getEmail(),
                bill.getNgayDat().format(formatter),
                String.format("%,.0f VNĐ", bill.getTongTien())
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        DelBillbtn = new javax.swing.JButton();
        UpdateBill = new javax.swing.JButton();
        SearchBillByEmail = new javax.swing.JButton();

        setBackground(new java.awt.Color(37, 37, 37));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));
        jPanel1.setForeground(new java.awt.Color(37, 37, 37));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bảng hóa đơn");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Tên khách hàng", "Số điện thoại", "Email", "Ngày mua", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(BillTable);

        jPanel2.setBackground(new java.awt.Color(37, 37, 37));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 0));

        DelBillbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DelBillbtn.setText("Xóa ");
        DelBillbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        DelBillbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBillbtnActionPerformed(evt);
            }
        });

        UpdateBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateBill.setText("Chỉnh sửa ");
        UpdateBill.setPreferredSize(new java.awt.Dimension(100, 25));
        UpdateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBillActionPerformed(evt);
            }
        });

        SearchBillByEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchBillByEmail.setText("Tìm kiếm");
        SearchBillByEmail.setPreferredSize(new java.awt.Dimension(100, 25));
        SearchBillByEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBillByEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DelBillbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBillByEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(DelBillbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchBillByEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

        private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        model.setRowCount(0); // Xóa bảng cũ
        for (Bill bill : billRepository.findAll()) {
            model.addRow(new Object[]{
                bill.getMaHD(),
                bill.getTen(),
                bill.getSdt(),
                bill.getEmail(),
                bill.getNgayDat(),
                bill.getTongTien()
            });
        }
    }

    private void DelBillbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBillbtnActionPerformed
        int selectedRow = BillTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để xóa.");
            return;
        }

        String maHD = BillTable.getValueAt(selectedRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn có chắc chắn muốn xóa hóa đơn " + maHD + "?",
                "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean deleted = billRepository.deleteById(maHD);
            if (deleted) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                loadTable();
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy hóa đơn để xóa.");
            }
        }
    }//GEN-LAST:event_DelBillbtnActionPerformed

    private void UpdateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBillActionPerformed
        
    }//GEN-LAST:event_UpdateBillActionPerformed

    private void SearchBillByEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBillByEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBillByEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JButton DelBillbtn;
    private javax.swing.JButton SearchBillByEmail;
    private javax.swing.JButton UpdateBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
