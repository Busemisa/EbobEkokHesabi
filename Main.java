import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = 1;
        int min = Math.min(sayi1, sayi2);

        for (int i = 1; i <= min; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);


    }
}
