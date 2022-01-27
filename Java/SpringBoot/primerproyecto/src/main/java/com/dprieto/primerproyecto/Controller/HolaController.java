/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dprieto.primerproyecto.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import model.Cliente;
import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;



/** 
 *
 * @author dprieto
 */

@RestController
public class HolaController {
    
    //FORMA 1
    /*
    @GetMapping("/hola/{nombre}/{edad}/{profesion}")
    public String decirHola(@PathVariable String nombre, @PathVariable int edad, @PathVariable String profesion) {
        return "Nombre: " + nombre + " Edad: " + edad + " Profesion: " + profesion;
    }
    */
    
    @GetMapping ("/hola")
    public String decirHola(@RequestParam String nombre, @RequestParam int edad, @RequestParam String profesion){
        return "Nombre: " + nombre + " Edad: " + edad + " Profesion: " + profesion;
    }
    
    @PostMapping ("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Datos cliente: " + cli.getNombre() + " Apellido: " + cli.getApellido());
    } 
    
    @GetMapping ("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente(1L, "Zlatan", "Ibrahimovic"));
        listaClientes.add(new Cliente(2L, "Cristiano", "Ronaldo"));
        listaClientes.add(new Cliente(3L, "Lionel", "Messi"));
        
        return listaClientes;
    }
    
    @GetMapping ("/pruebaResponse")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Esto es una respuesta", HttpStatus.OK);
    }
}
    