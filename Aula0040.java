/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=AuS1qyZ0cMI&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 40 - Instrução Continue
*/

public class Aula0040 {

    public static void main(String[] args) {
        System.out.println("Imprime os número pares de 0 até 100");
        for (int i = 0; i < 100; i++) {
            if(i%2==0)
                System.out.println(i);
            else
                continue;

            int a = 0, soma = 0;
            while(a<i){
                a++;
                soma+=a;
            }
            System.out.println("A soma de todos os número é: "+soma);
        }
    }
}
