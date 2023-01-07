import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(200, "Ferrari");
        Engine engine1 = new Engine(1000, "Ford");
        Engine engine2 = new Engine(350, "Bugatti");

        Driver driver = new Driver("Леонов В.А.", 2);
        Driver driver1 = new Driver("Петров А.А", 10);
        Driver driver2 = new Driver("Николаев Ю.С.", 7);

        Car car = new Car("Ferrari", "super car", 2, engine, driver);
        Lorry lorry = new Lorry("Ford", "truck", 10, engine1, driver1, 25);
        SportCar sportCar = new SportCar("Bugatti", "sport car", 3, engine2, driver2, 350);

        car.start();
        car.stop();
        car.turnRight();
        car.turnLeft();

        System.out.println();
        System.out.println(car);
        System.out.println();
        System.out.println(lorry);
        System.out.println();
        System.out.println(sportCar);
    }
}
