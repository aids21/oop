abstract class Vehicle
{
abstract void startEngine();
abstract void fuelType();
abstract void speedLimit();

void stopEngine()
{
System.out.println("Engine stopped safely.");
}

void vehicleInfo(String name, int wheels)
{
System.out.println("Vehicle Name: " + name);
System.out.println("Number of wheels: " + wheels);
}
}

class Car extends Vehicle
{
void startEngine()
{
System.out.println("Car engine started with key.");
}

void fuelType()
{
System.out.println("Car runs on petrol or diesel.");
}

void speedLimit()
{
System.out.println("Maximum speed of the car is 180 km/h.");
}

void airConditioning()
{
System.out.println("Air Conditioning is ON.");
}
}

class Bike extends Vehicle
{
void startEngine()
{
System.out.println("Bike engine started with kick or electric start.");
}

void fuelType()
{
System.out.println("Bike runs on petrol.");
}

void speedLimit()
{
System.out.println("Maximum speed of the bike is 120 km/h.");
}

void helmetRequired()
{
System.out.println("Helmet is mandatory for safety.");
}
}

public class AbstractClassDemo
{
public static void main(String[] args)
{
System.out.println("=== Car Details ===");

Vehicle myCar = new Car();

myCar.vehicleInfo("Honda City", 4);
myCar.startEngine();
myCar.fuelType();
myCar.speedLimit();
myCar.stopEngine();

((Car) myCar).airConditioning();

System.out.println("\n=== Bike Details ===");

Vehicle myBike = new Bike();

myBike.vehicleInfo("Royal Enfield", 2);
myBike.startEngine();
myBike.fuelType();
myBike.speedLimit();
myBike.stopEngine();

((Bike) myBike).helmetRequired();
}
}