package com.mycompany.battleroyale;
import javax.swing.JOptionPane;

public class Menu {
    
    //Menu para colocar las naves jugador
    public static void menuColocarNaves(Jugador jugador1) {
        //Menu colocacion de naves jugador
        int menuColocacionNaves = 0;

        while (menuColocacionNaves != 3) {
            menuColocacionNaves = Integer.parseInt(JOptionPane.showInputDialog(
                null, "> Colocacion de naves <\n  Seleccione como desea colocar las naves: \n"
                + "1. Automaticamente\n"
                + "2. Manualmente\n"
                + "3. Salir"));

                if (menuColocacionNaves == 1) {
                    //Muestra el tablero sin naves
                    jugador1.getTablero().mostrarTablero();

                    //Coloca las naves de forma aleatoria
                    jugador1.getTablero().colocarNavesRandom();

                    //Muestra el tablero con naves
                    jugador1.getTablero().mostrarTablero();

                    break;

                } else if (menuColocacionNaves == 2) {
                    //Muestra el tablero sin naves
                    jugador1.getTablero().mostrarTablero();

                    //Coloca las naves de forma manual
                    jugador1.getTablero().colocarNaves();

                    //Muestra el tablero con naves
                    jugador1.getTablero().mostrarTablero();

                    break;

                } else if (menuColocacionNaves == 3) {
                    JOptionPane.showMessageDialog(null, "Volviendo...");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
        }
    }

    public static void menuPartidaAtaque(Tablero tableroEnemigo, Tablero tableroPropio) {
        //Menu colocacion de naves jugador
        int menuAtaque = 0;

        while (menuAtaque != 4) {
            menuAtaque = Integer.parseInt(JOptionPane.showInputDialog(
                null, "> Menu de Ataque <\n Seleccione una opcion:\n"
                + "1. Atacar\n"
                + "2. Ver mi tablero de ataque\n"
                + "3. Hacer trampa\n"
                + "4. Saltar turno"));

                if (menuAtaque == 1) {
                    //Ataca el jugador 1
                    Func.atacar(tableroEnemigo, tableroPropio);

                    break;

                } else if (menuAtaque == 2) {
                    //Muestra el tablero de ataque del jugador 1
                    JOptionPane.showMessageDialog(null, "Tablero de ataque");
                    tableroPropio.mostrarTableroAtaque();
                } else if (menuAtaque == 3) {
                    //Muestra el tablero del enemigo
                    JOptionPane.showMessageDialog(null, "Trampa activada");

                    tableroEnemigo.mostrarTableroEnemigo();
                } else if (menuAtaque == 4) {
                    //Salta de turno
                    JOptionPane.showMessageDialog(null, "Salto de turno");

                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
        }
    }

}
