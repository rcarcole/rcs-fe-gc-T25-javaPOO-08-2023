package PDF_Ex04;

public class Persona {
    // Atributo
    private String nombre;

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}