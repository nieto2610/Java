package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    /*Paciente paciente=new Paciente("Juan","Perez","12345",new Date(122,5,25));
        paciente.darAlta(new Date());
        System.out.println(paciente.getFechaAlta());
        System.out.println(paciente.toString());*/
        Paciente pacienteDos=new Paciente("Juan","Perez","12345",new Date(121,3,25));
        pacienteDos.darAlta(new Date(122,3,5));
        System.out.println(pacienteDos.getFechaAlta());
        System.out.println(pacienteDos.toString());
    }
}
