/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=fzId5ZWeQtc&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 57 - For Each II
*/

public class Aula0057 {

    public static void main(String[] args) {

        int[] nums = new int[10];
        nums[0] = 125;
        nums[1] = 5487;
        nums[2] = 45;
        nums[3] = 457;
        nums[4] = 887;
        nums[5] = 1;
        nums[6] = 4087;
        nums[7] = 1287;
        nums[8] = 5456;
        nums[9] = 789841;

        //Imprime a média aritmética
        int soma = 0;
        for(int item : nums){
            soma += item;
        }

        float media = (float)soma / nums.length;

        System.out.println("O média aritmética é: " + media);


        //Imprime o menor e o maior valor da lista
        int menor = 0;
        int maior = 0;
        for(int item : nums){
            if(item < menor || menor == 0)
                menor = item;
            if(item > maior)
                maior = item;
        }

        System.out.println("O menor valor da lista é: "+menor);
        System.out.println("O maior valor da lista é: "+maior);

    }

}
