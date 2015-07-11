import java.util.Scanner;

public class Aula0013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir");

        int i = in.nextInt();

        System.out.println("Digite o primeiro número: ");
        double num1 = in.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = in.nextDouble();

        if(i == 1){
            System.out.println( num1 + num2 );
        }else{
            if(i ==2 ){
                System.out.println( num1 - num2 );
            }else {
                if(i==3){
                    System.out.println( num1 * num2 );
                }else{
                    if(i==4){
                        System.out.println( num1 / num2 );
                    }

                }
            }

        }
    }
}
