/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=1EWxRLVV55M&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 38 - Break na Prática
*/

public class Aula0038 {

    public static void main(String[] args) {

        double f = 5.5;
        System.out.println( (( int ) f) );

        int a = 5;
        int b = 4;
        if(a+b==6){
            System.out.println(
                    "O valor de i="+i+" o valor de J é: "+j);
        }else if(a/b>50){
            System.out.println(
                    "O valor de i="+i+" o valor de J é: "+j);
        }

        labelForI:
        for(int i = 0; i<10; i++){

            labelForJ:
            for (int j = 0; j < 10; j++) {
                System.out.println("O valor de i="+i+" o valor de J é: "+j);
                if(j==6 && i == 0)
                    break labelForI;
            }

            int a = 0;
            labelWhile:
            while(a<10){
                a++;
                break;
                if(a==5)
                    break labelForI;
            }

        }
    }
}
