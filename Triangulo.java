public class Triangulo extends Triangle{

    public Triangulo(Posicion position){
        this.xPosition = position.x;
        this.yPosition = position.y;
        height = 80;
        width =100;
        color = "red";
        isVisible = false;
    }
}
