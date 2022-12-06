package com.mycompany.battleroyale;

public class Almirante {
    //Atributos
    private int vidas = 4;
    private String charString = Integer.toString(vidas);
    private String nombreNave = "Almirante";
    private int PosFilas;
    private int PosColumnas;
    boolean vivo = true;

    //Constructor vacio
    public Almirante(){
        
    }

    //Constructor
    public Almirante(int vidas, int PosFilas, int PosColumnas) {
        this.vidas = vidas;
        this.PosFilas = PosFilas;
        this.PosColumnas = PosColumnas;
    }

    //Metodos SET
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setPosFilas(int PosFilas) {
        this.PosFilas = PosFilas;
    }

    public void setPosColumnas(int PosColumnas) {
        this.PosColumnas = PosColumnas;
    }

    //Metodos GET
    public int getVidas() {
        return vidas;
    }

    public int getPosFilas() {
        return PosFilas;
    }

    public int getPosColumnas() {
        return PosColumnas;
    }

    public String getCharString() {
        return charString;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public boolean getVivo() {
        return vivo;
    }

    //Metodo colocar almirante
    public void colocarAlmirante(){
        int posFila;
        int posColumna;

        posFila = Func.colocarPosFila(nombreNave);
        posColumna = Func.colocarPosColumna(nombreNave);

        setPosFilas(posFila);
        setPosColumnas(posColumna);
    }

    //Metodo colocar almirante random
    // public void colocarAlmiranteRandom(){
    //     int posFila;
    //     int posColumna;

    //     posFila = Func.colocarPosFilaRandom();
    //     posColumna = Func.colocarPosColumnaRandom();

    //     setPosFilas(posFila);
    //     setPosColumnas(posColumna);
    // }

    //Metodo para verificar si el almirante esta vivo
    public void estaVivo(){
        if(vidas == 0){
            vivo = false;
        }else{
            vivo = true;
        }

        if (vivo == false){
            charString = "*";
        }
    }

    public void updateVidas() {
        vidas--;
        charString = Integer.toString(vidas);
    }

}
