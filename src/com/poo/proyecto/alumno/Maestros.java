package com.poo.proyecto.alumno;

public class Maestros extends Alumno{
    int cuentaBanco;
    int grado;
    String materia;

    public Maestros() {
    }

    public Maestros(int id, String apellido, String nombre,
                    int cuentaBanco, int grado, String materia) {
        super(id, apellido, nombre);
        this.cuentaBanco = cuentaBanco;
        this.grado = grado;
        this.materia = materia;
    }

    public int getCuentaBanco() {
        return cuentaBanco;
    }

    public void setCuentaBanco(int cuentaBanco) {
        this.cuentaBanco = cuentaBanco;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int publicarNota(int calificacion) {
        int notaCalificacion = 75;
        System.out.println("Su calificacion final es: " + notaCalificacion);
        return 75;

    }

}
