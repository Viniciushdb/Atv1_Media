import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as três notas:");
        
        System.out.print("Primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("\nA média das notas é: %.2f\n", media);
        
        scanner.close();
    }
} 
