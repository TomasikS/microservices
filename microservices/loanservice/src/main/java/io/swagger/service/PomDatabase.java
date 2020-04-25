/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author stefan.tomasik
 */
public class PomDatabase {

    public Connection createConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        Connection connection;
        Properties properties = new Properties();
        // properties.load(new java.io.FileInputStream("C://Users//stefan.tomasik//Documents//NetBeansProjects//Review//src//main//java//com//sovy//review//application.properties"));

        String currentWorkingDir = System.getProperty("user.dir");
        String subor = currentWorkingDir + "//src//main//resources///application.properties";
        System.out.print(subor);
        properties.load(new java.io.FileInputStream(subor));

        String url = properties.getProperty("host");
        String user = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        Class.forName(driver);

        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public List getBookById() throws IOException, SQLException, FileNotFoundException, ClassNotFoundException {
        Long idKniha = null;
        List<Long> list = new ArrayList();
        String dopyt = "SELECT id from Book where id>0";
        Connection connectionBook = createConnection();
        PreparedStatement preparedStatementBook = connectionBook.prepareStatement(dopyt);
        ResultSet rss = preparedStatementBook.executeQuery();

        while (rss.next()) {
            idKniha = rss.getLong(1);
            list.add(idKniha);
        }
        connectionBook.close();
        return list;

    }

    public List getUserById() throws IOException, SQLException, FileNotFoundException, ClassNotFoundException {
        Long idUser = null;
        List<Long> list = new ArrayList();
        String dopyt = "SELECT id from Pouzivatel where id>0";
        Connection connectionUser = createConnection();
        PreparedStatement preparedStatementBook = connectionUser.prepareStatement(dopyt);
        ResultSet rss = preparedStatementBook.executeQuery();

        while (rss.next()) {
            idUser = rss.getLong(1);
            list.add(idUser);
        }
        connectionUser.close();
        return list;

    }

}
