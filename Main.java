import java.util.List;

public class Main {

    private static final char[] NUMBER_OF_CARS = null;

	public static void main(String[] args) throws InterruptedException {

        Human Neymarlaj = new Human("Alhaji Abu Bakarr Turay", 24, "16/02/1996", "Male");
        Human Shaw = new Human(" Adama Shaw", 18, "17/09/2002", "Female");
        Human Rachael = new Human("Rachel Sesay", 23, "23/06/1997", "Female");
        Human Tamba = new Human("Tamba Yayah", 30, "20/08/1990", "Male");

        Neymarlaj.eat("Salad");
        Thread.sleep(4000);

        Shaw.sing("My heart will go on");
        Thread.sleep(4000);

        Human[] humans = { Neymarlaj, Shaw, Rachael, Tamba };

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getName());
        }

        // data type, variable name
         //Vehicle firstCar = new Vehicle("Sky Blue", 35, 2, true);
         Vehicle firstCar = new Vehicle();
        firstCar.setCarName("Range Rover Spot");
        firstCar.setColor("White");
        firstCar.setFuelCapacity(100);
        firstCar.setisAutomatic(true);

        Vehicle secondCar = new Vehicle("Second Car", "Red", 70, false, false, true, 2,
        true);
        Vehicle thirdCar = new Vehicle("Third Car", "Orange", 60, true, true, true, 4, true);
        Vehicle fourthCar = new Vehicle("Fourth Car", "Pink", 100, true, false, true, 2,
        true);
        Vehicle fifthCar = new Vehicle("Fifth Car", "Brown", 40, false, false, true, 4,
        true);

        fourthCar.setColor("Yellow");
        Vehicle[] carArray = { firstCar, secondCar, thirdCar, fourthCar, fifthCar };

        secondCar.driveCar();

        Thread.sleep(4000);

       thirdCar.driveCar();

        List<Vehicle> ourManualCars = Vehicle.getAllManualCar(carArray);

        for (int a = 0; a < ourManualCars.size(); a++) {
        System.out.println(ourManualCars.get(a).getCarName());
        System.out.println(ourManualCars.get(a).getColor());
        System.out.println(ourManualCars.get(a).getFuelCapacity());
        System.out.println(ourManualCars.get(a).getisAutomatic());
        System.out.println("\n");
        }

        System.out.println(Vehicle.NUMBER_OF_CARS);

        // To assign to the object we use the dot(.) operator
        firstCar.setColor("Sky Blue");
        firstCar.setFuelCapacity(100);

        int capacity = firstCar.getFuelCapacity();
        String color = firstCar.getColor();

        System.out.println("Color of the car is: " + color);
        System.out.println("Fuel capacity of the car is: " + capacity);

    }
}
