class Car {
    int no_of_seats;
    String brand;

    Car() {
        System.out.println("I am a car");
    }

    Car(int no_of_seats, String brand) {
        this.no_of_seats = no_of_seats;
        this.brand = brand;
    }
}

class Tata extends Car {
    String model;
    int price;
    int kms;
    int fuel;

    Tata() {
        System.out.println("I am a Tata");
    }

    Tata(int no_of_seats, String brand, String model, int price, int kms, int fuel) {
        super(no_of_seats, brand);
        this.model = model;
        this.price = price;
        this.kms = kms;
        this.fuel = fuel;
    }

    void mileage() {
        System.out.println("Mileage is:"+kms / fuel);
    }
}

class Punch extends Tata {
    String color;

    Punch() {
        System.out.println("I am a Punch");
    }

    Punch(int no_of_seats, String brand, String model, int price, int kms, int fuel, String color) {
        super(no_of_seats, brand, model, price, kms, fuel);
        this.color = color;
    }

    void mileage() {
        System.out.println("Mileage is:"+kms / fuel);
    }
}

public class Nano extends Punch {
    public static void main(String[] args) {
        Nano n = new Nano(5, "Tata", "Sedan", 10000000, 300, 16, "Green", "Good");
        n.getDetails();
    }
    String performance;

    Nano() {
        System.out.println("I am a Nano");
    }

    Nano(int no_of_seats, String brand, String models, int price, int kms, int fuel, String color, String performance) {
        super(no_of_seats, brand, models, price, kms, fuel, color);
        this.performance = performance;
    }
    public void getDetails() {
        System.out.println("NO OF SEATS:" + no_of_seats);
        System.out.println("BRAND:" + brand);
        System.out.println("MODEL:" + model);
        System.out.println("PRICE:" + price);
        System.out.println("COLOR:" + color);
        System.out.println("PERFORMANCE:" + performance);
        mileage();
    }

    void mileage() {
        System.out.println("Mileage is:"+kms / fuel);
    }
}
