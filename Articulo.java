package com.example;

import java.util.ArrayList;

public class Articulo {
    private int codigo;
    private String titulo;
    private String resumen;
    private String contenido;
    private ArrayList<String> palabras;

    //CONSTRUCTOR
    public Articulo(int codigo, String titulo, String resumen, String contenido, ArrayList<String> palabras) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumen = resumen;
        this.contenido = contenido;
        this.palabras = palabras;
    }
    //GETTERS

    public int getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getResumen(){
        return resumen;
    }

    public String getContenido(){
        return contenido;
    }

    public ArrayList<String> getPalabras(){
        return palabras;
    }


    //SETTERS

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setResumen(String resumen){
        this.resumen=resumen;
    }

    public void setContenido(String contenido){
        this.contenido=contenido;
    }

    public void setPalabras(ArrayList<String> palabras){
        this.palabras=palabras;
    }
}
