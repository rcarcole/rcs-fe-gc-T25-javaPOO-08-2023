package Ex03_Electrodomestico;

public class Ex03_Electrodomestico {

    // Atributos con posibilidad de ser heredados
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constantes para valores por defecto
    protected static final double PRECIO_BASE_DEF = 100;
    protected static final String COLOR_DEF = "blanco";
    protected static final char CONSUMO_ENERGETICO_DEF = 'F';
    protected static final double PESO_DEF = 5;

    // Constructor por defecto
    public Ex03_Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEF;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.peso = PESO_DEF;
    }

    // Constructor con precio y peso. El resto por defecto.
    public Ex03_Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.peso = peso;
    }

    // Constructor con todos los atributos.
    public Ex03_Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Comprobar que el color es correcto, sinó retorna colo por defecto.
    private String comprobarColor(String color) {
        color = color.toLowerCase();
        switch (color) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color;
            default:
                return COLOR_DEF;
        }
    }

    // Comprobar que el consumo energético es correcto sinó retorna consumo por defecto.
    private char comprobarConsumoEnergetico(char consumo) {
        consumo = Character.toUpperCase(consumo);
        if (consumo >= 'A' && consumo <= 'F') {
            return consumo;
        }
        return CONSUMO_ENERGETICO_DEF;
    }
}
