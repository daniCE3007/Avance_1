package com.mycompany.battleroyale;
import javax.swing.JOptionPane;

public class Func {
    
    // Generador de numero random 1 al 6
    public static String GenNumeroRandom() {
        int generador = (int) (Math.random() * 6) + 1;
        String numero = String.valueOf(generador);
        return numero;

    }
    
    //Funciones para convertir las posiciones de las filas y columnas en posiciones de matriz para colocar
    public static int colocarPosFila(String nombreNave){
        int fila = 0;
        boolean set = false;

        while (set == false) {
            String opcionUsuario = JOptionPane.showInputDialog("Ingrese la fila"
                    + " en la que desea colocar su " + nombreNave + " (A - F): ");     
            
            if (opcionUsuario.equals("A")) {
                fila = 3;
                set = true;
            } else if (opcionUsuario.equals("B")) {
                fila = 5;
                set = true;
            } else if (opcionUsuario.equals("C")) {
                fila = 7;
                set = true;
            } else if (opcionUsuario.equals("D")) {
                fila = 9;
                set = true;
            } else if (opcionUsuario.equals("E")) {
                fila = 11;
                set = true;
            } else if (opcionUsuario.equals("F")) {
                fila = 13;
                set = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese "
                        + "una fila valida");
                set = false;
            }
        }

        return fila;
    }

    public static int colocarPosColumna(String nombreNave){
        int columna = 0;
        boolean set = false;

        while (set == false) {
            String opcionUsuario = JOptionPane.showInputDialog("Ingrese la "
                    + "columna en la que desea colocar su " + nombreNave 
                    + " (1 - 6): ");    
            
            if (opcionUsuario.equals("1")) {
                columna = 3;
                set = true;
            } else if (opcionUsuario.equals("2")) {
                columna = 5;
                set = true;
            } else if (opcionUsuario.equals("3")) {
                columna = 7;
                set = true;
            } else if (opcionUsuario.equals("4")) {
                columna = 9;
                set = true;
            } else if (opcionUsuario.equals("5")) {
                columna = 11;
                set = true;
            } else if (opcionUsuario.equals("6")) {
                columna = 13;
                set = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese "
                        + "una fila valida");
                set = false;
            }
        }

        return columna;
    }
   

    //Funciones para convertir las posiciones de las filas y columnas en posiciones de matriz para atacar
    public static int atacarPosFila(){
        int fila = 0;
        boolean set = false;

        while (set == false) {
            String opcionUsuario = JOptionPane.showInputDialog("Ingrese "
                    + "la fila en la que realizar su ataque (A - F): ");     
            
            if (opcionUsuario.equals("A")) {
                fila = 3;
                set = true;
            } else if (opcionUsuario.equals("B")) {
                fila = 5;
                set = true;
            } else if (opcionUsuario.equals("C")) {
                fila = 7;
                set = true;
            } else if (opcionUsuario.equals("D")) {
                fila = 9;
                set = true;
            } else if (opcionUsuario.equals("E")) {
                fila = 11;
                set = true;
            } else if (opcionUsuario.equals("F")) {
                fila = 13;
                set = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese"
                        + "una fila valida");
                set = false;
            }
        }

        return fila;
    }

        public static int atacarPosColumna(){
        int columna = 0;
        boolean set = false;

        while (set == false) {
            String opcionUsuario = JOptionPane.showInputDialog("Ingrese "
                    + "la columna en la que realizar su ataque (1 - 6): ");    
            
            if (opcionUsuario.equals("1")) {
                columna = 3;
                set = true;
            } else if (opcionUsuario.equals("2")) {
                columna = 5;
                set = true;
            } else if (opcionUsuario.equals("3")) {
                columna = 7;
                set = true;
            } else if (opcionUsuario.equals("4")) {
                columna = 9;
                set = true;
            } else if (opcionUsuario.equals("5")) {
                columna = 11;
                set = true;
            } else if (opcionUsuario.equals("6")) {
                columna = 13;
                set = true;
            } else {
                set = false;
            }
        }

        return columna;
    }

    
    // Metodo para atacar
    public static void atacar(Tablero tableroEnemigo, Tablero tableroPropio){
        tableroPropio.mostrarTableroAtaque();

        int fila = atacarPosFila();
        int columna = atacarPosColumna();

        boolean ataqueExitoso = false;

        //Se comprueba si el ataque se acerto o no
        //Modifica el tablero de ataque propio
        for (int i = 0; i < tableroEnemigo.getMatriz().length; i++) {
            for (int j = 0; j < tableroEnemigo.getMatriz()[i].length; j++) {
                if (i == fila && j == columna) {
                    if (tableroEnemigo.getMatriz()[i][j].equals("~")) {
                        tableroPropio.getMatrizAtaque()[i][j] = "X";
                        JOptionPane.showMessageDialog(null, "Has"
                                + " fallado el ataque");
                    } else if (tableroEnemigo.getMatriz()[i][j].equals("*")) {
                        JOptionPane.showMessageDialog(null, "Este"
                                + " barco ya esta destruido");
                    } else if (tableroEnemigo.getMatriz()[i][j].equals("1")) {
                        tableroPropio.getMatrizAtaque()[i][j] = "*";
                        ataqueExitoso = true;
                    } else if (!tableroEnemigo.getMatriz()[i][j].equals("~")) {
                        tableroPropio.getMatrizAtaque()[i][j] = "O";
                        JOptionPane.showMessageDialog(null, "Has"
                                + "acertado el ataque");
                        ataqueExitoso = true;
                    }
                }
            }
        }
        
        // Modifica el tablero de ataque enemigo
        if(ataqueExitoso == true) {
            if (tableroEnemigo.getAlmirante().getPosFilas() == fila && 
                    tableroEnemigo.getAlmirante().getPosColumnas() == columna) {
                // tableroEnemigo.getAlmirante().setVidas(tableroEnemigo.getAlmirante().getVidas() - 1);
                tableroEnemigo.getAlmirante().updateVidas();
                if (tableroEnemigo.getAlmirante().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El "
                            + "barco ha sido destruido");
                    tableroEnemigo.getAlmirante().estaVivo();
                }
            } else if (tableroEnemigo.getCapitan1().getPosFilas() == fila && 
                    tableroEnemigo.getCapitan1().getPosColumnas() == columna) {
                // tableroEnemigo.getCapitan1().setVidas(tableroEnemigo.getCapitan1().getVidas() - 1);
                tableroEnemigo.getCapitan1().updateVidas();
                if (tableroEnemigo.getCapitan1().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El "
                            + "barco ha sido destruido");
                    tableroEnemigo.getCapitan1().estaVivo();
                }
            } else if (tableroEnemigo.getCapitan2().getPosFilas() == fila && 
                    tableroEnemigo.getCapitan2().getPosColumnas() == columna) {
                // tableroEnemigo.getCapitan2().setVidas(tableroEnemigo.getCapitan2().getVidas() - 1);
                tableroEnemigo.getCapitan2().updateVidas();
                if (tableroEnemigo.getCapitan2().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El"
                            + " barco ha sido destruido");
                    tableroEnemigo.getCapitan2().estaVivo();
                }
            } else if (tableroEnemigo.getTeniente1().getPosFilas() == fila &&
                    tableroEnemigo.getTeniente1().getPosColumnas() == columna) {
                // tableroEnemigo.getTeniente1().setVidas(tableroEnemigo.getTeniente1().getVidas() - 1);
                tableroEnemigo.getTeniente1().updateVidas();
                if (tableroEnemigo.getTeniente1().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El "
                            + "barco ha sido destruido");
                    tableroEnemigo.getTeniente1().estaVivo();
                }
            } else if (tableroEnemigo.getTeniente2().getPosFilas() == fila &&
                    tableroEnemigo.getTeniente2().getPosColumnas() == columna) {
                // tableroEnemigo.getTeniente2().setVidas(tableroEnemigo.getTeniente2().getVidas() - 1);
                tableroEnemigo.getTeniente2().updateVidas();
                if (tableroEnemigo.getTeniente2().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El "
                            + "barco ha sido destruido");
                    tableroEnemigo.getTeniente2().estaVivo();
                }
            } else if (tableroEnemigo.getTeniente3().getPosFilas() == fila && 
                    tableroEnemigo.getTeniente3().getPosColumnas() == columna) {
                // tableroEnemigo.getTeniente3().setVidas(tableroEnemigo.getTeniente3().getVidas() - 1);
                tableroEnemigo.getTeniente3().updateVidas();
                if (tableroEnemigo.getTeniente3().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El"
                            + " barco ha sido destruido");
                    tableroEnemigo.getTeniente3().estaVivo();
                }
            }

        }
        tableroEnemigo.updateTablero();
        tableroPropio.mostrarTableroAtaque();
    }
    
    // Metodo para rellenar el tablero
    public static void rellenarTablero(String matriz[][]) {
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

    
    public static int colocarPosFilaRandom(String nombreNave){
        int fila = 0;
        boolean set = false;

        while (set == false) {
            String opcionUsuario = GenNumeroRandom();     
            
            if (opcionUsuario.equals("1")) {
                fila = 3;
                set = true;
            } else if (opcionUsuario.equals("2")) {
                fila = 5;
                set = true;
            } else if (opcionUsuario.equals("3")) {
                fila = 7;
                set = true;
            } else if (opcionUsuario.equals("4")) {
                fila = 9;
                set = true;
            } else if (opcionUsuario.equals("5")) {
                fila = 11;
                set = true;
            } else if (opcionUsuario.equals("6")) {
                fila = 13;
                set = true;
            } else {
                set = false;
            }
        }

        return fila;
    }

       public static int colocarPosColumnaRandom(String nombreNave){
        int columna = 0;
        boolean set = false;

        while (set == false) {
            String opcionUsuario = GenNumeroRandom();
            
            if (opcionUsuario.equals("1")) {
                columna = 3;
                set = true;
            } else if (opcionUsuario.equals("2")) {
                columna = 5;
                set = true;
            } else if (opcionUsuario.equals("3")) {
                columna = 7;
                set = true;
            } else if (opcionUsuario.equals("4")) {
                columna = 9;
                set = true;
            } else if (opcionUsuario.equals("5")) {
                columna = 11;
                set = true;
            } else if (opcionUsuario.equals("6")) {
                columna = 13;
                set = true;
            } else {
                set = false;
            }
        }

        return columna;
    }
 
    public static int atacarPosFilaRandom(){
        int fila = 0;
        boolean set = false;

        while (set == false) {
            String opcionUsuario = GenNumeroRandom();     
            
            if (opcionUsuario.equals("1")) {
                fila = 3;
                set = true;
            } else if (opcionUsuario.equals("2")) {
                fila = 5;
                set = true;
            } else if (opcionUsuario.equals("3")) {
                fila = 7;
                set = true;
            } else if (opcionUsuario.equals("4")) {
                fila = 9;
                set = true;
            } else if (opcionUsuario.equals("5")) {
                fila = 11;
                set = true;
            } else if (opcionUsuario.equals("6")) {
                fila = 13;
                set = true;
            } else {
                set = false;
            }
        }

        return fila;
    }
    
    
    public static int atacarPosColumnaRandom(){
        int columna = 0;
        boolean set = false;

        while (set == false) {
            String opcionUsuario = GenNumeroRandom();    
            
            if (opcionUsuario.equals("1")) {
                columna = 3;
                set = true;
            } else if (opcionUsuario.equals("2")) {
                columna = 5;
                set = true;
            } else if (opcionUsuario.equals("3")) {
                columna = 7;
                set = true;
            } else if (opcionUsuario.equals("4")) {
                columna = 9;
                set = true;
            } else if (opcionUsuario.equals("5")) {
                columna = 11;
                set = true;
            } else if (opcionUsuario.equals("6")) {
                columna = 13;
                set = true;
            } else {
                set = false;
            }
        }

        return columna;
    }
    
    // Metodo para atacar random
    public static void atacarRandom(Tablero tableroEnemigo, Tablero tableroPropio){
        tableroPropio.mostrarTableroAtaque();

        int fila = atacarPosFilaRandom();
        int columna = atacarPosColumnaRandom();

        boolean ataqueExitoso = false;

        //Se comprueba si el ataque se acerto o no
        //Modifica el tablero de ataque propio
        for (int i = 0; i < tableroEnemigo.getMatriz().length; i++) {
            for (int j = 0; j < tableroEnemigo.getMatriz()[i].length; j++) {
                if (i == fila && j == columna) {
                    if (tableroEnemigo.getMatriz()[i][j].equals("~")) {
                        tableroPropio.getMatrizAtaque()[i][j] = "X";
                        JOptionPane.showMessageDialog(null, "La CPU"
                                + " ha fallado el ataque");
                    } else if (tableroEnemigo.getMatriz()[i][j].equals("*")) {
                        JOptionPane.showMessageDialog(null, "La CPU"
                                + " atacó un barco que ya esta destruido");
                    } else if (tableroEnemigo.getMatriz()[i][j].equals("1")) {
                        tableroPropio.getMatrizAtaque()[i][j] = "*";
                        ataqueExitoso = true;
                    } else if (!tableroEnemigo.getMatriz()[i][j].equals("~")) {
                        tableroPropio.getMatrizAtaque()[i][j] = "O";
                        JOptionPane.showMessageDialog(null, "La CPU "
                                + "ha acertado el ataque");
                        ataqueExitoso = true;
                    }
                }
            }
        }
        
        // Modifica el tablero de ataque enemigo
        if(ataqueExitoso == true) {
            if (tableroEnemigo.getAlmirante().getPosFilas() == fila && 
                    tableroEnemigo.getAlmirante().getPosColumnas() == columna) {
                // tableroEnemigo.getAlmirante().setVidas(tableroEnemigo.getAlmirante().getVidas() - 1);
                tableroEnemigo.getAlmirante().updateVidas();
                tableroEnemigo.updateVidaGlobal();
                if (tableroEnemigo.getAlmirante().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El "
                            + "barco ha sido destruido");
                    tableroEnemigo.getAlmirante().estaVivo();
                }
            } else if (tableroEnemigo.getCapitan1().getPosFilas() == fila && 
                    tableroEnemigo.getCapitan1().getPosColumnas() == columna) {
                // tableroEnemigo.getCapitan1().setVidas(tableroEnemigo.getCapitan1().getVidas() - 1);
                tableroEnemigo.getCapitan1().updateVidas();
                tableroEnemigo.updateVidaGlobal();
                if (tableroEnemigo.getCapitan1().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El "
                            + "barco ha sido destruido");
                    tableroEnemigo.getCapitan1().estaVivo();
                }
            } else if (tableroEnemigo.getCapitan2().getPosFilas() == fila && 
                    tableroEnemigo.getCapitan2().getPosColumnas() == columna) {
                // tableroEnemigo.getCapitan2().setVidas(tableroEnemigo.getCapitan2().getVidas() - 1);
                tableroEnemigo.getCapitan2().updateVidas();
                tableroEnemigo.updateVidaGlobal();
                if (tableroEnemigo.getCapitan2().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El"
                            + " barco ha sido destruido");
                    tableroEnemigo.getCapitan2().estaVivo();
                }
            } else if (tableroEnemigo.getTeniente1().getPosFilas() == fila &&
                    tableroEnemigo.getTeniente1().getPosColumnas() == columna) {
                // tableroEnemigo.getTeniente1().setVidas(tableroEnemigo.getTeniente1().getVidas() - 1);
                tableroEnemigo.getTeniente1().updateVidas();
                tableroEnemigo.updateVidaGlobal();
                if (tableroEnemigo.getTeniente1().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El "
                            + "barco ha sido destruido");
                    tableroEnemigo.getTeniente1().estaVivo();
                }
            } else if (tableroEnemigo.getTeniente2().getPosFilas() == fila &&
                    tableroEnemigo.getTeniente2().getPosColumnas() == columna) {
                // tableroEnemigo.getTeniente2().setVidas(tableroEnemigo.getTeniente2().getVidas() - 1);
                tableroEnemigo.getTeniente2().updateVidas();
                tableroEnemigo.updateVidaGlobal();
                if (tableroEnemigo.getTeniente2().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El "
                            + "barco ha sido destruido");
                    tableroEnemigo.getTeniente2().estaVivo();
                }
            } else if (tableroEnemigo.getTeniente3().getPosFilas() == fila && 
                    tableroEnemigo.getTeniente3().getPosColumnas() == columna) {
                // tableroEnemigo.getTeniente3().setVidas(tableroEnemigo.getTeniente3().getVidas() - 1);
                tableroEnemigo.getTeniente3().updateVidas();
                tableroEnemigo.updateVidaGlobal();
                if (tableroEnemigo.getTeniente3().getVidas() == 0) {
                    JOptionPane.showMessageDialog(null, "El"
                            + " barco ha sido destruido");
                    tableroEnemigo.getTeniente3().estaVivo();
                }
            }

        }
        tableroEnemigo.updateTablero();
        tableroPropio.mostrarTableroAtaque();
        
    }
    
}
