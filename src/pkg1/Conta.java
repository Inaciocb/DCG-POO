package pasta1;
public class Conta {
    private double saldo;
    public void saque(double valor){
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente! ");
        } else{
            this.saldo = this.saldo - valor;
        }
    }
    public void deposito(double valor){
        this.saldo = saldo + valor;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
