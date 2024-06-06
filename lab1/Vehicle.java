package lab1;

public class Vehicle {
    private String make;
    private String year;

    public String getMake(){
        return make;
    }
    public String getYear(){
        return year;
    }

    Vehicle(String make, String year){
        this.make = make;
        this.year = year;
    }
    void print_info(){
        System.out.println("Make: "+getMake());
        System.out.println("Year: "+getYear());
    }
}
class Car extends Vehicle{
    String model;
    int numDoors;
    Car(String make,String year,String model,int numDoors){
        super(make,year);
        this.model = model;
        this.numDoors = numDoors;
    }
    @Override
    void print_info(){
        super.print_info();
        System.out.println("Model: "+model);
        System.out.println("Number of Doors: "+numDoors);
    }
    void accelerate(){
        System.out.println("Car is accelerating!");
        System.out.println();
    }
}
class Main{
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle("Honda","1969");
        vehicle.print_info();
        System.out.println();
        Car car = new Car("Toyota","1990","Camry",4);
        car.print_info();
        car.accelerate();
        Car car2 = new Car("Ford","1999","Focus",4);
        car2.print_info();
        car2.accelerate();
    }
}