/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

import com.ec.itss.conexion.ConexionMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ppucha
 */
public class RegistroProducto {
    
    ConexionMySql connectionMySql = new ConexionMySql();
    Connection con = connectionMySql.conectar();
    
    public void registrar(Producto p){
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Producto(nombre, cantidad, precio, total, idCategoria) VALUES (?,?,?,?,?)");
            ps.setString(1,p.getNombre());
            ps.setInt(2,p.getCantidad());
            ps.setDouble(3,p.getPrecio());
            ps.setDouble(4,p.calcularTotal());
            ps.setDouble(5,p.getIdCategoria());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR EL PRODUCTO\n"+ ex);
        }
    }
}
