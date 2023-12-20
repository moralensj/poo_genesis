package com.poo.proyecto.alumno;

public class Director extends Alumno{
    long cuentaBanco;
    String colegioAsignado;
    int distrito;

    public Director() {
    }

    public Director(int id, String apellido, String nombre, long cuentaBanco,
                    String colegioAsignado, int distrito) {

        super(id, apellido, nombre);
        this.cuentaBanco = cuentaBanco;
        this.colegioAsignado = colegioAsignado;
        this.distrito = distrito;
    }

    public long getCuentaBanco() {
        return cuentaBanco;
    }

    public void setCuentaBanco(int cuentaBanco) {
        this.cuentaBanco = cuentaBanco;
    }

    public String getColegioAsignado() {
        return colegioAsignado;
    }

    public void setColegioAsignado(String colegioAsignado) {
        this.colegioAsignado = colegioAsignado;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }
}

