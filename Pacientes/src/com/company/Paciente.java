package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion)
    {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        else{
            throw new PacienteException("La fecha de internación debe ser anterior al día de hoy!");
        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta)
    {
        if (fechaAlta.after(fechaInternacion)) {
            System.out.println("Alta de paciente exitosa");
            this.fechaAlta = fechaAlta;
        }
        else{
            //System.out.println("No se puede dar de alta");
            throw new PacienteException("La fecha de alta debe ser posterior al día de internación!");
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", historiaClinica='" + historiaClinica + '\'' +
                ", fechaInternacion=" + fechaInternacion +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
