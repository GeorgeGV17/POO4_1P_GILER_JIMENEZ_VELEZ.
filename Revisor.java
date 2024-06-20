package com.example;

public class Revisor extends Usuario {
    private String user;
    private String contrasenia;
    private String especialidad;
    private int narticulos;

   //CONSTRUCTOR
    public Revisor(String nombre, String apellido, String correo, Rol rol, String user, String contrasenia, String especialidad, int narticulos) {
        super(nombre, apellido, correo, rol);
        this.user = user;
        this.contrasenia = contrasenia;
        this.especialidad = especialidad;
        this.narticulos = narticulos;
    }

   //GETTERS

    public String getUser(){
        return user;
    }

    public String getContrasenia(){
        return contrasenia;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public int getNarticulos(){
        return narticulos;
    }



    //SETTERS

    public void setUser(String user){
        this.user=user;
    }

    public void setContrasenia(String contrasenia){
        this.contrasenia=contrasenia;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }

    public void setNarticulos(int narticulos){
        this.narticulos=narticulos;

    }
}
