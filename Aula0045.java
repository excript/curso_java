/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=_s7MDIlE5is&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 45 - Formatando textos em colunas (string)
*/

public class Aula0045 {
    public static void main(String[] args) {

        int[] array;//declaração do nosso array
        array = new int[10]; //cria e reserva o espaço para o nosso array
        System.out.printf("%s%10s\n", " _______", " ________ ");
        System.out.printf("%s%10s\n", "|Indice "  ,"| Valores|");
        System.out.printf("%s%10s\n", "|-------", "|--------|");
        for ( int i = 0; i <= 9; i++ ) {
            System.out.printf("|%5d%3s%7d |\n", i, " |", array[i]);
        }
        System.out.printf("%s%10s\n", "|-------", "|--------|");
    }
}
