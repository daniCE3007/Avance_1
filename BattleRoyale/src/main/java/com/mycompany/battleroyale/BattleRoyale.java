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
        String jugador1 = JOptionPane.showInputDialog(
                "Ingrese el nombre del jugador 1:");
        String jugador2 = JOptionPane.showInputDialog(
                "Ingrese el nombre del jugador 2:");
        
        //Se le pregunta al usuario contra quien quiere jugar
        JOptionPane.showInputDialog(null, "Seleccione"
                + " contra quien quiere jugar:\n"
                + "1. PC\n"
                + "2. Otro usuario");


        //Se crea el tablero (tamaño recomendado 15x15 para cumplir con el formato requerido)
        Tablero tablero1 = new Tablero(15,15);

        tablero1.rellenarTablero();
        tablero1.mostrarTablero();

    }
}
