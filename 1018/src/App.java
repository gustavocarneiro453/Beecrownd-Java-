import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int N, nota, resto, resto1, resto2, resto3, resto4, resto5;
        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        if (0 < N && N < 1000000) {
            System.out.println("" + N);
            nota = N / 100;
            System.out.println(nota + " nota(s) de R$ 100,00");
            resto = N % 100;

            nota = resto / 50;
            System.out.println(nota + " nota(s) de R$ 50,00");
            resto1 = resto % 50;

            nota = resto1 / 20;
            System.out.println(nota + " nota(s) de R$ 20,00");
            resto2 = resto1 % 20;

            nota = resto2 / 10;
            System.out.println(nota + " nota(s) de R$ 10,00");
            resto3 = resto2 % 10;

            nota = resto3 / 5;
            System.out.println(nota + " nota(s) de R$ 5,00");
            resto4 = resto3 % 5;

            nota = resto4 / 2;
            System.out.println(nota + " nota(s) de R$ 2,00");
            resto5 = resto4 % 2;

            nota = resto5 / 1;
            System.out.println(nota + " nota(s) de R$ 1,00");
        }
    }
}
