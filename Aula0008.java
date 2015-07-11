import java.util.Scanner;

public class Aula0008 {
    public static void main(String[] args) {
/*
 * 1) entrada de dados
 * 2) processamento de dados
 * 3) saída de dados
*/
        System.out.println("Informe a idade do seu cachorro: ");
        Scanner in = new Scanner( System.in );

        int idadeCachorro = in.nextInt();
        idadeCachorro = idadeCachorro * 7;

        System.out.println("O seu cachorro tem "+idadeCachorro+" anos.");
    }
}
