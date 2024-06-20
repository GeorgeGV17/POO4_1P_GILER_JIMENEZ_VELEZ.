package com.example;

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private Rol rol;

    //CONSTRUCTOR

    public Usuario(String nombre, String apellido, String correo, Rol rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.rol = rol;
    }
    
    //GETTERS

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getCorreo(){
        return correo;
    }

    public Rol getRol(){
        return rol;
    }

    //SETTERS

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    public void setRol(Rol rol){
        this.rol=rol;
    }
}
