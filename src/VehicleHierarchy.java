class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }

    public void stop() {
        System.out.println(brand + " vehicle is stopping.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Car extends Vehicle {
    int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public void openTrunk() {
        System.out.println(brand + " car trunk is open.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    public void popWheelie() {
        System.out.println(brand + " motorcycle is popping a wheelie!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

class Bicycle extends Vehicle {
    int gearCount;

    public Bicycle(String brand, int year, int gearCount) {
        super(brand, year);
        this.gearCount = gearCount;
    }

    public void ringBell() {
        System.out.println(brand + " bicycle bell rings: Ding ding!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gears: " + gearCount);
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Harley", 2020, true);
        Bicycle bicycle = new Bicycle("Giant", 2021, 18);

        System.out.println("=== Car Info ===");
        car.displayInfo();
        car.start();
        car.openTrunk();
        car.stop();

        System.out.println("\n=== Motorcycle Info ===");
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.popWheelie();
        motorcycle.stop();

        System.out.println("\n=== Bicycle Info ===");
        bicycle.displayInfo();
        bicycle.start();
        bicycle.ringBell();
        bicycle.stop();
    }
}
