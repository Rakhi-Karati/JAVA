class Employee {
    
    String name;
    int salary;


    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {

        
        Employee e1 = new Employee("Rakhi", 30000);

        
        System.out.println("Employee Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
    }
}