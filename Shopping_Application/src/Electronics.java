/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Void
 */
public class Electronics {
    public static boolean flag = false;
    public static void insertIntoElectronicsDB(String brand, String model, int price, int qty, String description, String imagePath){
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_application","root","");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO electronics(brand, model, price,"
                    + "quantity, description, photo) VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, brand);
            ps.setString(2, model);
            ps.setInt(3, price);
            ps.setInt(4, qty);
            ps.setString(5, description);
            ps.setString(6, imagePath);
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Entry successful!");
            
        } catch (SQLException ex) {
            Logger.getLogger(Mobiles.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    public static void updateElectronicsDB(String model, int qty){
         try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_application","root","");
            
            PreparedStatement ps = con.prepareStatement("UPDATE electronics SET quantity=? WHERE model=?");
            
            ps.setInt(1, qty);
            ps.setString(2, model);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else if(ps.executeUpdate()==1 && flag){
                JOptionPane.showMessageDialog(null, "Stock updated successfully!");
                flag = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Mobiles.class.getName()).log(Level.SEVERE, null, ex);

    }
    }
    
    public static ArrayList<ProductList> TableGenerator(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_application","root","");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT brand, model, price,quantity, description, photo FROM electronics");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("brand"),rs.getString("model"),
                        rs.getInt("price"),rs.getInt("quantity"),rs.getString("description"),
                        rs.getString("photo"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Mobiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
    
   public static ArrayList<ProductList> homePageContent(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_application","root","");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT brand, model, price,quantity, description, photo FROM electronics ORDER BY id DESC LIMIT 3");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("brand"),rs.getString("model"),
                        rs.getInt("price"),rs.getInt("quantity"),rs.getString("description"),
                        rs.getString("photo"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Mobiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
   public static ArrayList<ProductList> checkStock(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_application","root","");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT brand, model, price, quantity FROM electronics");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("brand"),rs.getString("model"),
                        0, rs.getInt("quantity"),null, null);
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Mobiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
   public static void delete(String model){
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_application","root","");
            PreparedStatement ps = con.prepareStatement("DELETE FROM electronics WHERE model=?");
            ps.setString(1, model);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else
                JOptionPane.showMessageDialog(null, "Entry deleted successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(Electronics.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   }
    
}
