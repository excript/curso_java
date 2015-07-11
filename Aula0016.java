import java.util.Scanner;

public class Aula0016 {
    public static void main(String[] args) {
        final double vsom = 340.28;//m/s

        System.out.println("Digite o espaço de tempo: ");
        Scanner in = new Scanner(System.in);
        int tempo = in.nextInt();
        System.out.println("A distância seria de: " +
                                    tempo * vsom +
                                        " metros percorridos. ");

        System.out.println("A distância seria de: " +
                                (tempo * vsom) / 1000 +
                                        " km percorridos. ");
    }
}
