public class Trebol{
    private Cuadrado[] cuadrado;

    public Trebol(Posicion p){
        cuadrado = new Cuadrado[3];
    
        cuadrado[0] = new Cuadrado(new Posicion(p.x + 50, p.y + 10));
        cuadrado[1] = new Cuadrado(new Posicion(p.x + 100, p.y + 10));
        cuadrado[2] = new Cuadrado(new Posicion(p.x + 75, p.y - 40));
    }

    public void dibujarTrebol(){
        for(Cuadrado i: cuadrado){
            i.changeSize(50);
            i.makeVisible();
        }
    }
}
