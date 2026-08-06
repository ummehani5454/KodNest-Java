
public class labelloop {

    public static void main(String[] args) {
        Hani:
        for (int i = 0; i <= 3; i++) {
            Hanif:
            for (int j = 0; j <= 4; j++) {
                if (i == 2) {
                    break Hani;

                }
                System.out.println("i: " + i + "  j: " + j);
            }
            System.out.println();
        }
    }
}
