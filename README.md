# Employee Data Processor using Functional Interface and Stream

## Overview

This Java program demonstrates how to use the `Function` interface and streams to process a dataset of employees. It includes operations to concatenate employee names and departments, calculate the average salary, and filter employees based on age.

## Features

1. **Concatenate Employee Name and Department:**
   - Uses a lambda expression implementing the `Function` interface to concatenate each employee's name and department.
   - Generates a list of concatenated strings using streams.

2. **Calculate Average Salary:**
   - Utilizes streams to calculate the average salary of all employees.

3. **Filter Employees by Age:**
   - Applies a filter to include only employees whose age is above a specified threshold (30 in this example).

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE (e.g., IntelliJ, Eclipse) or a text editor and command line tools

### Installation

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/your-username/employee-data-processor.git
   cd employee-data-processor
   ```

2. **Compile the Program:**
   ```sh
   javac EmployeeProcessor.java
   ```

3. **Run the Program:**
   ```sh
   java EmployeeProcessor
   ```

### Example Output

```
Name - Department List: [John - HR, Emily - Engineering, Michael - Engineering, Sarah - HR, David - Marketing]
Average Salary: 69000.0
Filtered Employees:
Emily - 34 - Engineering - 78000.0
Michael - 45 - Engineering - 105000.0
Sarah - 36 - HR - 62000.0
```

## Code Explanation

### Employee Class

Defines the `Employee` class with attributes for name, age, department, and salary. It includes a constructor and getter methods.

### EmployeeProcessor Class

Contains the main logic of the program:

1. **Dataset Initialization:**
   - Creates a list of `Employee` objects with different attributes.

2. **Function Interface:**
   - Implements the `Function<Employee, String>` interface using a lambda expression to concatenate the name and department of an employee.

3. **Streams Operations:**
   - **Mapping:** Applies the `Function` to each employee to create a list of concatenated strings.
   - **Average Salary Calculation:** Computes the average salary of all employees using `mapToDouble` and `average`.
   - **Filtering:** Filters employees whose age is above 30 using the `filter` method.

## Usage

1. **Modify Dataset:**
   - Update the list of employees in the `main` method to test with different data.

2. **Change Age Threshold:**
   - Update the `ageThreshold` variable to filter employees by a different age.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by the need to demonstrate Java's functional programming capabilities and stream processing.
- Thanks to the Java documentation and community for support and resources.
