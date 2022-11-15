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
    private String matriz[][];

    //Constructor vacio
    public Tablero(){
        
    }
    
    // Constructor
    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.matriz = new String [this.numFilas][this.numColumnas];
    }

    // Metodos set

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }
    
    // Metodos get

    public int getNumFilas() {
        return numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }  

    // Metodo para rellenar el tablero
    public void rellenarTablero(){
        
        int counter = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                //Tablero
                if (i == 0) {
                    matriz[i][j] = " - ";
                    matriz[0][0] = "- ";
                    matriz[matriz.length - 1][matriz.length - 1] = " -";
                } else if (i % 2 == 0) {
                    matriz[i][j] = " - ";
                    matriz[i][0] = "- ";
                    matriz[i][matriz.length - 1] = " -";
                } else if (i % 2 != 0 && j % 2 == 0) {
                    matriz[i][j] = "  |  ";
                    matriz[i][0] = "|  ";
                    matriz[i][matriz.length - 1] = "  |";
                } else if (j % 2 != 0 && i % 2 != 0) {
                    matriz[i][j] = "~";
                    if (i == 1) {
                        matriz[1][j] = Integer.toString(counter);
                        counter++;
                    }

                }

                }
            }

            matriz[1][1] = "Ω";
            matriz[3][1] = "A";
            matriz[5][1] = "B";
            matriz[7][1] = "C";
            matriz[9][1] = "D";
            matriz[11][1] = "E";
            matriz[13][1] = "F";
    }

    // Metodo para mostrar el tablero
    public void mostrarTablero(){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
    }
}
