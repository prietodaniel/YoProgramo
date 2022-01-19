/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo._nombre_y_dni;

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
        int DNI[] = {38088232, 38954364, 38088233};
        String nombre[] = {"Daniel", "Brenda", "Randy"};
        String apellido[] = {"Prieto", "Deparsia", "Random"};

        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Persona" + i + ":");
            System.out.println(nombre[i] +" "+ apellido[i] + ": " + DNI[i]);
        }

    }

}
