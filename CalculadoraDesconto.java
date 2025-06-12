import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço original do produto: R$ ");
        double precoOriginal = scanner.nextDouble();
        
        double desconto = precoOriginal * 0.15;
        double precoFinal = precoOriginal - desconto;
        
        System.out.printf("\nPreço original: R$ %.2f\n", precoOriginal);
        System.out.printf("Desconto (15%%): R$ %.2f\n", desconto);
        System.out.printf("Preço final: R$ %.2f\n", precoFinal);
        
        scanner.close();
    }
} 
