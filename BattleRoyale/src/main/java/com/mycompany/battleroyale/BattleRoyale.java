/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.battleroyale;
import javax.swing.JOptionPane; 
/**
 *
 * @author andre
 */
public class BattleRoyale {

    public static void main(String[] args) {
        //Se le solicitan al usuario los nombres de los jugadore
        // String jugador1 = JOptionPane.showInputDialog(
        //         "Ingrese el nombre del jugador 1:");
        // String jugador2 = JOptionPane.showInputDialog(
        //         "Ingrese el nombre del jugador 2:");


        //Se crea el tablero (tamaño recomendado 15x15 para cumplir con el formato requerido)
        Tablero tablero1 = new Tablero(15,15);
        Tablero tablero2 = new Tablero(15,15);

        tablero1.rellenarTableros();
        tablero2.rellenarTableros();
        tablero1.mostrarTablero();
        tablero1.colocarNaves();
        tablero1.mostrarTablero();
        Func.atacar(tablero1, tablero2);
        tablero1.mostrarTablero();

        // for (int i = 0; i < 10; i++) {
        //     Func.imprimirRandom();
        // }

        

    }
}
