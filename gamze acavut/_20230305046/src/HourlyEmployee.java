class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String firstName, String lastName, String department, double salary, int hoursWorked, double hourlyRate) {
        super(firstName, lastName, department, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return getSalary() + (hoursWorked * hourlyRate);
    }
}