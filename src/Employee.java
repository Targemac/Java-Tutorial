public class Employee extends Person {
    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);//super is used to send argument to the parent class
        this.salary = salary;

    }

    void showSalary() {
        System.out.println(this.first + "'s salary is NGN " + this.salary);
    }
}
