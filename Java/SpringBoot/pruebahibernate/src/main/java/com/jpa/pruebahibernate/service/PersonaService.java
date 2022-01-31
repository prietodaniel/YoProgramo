/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.pruebahibernate.service;

import com.jpa.pruebahibernate.model.Persona;
import com.jpa.pruebahibernate.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dprieto
 */

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persoRepository;
    
    @Override
    public List<Persona> getPersonas(){
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }
    
    @Override
    public void savePersona(Persona perso){
        persoRepository.save(perso);
    }
    
    @Override
    public void deletePersona(Long id){
       persoRepository.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id){
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
}
