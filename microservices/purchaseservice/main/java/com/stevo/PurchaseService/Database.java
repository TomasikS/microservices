/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevo.PurchaseService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author stefan.tomasik
 */
public class Database {

    public Connection createConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        Connection connection;
        Properties properties = new Properties();

        String currentWorkingDir = System.getProperty("user.dir");
        String subor = currentWorkingDir + "/src//main//java//com//stevo//PurchaseService//application.properties";

        System.out.println("pom vypis" + subor);
        //properties.load(new java.io.FileInputStream("C://Users//stefan.tomasik//Documents//NetBeansProjects//Review//src//main//java//com//sovy//review//application.properties"));
        properties.load(new java.io.FileInputStream(subor));
        String url = properties.getProperty("host");
        String user = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        Class.forName(driver);

        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public void insertData(Purchase nakup) throws SQLException, IOException, ClassNotFoundException {
        String sql = "INSERT INTO nakup (datumObjednavky,datumDodania,datumSplatnosti,sposobPlatby,idUser,idBook)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        // Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bookstore", "postgres", "postgres");
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nakup.getDatumObjednavky());
        statement.setString(2, nakup.getDatumDodania());
        statement.setString(3, nakup.getDatumSplatnosti());
        statement.setString(4, nakup.getSposobPlatby());
        statement.setLong(5, nakup.getIdUser());
        statement.setLong(6, nakup.getIdBook());

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A nakup was inserted successfully!");
        }
        connection.close();

    }

    void remove(long id) throws SQLException, IOException, FileNotFoundException, ClassNotFoundException {
        Connection connection = createConnection();
        String sql = "DELETE FROM nakup WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, id);
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("A nakup was deleted successfully!");
        }
        connection.close();
    }

   Purchase findbyId(int id) throws SQLException, ClassNotFoundException, IOException {

         Purchase nakup=null;
        Connection connection = createConnection();
        String sql = "SELECT * FROM  nakup where id=" + id;
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            Long idd = result.getLong(1);
            String datumDodania = result.getString(2);
            String datumObjednavky = result.getString(3);
            String datumSplatnosti = result.getString(4);
            String sposobPlatby = result.getString(5);
            Long idUser = result.getLong(6);
            Long idBook = result.getLong(7);
            nakup = new Purchase(idd, datumDodania, datumObjednavky, datumSplatnosti, sposobPlatby, idUser, idBook);

          
         // if (nakup !=null) return nakup;
        }     
        
        connection.close(); 
  
        return nakup;
    
    }
}
