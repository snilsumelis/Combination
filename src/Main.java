import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        System.out.print("Bir sayı giriniz: ");
        int r = input.nextInt();

        int nsum = 1;
        int rsum = 1;
        int difsum =1;
        int sum;

        for (int i = 1; i <= n; i++) {
            nsum *= i;
        }
        for (int i = 1; i <= r; i++) {
            rsum *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            difsum *= i;
        }

        sum= nsum/(rsum*difsum);

        System.out.print(sum);
    }
}