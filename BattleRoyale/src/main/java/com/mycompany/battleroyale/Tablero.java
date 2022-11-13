/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleroyale;

/**
 *
 * @author andre
 */
public class Tablero {
    
    private int numFilas;
    private int numColumnas;
    private int matriz[][];
    
    // Constructor
    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.matriz = new int[this.numFilas][this.numColumnas];
    }

    // Metodos get

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    // Metodos get

    public int getNumFilas() {
        return numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }    
}
