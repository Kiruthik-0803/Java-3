public class Sal {
    int id;
    int rollno;
    Employee emp;
    
    public static void main(String[] args) {
        Employee em = new Employee(2004);
        Sal s = new Sal(1, 11, em);
        s.printDetails();
    }

    public Sal(int id, int rollno, Employee em) {
        this.id = id;
        this.rollno = rollno;
        this.emp = em;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Roll No: " + rollno + ", Employee: " + emp.dob);
    }
}

class Employee {
    int dob;

    public Employee(int r) {
        dob = r;
    }
}
