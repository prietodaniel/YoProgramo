/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio.edad.controller;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dprieto
 */
@RestController
public class Controller {

    @GetMapping("/calcularedad/{dia}/{mes}/{anio}")
    public String calcularEdad(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio) {
        //float tempF = (tempC * 9)/5 + 32;
        int edad = 0;
        LocalDate date = LocalDate.of(anio, mes, dia);
        LocalDate today = LocalDate.now(); // Create a date object

        if (date.getMonthValue() > today.getMonthValue()) {
            edad = today.getYear() - date.getYear() - 1;
        }else{
            if(date.getMonthValue() == today.getMonthValue()){
                if(date.getDayOfMonth() <= today.getDayOfMonth()){
                    edad = today.getYear() - date.getYear();
                }else{
                    edad = today.getYear() - date.getYear() - 1;
                }
            }
        }

        return "Edad: " + edad + " años.";
    }
}
