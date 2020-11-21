import java.util.*;

public class Vehicle {

    // Attributes{color,
    // fuelCapacity,electric,automatic,voicecommand,AC,numberOfDoor}
    private String CarName;
    private String Color;
    private int fuelCapacity;
    private boolean isElectric;
    private boolean isAutomatic;
    private boolean hasVoiceCommand;
    private int numberOfDoors;
    private boolean hasAC;
    private Door leftDoor;
    private Door rightDoor;

    public static int NUMBER_OF_CARS = 0;

   
    // DEFAULT CONSTRUCTOR.
    public Vehicle() {
    	NUMBER_OF_CARS++;
    }

    // Constructor with parameters 
    public Vehicle(String name, String color, int capacity, int doors) {
        this.CarName = name;
        this.Color = color;
        this.fuelCapacity = capacity;
        this.numberOfDoors = doors;
        NUMBER_OF_CARS++;
    }

    // example Car taxi = new Car("Green",30,4,true);
    public Vehicle(String name, String color, int capacity, int doors, boolean electic) {
        this.CarName = name;
        this.Color = color;
        this.fuelCapacity = capacity;
        this.numberOfDoors = doors;
        this.isElectric = electic;
        NUMBER_OF_CARS++;
    }

    public Vehicle(String name, String color, int capacity, boolean electic, boolean automatic, boolean voiceCommand,
            int doors, boolean hasAC) {
        this.CarName = name;
        this.Color = color;
        this.fuelCapacity = capacity;
        this.numberOfDoors = doors;
        this.isElectric = electic;
        this.isAutomatic = automatic;
        this.hasVoiceCommand = voiceCommand;
        this.hasAC = hasAC;
        NUMBER_OF_CARS++;
    }

    // Getters and Setters
   

    public void setCarName(String name) {
        this.Color = name;
    }

    public String getCarName() {
        return this.CarName;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getColor() {
        return this.Color;
    }

    public void setFuelCapacity(int capacity) {
        this.fuelCapacity = capacity;
    }

    public int getFuelCapacity() {
        return this.fuelCapacity;
    }

    public void setisAutomatic(boolean automatic) {
        this.isAutomatic = automatic;
    }

    public boolean getisAutomatic() {
        return this.isAutomatic;
    }

    // Functions

    //  Function to return all the manual cars
    
    public static List<Vehicle> getAllManualCar(Vehicle[] inputCars) {

        List<Vehicle> manualCars = new ArrayList<>();

        for (int n = 0; n < inputCars.length; n++) {

            if (!inputCars[n].isAutomatic) {
                manualCars.add(inputCars[n]);
            }
        }
        return manualCars;
    }

   public void driveCar() {
      System.out.println(this.CarName + " has started driving");
    }

}