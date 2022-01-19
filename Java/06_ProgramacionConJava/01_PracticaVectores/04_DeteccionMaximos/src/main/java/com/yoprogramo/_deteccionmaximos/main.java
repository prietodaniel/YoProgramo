/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo._deteccionmaximos;

import java.sql.DriverManager;
import java.util.Arrays;

/**
 *
 * @author dprieto
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temperaturas[] = {23,24,25,13,24,27,30,35,33,32,37,24,25,26,28,29,27};
        
        int maxTemperaturas[] = new int[5];
        
        Arrays.sort(temperaturas);
        
        System.out.println("Las temperaturas mas altas son:");
        
        for (int i = 0; i<5; i++){
            maxTemperaturas[i] = temperaturas[temperaturas.length-1-i]; 
            System.out.println(maxTemperaturas[i]);
        }
        
        
    }
    
    
}
