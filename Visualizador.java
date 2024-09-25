//package Practica5;

public class Visualizador {
    public static void carta(Carta c, Posicion p) {
        Square square = new Square(p);
        square.changeColor("purple");
        square.makeVisible();

        
        for(int i=0; i<c.getValorEntero(); i++){
            Posicion nuevaPosicion = new Posicion(p.x, p.y + (i*30));
            
            Circle circle = new Circle(nuevaPosicion);
            circle.makeVisible();
            
            switch(c.getTipo()) {
                case Palo.DIAMANTES:
                    circle.changeColor("blue");
                    break;
                case Palo.CORAZONES:
                    circle.changeColor("red");
                    break;
                case Palo.PICAS:
                    circle.changeColor("black");
                    break;
                case Palo.TREBOLES:
                    circle.changeColor("green");
                    break;
                default:
                    break;
            }
        }
        
        
        
        

    }
}
