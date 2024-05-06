package br.com.alura.screenmatch.pratice;

public class Enum {
    public enum Planetas {
        MERCURIO,
        VENUS,
        TERRA,
        MARTE,
        JUPITER,
        SATURNO,
        URANO,
        NEPTUNO
    }

    public static void qualPlaneta(Planetas planeta) {
        switch (planeta) {
            case TERRA:
                System.out.println("Você está na Terra!");
                break;
            default:
                System.out.println("Você não está na Terra!");
                break;
        }
    }


    public static void main(String[] args) {
        qualPlaneta(Planetas.TERRA);
    }
}
