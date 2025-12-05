public class Student extends Person {
    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last);//super is used to send argument to the parent class
        this.gpa = gpa;

    }

    void showGpa() {
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}
