package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

    Perro primero = new Perro("caniche", new Date(115, 8 , 6), 7.5, false, false, "Leon");

    Integer edad = primero.preguntarEdad();
    System.out.println("la edad del perro es: " + edad);


    Boolean perderse = primero.factiblePerderse();
        System.out.println("es factible perderse?: " + perderse);


    Boolean adoptable = primero.puedeAdoptarse();
        System.out.println("es adoptable?: " + adoptable);




    Perro segundo = new Perro("salchicha", 6.1, false);

        segundo.setAnioNacimiento(new Date(112, 7, 15));
        System.out.println("la fecha de nacimiento de segundo es: " + segundo.getAnioNacimiento());


        System.out.println("la edad de segundo es: " + segundo.preguntarEdad());

        segundo.setTieneChip(true);
        System.out.println("segundo tiene chip?: " + segundo.getTieneChip());

        System.out.println("segundo se puede perder?: " + segundo.factiblePerderse());

        System.out.println("segundo puede adoptarse?: " + segundo.puedeAdoptarse());



    }









}
