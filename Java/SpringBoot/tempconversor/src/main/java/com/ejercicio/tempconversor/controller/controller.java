/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio.tempconversor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dprieto
 */

@RestController
public class controller {
    
    @GetMapping("/temp/{tempC}")
    public String convertirTemp(@PathVariable int tempC) {
        float tempF = (tempC * 9)/5 + 32;
        return "Temperatura Convertida: " + tempF + " °F";
    }
}
