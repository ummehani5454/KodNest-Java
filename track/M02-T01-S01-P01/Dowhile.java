
public class Dowhile {

    public static void main(String[] args) {
        int i = 1;
        do {
            int k = 1;
            do {
                System.out.println(k);
                k++;
            } while (k <= 5);
            System.out.println();
            i++;
        } while (i <= 5);

    }
}
