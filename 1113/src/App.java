import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leitura dos valores de X e Y
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Verifica se os valores são iguais para encerrar o programa
            if (x == y) {
                break;
            }

            // Verifica a ordem e imprime a mensagem correspondente
            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }

        scanner.close();
    }
}
