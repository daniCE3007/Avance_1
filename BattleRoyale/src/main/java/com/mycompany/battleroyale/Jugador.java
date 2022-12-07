/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleroyale;

/**
 *
 * @author andre
 */
public class Jugador {
    
    private String nombre;
    private Tablero tablero;

    public Jugador() {
    }

    public Jugador(String nombre, Tablero tablero) {
        this.nombre = nombre;
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
