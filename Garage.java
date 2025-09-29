class Car {
    // Private data fields
    private String brand;
    private String model;
    private int year;
    private double price;

    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }

    // Parameterized constructor (init all fields)
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to print car details
    public void printCar() {
        System.out.println("Brand: " + brand +
                ", Model: " + model +
                ", Year: " + year +
                ", Price: $" + price);
    }
}

public class Garage {
    public static void main(String[] args) {
        // Create array of 100 Cars
        Car[] garage = new Car[100];

        // Initialize all cars with different values
        for (int i = 0; i < garage.length; i++) {
            garage[i] = new Car("Brand" + (i + 1),
                    "Model" + (i + 1),
                    2000 + (i % 24),    // year between 2000–2023
                    10000 + (i * 500)); // price increments
        }

        // Print details of all cars
        for (Car c : garage) {
            c.printCar();
        }
    }
}
