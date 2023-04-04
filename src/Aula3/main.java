package Aula3;

public class Main {
    public static void main(String[] args) {
            Conta contaInacio = new Conta();
            Conta contaDaniel = new Conta();
            Retangulo r1 = new Retangulo();

            r1.altura = 3;
            r1.largura = 2;


            contaDaniel.setTitular("Daniel Schopf");
            contaInacio.setTitular("Inacio Cmamargo Buemo");

            contaDaniel.setSaldo(300);
            contaInacio.setSaldo(300);
            contaInacio.deposito(20);

            System.out.println("Saldo: R$ " + contaInacio.getSaldo() + "\nTitular: " + contaInacio.getTitular());


            contaInacio.transfer(30, contaDaniel);

            System.out.println("Saldo novo do " + contaDaniel.getTitular() + " " + contaDaniel.getSaldo());
            System.out.println("Area do r1: " + r1.calcular_area(r1.altura, r1.largura));
    }
}
