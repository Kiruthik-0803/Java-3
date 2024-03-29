class Vehicle {

    final int speed;
    final int fuelCapacity;

    public Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public void move() {
        System.out.println("Vehicle moving at " + speed + " km/h with fuel capacity of " + fuelCapacity + " Litres " );
    }
}

class Car extends Vehicle {

    public Car(int speed, int fuelCapacity) {
        super(speed, fuelCapacity);
    }

    public void move() {
        super.move();
        System.out.println("...using wheels...");
    }
}

class Bicycle extends Vehicle {

    public Bicycle(int speed, int fuelCapacity) {
        super(speed, fuelCapacity);
    }

    public void move() {
        super.move();
        System.out.println("...using pedals...");
    }
}
public class Main1 {

    public static void main(String[] args) {

        Car car = new Car(60, 30);
        Bicycle bicycle = new Bicycle(20, 0); 

        car.move();
        bicycle.move();
    }
}
