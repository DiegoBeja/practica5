
public class Cuadrado extends Square{

    public Cuadrado(Posicion Position){
        this.xPosition = Position.x;
        this.yPosition = Position.y;
        color = "black";
        isVisible = false;
        size = 100;
    }

    public int getSize(){
        return size;
    }
}
