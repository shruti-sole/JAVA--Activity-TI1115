// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// Derived class
class Car extends Vehicle {
    void honk() {
        System.out.println("Car honks");
    }
}

// Further derived class
class SportsCar extends Car {
    void speed() {
        System.out.println("Sports car goes fast");
    }
}

// Main class
 class activity{
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.start(); // From Vehicle
        sportsCar.honk();  // From Car
        sportsCar.speed(); // From SportsCar
    }
}

