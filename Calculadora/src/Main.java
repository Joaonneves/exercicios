import java.util.Scanner;
public class Main {
    public static void Menu() {
        System.out.println("Bem vindo a Calculadora!");
        System.out.println("0 - Fim");
        System.out.println("1 - Soma");
        System.out.println("2 - subtracao");
        System.out.println("3 - Multiplicacao");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        float ValorA = in.nextFloat();
        System.out.println("Informe outro valor: ");
        float ValorB = in.nextFloat();
        int opcao;
        do {
            Menu();
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("A soma é:" + (ValorA + ValorB));
                    break;
                case 2:
                    System.out.println("A subtracao é: " + (ValorA - ValorB));
                    break;
                case 3:
                    System.out.println("A multiplicacao é: " + (ValorA * ValorB));
                    break;
                default:
                    System.out.println("Encerrando Calculadora");
            }
        } while (opcao != 0);
    }
}