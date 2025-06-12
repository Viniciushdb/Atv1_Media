import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double areaTotal = 0;
        
        for (int i = 1; i <= 3; i++) {
            System.out.printf("\nCômodo %d:\n", i);
            
            System.out.print("Largura (metros): ");
            double largura = scanner.nextDouble();
            
            System.out.print("Comprimento (metros): ");
            double comprimento = scanner.nextDouble();
            
            double area = largura * comprimento;
            areaTotal += area;
            
            System.out.printf("Área do cômodo %d: %.2f m²\n", i, area);
        }
        
        System.out.printf("\nÁrea total dos cômodos: %.2f m²\n", areaTotal);
        
        scanner.close();
    }
}
