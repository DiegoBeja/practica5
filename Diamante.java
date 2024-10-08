public class Diamante{
    protected Triangulo[] triangulo;

    public Diamante(Posicion p){
        triangulo = new Triangulo[2];

        triangulo[0] = new Triangulo(new Posicion(p.x + 100, p.y - 40));
        

        triangulo[1] = new Triangulo(new Posicion(p.x + 100, p.y));
        triangulo[1].voltear = true;
        triangulo[1].changeSize(40, 50);
        triangulo[1].changeColor("white");
    }

    public void dibujarDiamantes(){
        triangulo[0].makeVisible();
        triangulo[1].makeVisible();
    }

}