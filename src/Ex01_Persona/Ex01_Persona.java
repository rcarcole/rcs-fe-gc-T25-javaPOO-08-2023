package Ex01_Persona;


public class Ex01_Persona {
    // Constantes
    private static final char SEXO_DEF = 'H';

    // Atributos
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    // Constructores
    public Ex01_Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
        this.sexo = SEXO_DEF;
        this.peso = 0;
        this.altura = 0;
    }

    public Ex01_Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = "";
        this.peso = 0;
        this.altura = 0;
    }

    public Ex01_Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
}
