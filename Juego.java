package Practica5;

public class Juego{
    public static void main(String[] args){
        Mazo mazo1 = new Mazo();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        
        mazo1.revolver();
        jugador1.getCartasJugador(mazo1);
        jugador2.getCartasJugador(mazo1);

        System.out.println("Mazo desordenado: ");
        mazo1.mostrarBaraja();

        System.out.println("\n Mazo ordenado: ");
        mazo1.acomodar();
        mazo1.mostrarBaraja();
        
    }
}
