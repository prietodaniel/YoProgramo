/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo._invertirarray;

import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author dprieto
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 10;

        String animales[] = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre de un animal: ");
            animales[i] = scanner.nextLine();
        }
        
        //Dar vuelta el arreglo
        String animalesInvertidos[] = new String[cantidad];
        System.out.println("Invertimos los animales:");
        for (int i = 0; i < cantidad; i++) {
            animalesInvertidos[animales.length -1 -i] = animales [i];            
        }
        
        for(String animal:animalesInvertidos){
            System.out.println(animal);
        }
    }
}
