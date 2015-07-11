/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=PnXX4sZ-6Z4&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 50 - Atividade com Array I
*/

import java.util.Arrays;
import java.util.Scanner;

public class Aula0050_AtividadeArrays1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] valores = new int[7];

        for(int i = 0; i<7; i++) {
            System.out.printf("Digite o numero da posicao [%d]: ", i + 1);
            valores[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(valores));

    }

}
