public class Employee {
    // Fields representing the properties of an Employee
    private String name;
    private int age;
    private String department;
    private int salary;

    // Constructor to initialize an Employee object
    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Getter method for the age field
    public int getAge() {
        return age;
    }

    // Getter method for the department field
    public String getDepartment() {
        return department;
    }

    // Getter method for the salary field
    public int getSalary() {
        return salary;
    }
}
