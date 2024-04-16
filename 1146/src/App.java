import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        // Lendo os valores de entrada
        while (true) {
            int w = in.nextInt();
            if (w == 0) {
                break;
            }
            inputs.add(w);
        }

        // Mostrando os valores de entrada seguidos das saídas correspondentes
        for (int w : inputs) {
            int[] vetorX = new int[w];
            for (int i = 0; i < vetorX.length; i++) {
                vetorX[i] = i + 1; // Preenchendo o array com valores incrementais
            }

            // Mostrando os valores de saída
            for (int i = 0; i < vetorX.length; i++) {
                System.out.print(vetorX[i] + " ");
            }
            System.out.println();
        }
    }
}
