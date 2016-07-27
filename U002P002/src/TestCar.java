/**
 * Created by mqc647 on 26.07.2016.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new JamesBondCar();

        car1.color = "Blue";
        car2.color = "Red";

        System.out.println("I've painted the cars.");
        System.out.println("The color of car1 is " + car1.color);
        System.out.println("The color of car2 is " + car2.color);
    }
}
