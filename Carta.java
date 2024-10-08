public class Carta implements Comparable<Carta>{
    private int valor;
    private Palo tipo;
    
    
    public Carta(int valor, Palo tipo){
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getValorEntero(){
        return this.valor;
    }

    public Palo getTipo(){
        return tipo;
    }

    public String getValor(){
        switch (valor) {
            case 11:
                return "J de " + tipo;
            case 12:
                return "Q de " + tipo;
            case 13:
                return "K de " + tipo;
            case 14:
                return "A de " + tipo;
            default:
                return valor + " de " + tipo;
        }
    }

    public int compareTo(Carta otraCarta){
        int comparacionPalo = this.tipo.ordinal() - otraCarta.tipo.ordinal();
        if(comparacionPalo != 0){
            return comparacionPalo;
        } 
        
        return this.valor - otraCarta.valor;
    }
}
