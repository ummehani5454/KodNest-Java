
public class Forcontinue {

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);
            }
            System.out.println();
        }
    }
}
