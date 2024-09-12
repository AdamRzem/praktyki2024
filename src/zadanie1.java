import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        double zysk, cenaDet;

        System.out.println("Podaj cenę detaliczną: ");

        cenaDet = klaw.nextDouble();
        klaw.nextLine();

        zysk = cenaDet * 0.4;

        System.out.println("Zysk z płytki to: " + zysk);

    }
}
