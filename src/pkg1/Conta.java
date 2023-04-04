package pasta1;

public class Conta {
    public double saldo;
    public void saque(double valor){
        this.saldo = this.saldo - valor;
    }
}
