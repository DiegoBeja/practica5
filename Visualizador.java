import java.awt.Color;

public class Visualizador {
    public static void carta(Carta c, Posicion p){
        Cuadrado square1 = new Cuadrado(p);
        square1.changeColor("black");
        square1.size = 200;
        square1.makeVisible();

        int tamanoSquare2 = (int)(square1.getSize() * 0.95);
        Posicion posicionCuadrado2 = new Posicion(p.x + (square1.getSize() - tamanoSquare2) / 2, p.y);
        Cuadrado square2 = new Cuadrado(posicionCuadrado2);
        square2.changeColor("white");
        square2.changeSize(tamanoSquare2);
        square2.makeVisible();

        Posicion posicionCuadrado3 = new Posicion(p.x, p.y / 5);
        Cuadrado square3 = new Cuadrado(posicionCuadrado3);
        square3.changeColor("black");
        square3.size = 200;
        square3.makeVisible();

        int tamanoSquare4 = (int)(square3.getSize() * 0.95);
        Posicion posicionCuadrado4 = new Posicion(p.x + (square3.getSize() - tamanoSquare4) / 2, p.y/5 + 10);
        Cuadrado square4 = new Cuadrado(posicionCuadrado4);
        square4.changeColor("white");
        square4.changeSize(tamanoSquare4);
        square4.makeVisible();
        
        if(c.getValorEntero() >= 1 && c.getValorEntero()<=10){
            for(int i=0; i<c.getValorEntero(); i++){
                
                Posicion nuevaPosicion = new Posicion(p.x + 10, (p.y/4) + (i*30));
                
                Circulo circle = new Circulo(nuevaPosicion);
                circle.makeVisible();
                
                switch(c.getTipo()) {
                    case Palo.DIAMANTES:
                    circle.changeColor("red");
                    break;
                    case Palo.CORAZONES:
                    circle.changeColor("red");
                    break;
                    case Palo.PICAS:
                    circle.changeColor("black");
                    break;
                    case Palo.TREBOLES:
                    circle.changeColor("black");
                    break;
                    default:
                    break;
                }
            }
        }

        switch (c.getTipo()) {
            case Palo.TREBOLES:
                Trebol trebol = new Trebol(p);
                trebol.dibujarTrebol();
                break;

            case Palo.DIAMANTES:
                Diamante diamante = new Diamante(p);
                diamante.dibujarDiamantes();
                break;

            case Palo.PICAS:
                Pica pica = new Pica(p);
                pica.dibujarPica();
                break;

            case Palo.CORAZONES:
                Corazon corazon = new Corazon(p);
                corazon.dibujarCorazon();
                break;
            default:
                System.out.println("Error al dibujar el palo");
                break;
        }
        
        switch (c.getValorEntero()) {
            case 11:
                if(c.getTipo() == Palo.CORAZONES || c.getTipo() == Palo.DIAMANTES){
                    Canvas.getCanvas().escribirCanvas("J", p.x + 10, p.y - 155, Color.RED);
                } else{
                    Canvas.getCanvas().escribirCanvas("J", p.x + 10, p.y - 155, Color.BLACK);
                }
                break;
            case 12:
                if(c.getTipo() == Palo.CORAZONES || c.getTipo() == Palo.DIAMANTES){
                    Canvas.getCanvas().escribirCanvas("Q", p.x + 10, p.y - 155, Color.RED);
                } else{
                    Canvas.getCanvas().escribirCanvas("Q", p.x + 10, p.y - 155, Color.BLACK);
                }
                break;
            case 13:
                if(c.getTipo() == Palo.CORAZONES || c.getTipo() == Palo.DIAMANTES){
                    Canvas.getCanvas().escribirCanvas("K", p.x + 10, p.y - 155, Color.RED);
                } else{
                    Canvas.getCanvas().escribirCanvas("K", p.x + 10, p.y - 155, Color.BLACK);
                }
                break;
            case 14:
                if(c.getTipo() == Palo.CORAZONES || c.getTipo() == Palo.DIAMANTES){
                    Canvas.getCanvas().escribirCanvas("A", p.x + 10, p.y - 155, Color.RED);
                } else{
                    Canvas.getCanvas().escribirCanvas("A", p.x + 10, p.y - 155, Color.BLACK);
                }
                break;
            default:
                break;
        }
    }

}
