
import java.util.Scanner;

public class EmployeeProfile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        String email = sc.nextLine();
        Employee e1 = new Employee(id, name, salary, email);
        e1.displayProfile();

    }
    
}
