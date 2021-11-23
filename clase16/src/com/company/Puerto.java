package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre;
    private List<Contenedor> listaContenedores;

    public Puerto(String nombre) {
        this.nombre=nombre;
        listaContenedores=new ArrayList<Contenedor>();
    }

    public void addContenedor(Contenedor unContenedor){
        listaContenedores.add(unContenedor);
    }

    public void ordenarPorIdMostrar(){

        //Es null, el "c:" aparece solo
        listaContenedores.sort( null);
        for(Contenedor unContenedor : listaContenedores){
            System.out.println(unContenedor.toString());
        }
    }
    public int calcularCantidadPeligrosoDesconocido( ){
        int contador=0;
        for(Contenedor unContenedor : listaContenedores) {
            if (unContenedor.getPaisProcedencia() == "Desconocida" && unContenedor.getEsPeligroso()) {
                contador++;
            }
        }

        return contador;
    }

    public List<Contenedor> getListaContenedores() {
        for(Contenedor unContenedor : listaContenedores) {
            System.out.println(unContenedor.toString());
        }
        return  listaContenedores;
    }
}
