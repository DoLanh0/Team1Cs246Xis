package bookshop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

public class Billing extends javax.swing.JFrame {

    public Billing() {
        initComponents();
    }

    public Billing(String UN) {
        initComponents();
        UnameLbl.setText(UN); //Dung de hien thi ten nguoi dung 
        DisplayBooks();
        BookNameTb.setEditable(false);
        PriceTb.setEditable(false);
    }
    Connection Con = null; //Dung de ket noi co so du lieu
    Statement St = null; //Dung de thuc hien truy van SQL.
    ResultSet Rs = null; //Dung de luu tru ket qua.

    private void DisplayBooks() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from App.BookTbl");
            BooksTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UnameLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GrdTotalLbl = new javax.swing.JLabel();
        QtyTb = new javax.swing.JTextField();
        BookNameTb = new javax.swing.JTextField();
        AddToBillBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        ClientNameTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        ResetBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LogoutLbt1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BillNumTb = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();

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
                .addContainerGap(435, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(363, 363, 363)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        UnameLbl.setBackground(new java.awt.Color(255, 255, 255));
        UnameLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UnameLbl.setForeground(new java.awt.Color(255, 92, 6));
        UnameLbl.setText("Users");
        UnameLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnameLblMouseClicked(evt);
            }
        });
        getContentPane().add(UnameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 24));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 92, 6));
        jLabel8.setText("Book Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 92, 6));
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 20));

        GrdTotalLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GrdTotalLbl.setForeground(new java.awt.Color(255, 92, 6));
        GrdTotalLbl.setText("Total");
        getContentPane().add(GrdTotalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 80, -1));

        QtyTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        QtyTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(QtyTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, 30));

        BookNameTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BookNameTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(BookNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 30));

        AddToBillBtn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        AddToBillBtn.setForeground(new java.awt.Color(255, 92, 6));
        AddToBillBtn.setText("Add To Bill");
        AddToBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBillBtnMouseClicked(evt);
            }
        });
        AddToBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBillBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddToBillBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

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
        getContentPane().add(PrintBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 110, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 92, 6));
        jLabel10.setText("Client Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 92, 6));
        jLabel13.setText("Price");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 20));

        PriceTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(PriceTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 90, 30));

        ClientNameTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ClientNameTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(ClientNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 30));

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title", "Author", "Categories", "Quantity", "Price"
            }
        ));
        BooksTable.setRowHeight(28);
        BooksTable.setRowMargin(1);
        BooksTable.setSelectionBackground(new java.awt.Color(255, 92, 6));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BooksTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 460, 240));

        ResetBtn1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ResetBtn1.setForeground(new java.awt.Color(255, 92, 6));
        ResetBtn1.setText("Reset");
        ResetBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtn1MouseClicked(evt);
            }
        });
        ResetBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 120, 30));

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 470, 330));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 92, 6));
        jLabel14.setText("Books Biil");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 100, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 92, 6));
        jLabel15.setText("Books List");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 100, -1));

        LogoutLbt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh3.png"))); // NOI18N
        LogoutLbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLbt1MouseClicked(evt);
            }
        });
        getContentPane().add(LogoutLbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, -1, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 92, 6));
        jLabel11.setText("Bill Number");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 20));

        BillNumTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BillNumTb.setForeground(new java.awt.Color(255, 92, 6));
        getContentPane().add(BillNumTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 90, 30));

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
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void UnameLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnameLblMouseClicked

    }//GEN-LAST:event_UnameLblMouseClicked

    private void Reset() {
        BookNameTb.setText("");
        PriceTb.setText("");
        QtyTb.setText("");
        ClientNameTb.setText("");
        BillTxt.setText("");
        BillNumTb.setText("");
        i = 0;
    }
    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try {
            BillTxt.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed
    int Stock = 0; // Chua so luong ton kho cua sach 
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        BookNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        Stock = Integer.valueOf(model.getValueAt(MyIndex, 4).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked

    int BId; //Dung de luu tru ID sach dang duoc cap nhat
    private void UpdateBook() {
        int newQty = Stock - Integer.valueOf(QtyTb.getText());
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
            String Query = "Update App.BookTbl set Quantity=" + newQty + " where BID=" + BId;
            Statement Update = Con.createStatement();
            Update.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Book Updated");
            DisplayBooks();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void ResetBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtn1MouseClicked
        Reset();
    }//GEN-LAST:event_ResetBtn1MouseClicked

    private void ResetBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtn1ActionPerformed

    private void LogoutLbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLbt1MouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutLbt1MouseClicked

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if (BillNumTb.getText().isEmpty() || ClientNameTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb", "App", "369369369");
                PreparedStatement add = Con.prepareStatement("insert into BillTbl values(?,?,?,?)");
                add.setInt(1, Integer.valueOf(BillNumTb.getText()));
                add.setString(2, UnameLbl.getText());
                add.setString(3, ClientNameTb.getText());
                add.setInt(4, Integer.valueOf(Total));
                int Save = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Bill Saved");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void AddToBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBillBtnActionPerformed

    }//GEN-LAST:event_AddToBillBtnActionPerformed
    //i dung de dem so luong mat hang duoc them vao hoa don.Total dung de tinh tong chi phi mat hang hien tai. GrdTotal luu tru chi phi tong tat ca mat hang trong hoa don.
    int i = 0, Total = 0, GrdTotal = 0;
    private void AddToBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBillBtnMouseClicked
        if (QtyTb.getText().isEmpty() || BookNameTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else if (Integer.valueOf(QtyTb.getText()) > Stock) {
            JOptionPane.showMessageDialog(this, "No Enough Book in Stock");
        } else {
            i++;
            Total = Integer.valueOf(PriceTb.getText()) * Integer.valueOf(QtyTb.getText());
            //Neu la muc dau tien duoc them vao hoa don. No se them dong tieu de va thong tin chi tiet mat hang vao bang hoa don BillTxt.
            if (i == 1) {
                BillTxt.setText(BillTxt.getText() + "      =================BOOK SHOP=================\n" + "NUM          PRODUCT            PRICE            QUANTITY          TOTAL\n" + i + "          " + BookNameTb.getText() + "       " + PriceTb.getText() + "                    " + QtyTb.getText() + "                   " + Total + "\n");
            } else {
                BillTxt.setText(BillTxt.getText() + i + "          " + BookNameTb.getText() + "       " + PriceTb.getText() + "                    " + QtyTb.getText() + "                   " + Total + "\n");
            }
            GrdTotal = GrdTotal + Total;
            GrdTotalLbl.setText("Rs " + GrdTotal);
            UpdateBook();
        }
    }//GEN-LAST:event_AddToBillBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBillBtn;
    private javax.swing.JTextField BillNumTb;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField BookNameTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JTextField ClientNameTb;
    private javax.swing.JLabel GrdTotalLbl;
    private javax.swing.JLabel LogoutLbt1;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JButton ResetBtn1;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel UnameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
