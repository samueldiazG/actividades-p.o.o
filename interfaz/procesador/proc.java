package interfaz.procesador;

public class proc {
    class Procesador {
        public void encender() {
            System.out.println("El procesador se está encendiendo.");
        }
    
        public void apagar() {
            System.out.println("El procesador se está apagando.");
        }
    }
    class Computadora {
        private Procesador procesador;
    
        public Computadora() {
            this.procesador = new Procesador();
        }
    
        public void iniciar() {
            procesador.encender();
            System.out.println("La computadora está iniciando.");
        }
    
        public void apagar() {
            procesador.apagar();
            System.out.println("La computadora se está apagando.");
        }
    }
    
    public class Ejercicio11 {
        public static void main(String[] args) {
            Computadora miComputadora = new Computadora();
            
            miComputadora.iniciar();
            miComputadora.apagar();
        }
    }
    
}
