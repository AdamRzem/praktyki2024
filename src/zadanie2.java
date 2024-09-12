import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);

        String ulubioneMiasto, miastoWielkie, miastoMale;
        char pierwszyZnak;
        int dlugosc;

        System.out.println("Jakie jest twoje ulubione miasto?");
        ulubioneMiasto = klaw.nextLine();

        miastoWielkie = ulubioneMiasto.toUpperCase();
        miastoMale = ulubioneMiasto.toLowerCase();
        pierwszyZnak = ulubioneMiasto.charAt(0);
        dlugosc = ulubioneMiasto.length();

        System.out.println(dlugosc);
        System.out.println(miastoWielkie);
        System.out.println(miastoMale);
        System.out.println(pierwszyZnak);
    }
}
