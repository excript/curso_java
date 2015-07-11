/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=BwEB0tfKEWY&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 36 - Operador Ternário II
*/

import java.util.Scanner;

public class Aula0036 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o seu dia da semana predileto?");
        System.out.println("Digite 1 para segunda e 7 para domingo");
        int num = in.nextInt();
        String dia = (num==1) ? "segunda" :
                     (num==2) ? "terça"   :
                     (num==3) ? "quarta"  :
                     (num==4) ? "quinta"  :
                     (num==5) ? "sexta"   :
                     (num==6) ? "sabado"  :
                     (num==7) ? "domingo" :
                                "Dia inválido";

        // switch (num) {
        //    case 1 : dia = "segunda";
        //    case 2 : dia = "terca";
        //    default: dia = "Dia invalido";
        //}
        System.out.println("O dia escolhido foi: "+dia);
    }

}
