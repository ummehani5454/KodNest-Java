
class ArraySearch {

    void search(int ref[], int key) {
        boolean found = true;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                System.out.println("Element found at index: " + i);
                found = false;
                break;
            }
        }
        if (found) {
            System.err.println("Element not found");
        }
    }
}
