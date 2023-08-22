package Ex04_Serie;

public class Ex04_Serie {
    // Atributos
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    // Constantes valores por defecto
    private static final int TEMPORADAS_DEF = 3;
    private static final boolean ENTREGADO_DEF = false;

    // Constructor por defecto
    public Ex04_Serie() {
        this.titulo = "";
        this.numeroDeTemporadas = TEMPORADAS_DEF;
        this.entregado = ENTREGADO_DEF;
        this.genero = "";
        this.creador = "";
    }

    // Constructor con titulo y creador. El resto por defecto.
    public Ex04_Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDeTemporadas = TEMPORADAS_DEF;
        this.entregado = ENTREGADO_DEF;
        this.genero = "";
    }

    // Constructor con todos los atributos excepto entregado
    public Ex04_Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = ENTREGADO_DEF;
    }
}
