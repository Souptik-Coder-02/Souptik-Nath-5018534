public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        Employee emp1 = new Employee("1", "Alice", "Manager", 75000.00);
        Employee emp2 = new Employee("2", "Bob", "Developer", 50000.00);
        Employee emp3 = new Employee("3", "Charlie", "Analyst", 60000.00);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee searchedEmployee = ems.searchEmployeeById("2");
        System.out.println(searchedEmployee != null ? searchedEmployee : "Employee not found");

        System.out.println("\nDeleting employee with ID 2:");
        ems.deleteEmployeeById("2");

        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}
