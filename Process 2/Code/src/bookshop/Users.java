package bookshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Users extends javax.swing.JFrame {
    public Users() {
        initComponents(); 
        displayUsers();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserLbI = new javax.swing.JLabel();
        LogoutLbI = new javax.swing.JLabel();
        BookLbI = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PasswordTb = new javax.swing.JTextField();
        UIdTb = new javax.swing.JTextField();
        UnameTb = new javax.swing.JTextField();
        PhoneTb = new javax.swing.JTextField();
        AddressTb = new javax.swing.JTextField();
        PrintBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        ResetBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1020, 627));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 96, 2));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 92, 6));
        jLabel3.setText("Book Shop Software");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(370, 370, 370)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        UserLbI.setBackground(new java.awt.Color(255, 255, 255));
        UserLbI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserLbI.setForeground(new java.awt.Color(255, 92, 6));
        UserLbI.setText("Users");
        getContentPane().add(UserLbI, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, 30));

        LogoutLbI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh3.png"))); // NOI18N
        LogoutLbI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLbIMouseClicked(evt);
            }
        });
        getContentPane().add(LogoutLbI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, 32));

        BookLbI.setBackground(new java.awt.Color(255, 255, 255));
        BookLbI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BookLbI.setForeground(new java.awt.Color(255, 92, 6));
        BookLbI.setText("Books");
        BookLbI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookLbIMouseClicked(evt);
            }
        });
        getContentPane().add(BookLbI, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, 30));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 51, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 92, 6));
        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 92, 6));
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 92, 6));
        jLabel9.setText("Phone");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 92, 6));
        jLabel10.setText("Address");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 92, 6));
        jLabel11.setText("User List");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        PasswordTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PasswordTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(PasswordTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 160, 34));

        UIdTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UIdTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(UIdTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 160, 34));

        UnameTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UnameTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(UnameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 160, 34));

        PhoneTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PhoneTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(PhoneTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 160, 34));

        AddressTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AddressTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(AddressTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 160, 34));

        PrintBtn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 92, 6));
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });
        getContentPane().add(PrintBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 110, 40));

        SaveBtn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 92, 6));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 33));

        EditBtn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 92, 6));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 110, 33));

        DeleteBtn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 92, 6));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 110, 33));

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Phone", "Password"
            }
        ));
        UsersTable.setRowHeight(25);
        UsersTable.setRowMargin(1);
        UsersTable.setSelectionBackground(new java.awt.Color(255, 92, 6));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 830, 260));

        ResetBtn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 92, 6));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 110, 33));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 92, 6));
        jLabel13.setText("Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh2.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 59, 30, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection Con = null; //Dung de ket noi co so du lieu.
Statement St = null; //Thuc hien try van SQL
ResultSet Rs = null; //Luu tru ket qua
    private void displayUsers() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from App.UserTbl");
            UsersTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch (Exception e) {
        }
    }    
    
    private void reset() {
        UIdTb.setText("");
        UnameTb.setText("");
        PhoneTb.setText("");
        AddressTb.setText("");
        PasswordTb.setText("");
    }
    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(UIdTb.getText().isEmpty() || UnameTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || AddressTb.getText().isEmpty() || PasswordTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
                PreparedStatement add = Con.prepareStatement("Insert into UserTbl values(?, ?, ?, ?, ?)");
                add.setInt(1, Integer.valueOf(UIdTb.getText()));
                add.setString(2, UnameTb.getText());
                add.setString(3, PhoneTb.getText());
                add.setString(4, AddressTb.getText());
                add.setString(5, PasswordTb.getText());
                    int Save = add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Book Saved");                  
                    displayUsers();    
                    reset();
            }   
            catch(Exception e) {
                e.printStackTrace();
            }
        }            
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void LogoutLbIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLbIMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutLbIMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try {
            UsersTable.print(); 
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)UsersTable.getModel();
        int MyIndex = UsersTable.getSelectedRow();
            UIdTb.setText(model.getValueAt(MyIndex, 0).toString());
            UnameTb.setText(model.getValueAt(MyIndex, 1).toString());
            PhoneTb.setText(model.getValueAt(MyIndex, 2).toString());
            AddressTb.setText(model.getValueAt(MyIndex, 3).toString());
            PasswordTb.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_UsersTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(UIdTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
                String UId = UIdTb.getText();
                String Query = "Delete from App.UserTbl where UID = " + UId;
                Statement Delete = Con.createStatement();
                Delete.executeUpdate(Query);
                    JOptionPane.showMessageDialog(this, "User Deleted");
                    displayUsers();
                    reset();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
       if(UIdTb.getText().isEmpty() || UnameTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || AddressTb.getText().isEmpty() || PasswordTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else {
           try {
               Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
                    //Lay gia tri tu truong van ban UIdTb va gan vao bien chuoi UId
               String UId = UIdTb.getText();
               String Query = "Update App.UserTbl set Uname='" + UnameTb.getText() + "',UPhone='" + PhoneTb.getText() + "',UAddress='" + AddressTb.getText() + "',UPassword='" + PasswordTb.getText() + "'where UID=" + UId;
               Statement Edit = Con.createStatement();
               Edit.executeUpdate(Query);   
               JOptionPane.showMessageDialog(this, "User Edit");
               displayUsers();
               reset();
           }
           catch (Exception e) {
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BookLbIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookLbIMouseClicked
        this.dispose();
        new Books().setVisible(true);
    }//GEN-LAST:event_BookLbIMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTb;
    private javax.swing.JLabel BookLbI;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LogoutLbI;
    private javax.swing.JTextField PasswordTb;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField UIdTb;
    private javax.swing.JTextField UnameTb;
    private javax.swing.JLabel UserLbI;
    private javax.swing.JTable UsersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
