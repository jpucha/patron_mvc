/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.controlador;

import com.ec.itss.modelo.ListarProducto;
import com.ec.itss.modelo.Producto;
import com.ec.itss.modelo.RegistroProducto;
import com.ec.itss.vista.Frm_RegistrarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ppucha
 */
public class Frm_RegistrarProducto_Controlador implements ActionListener{
 
    Frm_RegistrarProducto frm_rp; 

    public Frm_RegistrarProducto_Controlador(Frm_RegistrarProducto frm_rp) {
        this.frm_rp = frm_rp;
        this.frm_rp.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frm_rp.btnGuardar){
            
            // traer los valores de la caja de texto
            String nombre = frm_rp.txtNombre.getText();
            Integer cantidad = Integer.parseInt(frm_rp.txtCantidad.getText());
            Double precio = Double.parseDouble(frm_rp.txtPrecio.getText());
            Integer idCategoria = frm_rp.jComboBoxCategoria.getItemAt(frm_rp.jComboBoxCategoria.getSelectedIndex()).getIdCategoria();
            
            Producto producto = new Producto(nombre, cantidad, precio, idCategoria);
            RegistroProducto registro = new RegistroProducto();
            registro.registrar(producto);
            
            
            ListarProducto lp = new ListarProducto();
            lp.mostrarTabla(frm_rp.tableProductos);
            limpiarEntradas();
        }
    }

    private void limpiarEntradas() {
        frm_rp.txtNombre.setText("");
        frm_rp.txtCantidad.setText("");
        frm_rp.txtPrecio.setText("");
    }
}
