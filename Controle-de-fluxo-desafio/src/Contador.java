import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n\n\n\n\n-=-=-=-=-=-=-= Programa para realizar contagem -=-=-=-=-=-=-=\n\n");

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.print("Digite o segundo parâmetror: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("\n !! O segundo parâmetro deve ser maior que o primeiro !!\n");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println("\nImprimindo número: " + i);
        }
    }

}
