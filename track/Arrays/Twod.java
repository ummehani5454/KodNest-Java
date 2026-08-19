
import java.util.Scanner;

public class Twod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = sc.nextInt();
        System.out.println("Enter cols");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        System.out.println("Enter elements");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[col].length - 1; j++) {
                a[row][col] = sc.nextInt();

            }
        }
        System.out.println("Print elements");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[col].length - 1; j++) {
                System.out.println(a[row][col] + " ");
            }
            System.out.println();
        }

    }
}
