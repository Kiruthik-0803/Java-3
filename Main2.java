class Vehicle {
    int speed;
    int fuelcapacity;

    public Vehicle(int speed, int fuelcapacity) {
        this.speed = speed;
        this.fuelcapacity = fuelcapacity;
    }

    public void getdetails() {
        System.out.println("speed" + speed + "fuel capacity" + fuelcapacity);
    }
}

class Car extends Vehicle {
    String brand;

    public Car(int speed, int fuelcapacity, String brand) {
        super(speed, fuelcapacity);
        this.brand = brand;
    }

    @Override
    public void getdetails() {
        System.out.println("speed: " + speed + " fuel capacity: " + fuelcapacity + " brand: " + brand);
    }
}

class Bike extends Vehicle {
    String brand;

    public Bike(int speed, int fuelcapacity, String brand) {
        super(speed, fuelcapacity);
        this.brand = brand;
    }

    @Override
    public void getdetails() {
        System.out.println("speed: " + speed + " fuel capacity: " + fuelcapacity + " brand: " + brand);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car c = new Car(20, 23, "tata");
        Bike b = new Bike(20, 23, "suzuki");
        c.getdetails();
        b.getdetails();
    }
}