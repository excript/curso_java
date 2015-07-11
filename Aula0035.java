/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=LBriUCvPIeE&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 35 - Condição Ternária
*/

public class Aula0035 {

    public static void main(String[] args) {

        int a, b;

        a = 5;
        b = 6;

        /*
        if(a==b)
            valor = "verdadeiro";
        else
            valor = "falso";
        */
        String valor = (a<b) ? "verdaeiro" : "false";

        System.out.println(valor);
    }

}
