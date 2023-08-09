/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.conexion;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author ppucha
 */
public class ConexionMySql {
    
    Connection connection;
    public Connection conectar() {
        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/megamaxi_bdd";
            String username = "root";
            String password = "admin@";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error de conexion \n" +e);
        }
        return connection;
    }
    
}
