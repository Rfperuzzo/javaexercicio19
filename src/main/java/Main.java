import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, j;
        String texto;

        System.out.println("Digita algo aí");
        texto = scanner.next();

        System.out.println("Digita um número");
        num = scanner.nextInt();

        for (j = 1; j <= num; j = j + 1) {
            System.out.println(texto);
        }

    }
}