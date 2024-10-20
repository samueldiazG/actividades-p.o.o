package interfaz.agregar;

public package Agregacion;

import java.util.List;
import java.util.ArrayList;

class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
class Aula {
    private List<Estudiante> estudiantes;

    public Aula(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void iniciarClase() {
        System.out.println("Estudiantes en el aula:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre());
        }
    }
}

public class ejercicio10 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("cristian");
        Estudiante estudiante2 = new Estudiante("carlos");
        Estudiante estudiante3 = new Estudiante("luis");

        List<Estudiante> listaDeEstudiantes = new ArrayList<>();
        listaDeEstudiantes.add(estudiante1);
        listaDeEstudiantes.add(estudiante2);
        listaDeEstudiantes.add(estudiante3);

        Aula miAula = new Aula(listaDeEstudiantes);

        miAula.iniciarClase();
    }  {
    
    }
}
