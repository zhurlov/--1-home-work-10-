public class Employee {

    public static int counter = 0;
    private String FIO;
    public int id;
    private int employeeDepartment;
    private int salary;

    public Employee(String FIO, int employeeDepartment, int salary) {
        this.FIO = FIO;
        id = counter++;
        this.employeeDepartment = employeeDepartment;
        this.salary = salary;
    }
    public String getFIO() {
        return this.FIO;
    }
    public int getEmployeeDepartment() {
        return this.employeeDepartment;
    }
    public int getSalary() {
        return this.salary;
    }

    public void setSalary() {
        return;
    }

    public void setEmployeeDepartment() {
        return;
    }
}
