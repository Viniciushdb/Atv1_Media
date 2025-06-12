import java.util.Scanner;

public class CalculadoraCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o preço dos 3 produtos:");
        
        System.out.print("Produto 1: R$ ");
        double produto1 = scanner.nextDouble();
        
        System.out.print("Produto 2: R$ ");
        double produto2 = scanner.nextDouble();
        
        System.out.print("Produto 3: R$ ");
        double produto3 = scanner.nextDouble();
        
        double total = produto1 + produto2 + produto3;
        
        System.out.printf("\nTotal da compra: R$ %.2f\n", total);
        
        System.out.print("\nValor pago por Maria: R$ ");
        double valorPago = scanner.nextDouble();
        
        double troco = valorPago - total;
        
        if (troco >= 0) {
            System.out.printf("Troco: R$ %.2f\n", troco);
        } else {
            System.out.printf("Valor insuficiente! Faltam R$ %.2f\n", Math.abs(troco));
        }
        
        scanner.close();
    }
}
