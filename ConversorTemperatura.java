import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (1.8 * celsius) + 32;
        
        System.out.printf("\n%.1f°C = %.1f°F\n", celsius, fahrenheit);
        
        scanner.close();
    }
} 
