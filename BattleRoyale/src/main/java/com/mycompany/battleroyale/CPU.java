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
    
    // Metodo para colocar naves Random
    public void colocarNavesRandom(){

        // Almirante
        boolean almiranteColocado = false;

        while (almiranteColocado == false) {
            tablero.getAlmirante().colocarAlmirante();
            for (int i = 0; i < tablero.getMatriz().length; i++) {
                for (int j = 0; j < tablero.getMatriz()[i].length; j++) {
    
                    if (i == tablero.getAlmirante().getPosFilas() && j == 
                            tablero.getAlmirante().getPosColumnas()) {
                        if (tablero.getMatriz()[i][j].equals("~")) {
                            tablero.getMatriz()[i][j] = tablero.getAlmirante().
                                    getCharString();
                            almiranteColocado = true;
                        } else {
                            almiranteColocado = false;
                        }
    
    
                    }
                }
            }
        }

        // Capitan 1
        boolean capitan1Colocado = false;

        while (capitan1Colocado == false) {
            tablero.getCapitan1().colocarCapitan();
            for (int i = 0; i < tablero.getMatriz().length; i++) {
                for (int j = 0; j < tablero.getMatriz()[i].length; j++) {
    
                    if (i == tablero.getCapitan1().getPosFilas() && j == 
                            tablero.getCapitan1().getPosColumnas()) {
                        if (tablero.getMatriz()[i][j].equals("~")) {
                            tablero.getMatriz()[i][j] = tablero.getCapitan1().
                                    getCharString();
                            capitan1Colocado = true;
                        } else {
                            capitan1Colocado = false;
                        }
    
    
                    }
                }
            }
        }

        // Capitan 2
        boolean capitan2Colocado = false;

        while (capitan2Colocado == false) {
            tablero.getCapitan2().colocarCapitan();
            for (int i = 0; i < tablero.getMatriz().length; i++) {
                for (int j = 0; j < tablero.getMatriz()[i].length; j++) {
    
                    if (i == tablero.getCapitan2().getPosFilas() && j == 
                            tablero.getCapitan2().getPosColumnas()) {
                        if (tablero.getMatriz()[i][j].equals("~")) {
                            tablero.getMatriz()[i][j] = tablero.getCapitan2().
                                    getCharString();
                            capitan2Colocado = true;
                        } else {
                            capitan2Colocado = false;
                        }
    
    
                    }
                }
            }
        }

        // Teniente 1
        boolean teniente1Colocado = false;

        while (teniente1Colocado == false) {
            tablero.getTeniente1().colocarTeniente();
            for (int i = 0; i < tablero.getMatriz().length; i++) {
                for (int j = 0; j < tablero.getMatriz()[i].length; j++) {
    
                    if (i == tablero.getTeniente1().getPosFilas() && j ==
                            tablero.getTeniente1().getPosColumnas()) {
                        if (tablero.getMatriz()[i][j].equals("~")) {
                            tablero.getMatriz()[i][j] = tablero.getTeniente1().
                                    getCharString();
                            teniente1Colocado = true;
                        } else {
                            teniente1Colocado = false;
                        }
                    }
                }
            }
        }

        // Teniente 2
        boolean teniente2Colocado = false;

        while (teniente2Colocado == false) {
            tablero.getTeniente2().colocarTeniente();
            for (int i = 0; i < tablero.getMatriz().length; i++) {
                for (int j = 0; j < tablero.getMatriz()[i].length; j++) {
    
                    if (i == tablero.getTeniente2().getPosFilas() && j ==
                            tablero.getTeniente2().getPosColumnas()) {
                        if (tablero.getMatriz()[i][j].equals("~")) {
                            tablero.getMatriz()[i][j] = tablero.getTeniente2().
                                    getCharString();
                            teniente2Colocado = true;
                        } else {
                            teniente2Colocado = false;
                        }
    
    
                    }
                }
            }
        }

        // Teniente 3
        boolean teniente3Colocado = false;

        while (teniente3Colocado == false) {
            tablero.getTeniente3().colocarTeniente();
            for (int i = 0; i < tablero.getMatriz().length; i++) {
                for (int j = 0; j < tablero.getMatriz()[i].length; j++) {
    
                    if (i == tablero.getTeniente3().getPosFilas() && j 
                            == tablero.getTeniente3().getPosColumnas()) {
                        if (tablero.getMatriz()[i][j].equals("~")) {
                            tablero.getMatriz()[i][j] = tablero.getTeniente3().
                                    getCharString();
                            teniente3Colocado = true;
                        } else {
                            teniente3Colocado = false;
                        }
    
    
                    }
                }
            }
        }
        
        
    }
    
    
}   
