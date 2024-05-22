package thuchanh1;
import java.awt.Color;
public class FormChia extends javax.swing.JFrame {
    public FormChia() {
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

        jtxtImport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImport1ActionPerformed(evt);
            }
        });

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

        jbtnTinhNhan.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jbtnTinhNhan.setText("Tính Chia");
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

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Tính Chia");

        Delete.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        Delete.setText("✖");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        LogoutLbI.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        LogoutLbI.setText("⬅");
        LogoutLbI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLbIMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("Kết quả");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("Số thứ nhất");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setText("Số thứ hai");

        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(jLabel1)
                            .addGap(62, 62, 62)
                            .addComponent(Delete))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel3)
                            .addGap(29, 29, 29)
                            .addComponent(jtxtImport1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(jtxtImport2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jbtnTinhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jbtnNhapLai))
                        .addComponent(LogoutLbI))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel1))
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtxtImport1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtxtImport2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnTinhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnNhapLai))
                    .addGap(6, 6, 6)
                    .addComponent(LogoutLbI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
            Double so1 = Double.parseDouble( jtxtImport1.getText());
            Double so2 = Double.parseDouble( jtxtImport2.getText());
            jtxtResult.setForeground(Color.BLACK);
            jtxtResult.setText("" + (so1 / so2));

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
                new FormChia().setVisible(true);
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
