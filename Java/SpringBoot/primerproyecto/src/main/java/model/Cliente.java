/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dprieto
 */
public class Cliente{
    private long id;
    private String nombre;
    private String apellido;
    
    public Cliente(long ide, String name, String surname){
        this.id = ide;
        this.nombre = name;
        this.apellido = surname;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public long getId(){
        return this.id;
    }
    public String getApellido(){
        return this.apellido;
    }
}