package PDF_Ex02;

public class Empleado {
    // Atributos
    private String nombre;
    private double sueldo;

    // Constante para el límite de sueldo para pagar impuestos
    private static final double LIMITE_IMPUESTOS = 3000.0;

    // Constructor para cargar los datos
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Imprimir los datos del empleado
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    // El empleado debe pagar impuestos o no
    public void debePagarImpuestos() {
        if (sueldo > LIMITE_IMPUESTOS) {
            System.out.println(nombre + " debe pagar impuestos.");
        } else {
            System.out.println(nombre + " no debe pagar impuestos.");
        }
    }
}