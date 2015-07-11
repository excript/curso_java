/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=LD9kRcVfu98&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 44 - Array Unidimensional
*/

public class Aula0044 {
    public static void main(String[] args) {

        int[] array;//declaração do nosso array
        array = new int[10]; //cria e reserva o espaço para o nosso array
        //0..9
        for ( int i = 0; i <= 9; i++ ) {
            System.out.printf("%5d%7d\n", i, array[i]);
        }
    }
}
