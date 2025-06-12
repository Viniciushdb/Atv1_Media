package Extra;

import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor em reais (apenas inteiros): R$ ");
        int valor = scanner.nextInt();
        
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidade = new int[7];
        int valorRestante = valor;
        
        for (int i = 0; i < notas.length; i++) {
            quantidade[i] = valorRestante / notas[i];
            valorRestante = valorRestante % notas[i];
        }
        
        System.out.println("\nQuantidade de notas necessárias:");
        for (int i = 0; i < notas.length; i++) {
            if (quantidade[i] > 0) {
                System.out.printf("%d nota(s) de R$ %d\n", quantidade[i], notas[i]);
            }
        }
        
        scanner.close();
    }
}
