
import java.awt.Image;
import java.io.File;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chathura Sanjaya
 */
public class admin_panel extends javax.swing.JFrame {
 
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    private ImageIcon finalImage;
    private String filename;
     String path;
    /**
     * Creates new form admin_panel
     */
    public admin_panel() {
        initComponents();
         con = Dbconnection.getConnection();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Brand = new javax.swing.JTextField();
        Model = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Qty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cat = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        selectedPhoto = new javax.swing.JLabel();
        mPhotoPath = new javax.swing.JTextField();
        photoSelection = new javax.swing.JButton();
        LogInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 77, 64));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 77, 64));
        jLabel4.setText("Brand:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 104, -1));

        Brand.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Brand.setForeground(new java.awt.Color(0, 77, 64));
        Brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandActionPerformed(evt);
            }
        });
        jPanel1.add(Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 362, -1));

        Model.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Model.setForeground(new java.awt.Color(0, 77, 64));
        Model.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelActionPerformed(evt);
            }
        });
        jPanel1.add(Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 362, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 77, 64));
        jLabel5.setText("Model:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 104, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 77, 64));
        jLabel7.setText("Price:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 104, -1));

        Price.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Price.setForeground(new java.awt.Color(0, 77, 64));
        Price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 180, -1));

        Qty.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Qty.setForeground(new java.awt.Color(0, 77, 64));
        Qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });
        jPanel1.add(Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 110, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 77, 64));
        jLabel8.setText("Quantity:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 104, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 77, 64));
        jLabel6.setText("Category:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 104, -1));

        Cat.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronics", "Mobile", "Kids" }));
        jPanel1.add(Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 77, 64));
        jLabel9.setText("Product Description:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, -1));

        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Description.setLineWrap(true);
        Description.setRows(5);
        Description.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 77, 64), 1, true));
        jScrollPane1.setViewportView(Description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 370, 190));

        selectedPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Image_100px.png"))); // NOI18N
        selectedPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 77, 64), 1, true));
        selectedPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(selectedPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 230, 210));

        mPhotoPath.setEditable(false);
        mPhotoPath.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mPhotoPath.setForeground(new java.awt.Color(0, 77, 64));
        mPhotoPath.setText("Choose photo:");
        mPhotoPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        mPhotoPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPhotoPathActionPerformed(evt);
            }
        });
        jPanel1.add(mPhotoPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 210, 30));

        photoSelection.setBackground(new java.awt.Color(0, 77, 64));
        photoSelection.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        photoSelection.setForeground(new java.awt.Color(255, 255, 255));
        photoSelection.setBorder(null);
        photoSelection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        photoSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoSelectionActionPerformed(evt);
            }
        });
        jPanel1.add(photoSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 50, 30));

        LogInButton.setBackground(new java.awt.Color(0, 77, 64));
        LogInButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Database_24px.png"))); // NOI18N
        LogInButton.setText("Update");
        LogInButton.setBorder(null);
        LogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandActionPerformed

    private void ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed

    private void mPhotoPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPhotoPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPhotoPathActionPerformed

    private void photoSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoSelectionActionPerformed
        // TODO add your handling code here:
         JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File selectedImage = fc.getSelectedFile();
        path = selectedImage.getName();
        
        try {
            Image img = ImageIO.read(selectedImage);
            mPhotoPath.setText(path);
            selectedPhoto.setIcon(new ImageIcon(img.getScaledInstance(selectedPhoto.getWidth(),
                    selectedPhoto.getHeight(), Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(admin_panel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_photoSelectionActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
//          try {
//            String sql = "insert into new_product"
//                    +"(brand, model, price, quantity, category, product_description,"
//                    + " img)values (?,?,?,?,?,?,?)";
//            ps = con.prepareStatement(sql);
//            ps.setString(1, mBrand.getText());
//            ps.setString(2, mModel.getText());
//            ps.setString(3, mPrice.getText());
//             ps.setString(4, mQty.getText());
//               if(mCat.getSelectedItem().equals("Mobile")){
//                if(!path.equals(""))
//                Mobiles.insertIntoMobileDB(mBrand.getText(), mModel.getText(), Integer.parseInt(mPrice.getText()),
//                    Integer.parseInt(mQty.getText()), mDescription.getText(), path);
//            }
//
//            else if(mCat.getSelectedItem().equals("Electronics")){
//                if(!path.equals(""))
//                Electronics.insertIntoElectronicsDB(mBrand.getText(), mModel.getText(), Integer.parseInt(mPrice.getText()),
//                    Integer.parseInt(mQty.getText()), mDescription.getText(), path);
//            }
//            else if(mCat.getSelectedItem().equals("Kids")){
//                if(!path.equals(""))
//                Kids.insertIntoKidsDB(mBrand.getText(), mModel.getText(), Integer.parseInt(mPrice.getText()),
//                    Integer.parseInt(mQty.getText()), mDescription.getText(), path);
//               }
//            //ps.setString(5, (String) mCat.getSelectedItem());
//             ps.setString(6, mDescription.getText());
//           if(filename!=null){
//            FileInputStream fis=new FileInputStream(filename);
//            ps.setBinaryStream(7,fis,(int)filename.length());
//            }
//            ps.execute();
//            JOptionPane.showMessageDialog(null, "New Product added Successfully");
//             mBrand.setText(null);
//             mModel.setText(null);
//             mPrice.setText(null);
//             mQty.setText(null);
//             mCat.setSelectedIndex(0);
//             selectedPhoto.setIcon(null);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        
//        }
        try{
            if(Cat.getSelectedItem().equals("Mobile")){
                if(!path.equals(""))
                Mobiles.insertIntoMobileDB(Brand.getText(), Model.getText(), Integer.parseInt(Price.getText()),
                    Integer.parseInt(Qty.getText()), Description.getText(), path);
            }

            else if(Cat.getSelectedItem().equals("Electronics")){
                if(!path.equals(""))
                Electronics.insertIntoElectronicsDB(Brand.getText(), Model.getText(), Integer.parseInt(Price.getText()),
                    Integer.parseInt(Qty.getText()), Description.getText(), path);
            }
            else if(Cat.getSelectedItem().equals("Kids")){
                if(!path.equals(""))
                Kids.insertIntoKidsDB(Brand.getText(), Model.getText(), Integer.parseInt(Price.getText()),
                    Integer.parseInt(Qty.getText()), Description.getText(), path);
            }

            Brand.setText("");
            Model.setText("");
            Qty.setText("");
            Price.setText("");
            Description.setText("");
            mPhotoPath.setText("");
            selectedPhoto.setIcon(null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            Brand.setText("");
            Model.setText("");
            Qty.setText("");
            Price.setText("");
            Description.setText("");
            mPhotoPath.setText("");
            selectedPhoto.setIcon(null);
        }

    }//GEN-LAST:event_LogInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(admin_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brand;
    private javax.swing.JComboBox<String> Cat;
    private javax.swing.JTextArea Description;
    private javax.swing.JButton LogInButton;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Qty;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mPhotoPath;
    private javax.swing.JButton photoSelection;
    private javax.swing.JLabel selectedPhoto;
    // End of variables declaration//GEN-END:variables
}
