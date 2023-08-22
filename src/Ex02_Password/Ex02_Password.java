package Ex02_Password;

import java.util.Random;

public class Ex02_Password {
    // Atributos
    private int longitud;
    private String contraseña;

    // Constante
    private static final int LONGITUD_DEF = 8;

    // Constructor por defecto
    public Ex02_Password() {
        this.longitud = LONGITUD_DEF;
        this.contraseña = generarContraseña(LONGITUD_DEF);
    }

    // Constructor con longitud definida
    public Ex02_Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarContraseña(longitud);
    }

    // Contraseña aleatoria
    private String generarContraseña(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder pass = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            pass.append(caracteres.charAt(rand.nextInt(caracteres.length())));
        }

        return pass.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }


}
