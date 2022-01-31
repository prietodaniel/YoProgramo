/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jpa.pruebahibernate.service;

import com.jpa.pruebahibernate.model.Persona;
import java.util.List;

/**
 *
 * @author dprieto
 */
public interface IPersonaService {
    public List<Persona> getPersonas();
    public void savePersona(Persona perso);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
}
