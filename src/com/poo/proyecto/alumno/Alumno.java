package com.poo.proyecto.alumno;

public class Alumno {

    int id;
    String apellido;
    String nombre;



    public Alumno () {
    }


    public Alumno(int id, String apellido, String nombre) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarCalificacion (double calificacion ) {

        if (calificacion > 75) {
            System.out.println("Aprobado, esta promovido");
        } else {
            System.out.println("No aprobado");
        }
    }
}
