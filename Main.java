public class Main {
    public static void main(String[] args){
        Visualizador.carta(new Carta(1, Palo.TREBOLES), new Posicion(60, 250));
        Visualizador.carta(new Carta(4, Palo.PICAS), new Posicion(270, 250));
        Visualizador.carta(new Carta(8, Palo.DIAMANTES), new Posicion(480, 250));
        Visualizador.carta(new Carta(12, Palo.CORAZONES), new Posicion(690, 250));
        
    
    }
}