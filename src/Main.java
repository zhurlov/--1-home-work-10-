import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {
    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Кондратьев Аскольд Алексеевич", 3, 89070),
                new Employee("Гурьев Ефим Тарасович", 1, 60000),
                new Employee("Самсонов Вилли Владиславович", 1, 76859 ),
                new Employee("Капустин Аполлон Авдеевич", 5, 87652),
                new Employee("Давыдов Юрий Андреевич", 1,144800),
                new Employee("Клюев Тимофей Миронович", 3,56738),
                new Employee("Михеев Марк Маркович", 5,89000),
                new Employee("Громов Тимофей Давидович", 3, 103879),
                new Employee("Киселев Ян Ильич", 4, 87298),
                new Employee("Алексеев Даниил Степанович", 4, 142000),
        };

        System.out.println(amountOfWagesPerMonth());
        System.out.println(employees[7].getFio());
        System.out.println(employees[3].getEmployeeDepartment());
        System.out.println(employees[3].getSalary());
        listOfEmployees();

    }
    private static Employee[] employees = new Employee[10];

    public static void listOfEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int amountOfWagesPerMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    public static Employee minimumWage() {
        Employee min = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                min = employee;
            }
        }
        return min;
    }
    public static Employee maximumSalary() {
        Employee max = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                max = employee;
            }
        }
        return max;
    }
    public static float averageSalary() {
        return amountOfWagesPerMonth() / (float) employees.length;
    }
}