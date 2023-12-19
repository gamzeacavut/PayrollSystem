import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PayrollSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding different types of employees to the list with department info
        employees.add(new HourlyEmployee("Gamze", "Acavut", "IT", 5000, 50, 28));
        employees.add(new HourlyEmployee("Refik", "Acavut", "Arge", 5000, 30, 20));
        employees.add(new SalariedEmployee("Kağan", "Acavut", "HR", 6000));
        employees.add(new SalariedEmployee("Burak", "Kukal", "IT", 6200));


        // Calculating and displaying payroll for each employee
        for (Employee emp : employees) {
            System.out.println(emp);
            System.out.println("Calculated Pay: $" + emp.calculatePay());


        }
        System.out.println("**************************************");

        List<Employee> itEmployees = employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .collect(Collectors.toList());
        double minSalary = 5500;
        double maxSalary = 6500;

        List<Employee> filteredBySalary = employees.stream()
                .filter(employee -> employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary)
                .collect(Collectors.toList());

        System.out.println("Employees with salary between $" + minSalary + " and $" + maxSalary + ":");
        filteredBySalary.forEach(System.out::println);
        System.out.println("IT Department Employees (List):");
        itEmployees.forEach(System.out::println);



        Set<Employee> hrEmployeesSet = new HashSet<>();
        for (Employee emp : employees) {
            if (emp.getDepartment().equals("HR")) {
                hrEmployeesSet.add(emp);
            }
        }

        System.out.println("HR Department Employees (Set):");
        hrEmployeesSet.forEach(System.out::println);

    }
}