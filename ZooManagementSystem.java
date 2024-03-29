class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}

class Monkey extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Ooh ooh ah ah!");
    }
}

public class ZooManagementSystem {
    public static void main(String[] args) {
        Animal Animal = new Animal();
        Lion lion = new Lion();
        Monkey monkey = new Monkey();

        Animal.makeSound();
        lion.makeSound();
        monkey.makeSound();
    }
}