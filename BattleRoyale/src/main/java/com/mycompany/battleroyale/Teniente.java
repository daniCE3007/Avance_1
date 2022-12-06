package com.mycompany.battleroyale;

public class Teniente {
    //Atributos
    private int vidas = 1;
    private String charString = Integer.toString(vidas);
    public String nombreNave = "Teniente";
    private int PosFilas;
    private int PosColumnas;
    boolean vivo = true;

    //Constructor vacio
    public Teniente(){
        
    }

    //Constructor
    public Teniente(int vidas, int PosFilas, int PosColumnas) {
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

    //Metodo colocar Teniente
    public void colocarTeniente(){
        int posFila;
        int posColumna;

        posFila = Func.colocarPosFila(nombreNave);
        posColumna = Func.colocarPosColumna(nombreNave);

        setPosFilas(posFila);
        setPosColumnas(posColumna);
    }
    
    public void colocarTenienteRandom(){
        int posFila;
        int posColumna;

        posFila = Func.colocarPosFilaRandom(nombreNave);
        posColumna = Func.colocarPosColumnaRandom(nombreNave);

        setPosFilas(posFila);
        setPosColumnas(posColumna);
    }


    //Metodo para verificar si el teniente esta vivo
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
