/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import yumxpress.dao.CompanyDAO;
import yumxpress.dao.ProductDAO;
import yumxpress.pojo.ProductPojo;
import yumxpress.utility.UserProfile;

/**
 *
 * @author Nikita Kumari
 */
public class OrderFoodFrame extends javax.swing.JFrame {

    /**
     * Creates new form OrderFoodFrame
     */
    private Map<String, String> companyMap;
    private List<ProductPojo> productList;
    private int listIndex;
    private JFrame showFrame;
   
    

    public OrderFoodFrame() {
         initComponents();
        this.setLocationRelativeTo(null);
        this.lblUserProfile.setText("Hello " + UserProfile.getUserName().trim());
        loadCompanyNames();
    
        
   
        
    }
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnMyAccount = new javax.swing.JButton();
        btnMyCart = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUserProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lblProductImage1 = new javax.swing.JLabel();
        lblProductImage2 = new javax.swing.JLabel();
        lblProductImage3 = new javax.swing.JLabel();
        lblProductImage4 = new javax.swing.JLabel();
        lblProductImage5 = new javax.swing.JLabel();
        lblProductImage6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcCompanyNames = new javax.swing.JComboBox<>();
        lblProductName1 = new javax.swing.JLabel();
        lblProductName2 = new javax.swing.JLabel();
        lblProductName3 = new javax.swing.JLabel();
        lblProductName4 = new javax.swing.JLabel();
        lblProductName5 = new javax.swing.JLabel();
        lblProductName6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user.png"))); // NOI18N

        btnMyAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMyAccount.setText("My Account");

        btnMyCart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMyCart.setText("My Cart");

        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelOrder.setText("Cancel Order");

        btnOrderHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOrderHistory.setText("Order History");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Back");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMyAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMyCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMyAccount)
                .addGap(46, 46, 46)
                .addComponent(btnMyCart)
                .addGap(58, 58, 58)
                .addComponent(btnCancelOrder)
                .addGap(55, 55, 55)
                .addComponent(btnOrderHistory)
                .addGap(54, 54, 54)
                .addComponent(btnBack)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Order Food");

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/icons8-left-arrow-64.png"))); // NOI18N

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/icons8-right-arrow-64.png"))); // NOI18N

        lblProductImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductImage2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductImage3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductImage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductImage4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductImage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductImage6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("FILTER");

        jcCompanyNames.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcCompanyNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCompanyNamesActionPerformed(evt);
            }
        });

        lblProductName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductName1.setText("NA");
        lblProductName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductName2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductName2.setText("NA");
        lblProductName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductName3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductName3.setText("NA");
        lblProductName3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductName4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductName4.setText("NA");
        lblProductName4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        lblProductName5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductName5.setText("NA");

        lblProductName6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductName6.setText("NA");
        lblProductName6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderFoodClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNext, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(lblProductImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcCompanyNames, 0, 155, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblProductImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblProductImage6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(lblProductName4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172)
                                        .addComponent(lblProductName5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(210, 210, 210)
                                        .addComponent(lblProductName6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblProductImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(43, 43, 43)
                                                        .addComponent(lblProductName1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblProductImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(lblProductName2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(169, 169, 169)
                                                .addComponent(lblProductName3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(lblProductImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcCompanyNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductImage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblProductName2)
                                    .addComponent(lblProductName3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblProductImage6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProductImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductName1)
                                .addGap(30, 30, 30)
                                .addComponent(lblProductImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lblBack)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName4)
                    .addComponent(lblProductName5)
                    .addComponent(lblProductName6))
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lblNext, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCompanyNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCompanyNamesActionPerformed
       String compName = jcCompanyNames.getSelectedItem().toString();
        String compId = companyMap.get(compName);
        if (compId == null) {
            compId = "ALL";
        }
        try {
            productList = ProductDAO.getAllProductsByCompanyId(compId);
            showDetails();
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN OrderFoodFrame");
            sq.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image ERROR IN OrderFoodFrame");
            ex.printStackTrace();
        }
    
    
    }//GEN-LAST:event_jcCompanyNamesActionPerformed

    private void lblOrderFoodClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrderFoodClick
        JLabel lbl = (JLabel) evt.getSource();
        int index = Integer.parseInt(lbl.getName());
        System.out.println("You clicked on:" + index);
        if (index >= productList.size()) {
            JOptionPane.showMessageDialog(null, "Invalid item clicked");
            return;
        }
        String[] str = {"Add To Cart", "Buy Now"};
        int choice = JOptionPane.showOptionDialog(null, "What do you want to do ?", "Select", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[1]);
        if (choice == 0) {
            // Code for add to cart
        } else {
            ProductPojo p = productList.get(index);
            showFrame = new OrderProductFrame(p);
            showFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblOrderFoodClick

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcCompanyNames;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblProductImage1;
    private javax.swing.JLabel lblProductImage2;
    private javax.swing.JLabel lblProductImage3;
    private javax.swing.JLabel lblProductImage4;
    private javax.swing.JLabel lblProductImage5;
    private javax.swing.JLabel lblProductImage6;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblProductName2;
    private javax.swing.JLabel lblProductName3;
    private javax.swing.JLabel lblProductName4;
    private javax.swing.JLabel lblProductName5;
    private javax.swing.JLabel lblProductName6;
    private javax.swing.JLabel lblUserProfile;
    // End of variables declaration//GEN-END:variables


          private void showDetails() {
               if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage1.getWidth(), lblProductImage1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage1.setIcon(icon);
            lblProductName1.setText(p.getProductName());
            lblProductImage1.setName(listIndex + "");
            lblProductName1.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage1.setIcon(null);
            lblProductImage1.setText("N/A");
            lblProductName1.setText("N/A");
            lblProductImage1.setName(listIndex + "");
            lblProductName1.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage2.getWidth(), lblProductImage2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductName2.setText(p.getProductName());
            lblProductImage2.setIcon(icon);
            lblProductImage2.setName(listIndex + "");
            lblProductName2.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage2.setIcon(null);
            lblProductImage2.setText("N/A");
            lblProductName2.setText("N/A");
            lblProductImage2.setName(listIndex + "");
            lblProductName2.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage3.getWidth(), lblProductImage3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage3.setIcon(icon);
            lblProductName3.setText(p.getProductName());
            lblProductImage3.setName(listIndex + "");
            lblProductName3.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage3.setIcon(null);
            lblProductImage3.setText("N/A");
            lblProductName3.setText("N/A");
            lblProductImage3.setName(listIndex + "");
            lblProductName3.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage4.getWidth(), lblProductImage4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage4.setIcon(icon);
            lblProductName4.setText(p.getProductName());
            lblProductImage4.setName(listIndex + "");
            lblProductName4.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage4.setIcon(null);
            lblProductImage4.setText("N/A");
            lblProductName4.setText("N/A");
            lblProductImage4.setName(listIndex + "");
            lblProductName4.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage5.getWidth(), lblProductImage5.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage5.setIcon(icon);
            lblProductName5.setText(p.getProductName());
            lblProductImage5.setName(listIndex + "");
            lblProductName5.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage5.setIcon(null);
            lblProductImage5.setText("N/A");
            lblProductName5.setText("N/A");
            lblProductImage5.setName(listIndex + "");
            lblProductName5.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage6.getWidth(), lblProductImage6.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage6.setIcon(icon);
            lblProductName6.setText(p.getProductName());
            lblProductImage6.setName(listIndex + "");
            lblProductName6.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage6.setIcon(null);
            lblProductImage6.setText("N/A");
            lblProductName6.setText("N/A");
            lblProductImage6.setName(listIndex + "");
            lblProductName6.setName(listIndex + "");
            listIndex++;
        }
    }




    private void loadCompanyNames() {
         try {
            companyMap = CompanyDAO.getAllCompanyIdAndName();
            Set<String> companyNames = companyMap.keySet();
            jcCompanyNames.addItem("ALL");
            for (String cname : companyNames) {
                jcCompanyNames.addItem(cname);
            }
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN OrderFoodFrame");
            sq.printStackTrace();
        }
    }
}
         
