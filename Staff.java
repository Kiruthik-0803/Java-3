class Employee {
    public int id;
    public int rollno;
    public String name;
    public int mob_no;
    public int salary;
    public int working_days;

    Employee(int id, int rollno, int salary, String name, int mob_no, int working_days) {
        this.id = id;
        this.rollno = rollno;
        this.salary = salary;
        this.name = name;
        this.mob_no = mob_no;
        this.working_days = working_days;
    }

    public void getSalary() {
        System.out.println("SALARY IS:"+salary);
    }

    public void getWorkingDays() {
        System.out.println("wORKING DAYS ARE:"+working_days);
    }
}

public class Staff extends Employee {
    public static void main(String[] args) {
        Staff st = new Staff(12, 1, 10000, "Ravi", 123, 27, "child", 12, "child");
        st.getDetails();
    }
   
    String role;
    int years_of_experience;
    String dept;

    Staff(int id, int rollno, int salary, String name, int mob_no, int working_days, String role, int years_of_experience, String dept) {
        super(id, rollno, salary, name, mob_no, working_days);
        this.role = role;
        this.years_of_experience = years_of_experience;
        this.dept = dept;
    }

    public void getDetails() {
        System.out.println("ID:"+id);
        System.out.println("ROLLNO:"+rollno);
        System.out.println("NAME:"+name);
        System.out.println("MOBILE NUMBER:"+mob_no);
        System.out.println("SALARY:"+salary);
        System.out.println("WORKING DAYS:"+working_days);
        getSalary();
        getWorkingDays();
        System.out.println("ROLE:"+role);
        System.out.println("YEARS OF EXPERIENCE:"+years_of_experience);
        System.out.println("DEPARTMENT:"+dept);
    }

    
}
