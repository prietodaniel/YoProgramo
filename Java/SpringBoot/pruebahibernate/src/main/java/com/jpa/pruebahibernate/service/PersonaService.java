/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.pruebahibernate.service;

import com.jpa.pruebahibernate.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dprieto
 */

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository persoRepository;
    
}
