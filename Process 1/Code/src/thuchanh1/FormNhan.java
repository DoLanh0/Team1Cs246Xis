package thuchanh1;
import java.awt.Color;
public class FormNhan extends javax.swing.JFrame {
    public FormNhan() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtImport1 = new javax.swing.JTextField();
        jtxtImport2 = new javax.swing.JTextField();
        jbtnNhapLai = new javax.swing.JButton();
        jbtnTinhNhan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        LogoutLbI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(360, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtImport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImport1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImport1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 89, 150, 36));
        getContentPane().add(jtxtImport2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 145, 150, 36));

        jbtnNhapLai.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jbtnNhapLai.setText("Nhập lại");
        jbtnNhapLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnNhapLaiMouseClicked(evt);
            }
        });
        jbtnNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNhapLaiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnNhapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 263, -1, -1));

        jbtnTinhNhan.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jbtnTinhNhan.setText("Tính Nhân");
        jbtnTinhNhan.setPreferredSize(new java.awt.Dimension(117, 35));
        jbtnTinhNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnTinhNhanMouseClicked(evt);
            }
        });
        jbtnTinhNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTinhNhanActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTinhNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 263, 140, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Tính Nhân");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 25, -1, -1));

        Delete.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        Delete.setText("✖");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 11, -1, 35));

        LogoutLbI.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        LogoutLbI.setText("⬅");
        LogoutLbI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLbIMouseClicked(evt);
            }
        });
        getContentPane().add(LogoutLbI, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 304, -1, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("Kết quả");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 201, 145, 36));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("Số thứ nhất");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 95, -1, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setText("Số thứ hai");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 151, 132, 30));

        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 201, 150, 36));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtImport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImport1ActionPerformed

    }//GEN-LAST:event_jtxtImport1ActionPerformed

    private void jbtnNhapLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNhapLaiMouseClicked
        jtxtResult.setForeground(Color.BLACK);
        jtxtImport1.setText("");
        jtxtImport2.setText("");
        jtxtResult.setText("");
    }//GEN-LAST:event_jbtnNhapLaiMouseClicked

    private void jbtnNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNhapLaiActionPerformed

    }//GEN-LAST:event_jbtnNhapLaiActionPerformed

    private void jbtnTinhNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnTinhNhanMouseClicked
        try {
            double so1 = Double.parseDouble( jtxtImport1.getText());
            double so2 = Double.parseDouble( jtxtImport2.getText());
            jtxtResult.setForeground(Color.BLACK);
            jtxtResult.setText("" + (so1 * so2));

        }
        catch(Exception e) {
            jtxtResult.setForeground(Color.red);
            jtxtResult.setText("Nhập dữ liệu sai");
        }
    }//GEN-LAST:event_jbtnTinhNhanMouseClicked

    private void jbtnTinhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTinhNhanActionPerformed

    }//GEN-LAST:event_jbtnTinhNhanActionPerformed

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        System.exit(0);
    }//GEN-LAST:event_DeleteMouseClicked

    private void LogoutLbIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLbIMouseClicked
        this.dispose();
        new FormChinh().setVisible(true);
    }//GEN-LAST:event_LogoutLbIMouseClicked

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed

    }//GEN-LAST:event_jtxtResultActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel LogoutLbI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnNhapLai;
    private javax.swing.JButton jbtnTinhNhan;
    private javax.swing.JTextField jtxtImport1;
    private javax.swing.JTextField jtxtImport2;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
