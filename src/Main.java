public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("велосипед",2);
        Car car = new Car(" автомобиль ", 4);
        Truck truck = new Truck(" грузовик ", 8);
        ServiceStation serviceStation = new ServiceStation();

        System.out.println(" диагностика велосипеда : ");
        serviceStation.check(bicycle);
        System.out.println();

        System.out.println(" диагностика автомобиля : ");
        serviceStation.check(car);
        System.out.println();

        System.out.println(" диагностика грузовика : ");
        serviceStation.check(truck);

    }
}