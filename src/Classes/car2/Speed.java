package Classes.car2;

public class Speed {
    public static void main(String[] args) {
        Car2 audi = new Car2();
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        Car2 bmw = new Car2();
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printSpeed();

        Car2 mercedes = new Car2();
        mercedes.speed = 20;
        mercedes.printSpeed();
    }
}
