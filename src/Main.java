import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", "IT", 70000),
                new Employee(2, "Priya", "HR", 50000),
                new Employee(3, "Amit", "IT", 90000),
                new Employee(4, "Sneha", "Finance", 80000),
                new Employee(5, "Karan", "IT", 60000),
                new Employee(6, "Neha", "HR", 55000)
        );
    }
}
