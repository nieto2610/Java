package com.company;

import java.util.Date;

public class Perro {

    private Boolean esAdoptable;
    private String raza;
    private Date anioNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private String nombre;

    public Perro(String raza, Date anio, Double peso, Boolean tieneChip, Boolean estaLastimado, String nombre) {
        this.raza = raza;
        anioNacimiento = anio;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
        esAdoptable = false;
    }

    public Perro(String raza, Double peso, Boolean estaLastimado) {
        this.raza = raza;
        this.peso = peso;
        this.estaLastimado = estaLastimado;
        esAdoptable = false;
        anioNacimiento = new Date();
        tieneChip = false;
        nombre = "";
    }

    public void setAnioNacimiento(Date anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    };

    public Date getAnioNacimiento(){
        return anioNacimiento;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    };

    public Boolean getTieneChip(){
        return tieneChip;
    }

    public Integer preguntarEdad(){
        Date fechaActual= new Date();
        int anio = fechaActual.getYear();
        int anioNac = anioNacimiento.getYear();
        return anio - anioNac;

    }

    public Boolean factiblePerderse(){

        return !tieneChip;


    }

    public Boolean puedeAdoptarse() {
        if (!estaLastimado && peso > 5){
            esAdoptable = true;
        }

        else {
            esAdoptable = false;
        }
        return esAdoptable;
    }

}