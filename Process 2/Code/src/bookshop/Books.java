package bookshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Books extends javax.swing.JFrame {
    public Books() {
        initComponents();
        DisplayBooks();
    }
    
Connection Con = null; //Dung de ket noi co so du lieu
Statement St = null; //Thuc hien truy van SQL
ResultSet Rs = null; //Luu tru ket qua
private void DisplayBooks() {
    try {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from App.BookTbl");
        BooksTable.setModel(DbUtils.resultSetToTableModel(Rs)); 
    }
        catch (Exception e) {
    }
} 

    private void reset() {
        BookIdTb.setText("");
        NameTb.setText("");
        AuthorTb.setText("");
        CatCb.setSelectedIndex(0);
        QuantityTb.setText("");
        PriceTb.setText("");     
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserLbI = new javax.swing.JLabel();
        BookLbI = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        BookIdTb = new javax.swing.JTextField();
        NameTb = new javax.swing.JTextField();
        AuthorTb = new javax.swing.JTextField();
        QuantityTb = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        ResetBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CatCb = new javax.swing.JComboBox<>();
        SaveBtn1 = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LogoutLbt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1020, 627));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 96, 2));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(993, 0, 27, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 92, 6));
        jLabel3.setText("Book Shop Software");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 2, -1, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        UserLbI.setBackground(new java.awt.Color(255, 255, 255));
        UserLbI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserLbI.setForeground(new java.awt.Color(255, 92, 6));
        UserLbI.setText("Users");
        UserLbI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLbIMouseClicked(evt);
            }
        });
        getContentPane().add(UserLbI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 24));

        BookLbI.setBackground(new java.awt.Color(255, 255, 255));
        BookLbI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BookLbI.setForeground(new java.awt.Color(255, 92, 6));
        BookLbI.setText("Books");
        getContentPane().add(BookLbI, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 60, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 92, 6));
        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 92, 6));
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 133, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 92, 6));
        jLabel9.setText("Author");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 133, -1, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 92, 6));
        jLabel10.setText("Categaries");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 133, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 92, 6));
        jLabel11.setText("Users List");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 273, 80, -1));

        PriceTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(PriceTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 163, 160, 30));

        BookIdTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BookIdTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(BookIdTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 90, 30));

        NameTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(NameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 163, 160, 30));

        AuthorTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AuthorTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(AuthorTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 163, 160, 30));

        QuantityTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        QuantityTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(QuantityTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 163, 160, 30));

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
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 223, 110, 33));

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
        getContentPane().add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 223, 110, 33));

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
        getContentPane().add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 223, 110, 33));

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title", "Author", "Categories", "Quantity", "Price"
            }
        ));
        BooksTable.setRowHeight(25);
        BooksTable.setRowMargin(1);
        BooksTable.setSelectionBackground(new java.awt.Color(255, 92, 6));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BooksTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 303, 920, 260));

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
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 223, 110, 33));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 92, 6));
        jLabel13.setText("Price");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 133, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 92, 6));
        jLabel14.setText("Quantity");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 133, -1, -1));

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
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 50, -1));

        CatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programming", "Buddhism", "Story", "Didactic", "Foreign Language", "Psychology - Life skills", "Economy" }));
        CatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbActionPerformed(evt);
            }
        });
        getContentPane().add(CatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 163, 140, 30));

        SaveBtn1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        SaveBtn1.setForeground(new java.awt.Color(255, 92, 6));
        SaveBtn1.setText("Save");
        SaveBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtn1MouseClicked(evt);
            }
        });
        SaveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 223, 110, 33));

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
        getContentPane().add(PrintBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, 100, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh2.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        LogoutLbt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh3.png"))); // NOI18N
        LogoutLbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLbt2MouseClicked(evt);
            }
        });
        getContentPane().add(LogoutLbt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, 32));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void UserLbIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLbIMouseClicked
        this.dispose();
        new Users().setVisible(true);
    }//GEN-LAST:event_UserLbIMouseClicked

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(BookIdTb.getText().isEmpty() || NameTb.getText().isEmpty() || AuthorTb.getText().isEmpty() || CatCb.getSelectedIndex() == -1 || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Missing Information");
        } 
        else {
            try { 
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
                PreparedStatement add = Con.prepareStatement("Insert into  BookTbl values(?, ?, ?, ?, ?, ?)");
                add.setInt(1, Integer.valueOf(BookIdTb.getText()));
                add.setString(2, NameTb.getText());
                add.setString(3, AuthorTb.getText());
                add.setString(4, CatCb.getSelectedItem().toString());
                add.setInt(5, Integer.valueOf(QuantityTb.getText()));
                add.setInt(6, Integer.valueOf(PriceTb.getText()));
                int Save = add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Book Saved");
                reset();
                DisplayBooks();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }           
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(BookIdTb.getText().isEmpty() || NameTb.getText().isEmpty() || AuthorTb.getText().isEmpty() || CatCb.getSelectedIndex() == -1 || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty()) {    
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else {
            try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
                //Lay gia tri tu truong van ban BookIdTb va gan no cho bien chuoi BId.
            String BId = BookIdTb.getText();
            String Query = "Update App.BookTbl set Title='" + NameTb.getText() + "',Author='" + AuthorTb.getText() + "',Category='" + CatCb.getSelectedItem() + "',Quantity=" + QuantityTb.getText() + ",Price=" + PriceTb.getText() + "Where BID = " + BId;
            Statement Edit = Con.createStatement();
            Edit.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Book Edit");
            DisplayBooks();
            reset();          
        }
        catch (Exception e) {
                e.printStackTrace();    
        }
    }//GEN-LAST:event_EditBtnMouseClicked
}
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(BookIdTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else {
            try {
                 Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
                    //Lay van ban da nhap vao truong van ban BookIdTb va luu vao mot bien chuoi BId.
                 String BId = BookIdTb.getText();
                 String Query = "Delete from App.BookTbl where BID =" + BId; 
                Statement Delete = Con.createStatement();
                Delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Book Deleted");
                 DisplayBooks();
                reset();              
            }
          catch (Exception e) {
              e.printStackTrace();
          }
       }         
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BookIdTb.setText(model.getValueAt(MyIndex, 0).toString());
        NameTb.setText(model.getValueAt(MyIndex, 1).toString());
        AuthorTb.setText(model.getValueAt(MyIndex, 2).toString());
        CatCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        QuantityTb.setText(model.getValueAt(MyIndex, 4).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 5).toString()); 
    }//GEN-LAST:event_BooksTableMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void CatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbActionPerformed

    private void SaveBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtn1MouseClicked

    private void SaveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtn1ActionPerformed

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
       try {
           BooksTable.print();
       }
       catch (Exception e) {                 
       }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void LogoutLbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLbt2MouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutLbt2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuthorTb;
    private javax.swing.JTextField BookIdTb;
    private javax.swing.JLabel BookLbI;
    private javax.swing.JTable BooksTable;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LogoutLbt2;
    private javax.swing.JTextField NameTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QuantityTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SaveBtn1;
    private javax.swing.JLabel UserLbI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
