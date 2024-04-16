import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double nota1, nota2 , media,x;

        Scanner in = new Scanner(System.in);

        nota1 = in.nextDouble();
        nota2 = in.nextDouble();
        x = 0;
        media = (nota1 + nota2)/2;


            if(0 <= nota1 && nota1 <= 10){
                if(0 <= nota2 && nota2 <= 10){
                    System.out.println("media = " + media);
                
                }
            }else{
                System.out.println("nota invalida");
                System.out.println("novo calculo (1-sim 2-nao)");
                x = in.nextInt();

                if(x == 1 || x == 2){
                    if(x==1){
                        
                        nota1 = in.nextInt();
                        nota2 = in.nextInt();
                        System.out.println("media = " + media);
                    }else{
                        
                    }

                }else{
                    System.out.println("novo calculo (1-sim 2-nao)");
                }
               
            }
       
    

}
}
