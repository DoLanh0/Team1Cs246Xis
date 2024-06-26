package bookshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;  
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UnameTb = new javax.swing.JTextField();
        PasswordTb = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RoleCb = new javax.swing.JComboBox<>();
        LoginBtn = new javax.swing.JButton();
        ResetLbI = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 338));
        setSize(new java.awt.Dimension(512, 341));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 92, 6));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seller Login");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admin Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(118, 118, 118))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 338));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 92, 6));
        jLabel1.setText("Book Shop Software");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 180, 32));

        UnameTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UnameTb.setForeground(new java.awt.Color(255, 92, 6));
        UnameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameTbActionPerformed(evt);
            }
        });
        getContentPane().add(UnameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 150, 160, 34));

        PasswordTb.setText("jPasswordField1");
        PasswordTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTbActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 202, 160, 33));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 92, 6));
        jLabel2.setText("UserName");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 153, -1, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 92, 6));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 205, 86, 25));

        RoleCb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RoleCb.setForeground(new java.awt.Color(255, 92, 6));
        RoleCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller" }));
        RoleCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleCbActionPerformed(evt);
            }
        });
        getContentPane().add(RoleCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 106, 132, 32));

        LoginBtn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 92, 6));
        LoginBtn.setText("Login");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 140, 33));

        ResetLbI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ResetLbI.setForeground(new java.awt.Color(255, 92, 6));
        ResetLbI.setText("Reset");
        ResetLbI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetLbIMouseClicked(evt);
            }
        });
        getContentPane().add(ResetLbI, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 60, 25));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 92, 6));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 20, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh5.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTbActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void ResetLbIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetLbIMouseClicked
        UnameTb.setText("");
        PasswordTb.setText("");
    }//GEN-LAST:event_ResetLbIMouseClicked
Connection Con = null; //Dung de ket noi co so du lieu
Statement St = null; //Dung de thuc hien truy van SQL
ResultSet Rs = null; //Dung de luu tru ket qua
    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        if(UnameTb.getText().isEmpty() || PasswordTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Username and Password");
        }   
        else 
               if(RoleCb.getSelectedIndex() == 1) {
                    String Query = "select * from App.UserTbl where UName='" + UnameTb.getText() + "' and UPassword = '" + PasswordTb.getText() + "'";
                    String UserName = UnameTb.getText();
                    try {
                        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
                        St = Con.createStatement();
                        Rs = St.executeQuery(Query);
                        if(Rs.next()) {
                            this.dispose();
                            new Billing(UserName).setVisible(true);
                    }
                    else { 
                            JOptionPane.showMessageDialog(this, "Incorrect username or password");
                            UnameTb.setText("");
                            PasswordTb.setText("");
                        }
                    }
                    catch (Exception e) {
                    }   
                }
                else {
                    if(UnameTb.getText().equals("Admin") && PasswordTb.getText().equals("369369369")) {
                        this.dispose();
                        new Books().setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Incorrect username or password");
                        UnameTb.setText("");
                        PasswordTb.setText("");
                    }
           }
    }//GEN-LAST:event_LoginBtnMouseClicked

    private void RoleCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleCbActionPerformed

    private void UnameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnameTbActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PasswordTb;
    private javax.swing.JLabel ResetLbI;
    private javax.swing.JComboBox<String> RoleCb;
    private javax.swing.JTextField UnameTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
