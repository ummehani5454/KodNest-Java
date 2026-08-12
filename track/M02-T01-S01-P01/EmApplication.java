
public class EmApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "hanif";
        System.out.println(e1.id);
        System.out.println(e1.name);
        Employee e2;
        e2 = e1;
        e2.id = 12;
        e2.name = "Hani";
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e1.id);
        System.out.println(e1.name);
        // e1.work();

    }
}
