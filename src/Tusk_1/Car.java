package Tusk_1;

public class Car {
    int distance;

    public void start(){
        System.out.println("Car starts to drive");
    }

    public void stop(){
        System.out.println("Car is stopping now");
    }

    public int drive(int howLong){
        distance = howLong * 60;
        return distance;
    }
}
