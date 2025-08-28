package Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculador calculador = new Calculador();

        System.out.println("Digite aqui o comprimento de seu retangulo:");
        calculador.c = sc.nextDouble();
        System.out.println("Agora a largura: ");
        calculador.l = sc.nextDouble();

        System.out.println("Area: " + calculador.area());
        System.out.println("Diagonal: " + calculador.diagonal());
        System.out.println("Perimetro: " + calculador.perimetro());

    }
}