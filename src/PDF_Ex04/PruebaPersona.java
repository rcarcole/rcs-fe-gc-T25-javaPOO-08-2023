package PDF_Ex04;

public class PruebaPersona {
    public static void main(String[] args) {
        // Crear dos objetos de tipo Persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        // Asignar un nombre a cada uno
        persona1.setNombre("Jose");
        persona2.setNombre("Robert");

        // Pedir a cada persona que salude
        persona1.saludar();
        persona2.saludar();
    }
}
