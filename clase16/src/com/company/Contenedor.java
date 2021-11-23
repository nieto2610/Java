package com.company;

import java.lang.Object;

public class Contenedor implements Comparable {
    private Integer iD;
    private String paisProcedencia;
    private Boolean esPeligroso;

    public Contenedor(Integer iD, String paisProcedencia, Boolean esPeligroso) {
        this.iD = iD;
        this.paisProcedencia = paisProcedencia;
        this.esPeligroso = esPeligroso;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "iD=" + iD +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", esPeligroso=" + esPeligroso +
                '}';
    }
    @Override
    public int compareTo(Object object) {
        Contenedor otroContenedor= (Contenedor) object;
        return iD-otroContenedor.iD;
    }



    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public Boolean getEsPeligroso() {
        return esPeligroso;
    }


}
