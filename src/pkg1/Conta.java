package pkg1;
public class Conta {
    public double saldo;
    public void saque(double valor){
        this.saldo = this.saldo - valor;
    }
    public void deposito(double valor){
        this.saldo = saldo + valor;
    }
}
