import java.util.Scanner;

public class CalculadoraSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de anos: ");
        int anos = scanner.nextInt();
        
        int segundosPorMinuto = 60;
        int minutosPorHora = 60;
        int horasPorDia = 24;
        int diasPorAno = 365;
        
        long segundos = (long) anos * diasPorAno * horasPorDia * minutosPorHora * segundosPorMinuto;
        
        System.out.printf("Em %d anos existem %d segundos\n", anos, segundos);
        
        scanner.close();
    }
} 
