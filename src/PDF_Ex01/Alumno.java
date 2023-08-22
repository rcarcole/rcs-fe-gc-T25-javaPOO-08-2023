package PDF_Ex01;

public class Alumno {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor para cargar datos
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Imprimir los datos ingresados
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // El alumno es mayor de edad o no
    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }
}