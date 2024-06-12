package Tusk_1;

public class CarOwner {
    public  static void main(String[] args){
        Car bibika = new Car();
        bibika.start();
        bibika.stop();
        System.out.println(bibika.drive(10) + " km.");
        System.out.println("JamesBondCar");
        JamesBondCar JBC = new JamesBondCar();
        JBC.start();
        JBC.stop();
        System.out.println(JBC.drive(10) + " km.");
    }
}
