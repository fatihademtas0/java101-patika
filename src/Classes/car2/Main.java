package Classes.car2;

public class Main {
    public static void main(String[] args) {
        Car2 audi = new Car2();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);

        Car2 bmw = new Car2();
        bmw.speed = 25;
        System.out.println("Bmw Hızı : " + bmw.speed);

        Car2 mercedes = new Car2();
        mercedes.speed = 30;
        System.out.println("Mercedes Hızı : " + mercedes.speed);
    }
}
