

public class Conta {
    private int number;
    private String name;
    private String yn;
    private double Banco;

    // sobrecarga
    public Conta (int number, String name, double depositoinicial){
        this.number = number;
        this.name = name;
        deposito(depositoinicial);
    }
     public Conta (int number, String name){
        this.number = number;
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYn() {
        return yn;
    }
    public void setYn(String yn) {
        this.yn = yn;
    }
    public double getBanco() {
        return Banco;
    }
    public void setBanco(double banco) {
        Banco = banco;
    }
    
    public void deposito(double deposito){
        
        Banco += deposito;

    }
    public void sacar(double valor){
        // o 5.0 seria a taxa do saque 
        Banco -= valor + 5.0;
    }
    public String toString() {
        return "Account "
                + number
                +", Holder: "
                + name
                +", Balance: $ "
                // para mostrar apenas duas casas decimais 
                // e sempre lembrar das aspas
                + String.format("%.2f", Banco);
    }



}