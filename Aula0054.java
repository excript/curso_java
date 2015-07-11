/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=HJ2AGUJnJv4&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 54 - Arrays Multidimensionais II
*/

public class Aula0054 {

    public static void main(String[] args) {

        int[][] nums = new int[2][9];
//        nums[0][0] = 1000;
//        System.out.println(nums[0][0]);
//        nums[1][0] = 5;
//        System.out.println(nums[1][0]);

//        System.out.println(nums[0].length);

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 4;
        nums[0][4] = 5;
        nums[0][5] = 6;
        nums[0][6] = 7;
        nums[0][7] = 8;
        nums[0][8] = 9;


        for(int x = 0; x<nums[0].length; x++){
            System.out.println(nums[1][x]);

        }


    }

}
