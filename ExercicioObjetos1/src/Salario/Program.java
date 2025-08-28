package Salario;
public class Program {

    public String nome;
    public double salary;
    public double taxa;

    
    public double grossSalary() {
        return salary - taxa;
    }
    public void addTaxa(double porcentagem){
        salary += salary * porcentagem / 100.0;
    }



    public String toString(){
        return nome + ", $ " + String.format("%.2f", grossSalary());
    }   

    
}
