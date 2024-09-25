//package Practica5;
import java.util.ArrayList;

public class Jugador {
    public String nombreJugador;
    private ArrayList<Carta> manoJugador;

    public Jugador(){
        manoJugador = new ArrayList<>();
    }

    public void getCartasJugador(Mazo mazo){
        manoJugador = mazo.getMano(7);
    }

    public void mostrarManoJugador(){
        for(Carta i: manoJugador){
            System.out.println(i.getValor());
        }
    }

    public void deshacerseDeCarta(Carta otraCarta){
        boolean bandera = false;
        for(Carta i: manoJugador){
            if(i.getValor().equals(otraCarta.getValor())){
                bandera = true;
            }
        }
        if(bandera == true){
            manoJugador.removeIf(carta -> carta.getValor().equals(otraCarta.getValor()));
            System.out.println("Se a eliminado la carta " + otraCarta.getValor());
        }
    }

    public void infoJugador(){
        if(nombreJugador == null || nombreJugador.isEmpty()){
            System.out.println("No hay nombre");
            System.out.println("Cartas del jugador: ");
            for(Carta i: manoJugador){
                System.out.println(i.getValor());
            }
        } else{
            System.out.println("Nombre: " + nombreJugador);
            System.out.println("Cartas del jugador: ");
            for(Carta i: manoJugador){
                System.out.println(i.getValor());
            }
        }
    }
}
