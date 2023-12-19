abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String department;
    private double salary;

    public Employee(String firstName, String lastName, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Department: " + department + ", Salary: $" + salary;
    }
}


