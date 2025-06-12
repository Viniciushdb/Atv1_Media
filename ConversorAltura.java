import java.util.Scanner;

public class ConversorAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a altura em metros: ");
        double metros = scanner.nextDouble();
        
        double centimetros = metros * 100;
        double pes = centimetros / 30.48;
        double polegadas = centimetros / 2.54;
        
        System.out.printf("\nAltura em pés: %.0f\n", Math.floor(pes));
        System.out.printf("Altura em polegadas: %.3f\n", polegadas);
        
        scanner.close();
    }
}
