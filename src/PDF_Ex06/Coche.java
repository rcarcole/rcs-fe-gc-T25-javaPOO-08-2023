package PDF_Ex06;

public class Coche {
    // Atributos
    private String marca;
    private String modelo;
    private int cilindrada;
    private double potencia;

    // Getters y setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public static void main(String[] args) {
        // Objeto de la clase Coche
        Coche coche = new Coche();

        // Valores a sus atributos
        coche.setMarca("Toyota");
        coche.setModelo("Corolla");
        coche.setCilindrada(1600);
        coche.setPotencia(132.0);

        // Mostrar los valores de los atributos
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Cilindrada: " + coche.getCilindrada() + " cc");
        System.out.println("Potencia: " + coche.getPotencia() + " HP");
    }
}