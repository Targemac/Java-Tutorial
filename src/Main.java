public class Main {
    public static void main(String[] args) {
        //super = refers to the parent class (subclass (aka child class) <- superclass (aka parent class))
        //        used in constructors and method overriding
        //        calls the parent constructor to initialize attributes


        Person person = new Person("Tunde", "Nut");
        Student student = new Student("Bola", "Ahmed", 4.3);
        Employee employee = new Employee("Kate", "ola", 50000);

        person.showName();
        System.out.println(student.gpa);
        student.showName();
        student.showGpa();
        employee.showSalary();


    }
}
