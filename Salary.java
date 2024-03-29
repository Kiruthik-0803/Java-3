abstract class Salary {
    abstract int getSalary();

    public static void main(String[] args) {
        Dept_staff s = new Dept_staff();
        s.calcSalary();

        Train_staff s1 = new Train_staff();
        s1.calcSalary();
    }
}

class Dept_staff extends Salary {
    int base_price = 2000;
    int no_of_days = 27;
    String dept="Staff";
     @Override
    int getSalary() {
        return base_price * no_of_days;
    }

    void calcSalary() {
        
        System.out.println("\n"+getClass().getSimpleName() +"\n Working department : "+ dept+"\n Base_price: "+ base_price +"\n Number of working days: "+no_of_days+ "\n Salary: " + getSalary());
    }
}

class Train_staff extends Salary {
    int base_price = 3000;
    int no_of_days = 23;
    String dept="Trainer";

    @Override
    int getSalary() {
        return base_price * no_of_days;
    }

    void calcSalary() {
        System.out.println("\n"+getClass().getSimpleName() +"\n Working department : "+ dept +"\n Base_price: "+ base_price +"\n Number of working days: "+no_of_days+"\n Salary: " + getSalary());
    }
}