package PDF_Ex05;

public class Libro {
    // Atributos
    private String autor;
    private String titulo;
    private String ubicacion;

    // Constructor
    public Libro() {}

    // Getters y setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public static void main(String[] args) {
        // Objeto de la clase Libro
        Libro libro = new Libro();

        // Dar valores a sus tres atributos
        libro.setAutor("J.K. Rowling");
        libro.setTitulo("Harry Popotter y la piedra filosofal");
        libro.setUbicacion("Estante 7, Sección C");

        // Mostrar los valores de los atributos
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Ubicación: " + libro.getUbicacion());
    }
}
