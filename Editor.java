package com.example;
public class Editor extends Usuario{
   private String njournal;
   private String user;
   private String contrasenia;

    //CONSTRUCTOR
    public Editor(String nombre, String apellido, String correo, Rol rol, String njournal, String user, String contrasenia) {
        super(nombre, apellido, correo, rol);
        this.njournal = njournal;
        this.user = user;
        this.contrasenia = contrasenia;
    }

    //GETTERS
    public String getNjournal(){
        return njournal;
    }

    public String getUser(){
        return user;
    }

    public String getContrasenia(){
        return contrasenia;
    }

    //SETTERS

    public void setNjournal(String njournal){
        this.njournal=njournal;
    }

    public void setUser(String user){
        this.user=user;
    }

    public void setContrasenia(String contrasenia){
        this.contrasenia=contrasenia;
    }
}
