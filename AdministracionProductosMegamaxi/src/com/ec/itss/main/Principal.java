/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.main;

import com.ec.itss.controlador.Frm_RegistrarProducto_Controlador;
import com.ec.itss.modelo.ListarProducto;
import com.ec.itss.vista.Frm_RegistrarProducto;

/**
 *
 * @author ppucha
 */
public class Principal {
    
    public static Frm_RegistrarProducto frm_rp;
    
    public static Frm_RegistrarProducto_Controlador c_frm_rp;
    
    public static ListarProducto listar_producto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frm_rp = new Frm_RegistrarProducto();
        frm_rp.setVisible(true);
        frm_rp.setLocationRelativeTo(null);
        
        c_frm_rp = new Frm_RegistrarProducto_Controlador(frm_rp);
        
        listar_producto = new ListarProducto();
        listar_producto.mostrarTabla(frm_rp.tableProductos);
    }
    
}
