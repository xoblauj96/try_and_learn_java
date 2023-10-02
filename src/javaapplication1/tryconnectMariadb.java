///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package javaapplication1;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.mariadb.jdbc.Driver;
//
///**
// *
// * @author stl_sdd_sor
// */
//public class tryconnectMariadb {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
////        Connection con = null;
//////        String dbUrl = "jdbc:mariadb://localhost:3306/ishare";
////        String dbUrl = "jdbc:mysql://localhost:3306/ishare?useSSL=false";
////        String user="root";
////        String pass="";
////        try {
////            con = DriverManager.getConnection(dbUrl,user,pass);
////            System.out.println("connect db successfully.....s");
////        } catch (Exception e) {
////            System.out.println(":Error: "+e.getMessage());
////        }
//// String userName,password,url,driver;
////Connection con;
////    Statement st;
////  userName="root";
////        password="1234";
////        url="jdbc:mariadb://localhost:3307/ishare";
////        driver="org.mariadb.jdbc.Driver";
////        try {
//////            Class.forName(driver);
////Class.forName ("org.mariadb.jdbc.Driver");
////        con=DriverManager.getConnection(url, userName, password);
////        st=con.createStatement();
////        System.out.println("Connection is successful");
////        } catch (Exception e) {
////          e.printStackTrace();
////            System.out.println(e.getMessage());
////        }
//
////  System.out.println("init");
////        try {
//////            Class.forName ("com.mysql.jdbc.Driver");
////            
//////           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/ishare?user=root&password=");
////           Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/ishare","root","1234");
////           Class.forName ("org.mariadb.jdbc.Driver");
////            System.out.println(conn);
////            PreparedStatement ps = conn.prepareStatement("select * from transaction_history");
////            ResultSet rs = ps.executeQuery();
////            while(rs.next()){
////                System.out.println(rs.getString("isdn")+" | "+rs.getString("amount"));
////                
////            }
//////            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/ishare", "root", "1234");
////                System.out.println("connected");
////            
////        } catch (Exception e){
////            e.printStackTrace();
////            System.out.println(e.getMessage());
////        }
////C:\Users\IT\Desktop\MyWork\Projects\Web_Report_I_Share\src\java\com\viettel\config\database\Ishare.cfg.xml
////        try {
////            SessionFactory factory = new Configuration().configure("com/viettel/config/database/Ishare.cfg.xml").buildSessionFactory();
////            Session session = factory.getCurrentSession();
////            session.beginTransaction();
////            Connection conn = session.connection();
////            PreparedStatement ps = conn.prepareStatement("select * from transaction_history");
////            ResultSet rs = ps.executeQuery();
////            while (rs.next()) {
////                System.out.println(rs.getString("isdn") + " | " + rs.getString("amount"));
////
////            }
//////            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/ishare", "root", "1234");
////            System.out.println("connected");
////
////        } catch (Exception e) {
////            e.printStackTrace();
////            System.out.println(e.getMessage());
////        }
//
//    }
//
//}
