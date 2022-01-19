/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo._vectores;
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

        int vector[] = new int[100];
        
        for(int i=0; i<10; i++){
            System.out.println("Ingrese el numero: ");
            vector[i] = scanner.nextInt();
        }
        System.out.println("Vector:");
        for(int i=0; i<10; i++){
            System.out.println(vector[i]);
        }
    }
}