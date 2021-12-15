public class Car {
    private String model;
    private String manufacturer;
    private int yearManufactured;
    private double price;

    public Car(String mo, String ma, int year, double pr) {
        model = mo;
        manufacturer = ma;
        yearManufactured = year;
        price = pr;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return yearManufactured;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return ("Mode: " + model + "\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Year Manufactured: " + yearManufactured + "\n" +
                "Price: " + price + "\n");
    }
}