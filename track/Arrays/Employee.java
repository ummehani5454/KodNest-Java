
class Employee {

    int id;
    String name;
    double salary;
    String email;

    Employee(int id, String name, double salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    void displayProfile() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.err.println("Employee Salary: " + salary);
        System.err.println("Employee Email: " + email);

    }
}
