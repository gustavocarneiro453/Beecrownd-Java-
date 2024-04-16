import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double x, y;

        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        if(x > 0 && y > 0 ){
            System.out.println("Q1");
        }
        if(x < 0  && y > 0){
            System.out.println("Q2");
        }
        if(y < 0 && x > 0){
            System.out.println("Q4");
        }
        if(y < 0 && x < 0){
            System.out.println("Q3");
        }
        if(y == 0 && x != 0){
            System.out.println("Eixo X");
        }
        if(y != 0 && x == 0){
            System.out.println("Eixo Y");
        }
    }
}
