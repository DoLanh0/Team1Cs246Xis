package thuchanh1;
import java.awt.Color;
public class FormCong extends javax.swing.JFrame {
    public FormCong() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKQ = new javax.swing.JLabel();
        jtxtResult = new javax.swing.JTextField();
        jtxtImport1 = new javax.swing.JTextField();
        jtxtImport2 = new javax.swing.JTextField();
        jbtnNhapLai = new javax.swing.JButton();
        jbtnTinhCong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        LogoutLbI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(360, 340));

        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });

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

        jbtnTinhCong.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jbtnTinhCong.setText("Tính Cộng");
        jbtnTinhCong.setPreferredSize(new java.awt.Dimension(117, 35));
        jbtnTinhCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnTinhCongMouseClicked(evt);
            }
        });
        jbtnTinhCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTinhCongActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Tính Cộng");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(63, 63, 63)
                                .addComponent(Delete)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnTinhCong, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jbtnNhapLai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblKQ))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LogoutLbI)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtImport1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtImport2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(lblKQ)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtImport1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jtxtImport2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtResult)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnTinhCong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LogoutLbI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed

    }//GEN-LAST:event_jtxtResultActionPerformed

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

    private void jbtnTinhCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnTinhCongMouseClicked
        try {
            double so1 = Double.parseDouble( jtxtImport1.getText());
            double so2 = Double.parseDouble( jtxtImport2.getText());
            jtxtResult.setForeground(Color.BLACK);
            jtxtResult.setText("" + (so1 + so2));

        }
        catch(Exception e) {
            jtxtResult.setForeground(Color.red);
            jtxtResult.setText("Nhập dữ liệu sai");
        }
    }//GEN-LAST:event_jbtnTinhCongMouseClicked

    private void jbtnTinhCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTinhCongActionPerformed

    }//GEN-LAST:event_jbtnTinhCongActionPerformed

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        System.exit(0);
    }//GEN-LAST:event_DeleteMouseClicked

    private void LogoutLbIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLbIMouseClicked
        this.dispose();
        new FormChinh().setVisible(true);
    }//GEN-LAST:event_LogoutLbIMouseClicked
   
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCong().setVisible(true);
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
    private javax.swing.JButton jbtnTinhCong;
    private javax.swing.JTextField jtxtImport1;
    private javax.swing.JTextField jtxtImport2;
    private javax.swing.JTextField jtxtResult;
    private javax.swing.JLabel lblKQ;
    // End of variables declaration//GEN-END:variables
}
