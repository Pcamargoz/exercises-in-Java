package dollar;

public class Programa {
    public double dollar;
    public double comprar;
    public static final double IOF = 6.0; // valor que nao vai ser alterado 

    // statico por que eu vou chamar ele apenas uma vez entao isso me atrasa menos no codigo 
    public static double calculardollar(double dollar , double comprar){
        double valorSemIOF = dollar * comprar;
        return valorSemIOF * (1 + IOF / 100);
    }
    
}
