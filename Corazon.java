public class Corazon{
    protected Cuadrado[] cuadrados;

    public Corazon(Posicion p){
        cuadrados = new Cuadrado[3];

        cuadrados[0] = new Cuadrado(new Posicion(p.x + 50, p.y + 10));
        cuadrados[1] = new Cuadrado(new Posicion(p.x + 100, p.y + 10));
        cuadrados[2] = new Cuadrado(new Posicion(p.x + 75, p.y - 40));
    }

    public void dibujarCorazon(){
        for(Cuadrado i: cuadrados){
            i.changeColor("red");
            i.changeSize(50);
            i.makeVisible();
        }
    }
}
