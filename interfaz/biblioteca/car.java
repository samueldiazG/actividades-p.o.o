package interfaz.orientacion,cardinalidad;
import java.util.ArrayList;
import java.util.List;

public class car {

class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

// Clase Biblioteca
class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo());
        }
    }
}

public class Ejercicio14 {
    public static void main(String[] args) {
        // Instancia
        Biblioteca miBiblioteca = new Biblioteca();
        
        // Librooos
        Libro libro1 = new Libro("Indigno de ser humano");
        Libro libro2 = new Libro("Las 48 leyes del poder");
        Libro libro3 = new Libro("Crimen y Castigo");
        
        miBiblioteca.añadirLibro(libro1);
        miBiblioteca.añadirLibro(libro2);
        miBiblioteca.añadirLibro(libro3);
        
        miBiblioteca.mostrarLibros();
    }
}
}
