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
        int menuPrincipal = 0;
        while (menuPrincipal != 2) {
            menuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Menu Principal\nSeleccione una opcion: \n"
                    + "1. Iniciar Partida\n"
                    + "2. Salir"));
            //Iniciar partida
            if (menuPrincipal == 1) {
                String jugador1Nombre = JOptionPane.showInputDialog(
                        "Ingrese el nombre del jugador 1:");

                Jugador jugador1 = new Jugador(jugador1Nombre, new Tablero(
                        15,15));
                jugador1.getTablero().rellenarTableros();

                //Menu elegir contra quien jugar
                int menuJugadorCPU = 0;
                while (menuJugadorCPU != 2) {
                    menuJugadorCPU = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "Configuracion de partida\n"
                                + "Seleccione contra quien desea jugar: \n"
                        + "1. Jugador 2\n"
                        + "2. CPU\n"
                        + "3. Salir"));

                        if (menuJugadorCPU == 1 ) {
                            //Crear jugador 2 y flujo jugador 2
                            JOptionPane.showMessageDialog(null, "Turno "
                                    + "de " + jugador1.getNombre() + ":");
                            Menu.menuColocarNaves(jugador1);
                            
                            //Se crea otro jugador
                            JOptionPane.showMessageDialog(null, 
                                    "Turno de Jugador 2:");
                            String jugador2Nombre = JOptionPane.showInputDialog(
                                    "Ingrese el nombre del jugador 2:");
                            
                            Jugador jugador2 = new Jugador(jugador2Nombre, 
                                    new Tablero(15,15));
                            jugador2.getTablero().rellenarTableros();

                            Menu.menuColocarNaves(jugador2);

                            do {
                                //Se inicia el juego
                                //Ataca el jugador 1
                                JOptionPane.showMessageDialog(null,"Turno de " 
                                        + jugador1.getNombre());
                                Menu.menuPartidaAtaque(
                                        jugador2.getTablero(), 
                                        jugador1.getTablero());
                                System.out.println("");

                                //Ataca jugador 2
                                JOptionPane.showMessageDialog(null,"Turno de " 
                                        + jugador2.getNombre());
                                Menu.menuPartidaAtaque(
                                        jugador1.getTablero(), 
                                        jugador2.getTablero());
                                System.out.println("");
                                
                            } while (jugador1.getTablero().getVida() != 0 &&
                                    jugador2.getTablero().getVida() != 0);
                            if (jugador1.getTablero().getVida()==0){
                                JOptionPane.showMessageDialog(null, 
                                        "Ganó "+ jugador2.getNombre());
                                break;
                            } else if (jugador2.getTablero().getVida()==0){
                                JOptionPane.showMessageDialog(null, 
                                        "Ganó "+ jugador1.getNombre());
                                break;
                            }
                            
                                
                            
                        } else if (menuJugadorCPU == 2) {
                            //Crear CPU y flujo CPU
                            Menu.menuColocarNaves(jugador1);

                            //Se crea CPU
                            CPU cpu = new CPU("CPU", new Tablero(15,
                                    15));
                            cpu.getTablero().rellenarTableros();
                            
                            
                            //Se colocan las naves de la CPU aleatoriamente
                            cpu.getTablero().colocarNavesRandom();
                            JOptionPane.showMessageDialog(null, 
                                    "Naves de la CPU colocadas");

                            do {
                                //Se inicia el juego
                                //Ataca el jugador 1
                                JOptionPane.showMessageDialog(null,"Turno de " 
                                        + jugador1.getNombre());
                                Menu.menuPartidaAtaque(
                                        cpu.getTablero(), 
                                        jugador1.getTablero());
                                System.out.println("");

                                //Ataca la CPU
                                JOptionPane.showMessageDialog(null,
                                        "Turno de " + cpu.getNombre());
                                Func.atacarRandom(
                                        jugador1.getTablero(), 
                                        cpu.getTablero());
                                System.out.println("");
                                

                            } while (jugador1.getTablero().getVida() != 0 &&
                                    cpu.getTablero().getVida() != 0);

                            if (jugador1.getTablero().getVida() == 0) {
                                JOptionPane.showMessageDialog(null,
                                        "Ganó " + cpu.getNombre());
                                break;
                            } else if (cpu.getTablero().getVida() == 0) {
                                JOptionPane.showMessageDialog(null,
                                        "Ganó " + jugador1.getNombre());
                                break;
                            }
                            

                        } else if (menuJugadorCPU == 3) {
                            JOptionPane.showMessageDialog(null, 
                                    "Volviedo...");
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Opcion no valida");
                        }                    
                }


            } else if (menuPrincipal == 2) {
                JOptionPane.showMessageDialog(null, 
                        "Gracias por jugar");
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Opcion no valida");
            }
        } 

    }
}
