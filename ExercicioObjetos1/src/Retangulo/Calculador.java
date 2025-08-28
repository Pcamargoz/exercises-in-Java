package Retangulo;
public class Calculador {
    public double l;
    public double c;

    public Calculador(){

    }
    public double area(){
        return l * c;
    }
    public double perimetro(){
        double p = 2 * (l + c);
        return p;
    }
    public double diagonal (){
        double d = Math.sqrt((l * l) + (c * c));
        return d;

    }


}
