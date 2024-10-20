package interfaz.puertas;

public class door {
        private String material;
    
        public door(String material) {
            this.material = material;
        }
    
        public String getMaterial() {
            return material;
        }
    }
    
    class Casa {
        private door puerta;
        public Casa(door puerta) {
            if (puerta == null) {
                throw new IllegalArgumentException("Una casa no puede existir sin una puerta.");
            }
            this.puerta = puerta;
        }
        public void cambiarPuerta(door nuevaPuerta) {
            if (nuevaPuerta == null) {
                throw new IllegalArgumentException("La puerta no puede ser nula.");
            }
            this.puerta = nuevaPuerta;
        }
        public door obtenerPuerta() {
            return this.puerta;
        }
        public void eliminarPuerta() {
            throw new UnsupportedOperationException("No se puede eliminar la puerta, TONTOOOOO! ");
        }
    }
