package AdminViews;

import scene.LoginScene;

public class AdminMainView extends javax.swing.JFrame {
    public AdminMainView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Home = new javax.swing.JMenuItem();
        jLogOut = new javax.swing.JMenuItem();
        jQuanl = new javax.swing.JMenu();
        jQuanLyNhanSu = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jQuanLyDoAn = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jQuanLyHoaDon = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setPreferredSize(new java.awt.Dimension(1200, 600));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1188, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        Home.setIcon(new javax.swing.ImageIcon("C:\\Users\\aoshi\\Downloads\\BTL_Lap_trinh_Java\\BTL_Lap_trinh_Java\\src\\icon&image\\home.png")); // NOI18N
        Home.setText("Trang chủ");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jMenu1.add(Home);

        jLogOut.setIcon(new javax.swing.ImageIcon("D:\\codenham\\java\\Clone_BTL_JAVA\\src\\main\\java\\icons\\logout.png")); // NOI18N
        jLogOut.setText("Đăng xuất");
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(jLogOut);

        jMenuBar2.add(jMenu1);

        jQuanl.setText("Quản lý");

        jQuanLyNhanSu.setIcon(new javax.swing.ImageIcon("C:\\Users\\aoshi\\Downloads\\BTL_Lap_trinh_Java\\BTL_Lap_trinh_Java\\src\\icon&image\\group.png")); // NOI18N
        jQuanLyNhanSu.setText("Quản lý nhân sự");
        jQuanLyNhanSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuanLyNhanSuActionPerformed(evt);
            }
        });
        jQuanl.add(jQuanLyNhanSu);
        jQuanl.add(jSeparator5);

        jQuanLyDoAn.setIcon(new javax.swing.ImageIcon("C:\\Users\\aoshi\\Downloads\\BTL_Lap_trinh_Java\\BTL_Lap_trinh_Java\\src\\icon&image\\fast-food.png")); // NOI18N
        jQuanLyDoAn.setText("Quản lý đồ ăn");
        jQuanLyDoAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuanLyDoAnActionPerformed(evt);
            }
        });
        jQuanl.add(jQuanLyDoAn);
        jQuanl.add(jSeparator4);

        jQuanLyHoaDon.setIcon(new javax.swing.ImageIcon("C:\\Users\\aoshi\\Downloads\\BTL_Lap_trinh_Java\\BTL_Lap_trinh_Java\\src\\icon&image\\menu.png")); // NOI18N
        jQuanLyHoaDon.setText("Quản lý hóa đơn");
        jQuanLyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuanLyHoaDonActionPerformed(evt);
            }
        });
        jQuanl.add(jQuanLyHoaDon);

        jMenuBar2.add(jQuanl);

        jMenu4.setText("Trợ giúp");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // đăng xuất từ đây sẽ về đăng nhập AdminMainViews -> LoginView 
    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutActionPerformed
        LoginScene login = new LoginScene();
        login.setVisible(true);            
        this.dispose(); 
    }//GEN-LAST:event_jLogOutActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
    }//GEN-LAST:event_HomeActionPerformed

    
    private void jQuanLyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuanLyHoaDonActionPerformed
        BillManagerView panel = new BillManagerView();
        MainPanel.removeAll(); // xóa nội dung cũ
        MainPanel.setLayout(new java.awt.BorderLayout()); // nếu chưa đặt layout
        MainPanel.add(panel, java.awt.BorderLayout.CENTER);
        MainPanel.revalidate(); // cập nhật giao diện
        MainPanel.repaint();    // vẽ lại
    }//GEN-LAST:event_jQuanLyHoaDonActionPerformed

    private void jQuanLyDoAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuanLyDoAnActionPerformed
        FoodManagerView panel = new FoodManagerView();
        MainPanel.removeAll(); // xóa nội dung cũ
        MainPanel.setLayout(new java.awt.BorderLayout()); // nếu chưa đặt layout
        MainPanel.add(panel, java.awt.BorderLayout.CENTER);
        MainPanel.revalidate(); // cập nhật giao diện
        MainPanel.repaint();    // vẽ lại
    }//GEN-LAST:event_jQuanLyDoAnActionPerformed

    private void jQuanLyNhanSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuanLyNhanSuActionPerformed
        UserManager panel = new UserManager();
        MainPanel.removeAll(); // xóa nội dung cũ
        MainPanel.setLayout(new java.awt.BorderLayout()); // nếu chưa đặt layout
        MainPanel.add(panel, java.awt.BorderLayout.CENTER);
        MainPanel.revalidate(); // cập nhật giao diện
        MainPanel.repaint();    // vẽ lại
    }//GEN-LAST:event_jQuanLyNhanSuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Home;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem jLogOut;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jQuanLyDoAn;
    private javax.swing.JMenuItem jQuanLyHoaDon;
    private javax.swing.JMenuItem jQuanLyNhanSu;
    private javax.swing.JMenu jQuanl;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
