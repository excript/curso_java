import java.util.Scanner;

public class Aula0017 {
    public static void main(String[] args) {
        //Introdução aos operadores lógicos

        Scanner in = new Scanner(System.in);

        final int iJ, iI;
        iJ = 17;
        iI = 60;

        //mais 17 e menos 60

        int idade = in.nextInt();

        if(idade <= iJ){
            System.out.println("A idade da pessoa informada é de um jovem.");
        }else{
            if(idade >= iI){
                System.out.println("A idade da pessoa informada é de uma pessoa idosa.");
            }else{
                if(idade > iJ){
                    System.out.println("É um jovem!");
                }
            }
        }

    }
}
