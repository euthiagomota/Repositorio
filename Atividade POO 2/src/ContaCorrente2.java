
import java.util.Scanner;

public class ContaCorrente2 {
    private double saldo;
    private Scanner leia;

    public ContaCorrente2() {
        saldo = 0.0;
        leia = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("O que você deseja fazer?\n 1- Depositar\n 2- Sacar\n 3- Obter saldo");
        int opt = leia.nextInt();

        switch (opt) {
            case 1:
                depositar();
                break;
            case 2:
                sacar();
                break;
            case 3:
                obterSaldo();
                break;
            default:
                System.out.println("Opção inválida.");
                menu();
                break;
        }
    }

    public void depositar() {
        System.out.println("Quanto você quer depositar? ");
        double dep = leia.nextDouble();

        saldo += dep;

        menu();
    }

    public void sacar() {
        System.out.println("Quanto você quer sacar? ");
        double sac = leia.nextDouble();

        if (saldo < sac) {
            System.out.println("Você não tem saldo suficiente, seu saldo atual é de: " + saldo);
        } else {
            sac = (sac + (sac * 0.005));
            saldo -= sac;
        }

        menu();
    }

    public void obterSaldo() {
        System.out.println("Você tem: R$" + saldo);
        menu();
    }
    
}
    