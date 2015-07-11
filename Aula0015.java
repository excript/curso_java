public class Aula0015 {

    public static void main(String[] args) {
        /*
        * 1) os dados nunca serão alterados
        * 2) uma constante tem o seu endereço protegido
        * 3) uma cosntante nunca será desalocada
        * 4) declaramos uma vez, utilizamos quantas vezes forem necessárias
        * */

        int var = 10;//declaração de variável
        final int constante = 10;//declaração de constantes

        System.out.println( var );
        System.out.println( constante );

     }

}
