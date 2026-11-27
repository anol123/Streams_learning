import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        employees.stream()
                .filter(emp->emp.getDepartment().equals("IT"))
                .forEach(emp->System.out.println(emp.getName()));

//      using forEach() in streams

        employees.stream()
                .filter(emp->emp.getSalary()>60000)
                .forEach(emp->System.out.println(emp.getName()));


        //using collect(Collectors.toList()) and later using forEach() to print
        List<Employee> employee_list = employees.stream()
                .filter(emp->emp.getSalary()>60000)
                .collect(Collectors.toList());

        employee_list.forEach(emp-> System.out.println(emp.getName()));

    }
}
