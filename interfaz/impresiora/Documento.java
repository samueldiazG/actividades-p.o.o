package interfaz.impresiora;

public class Documento {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}
class Impresora {
    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo el documento...");
        System.out.println("Contenido del documento: " + doc.getContenido());
        System.out.println("La impresión ha finalizado.");
    }
}
public class Ejercicio9 {
    public static void main(String[] args) {
        Documento miDocumento = new Documento("Este es el contenido del documento.");
        
        Impresora miImpresora = new Impresora();
        
        miImpresora.imprimir(miDocumento);
    }
}


