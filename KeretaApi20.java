public class KeretaApi20 {
    private String name;
    private int speed;
    private int numberOfCars;

    // Constructor
    public KeretaApi20(String name, int speed, int numberOfCars) {
        this.name = name;
        this.speed = speed;
        this.numberOfCars = numberOfCars;
    }

    // Method to increase speed
    public void increaseSpeed(int increment) {
        this.speed += increment;
    }

    // Method to decrease speed
    public void decreaseSpeed(int decrement) {
        this.speed -= decrement;
    }

    // Method to add cars
    public void addCars(int newCars) {
        this.numberOfCars += newCars;
    }

    // Method to display train details
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Speed: " + this.speed);
        System.out.println("Number of Kereta Api: " + this.numberOfCars);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Create 10 KeretaApi objects with different names, speeds, and number of cars
        KeretaApi[] trains = new KeretaApi[10];
        trains[0] = new KeretaApi20("Express 1", 80, 10);
        trains[1] = new KeretaApi20("Rapid Transit", 90, 12);
        trains[2] = new KeretaApi20("Super Train", 100, 15);
        trains[3] = new KeretaApi20("Speedster", 85, 8);
        trains[4] = new KeretaApi20("Highspeed Line", 110, 20);
        trains[5] = new KeretaApi20("Commuter", 70, 9);
        trains[6] = new KeretaApi20("Intercity", 95, 14);
        trains[7] = new KeretaApi20("City Express", 88, 11);
        trains[8] = new KeretaApi20("Long Haul", 105, 18);
        trains[9] = new KeretaApi20("Metro Line", 75, 13);

        // Manipulate each train
        for (KeretaApi train : trains) {
            train.increaseSpeed(10);
            train.addCars(2); // Add two more cars
            train.displayInfo();
        }
    }
}
