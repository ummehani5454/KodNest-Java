
public class Student2Application {

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s3 = new Student2("hanif");
        Student2 s2 = new Student2("sofi", 15, 4.3);
        s1.display();
        s2.display();
        s3.display();
    }

}
