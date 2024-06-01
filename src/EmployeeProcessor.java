import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeProcessor {
    public static void main(String[] args) throws Exception {
        List<Employee> employeList = Arrays.asList(
                new Employee("John", 28, "HR", 52000),
                new Employee("Emily", 34, "Engineering", 78000),
                new Employee("Michael", 45, "Engineering", 105000),
                new Employee("Sarah", 36, "HR", 62000),
                new Employee("David", 25, "Marketing", 48000));

        // Implemnet Functional interfaces here
        Function<Employee, String> nameAndDepartment = emp -> emp.getName() + " - " + emp.getDepartment();

        // Create a list of emplaye and departmet concated
        List<String> nameAndDepList = employeList.stream().map(nameAndDepartment).collect(Collectors.toList());
        System.out.println("Name - Department List: " + nameAndDepList);

        // Calculate Average salary
        double averarageSalary = employeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println("Average salary: " + averarageSalary);

    }
}
