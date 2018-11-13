import java.util.Scanner;

public class Broj {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = input.nextInt();
        while (broj <= 1) {
            System.out.print("Uneti broj mora biti veci od 1. ");
            broj = input.nextInt();
        }
        System.out.println("Uneti broj je deljiv sa sledecim prostim brojevima:");
        int count = 0;
        for (int faktor = 2; faktor <= broj; faktor++) {
            while (broj % faktor == 0) {
                broj = broj / faktor;
                count++;
            }
            if (count != 0) {
                System.out.print(faktor + " ");
            }
            count = 0;

        }
    }
}
