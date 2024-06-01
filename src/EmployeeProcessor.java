import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EmployeeProcessor {
    public static void main(String[] args) throws Exception {
        List<Employee> emploList = Arrays.asList(
                new Employee("John", 28, "HR", 52000),
                new Employee("Emily", 34, "Engineering", 78000),
                new Employee("Michael", 45, "Engineering", 105000),
                new Employee("Sarah", 36, "HR", 62000),
                new Employee("David", 25, "Marketing", 48000));

        Function<Employee, String> nameAndDepartment = emp -> emp.getName() + "-" + emp.getDepartment();
    }
}
