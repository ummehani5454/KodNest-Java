
public class Student2 {

    String name;
    int age;
    double height;

    Student2() {
        name = "sofiya";
        age = 16;
        height = 4.3;
    }

    Student2(String name) {
        this.name = name;
    }

    Student2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
    }

}
