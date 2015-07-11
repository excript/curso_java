/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: https://www.youtube.com/watch?v=BQGFKW3jwZU&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 52 - Média Aritmética
*/

public class Aula0052A {

    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 9;
        nums[1] = 10;
        nums[2] = 5;
        nums[3] = 6;
        nums[4] = 7;

        int media = 0;
        for(int i = 0; i<nums.length; i++)
            media += nums[i];

        float total = (float)media / nums.length;

        System.out.println("A média é: "+total);


    }

}
