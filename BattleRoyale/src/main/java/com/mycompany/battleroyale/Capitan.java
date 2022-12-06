package com.mycompany.battleroyale;

public class Capitan {
    //Atributos
    private int vidas = 3;
    private String charString = Integer.toString(vidas);
    public String nombreNave = "Capitan";
    private int PosFilas;
    private int PosColumnas;
    boolean vivo = true;

    //Constructor vacio
    public Capitan(){
        
    }

    //Constructor
    public Capitan(int vidas, int PosFilas, int PosColumnas) {
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

    //Metodo colocar Capitan
    public void colocarCapitan(){
        int posFila;
        int posColumna;

        posFila = Func.colocarPosFila(nombreNave);
        posColumna = Func.colocarPosColumna(nombreNave);

        setPosFilas(posFila);
        setPosColumnas(posColumna);
    }

    //Metodo para verificar si el capitan esta vivo
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
