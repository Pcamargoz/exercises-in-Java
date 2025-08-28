
import java.util.Locale;
import java.util.Scanner;

public class Painel {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        System.out.println("Is there na initial deposit(y/n)? ");
        char escolha = sc.next().charAt(0);
        if(escolha == 'y'){
            System.out.println("Enter initial deposit value: ");
            double depositoinical = sc.nextDouble();
            conta = new Conta(number, name, depositoinical);
        }else{
            conta = new Conta(number, name);
        }

        

        System.out.println("Account data: ");
        System.out.println(conta);

        System.out.println("Enter a deposit value: " );
        double deposito = sc.nextDouble();

        conta.deposito(deposito);
        sc.nextLine();

        System.out.println("Updated account data: ");
        System.out.println(conta);

        System.out.println("Enter a withdraw value: ");
        double sacar = sc.nextDouble();

        sc.nextLine();
        conta.sacar(sacar);

        System.out.println("Updated account data: ");
        System.out.println(conta);




        



        sc.close();

    }
       
}
