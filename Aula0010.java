import java.util.Scanner;

public class Aula0010 {
    public static void main(String[] args) {
//        int num;
//        num = 11;
//
//        if(num == 10){
//            System.out.println("sim, é igual");
//        }else{
//            System.out.println("não, o número não é");
//
//        }

        int num;
        System.out.println("Digite o número 1: ");
        Scanner in = new Scanner( System.in );
        num = in.nextInt();
        if(num==1){
            System.out.println("Obrigado por digitar o número 1");
        }else{
            System.out.println("O número digitado não é igual a 1");
        }
    }
}
