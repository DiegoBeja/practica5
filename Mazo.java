package Practica5;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> misCartas;
    private ArrayList<Carta> mano;

    public Mazo(){
        misCartas = new ArrayList<>();
        Palo[] tipos = Palo.values();

        for(Palo i : tipos){
            for(int valor = 2; valor <= 14; valor++){
                misCartas.add(new Carta(valor, i));
            }
        }
    }

    public void revolver(){
        Collections.shuffle(misCartas);
    }

    public void acomodar(){
        Collections.sort(misCartas);
    }

    public void mostrarBaraja(){
        for(Carta i : misCartas){
            System.out.println(i.getValor());
        }
    }

    public ArrayList<Carta> getMano(int cartasJugador){
        mano = new ArrayList<>();
        Collections.shuffle(misCartas);

        for(int i= 0; i<cartasJugador; i++){
            mano.add(misCartas.remove(0));
        }

        return mano;
    }

    public void mostrarMano(){
        for(Carta i : mano){
            System.out.println(i.getValor());
        }
    }

    public void agregarCarta(Carta otraCarta){
        misCartas.add(otraCarta);
    }

    public void quitarCarta(Carta otraCarta){
        misCartas.remove(otraCarta);
    }
}
