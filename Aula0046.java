/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=5JF6hxCcCdo&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 46 - Arrays Unidimensionais II
*/

public class Aula0046 {
    public static void main(String[] args) {
        int[] array = {78, 20, 56, 89, 1};
        System.out.printf("%s%8s\n", "Indice", "Valores");

        for(int i = 0; i < array.length; i++)
            System.out.printf("%5d%8d\n", i, array[i]);
    }
}
