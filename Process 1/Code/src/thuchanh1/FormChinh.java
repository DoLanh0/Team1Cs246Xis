package thuchanh1;
import javax.swing.Icon;
import javax.swing.JOptionPane;
public class FormChinh extends javax.swing.JFrame {
    public FormChinh() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        ChucNangCong = new javax.swing.JMenuItem();
        ChucNangTru = new javax.swing.JMenuItem();
        ChucNangNhan = new javax.swing.JMenuItem();
        ChucNangChia = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenuItem3.setText("jMenuItem3");

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem4.setText("jMenuItem4");

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jMenu3.setText("Hệ thống");

        jMenuItem2.setText("Thoát");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu11.setText("Chức năng");

        ChucNangCong.setText("Phép cộng");
        ChucNangCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChucNangCongActionPerformed(evt);
            }
        });
        jMenu11.add(ChucNangCong);

        ChucNangTru.setText("Phép trừ");
        ChucNangTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChucNangTruActionPerformed(evt);
            }
        });
        jMenu11.add(ChucNangTru);

        ChucNangNhan.setText("Phép nhân");
        ChucNangNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChucNangNhanActionPerformed(evt);
            }
        });
        jMenu11.add(ChucNangNhan);

        ChucNangChia.setText("Phép chia");
        ChucNangChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChucNangChiaActionPerformed(evt);
            }
        });
        jMenu11.add(ChucNangChia);

        jMenuBar1.add(jMenu11);

        jMenu12.setText("Trợ giúp");
        jMenuBar1.add(jMenu12);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChucNangCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChucNangCongActionPerformed
        FormCong frm1 = new FormCong();
        frm1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChucNangCongActionPerformed

    private void ChucNangTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChucNangTruActionPerformed
        FormTru frm2 = new FormTru();
        frm2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChucNangTruActionPerformed

    private void ChucNangNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChucNangNhanActionPerformed
        FormNhan frm3 = new FormNhan();
        frm3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChucNangNhanActionPerformed

    private void ChucNangChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChucNangChiaActionPerformed
        FormChia frm4 = new FormChia();
        frm4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChucNangChiaActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ChucNangChia;
    private javax.swing.JMenuItem ChucNangCong;
    private javax.swing.JMenuItem ChucNangNhan;
    private javax.swing.JMenuItem ChucNangTru;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
