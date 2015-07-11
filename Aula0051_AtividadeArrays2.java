/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=j9rPKAvhzGo&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 51 - Atividade com Array II
*/

import java.util.Scanner;

public class Aula0051_AtividadeArrays2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] valores = new int[7];
//      {0, 1, 2, 3, 4, 5, 6}

        for(int i = 0; i<7; i++) {
            System.out.printf("Digite o numero da posicao [%d]: ", (i + 1));
            valores[i] = in.nextInt();
        }

        int somaElemntos = 0;
        for(int x = 0; x<7; x++){
            somaElemntos += valores[x];
//            somaElemntos = somaElemntos + valores[x];
        }

        System.out.printf("A soma dos elementos eh: %d\n", somaElemntos);

        for(int x = 0; x<7; x++){
            int produto = (valores[x] * x);
            System.out.printf("A mult. do indice pelo elem. %d * %d = %d\n",
                    valores[x], x, produto);
        }

//      Média Aritmética = a soma de todos os valores dividido pela quantida
        double soma = somaElemntos;
        double media = soma / 7.0;
        System.out.printf("A media aritmetica eh: %f\n", media);


//        System.out.println(Arrays.toString(valores));

    }

}
