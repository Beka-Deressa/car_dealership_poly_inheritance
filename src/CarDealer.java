import java.sql.SQLOutput;
import java.util.ArrayList;
public class CarDealer {
    private ArrayList<Car> inventory;

    public CarDealer(){
        inventory = new ArrayList<Car>();
    }
    public void addCar(Car car){
        this.inventory.add(car);
    }
    public void sellCar(Car car){
        this.inventory.remove(car);
    }

    public int getInventoryCount(){
        return inventory.size();

    }
    public static void main(String[] args){
        CarDealer Dealer = new CarDealer();
        Sedan sedan = new Sedan("Tesla", "ModelS", 80000.0, true);

        SUV suv = new SUV("Cadillac", "Escalade", 90000.0, false);

        Dealer.addCar(sedan);
        Dealer.addCar(suv);

        System.out.println(sedan.isElectric());
        System.out.println(suv.isElectric());
        System.out.println(Dealer.inventory);

        System.out.println( "Car Inventory: " + Dealer.getInventoryCount());

        Dealer.sellCar(sedan);
        System.out.println("Car Inventory: " + Dealer.getInventoryCount());


    }
}
