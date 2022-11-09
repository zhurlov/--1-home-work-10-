import java.util.Objects;

public class Employee {

    public static int counter = 0;
    private String fio;
    public int id;
    private int employeeDepartment;
    private int salary;

    public Employee(String fio, int employeeDepartment, int salary) {
        this.fio = fio;
        id = counter++;
        this.employeeDepartment = employeeDepartment;
        this.salary = salary;
    }
    public String getFio() {
        return this.fio;
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

    public String toString() {
        return id + "." + fio + " (отдел " + employeeDepartment + ") текущая зарплата " +salary;
    }

    public int hashCode() {
        return Objects.hash(id, fio, employeeDepartment, salary);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return id == employee.id && Objects.equals (fio, employee.fio) && employeeDepartment == employee.employeeDepartment && salary == employee.salary;
    }
}
