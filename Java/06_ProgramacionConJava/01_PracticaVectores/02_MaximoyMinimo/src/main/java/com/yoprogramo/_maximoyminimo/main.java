/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo._maximoyminimo;

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

        int notas[] = {4, 2, 5, 1, 2, 5, 8, 4, 2, 10};
        
        int nota_min = getMin(notas);
        int nota_max = getMax(notas);

        System.out.println("La nota minima es: " + nota_min);
        System.out.println("La nota maxima es: " + nota_max);
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    
}
