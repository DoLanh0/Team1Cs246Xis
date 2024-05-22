package bookshop;
public class Splash extends javax.swing.JFrame {
    public Splash() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PercentageLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Myprogress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 92, 6));
        jPanel1.setPreferredSize(new java.awt.Dimension(439, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(240, 240, 240));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book shop management system");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 330, -1));

        jLabel3.setBackground(new java.awt.Color(240, 240, 240));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Loading modules");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, -1));

        PercentageLbl.setBackground(new java.awt.Color(240, 240, 240));
        PercentageLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 25)); // NOI18N
        PercentageLbl.setForeground(new java.awt.Color(255, 255, 255));
        PercentageLbl.setText("%");
        jPanel1.add(PercentageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Hinh4.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 50, 60));

        Myprogress.setBackground(new java.awt.Color(255, 255, 255));
        Myprogress.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Myprogress.setForeground(new java.awt.Color(255, 92, 6));
        Myprogress.setBorder(null);
        Myprogress.setBorderPainted(false);
        jPanel1.add(Myprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 460, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String [] args) {
        Splash Mysplash = new Splash();
        Mysplash.setVisible(true);
        try {
            for(int i = 0; i <= 100; i++) {
                Thread.sleep(60);
                Mysplash.Myprogress.setValue(i); //Cap nhat thanh tien trinh Myprogress cua Mysplash thanh gia tri i
                Mysplash.PercentageLbl.setText(Integer.toString(i) + "%");
            }
        }
        catch(Exception e) {
        }
        Mysplash.dispose();
        new Login().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Myprogress;
    private javax.swing.JLabel PercentageLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
