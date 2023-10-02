///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package javaapplication1;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
///**
// *
// * @author stl_sdd_sor
// */
//public class ConnectMariaDB {
//    
//    public static Session getSession(){
//         Session session = null;
//          try {
//            SessionFactory factory = new Configuration().configure("com/viettel/config/database/Ishare.cfg.xml").buildSessionFactory();
//             session = factory.getCurrentSession();
////            session.beginTransaction();
////            Connection conn = session.connection();
////            PreparedStatement ps = conn.prepareStatement("select * from transaction_history");
////            ResultSet rs = ps.executeQuery();
////            while (rs.next()) {
////                System.out.println(rs.getString("isdn") + " | " + rs.getString("amount"));
////
////            }
////            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/ishare", "root", "1234");
//            System.out.println("connected");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//           return session;
//    }
//   
//}
