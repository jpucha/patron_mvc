/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

/**
 *
 * @author Kruger
 */
public class Categoria {
    
    private Integer idCategoria;

    private String nombre;
    
    private String descripcion;

    public Categoria() {
      
    }
    
    public Categoria(Integer idCategoria, String nombre) {
      this.idCategoria = idCategoria;
      this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return idCategoria + "-" + nombre;
    }

   
   
    
    
}
