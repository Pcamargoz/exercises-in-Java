package Salario;

import java.util.Locale;
import java.util.Scanner;

public class Calculador2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Program program = new Program();
        System.out.println("Name: ");
        program.nome = sc.nextLine();
        System.out.println("Gross Salary: ");
        program.salary = sc.nextDouble();
        System.out.println("Tax: ");
        program.taxa = sc.nextDouble();

        System.out.println(program);

        System.out.println("Which percentage to increaese Salary: ");
        double percentage = sc.nextDouble();
        program.addTaxa(percentage);
        System.out.println("Update data: " + program);
        sc.close();

    }
    
}
