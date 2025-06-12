import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor em Reais (BRL): R$ ");
        double reais = scanner.nextDouble();
        
        System.out.print("Digite a taxa de conversão atual (EUR/BRL): ");
        double taxaConversao = scanner.nextDouble();
        
        double euros = reais / taxaConversao;
        
        System.out.printf("\nR$ %.2f = € %.2f\n", reais, euros);
        
        scanner.close();
    }
}
