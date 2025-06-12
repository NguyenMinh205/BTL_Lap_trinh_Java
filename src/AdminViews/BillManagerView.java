package AdminViews;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
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
        try {
            MaskFormatter startMask = new MaskFormatter("##/##/####");
            startMask.setPlaceholderCharacter('_');
            startMask.install(DayStart);

            MaskFormatter endMask = new MaskFormatter("##/##/####");
            endMask.setPlaceholderCharacter('_');
            endMask.install(DayEnd);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        loadDataToTable(billRepository.findAll());
    }

    private void loadDataToTable(List<Bill> bills) {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
        Check = new javax.swing.JButton();
        FindBillByDay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Reset = new javax.swing.JButton();
        DayStart = new javax.swing.JFormattedTextField();
        DayEnd = new javax.swing.JFormattedTextField();
        DelBillbtn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

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

        Check.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon&image/transaction.png"))); // NOI18N
        Check.setText("Xem chi tiết");
        Check.setPreferredSize(new java.awt.Dimension(100, 25));
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        FindBillByDay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FindBillByDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon&image/transaction-history.png"))); // NOI18N
        FindBillByDay.setText("Tìm kiếm");
        FindBillByDay.setPreferredSize(new java.awt.Dimension(100, 25));
        FindBillByDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBillByDayActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ngày bắt đầu:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày kết thúc:");

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reset.setText("Reset");
        Reset.setPreferredSize(new java.awt.Dimension(100, 25));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        DelBillbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DelBillbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon&image/bill.png"))); // NOI18N
        DelBillbtn.setText("Xóa ");
        DelBillbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        DelBillbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBillbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Check, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DayEnd)
                    .addComponent(FindBillByDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DelBillbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(DayStart))
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator4)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(DelBillbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(DayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FindBillByDay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(468, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        int selectedRow = BillTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn đơn hàng");
        } else {
            String maHD = BillTable.getValueAt(selectedRow, 0).toString();
            Bill bill = billRepository.findById(maHD);
            if (bill != null) {
                BillDetailScene billDetail = new BillDetailScene(bill);
                JFrame detailFrame = new JFrame("Chi tiết hóa đơn");
                detailFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                detailFrame.getContentPane().add(billDetail);
                detailFrame.pack();
                detailFrame.setLocationRelativeTo(null);
                detailFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy đơn hàng");
            }
        }

    }//GEN-LAST:event_CheckActionPerformed

    private void FindBillByDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBillByDayActionPerformed
        String startText = DayStart.getText().trim();
        String endText = DayEnd.getText().trim();

        if (startText.contains("_") || endText.contains("_")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ cả ngày bắt đầu và ngày kết thúc.");
            return;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate startDate = LocalDate.parse(startText, formatter);
            LocalDate endDate = LocalDate.parse(endText, formatter);

            if (startDate.isAfter(endDate)) {
                JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải trước hoặc bằng ngày kết thúc.");
                return;
            }

            List<Bill> result = billRepository.findByDateRange(startDate, endDate);
            if (result.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy hóa đơn trong khoảng ngày.");
            }
            loadDataToTable(result);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng ngày: dd/MM/yyyy");
        }
    }//GEN-LAST:event_FindBillByDayActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
    
        model.setRowCount(0);

        List<Bill> bills = billRepository.findAll();

        for (Bill b : bills) {
            model.addRow(new Object[]{
                b.getMaHD(),
                b.getTen(),
                b.getSdt(),
                b.getEmail(),
                b.getNgayDat(),
                b.getTongTien()
            });
        }
    }//GEN-LAST:event_ResetActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JButton Check;
    private javax.swing.JFormattedTextField DayEnd;
    private javax.swing.JFormattedTextField DayStart;
    private javax.swing.JButton DelBillbtn;
    private javax.swing.JButton FindBillByDay;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
