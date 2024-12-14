/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    
    static Connection koneksi;
    
    public static Connection getKoneksi(){
    
        try{
            String url = "jdbc:mysql://localhost/sekolah";
            String username = "root";
            String password = "";
            DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, username, password);
            
            System.out.println("Koneksi berhasil");
        } catch(SQLException e){
            System.out.println("Error koneksi");
        }
        return koneksi;
        
    }
    
    
    
}
