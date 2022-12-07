/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleroyale;

import javax.swing.JOptionPane;

/**
 *
 * @author danic
 */
public class CPU {
    
    private String nombre;
    private Tablero tablero;

    public CPU() {
    }

    public CPU(String nombre, Tablero tablero) {
        this.nombre = "CPU";
        this.tablero = tablero;
    }

    public String getNombre() {
        return nombre;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }    
    
}   
