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

        //Se le pregunta al usuario contra quien quiere jugar
        int i=0;
        while (i == 0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Seleccione contra quien quiere jugar:\n"
                    + "1. PC\n"
                    + "2. Otro usuario"));
            if (opcion == 1) {
                //Se le solicitan al usuario los nombres de 
                //los jugadores dependiendo su elección
                String jugador1 = JOptionPane.showInputDialog(
                        "Ingrese el nombre del jugador 1:");
                String jugador2 = JOptionPane.showInputDialog(
                        "Ingrese el nombre del PC:");
                i = 1;
            }
            if (opcion == 2) {
                String jugador1 = JOptionPane.showInputDialog(
                        "Ingrese el nombre del jugador 1:");
                String jugador2 = JOptionPane.showInputDialog(
                        "Ingrese el nombre del jugador 2:");
                i = 1;
            } if (opcion==0 ||opcion>2  ) {
                JOptionPane.showMessageDialog(null, "Datos no"
                        + " validos, intente nuevamente");
            }
        }


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
