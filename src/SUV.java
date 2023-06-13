public class SUV extends Car{
 private boolean electric;


    public SUV(String make, String model, double price, boolean electric){
        super(make, model ,price);
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
    return "SUV{" +
            "electric = " + electric +
            " make = " + getMake() +
            " model = " + getModel() +
            " price = " + getPrice();
    }

}
