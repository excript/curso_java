/*
:: SITE: eXcript.com
:: FB: fb.com/eXcript
:: URL: https://www.youtube.com/watch?v=8SMB_yRXkec&list=PLesCEcYj003Rfzs39Y4Bs_chpkE276-gD
:: NOME: Curso de Java - Aula 39 - Labels em Blocos de Instruções
*/

public class Aula0039 {

    public static void main(String[] args) {
        label1:
        {
            labelIF:
            if (true) {
                System.out.println("instrução if");

                break labelIF;
                System.out.println("label 1 ini");
                label2:
                {
                    System.out.println("label 2 ini");
                    label3:
                    {
                        System.out.println("label 3 ini");
                        if (true)
                            break label2;
                    }
                    System.out.println("label 2 fim");
                }
                System.out.println("label 1 fim");
            }
        }
    }
}
