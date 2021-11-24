package com.company;

import javax.management.remote.SubjectDelegationPermission;

public class PacienteException extends RuntimeException{

    public PacienteException(){
        super();
    }
    public PacienteException(String message){
        super(message);
    }
@Override
    public String toString(){
        return "Error: "+this.getClass().getName()+"\n"+"Mensaje: "+this.getMessage()+"\n";

}
}
