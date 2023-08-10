/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

import com.ec.itss.conexion.ConexionMySql;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ppucha
 */
public class ListarCategoria {
    
    ConexionMySql conMySql = new ConexionMySql();
    Connection connection = conMySql.conectar();
    ResultSet rs;
    Statement st;
    
    public ArrayList<Categoria> obtenerCategorias(){
        ArrayList<Categoria> categoriaList = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM Categoria";
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                Categoria categoria =new Categoria();
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setDescripcion(rs.getString("descripcion"));
                
                categoriaList.add(categoria);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar las categorias\n" +e);
        }
        return categoriaList;
    }
    
    
}
