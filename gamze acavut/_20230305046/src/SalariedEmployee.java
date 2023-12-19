class SalariedEmployee extends Employee {
    public SalariedEmployee(String firstName, String lastName, String department, double salary) {
        super(firstName, lastName, department, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }
}
