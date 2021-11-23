package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    // Creo 5 contenedores y un puerto
        Contenedor contenedorUno=new Contenedor(03,"Desconocida", true);
        Contenedor contenedorDos=new Contenedor(02,"China", true);
        Contenedor contenedorTres=new Contenedor(01,"China", false);
        Contenedor contenedorCuatro=new Contenedor(05,"EEUU", true);
        Contenedor contenedorCinco=new Contenedor(04,"Polonia", false);
        Puerto unPuerto=new Puerto("Paraná");

    //El sistema debe permitir que el puerto pueda ingresar contenedores,
        unPuerto.addContenedor(contenedorUno);
        unPuerto.addContenedor(contenedorDos);
        unPuerto.addContenedor(contenedorTres);
        unPuerto.addContenedor(contenedorCuatro);
        unPuerto.addContenedor(contenedorCinco);
        System.out.println("Los contenedores existentes en este puerto son: ");
        unPuerto.getListaContenedores();

    //El sistema debe permitir que el puerto pueda mostrarlos ordenados de acuerdo al número que los identifica,
        System.out.println("Los contenedores se encuentran ordenados por ID: ");
        unPuerto.ordenarPorIdMostrar();
    //El sistema debe permitir calcular la cantidad de contenedores peligrosos cuya procedencia sea “Desconocida”.
        System.out.print("La cantidad de contenedores peligrosos cuya procedencia es desconocida es: ");
        System.out.print(unPuerto.calcularCantidadPeligrosoDesconocido());


    }
}
