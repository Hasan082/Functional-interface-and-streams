import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeProcessor {
    public static void main(String[] args) throws Exception {
        /*
         * Initialize a list of Employee objects with sample data.
         * This represents the dataset we are going to process.
         */
        List<Employee> employeList = Arrays.asList(
                new Employee("John", 28, "HR", 52000),
                new Employee("Emily", 34, "Engineering", 78000),
                new Employee("Michael", 45, "Engineering", 105000),
                new Employee("Sarah", 36, "HR", 62000),
                new Employee("David", 25, "Marketing", 48000));

        /*
         * Implement the Function interface to concatenate the name and department
         * of each employee. The lambda expression takes an Employee object and
         * returns a string in the format "Name - Department".
         */
        Function<Employee, String> nameAndDepartment = emp -> emp.getName() + " - " + emp.getDepartment();

        /*
         * Use streams to create a new list containing the concatenated name and
         * department strings. The map method applies the Function to each
         * Employee object in the list.
         */
        List<String> nameAndDepList = employeList.stream()
                .map(nameAndDepartment) // Apply the function to each employee
                .collect(Collectors.toList()); // Collect results into a list
        // Print the list of concatenated name and department strings
        System.out.println("Name - Department List: " + nameAndDepList);

        /*
         * Calculate the average salary of all employees using streams. The
         * mapToDouble method extracts the salary from each Employee object,
         * and the average method computes the average of these values.
         * If the list is empty, orElse provides a default value of 0.0.
         */
        double averageSalary = employeList.stream()
                .mapToDouble(Employee::getSalary) // Extract the salary from each employee
                .average() // Calculate the average
                .orElse(0.0); // Provide a default value if the list is empty
        // Print the average salary
        System.out.println("Average salary: " + averageSalary);

        /*
         * Define an age threshold for filtering employees. Here, we only want
         * to include employees who are older than 30 years.
         */
        int ageThreshold = 30;

        /*
         * Use streams to filter the list of employees based on the age threshold.
         * The filter method applies a predicate to each Employee object, and
         * only those that satisfy the condition (age > ageThreshold) are included
         * in the resulting list.
         */
        List<Employee> filteredEmployees = employeList.stream()
                .filter(emp -> emp.getAge() > ageThreshold) // Apply the age filter
                .collect(Collectors.toList()); // Collect results into a list

        /*
         * Print the details of the filtered employees. For each employee in the
         * filtered list, print their name, age, department, and salary.
         */
        filteredEmployees.forEach(emp -> System.out.println(
                "Name: " + emp.getName() +
                        ", Age: " + emp.getAge() +
                        ", Department: " + emp.getDepartment() +
                        ", Salary: " + emp.getSalary()));
    }
}
