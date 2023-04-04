package pasta1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Conta contaInacio = new Conta();
            Conta contaDaniel = new Conta();

            contaDaniel.setTitular("Daniel Schopf");
            contaDaniel.setSaldo(300);
            contaInacio.setSaldo(300);
            contaInacio.deposito(20);
            contaInacio.setTitular("Inacio Cmamargo Buemo");
            System.out.println("Saldo: R$ " + contaInacio.getSaldo() + "\nTitular: " + contaInacio.getTitular());


            contaInacio.transfer(30, contaDaniel);

            System.out.println("Saldo novo do " + contaDaniel.getTitular() + contaDaniel.getSaldo());

    }
}
