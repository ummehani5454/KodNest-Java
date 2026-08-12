
class StudentApplication {

    String name;
    int age;
    double height;

    void input(String a, int b, double c) {
        name = a;
        age = b;
        height = c;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }

    public static void main(String[] args) {
        StudentApplication s1 = new StudentApplication();
        s1.input("raja", 18, 12.9);
        s1.display();

    }
}
