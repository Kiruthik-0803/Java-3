class Student {
     String name;
     int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

public class GradingSystem {
    public static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 95);
        students[1] = new Student("Bob", 75);
        students[2] = new Student("Charlie", 85);

        for (int i = 0; i < students.length; i++) {
            char grade = calculateGrade(students[i].getMarks());
            System.out.println(students[i].getName() + " - Grade: " + grade);
        }
    }
}