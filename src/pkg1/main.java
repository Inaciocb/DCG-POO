package pasta1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Conta contaInacio =  new Conta();
            contaInacio.saldo = 100;
            contaInacio.saque(60);
            contaInacio.deposito(20);
            contaInacio.setSaldo(300);
            System.out.println("Saldo: R$ " + contaInacio.getSaldo());
    }
}
