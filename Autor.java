package com.example;

public class Autor extends Usuario{
//ATRIBUTOS
    private String identificacion;
    private String institucion;
    private String campo;

//CONSTRUCTOR

    public Autor(String nombre, String apellido, String correo, Rol rol, String identificacion, String institucion, String campoInvestigacion) {
        super(nombre, apellido, correo, rol);
        this.identificacion = identificacion;
        this.institucion = institucion;
        this.campo = campoInvestigacion;
    }

//GETTERS

    public String getIdentificacion(){
        return identificacion;
    }

    public String getInstitucion(){
        return institucion;
    }

    public String getCampo(){
        return campo;
    }

//SETTERS

    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }

    public void setInstitucion(String institucion){
        this.institucion=institucion;
    }

    public void setCampo(String campo) {
        this.campo=campo;
    }
}
