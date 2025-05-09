import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência Bancária ");
        int numConta = conta.nextInt();

        System.out.println("Por favor, digite o número da sua conta ");
        String agBanco = conta.next();

        System.out.println("Por favor, digite o seu nome ");
        String nomCli = conta.next();

        System.out.println("Por favor, digite o seu sobrenome ");
        String sobnomCli = conta.next();

        System.out.println("Por favor, digite o valor do seu saldo ");
        double saldo = conta.nextDouble();

        System.out.println("Olá "+nomCli+" "+sobnomCli+", obrigado por criar uma conta em nosso banco, sua agência é "+agBanco+", conta "+numConta+" e seu saldo R$ "+saldo+" já está disponível para saque!");

    }
}
