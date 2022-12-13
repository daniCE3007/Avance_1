/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleroyale;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Tablero {
    
    private int numFilas;
    private int numColumnas;
    private String matriz[][];
    private String matrizAtaque[][];
    private Almirante almirante;
    private Capitan capitan1;
    private Capitan capitan2;
    private Teniente teniente1;
    private Teniente teniente2;
    private Teniente teniente3;
    private int vida = 13;

    //Constructor vacio
    public Tablero(){
        
    }
    
    // Constructor
    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.matriz = new String [this.numFilas][this.numColumnas];
        this.matrizAtaque = new String [this.numFilas][this.numColumnas];
        this.almirante = new Almirante();
        this.capitan1 = new Capitan();
        this.capitan2 = new Capitan();
        this.teniente1 = new Teniente();
        this.teniente2 = new Teniente();
        this.teniente3 = new Teniente();
        this.vida = 13;
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

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    // Metodos get

    public int getNumFilas() {
        return numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public String[][] getMatrizAtaque() {
        return matrizAtaque;
    }

    public Almirante getAlmirante() {
        return almirante;
    }

    public Capitan getCapitan1() {
        return capitan1;
    }

    public Capitan getCapitan2() {
        return capitan2;
    }

    public Teniente getTeniente1() {
        return teniente1;
    }

    public Teniente getTeniente2() {
        return teniente2;
    }

    public Teniente getTeniente3() {
        return teniente3;
    }

    public int getVida() {
        return vida;
    }
    
    


    // Metodo para rellenar el tablero
    public void rellenarTableros(){
        Func.rellenarTablero(matriz);
        Func.rellenarTablero(matrizAtaque);
    }

    // Metodo para mostrar el tablero
    public void mostrarTablero(){
        System.out.println("Tablero propio");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("*****************************************************");
        System.out.println("");
        
    }
    // Metodo para mostrar tablero enemigo
    public void mostrarTableroEnemigo(){
        System.out.println("Tablero Enemigo");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("*****************************************************");
        System.out.println("");
        
    }
    // Metodo para mostrar el tablero de ataque
    public void mostrarTableroAtaque(){
        System.out.println("Tablero de ataque");
        for (int i = 0; i < matrizAtaque.length; i++) {
            for (int j = 0; j < matrizAtaque[i].length; j++) {
                System.out.print(matrizAtaque[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("*****************************************************");
        System.out.println("");
        
    }

    // Metodo para colocar naves
    public void colocarNaves(){

        // Almirante
        boolean almiranteColocado = false;

        while (almiranteColocado == false) {
            almirante.colocarAlmirante();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == almirante.getPosFilas() && j == 
                            almirante.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = almirante.getCharString();
                            JOptionPane.showMessageDialog(null, 
                                    "Almirante colocado");
                            almiranteColocado = true;
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Posicion ocupada");
                        }
    
    
                    }
                }
            }
        }

        // Capitan 1
        boolean capitan1Colocado = false;

        while (capitan1Colocado == false) {
            capitan1.colocarCapitan();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == capitan1.getPosFilas() && j == 
                            capitan1.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = capitan1.getCharString();
                            JOptionPane.showMessageDialog(null,
                                    "Capitan 1 colocado");
                            capitan1Colocado = true;
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Posicion ocupada");
                        }
    
    
                    }
                }
            }
        }

        // Capitan 2
        boolean capitan2Colocado = false;

        while (capitan2Colocado == false) {
            capitan2.colocarCapitan();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == capitan2.getPosFilas() && j == 
                            capitan2.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = capitan2.getCharString();
                            JOptionPane.showMessageDialog(null, 
                                    "Capitan 2 colocado");
                            capitan2Colocado = true;
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Posicion ocupada");
                        }
    
    
                    }
                }
            }
        }

        // Teniente 1
        boolean teniente1Colocado = false;

        while (teniente1Colocado == false) {
            teniente1.colocarTeniente();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == teniente1.getPosFilas() && j ==
                            teniente1.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = teniente1.getCharString();
                            JOptionPane.showMessageDialog(null, 
                                    "Teniente 1 colocado");
                            teniente1Colocado = true;
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Posicion ocupada");
                        }
                    }
                }
            }
        }

        // Teniente 2
        boolean teniente2Colocado = false;

        while (teniente2Colocado == false) {
            teniente2.colocarTeniente();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == teniente2.getPosFilas() && j ==
                            teniente2.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = teniente2.getCharString();
                            JOptionPane.showMessageDialog(null, 
                                    "Teniente 2 colocado");
                            teniente2Colocado = true;
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Posicion ocupada");
                        }
    
    
                    }
                }
            }
        }

        // Teniente 3
        boolean teniente3Colocado = false;

        while (teniente3Colocado == false) {
            teniente3.colocarTeniente();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == teniente3.getPosFilas() && j 
                            == teniente3.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = teniente3.getCharString();
                            JOptionPane.showMessageDialog(null, 
                                    "Teniente 3 colocado");
                            teniente3Colocado = true;
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Posicion ocupada");
                        }
    
    
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Naves colocadas manualmente con exito");
        
    }

    // Metodo para colocar naves
    public void colocarNavesRandom(){

        // Almirante
        boolean almiranteColocado = false;

        while (almiranteColocado == false) {
            almirante.colocarAlmiranteRandom();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == almirante.getPosFilas() && j == 
                            almirante.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = almirante.getCharString();
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
            capitan1.colocarCapitanRandom();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == capitan1.getPosFilas() && j == 
                            capitan1.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = capitan1.getCharString();
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
            capitan2.colocarCapitanRandom();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == capitan2.getPosFilas() && j == 
                            capitan2.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = capitan2.getCharString();
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
            teniente1.colocarTenienteRandom();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == teniente1.getPosFilas() && j ==
                            teniente1.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = teniente1.getCharString();
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
            teniente2.colocarTenienteRandom();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == teniente2.getPosFilas() && j ==
                            teniente2.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = teniente2.getCharString();
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
            teniente3.colocarTenienteRandom();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
    
                    if (i == teniente3.getPosFilas() && j 
                            == teniente3.getPosColumnas()) {
                        if (matriz[i][j].equals("~")) {
                            matriz[i][j] = teniente3.getCharString();
                            teniente3Colocado = true;
                        } else {
                            teniente3Colocado = false;
                        }
    
    
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Naves colocadas automaticamente con exito");
        
    }
    
    // Metodo para actualizar naves
    public void updateTablero(){

        // Almirante
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == almirante.getPosFilas() && j == almirante.getPosColumnas()) {
                        matriz[i][j] = almirante.getCharString();
                }
            }
        }

        // Capitan 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == capitan1.getPosFilas() && j == capitan1.getPosColumnas()) {
                        matriz[i][j] = capitan1.getCharString();
                }
            }
        }
        
        // Capitan 2
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == capitan2.getPosFilas() && j == capitan2.getPosColumnas()) {
                        matriz[i][j] = capitan2.getCharString();
                }
            }
        }
        
        // Teniente 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == teniente1.getPosFilas() && j == teniente1.getPosColumnas()) {
                        matriz[i][j] = teniente1.getCharString();
                }
            }
        }

        // Teniente 2
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == teniente2.getPosFilas() && j == teniente2.getPosColumnas()) {
                        matriz[i][j] = teniente2.getCharString();
                }
            }
        }
        
        // Teniente 3
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == teniente3.getPosFilas() && j == teniente3.getPosColumnas()) {
                        matriz[i][j] = teniente3.getCharString();
                }
            }
        }

    }

    public void updateVidaGlobal() {
        vida--;
    }
  
}
