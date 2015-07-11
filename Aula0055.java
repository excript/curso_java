/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: youtube.com/watch?v=lwu6Xe9Qklk&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 55 - Arrays Multidimensionais III
*/

public class Aula0055 {

    public static void main(String[] args) {

        int[][] nums = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
//        int[][] x = new int[2][2];

        for(int x = 0; x<3; x++){
            for(int y = 0; y<3; y++)
                System.out.print(nums[x][y]+" ");
            System.out.println();
        }
/*
* 1) de x
*   x = 0;
*       y = 0;(0,0)
*       y = 1;(0,1)
*       y = 2;(0,2)
*  x = 1;
*       y = 0;(1,0)
*       y = 1;(1,1)
*       y = 2;(1,2)
*  x = 2
*       y = 0;(2,0)
*       y = 1;(2,1)
*       y = 2;(2,2)
* */
    }

}
