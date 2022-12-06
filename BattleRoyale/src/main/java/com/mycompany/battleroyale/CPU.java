/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleroyale;

/**
 *
 * @author danic
 */
public class CPU {


    
    public static String GenNumeroRandom() {
        int generador = (int) (Math.random() * 6)+1;
        String numero = String.valueOf(generador);
        return numero;
        
    }

    
}
