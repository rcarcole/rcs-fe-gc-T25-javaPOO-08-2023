package PDF_Ex03;

public class Operaciones {
    // Atributos
    private int valor1;
    private int valor2;

    // Constructor para cargar los valores
    public Operaciones(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Calcular e imprimir la suma
    public void suma() {
        int resultado = valor1 + valor2;
        System.out.println("Suma: " + resultado);
    }

    // Calcular e imprimir la resta
    public void resta() {
        int resultado = valor1 - valor2;
        System.out.println("Resta: " + resultado);
    }

    // Calcular e imprimir la multiplicación
    public void multiplicacion() {
        int resultado = valor1 * valor2;
        System.out.println("Multiplicación: " + resultado);
    }

    // Calcular e imprimir la división
    public void division() {
        if (valor2 != 0) {
            double resultado = (double) valor1 / valor2;
            System.out.println("División: " + resultado);
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }
    }
}