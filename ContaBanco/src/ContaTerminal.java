import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nome=scanner.next();

        System.out.println("Por favor, digite a sua agência: ");
        String agencia=scanner.next();

        System.out.println("Por favor, digite o numero da conta: ");
        Integer numeroConta=scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        Double saldo=scanner.nextDouble();
        
        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+numeroConta +" e seu saldo de R$"+saldo+" já está disponível para saque");
    }
}
