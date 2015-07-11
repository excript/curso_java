/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL:
:: NOME:
*/

public class Aula0052B {

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

        int media = 0;
        int[] resul = new int[2];
        for(int a=0; a<2; a++){
            media = 0;
            for ( int i = 1; i < nums.length; i++ ) {
                if ( (nums[i] < nums[resul[a]]) == (a==0)){
                    resul[a] = i;
                }
                media+=nums[i];
            }
        }
        System.out.println(nums[resul[0]]);
        System.out.println(nums[resul[1]]);
//        System.out.println(media/nums);

    }

}
