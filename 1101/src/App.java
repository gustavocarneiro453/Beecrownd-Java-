import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leitura dos valores M e N
            int M = scanner.nextInt();
            int N = scanner.nextInt();

            // Verifica se algum dos valores é menor ou igual a zero
            if (M <= 0 || N <= 0) {
                break;
            }

            // Determina o menor e o maior valor
            int menor = Math.min(M, N); 
            int maior = Math.max(M, N); 

            // Imprime a sequência e a soma
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
            }

            System.out.println("Sum=" + soma(menor, maior)); 
        }

        scanner.close();
    }

    // Função para calcular a soma dos inteiros consecutivos entre dois valores
    private static int soma(int menor, int maior) {
        int soma = 0; 
        for (int i = menor; i <= maior; i++) {
            soma += i; 
        }
        return soma;
    }
}


