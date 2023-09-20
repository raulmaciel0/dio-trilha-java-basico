import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-==-=-==-=-=-==-=-=-==-=-");

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = sc.nextLine();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-==-=-==-=-=-==-=-=-==-=-");

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(altura);
        }
        catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser númericos!");
        }
        
        
    }
}
