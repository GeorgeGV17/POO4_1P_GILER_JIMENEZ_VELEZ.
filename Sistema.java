package com.example;

import java.util.ArrayList;

public class Sistema {
    static ArrayList<Usuario> usuarios;
    static ArrayList<Articulo> articulos;

    //CONSTRUCTOR
    public Sistema() {
        usuarios = new ArrayList<>();
        articulos = new ArrayList<>();
    }
    
    //GETTERS
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }

    public ArrayList<Articulo> getArticulos(){
        return articulos;
    }
}
