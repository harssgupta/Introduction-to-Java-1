
class Employee {
    String firstName, lastName, designation;
    int age;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    Employee() {
        firstName="Harsh";
        lastName="Gupta";
        age=22;
        designation="Software Engineer";
    }
    Employee(String fname, String lname) {
        setFirstName(fname);
        setLastName(lname);
        this.age= 22;
        this.designation="Software Engineer";
    }
    Employee(String fname, String lname, int age, String desig) {
        this(fname,lname);
        setAge(age);
        setDesignation(desig);
    }
    @Override
    public String toString() {
        return this.firstName+" "+this.lastName+" is "+this.age+" years old and his designation is "+ this.designation;
    }
}
public class ques5 {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        System.out.println(emp1.toString());
        Employee emp2= new Employee("Nikhil","Gupta");
        System.out.println(emp2.toString());
        Employee emp3= new Employee("Mayank","Gupta",22,"Software Engineer");
        System.out.println(emp3.toString());
    }
}