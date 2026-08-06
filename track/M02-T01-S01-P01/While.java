
public class While {

    public static void main(String[] args) {
        int a = 1;
        while (a <= 5) {
            int b = 1;
            while (b <= 5) {
                System.out.println(b);
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
