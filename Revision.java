package com.example;

public class Revision {
    private Autor autor;
    private Estado decisionf;
    private Articulo articulo;
    private Revisor revisor1;
    private Revisor revisor2;

    //CONSTRUCTOR

    public Revision(Autor autor, Estado decisionf, Articulo articulo, Revisor revisor1, Revisor revisor2) {
        this.autor = autor;
        this.decisionf = decisionf;
        this.articulo = articulo;
        this.revisor1 = revisor1;
        this.revisor2 = revisor2;
    }
    
    //GETTERS

    public Autor getAutor(){
        return autor;
    }

    public Estado getDecisionf(){
        return decisionf;
    }

    public Articulo getArticulo(){
        return articulo;
    }

    public Revisor getRevisor1(){
        return revisor1;
    }

    public Revisor getRevisor2(){
        return revisor2;
    }

    //SETTERS

    public void setAutor(Autor autor){
        this.autor=autor;
    }

    public void setDecisionf(Estado decisionf){
        this.decisionf=decisionf;
    }

    public void setArticulo(Articulo articulo){
        this.articulo=articulo;
    }

    public void setRevisor1(Revisor revisor1){
        this.revisor1=revisor1;
    }

    public void setRevisor2(Revisor revisor2){
        this.revisor2=revisor2;
    }

}
