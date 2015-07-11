import java.util.Scanner;

public class Aula0009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, soma, subtracao, multi, divi;

        System.out.println("Insira um número: ");
        num1 = in.nextInt();

        System.out.println("Insira outro número: ");
        num2 = in.nextInt();

        num2 = num1 + num2;
        System.out.println("O resultado da soma é: ");

        subtracao = num1 - num2;
        System.out.println("O resultado da subtração é: ");

        multi = num1 * num2;
        System.out.println("O resultado da multiplicação é: ");

        multi = num1 / num2;
        System.out.println("O resultado da divisão é: ");


    }
}
