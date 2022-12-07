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
    private int vida;
    private Tablero tablero;

    public CPU() {
    }

    public CPU(String nombre, int vida, Tablero tablero) {
        this.nombre = "CPU";
        this.vida = vida;
        this.tablero = tablero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }    
    
}   
