import java.util.Scanner;

public class CalculadoraBoletos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PARTE A: Cálculo do Total dos Boletos ===");
        System.out.println("Digite os valores dos 4 boletos:");
        
        double boleto1 = lerValor(scanner, "Primeiro boleto");
        double boleto2 = lerValor(scanner, "Segundo boleto");
        double boleto3 = lerValor(scanner, "Terceiro boleto");
        double boleto4 = lerValor(scanner, "Quarto boleto");
        
        double totalBoletos = boleto1 + boleto2 + boleto3 + boleto4;
        System.out.printf("\nTotal dos boletos: R$ %.2f\n", totalBoletos);
        
        System.out.println("\n=== PARTE B: Análise com Salário Líquido ===");
        double salarioLiquido = lerValor(scanner, "Salário líquido disponível");
        double diferenca = salarioLiquido - totalBoletos;
        
        System.out.printf("Total dos boletos: R$ %.2f\n", totalBoletos);
        if (diferenca >= 0) {
            System.out.printf("Valor que irá sobrar: R$ %.2f\n", diferenca);
        } else {
            System.out.printf("Valor que irá faltar: R$ %.2f\n", Math.abs(diferenca));
        }
        
        System.out.println("\n=== PARTE C: Análise com Salário Bruto ===");
        double salarioBruto = lerValor(scanner, "Salário bruto");
        double salarioLiquidoCalculado = salarioBruto * 0.86;
        double diferencaFinal = salarioLiquidoCalculado - totalBoletos;
        
        System.out.printf("Salário líquido (após 14%% de desconto): R$ %.2f\n", salarioLiquidoCalculado);
        System.out.printf("Total das contas: R$ %.2f\n", totalBoletos);
        if (diferencaFinal >= 0) {
            System.out.printf("Restante do salário: R$ %.2f\n", diferencaFinal);
        } else {
            System.out.printf("Valor que irá faltar: R$ %.2f\n", Math.abs(diferencaFinal));
        }
        
        scanner.close();
    }
    
    private static double lerValor(Scanner scanner, String mensagem) {
        System.out.print(mensagem + ": R$ ");
        return scanner.nextDouble();
    }
}
