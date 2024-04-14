/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author DELL
 */
public class Producto {
    protected String nombre;
    protected double precio;
    
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
    
    public double getPrecio(){
        return precio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
}
