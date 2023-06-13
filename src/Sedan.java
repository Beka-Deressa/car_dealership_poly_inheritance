public class Sedan extends Car{
 private boolean electric;


    public Sedan(String make, String model, double price, boolean electric){
        super(make, model, price);
        this.electric = electric;

    }
    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        electric = electric;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "electric = " + electric +
                " make = " + getMake() +
                " model = " + getModel() +
                " price = " + getPrice();
    }
}
