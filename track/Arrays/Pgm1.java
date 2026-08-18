
import java.util.Scanner;

public class Pgm1 {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("Total: " + sum);

    }
}
