package Ejercicio20_partidoFutbol;

public class Main {
    public static void main(String[] args) {
        PartidoFutbol partido = new PartidoFutbol("Argentina", "Francia");
        System.out.println("Copa del Mundo - Final");
        partido.mostrarResultado();

        partido.golLocal();
        partido.mostrarResultado();
        partido.golVisitante();
        partido.mostrarResultado();
        partido.golLocal();
        partido.golVisitante();
        partido.golLocal();
        System.out.print("Resultado final: ");
        partido.mostrarResultado();
    }
}
