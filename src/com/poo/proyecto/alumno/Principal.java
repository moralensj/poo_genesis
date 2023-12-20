package com.poo.proyecto.alumno;

public class Principal {

    public static void main(String[] args) {

        Alumno estudiante1 = new Alumno();
        Alumno estudiante2 = new Alumno(5, "Jean Louis", "Moralens");

        System.out.println("El id del segundo estudiante es: " + estudiante2.getId());
        System.out.println("Su apellido es: " + estudiante2.getApellido());
        System.out.println("Su nombre: " + estudiante2.getNombre());

        System.out.println("--------------------");

        estudiante1.setId(35);
        estudiante1.setApellido("Lamar");
        estudiante1.setNombre("Feliz");

        System.out.println("El numero del su id es " + estudiante1.getId());
        System.out.println("Su apellido es: " + estudiante1.getApellido());
        System.out.println("Su nombre: " + estudiante1.getNombre());

        System.out.println("------------------");

        Maestros m1 = new Maestros();
        Maestros m2 = new Maestros(01, "White", "Salma",
                10983, 11, "Matematicas");

        System.out.println("El id de la maestra Salma es: " + m2.getId());
        System.out.println("Su cuenta bancaria es: " + m2.getCuentaBanco());
        System.out.println("La maestra White imparte clases en el grado: " + m2.getGrado());
        System.out.println("Ella imparte la materia de : " + m2.getMateria());

        System.out.println("------------------------------");

        Director dire = new Director(11, "Ortega", "Kenia", 896745600,
                "Maria trinidad Moya", 16-03);

        System.out.println("El nombre de la directora del colegio es: " + dire.getNombre());
        System.out.println("La maestra Kenia es directora del centro: " + dire.getColegioAsignado());
    }
}
