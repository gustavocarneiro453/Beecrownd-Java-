import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int item, qnt_item;
        double total = 0.0;

        Scanner in =  new Scanner(System.in);

        item =  in.nextInt();
        qnt_item = in.nextInt();

        if(item == 1){
            total = 4.0 * qnt_item;
        } else if(item == 2){
            total = 4.5 * qnt_item;
        } else if(item == 3){
            total = 5.0 * qnt_item;
        } else if(item == 4){
            total = 2.0 * qnt_item;
        } else if(item == 5){
            total = 1.5 * qnt_item;
        }

        //Locale.US, ele adequa ao padrao cultura dos EUA, exemplo . e , 
        System.out.printf(Locale.US, "Total: R$ %.2f%n", total);
    }
}
