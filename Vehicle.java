public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int serialNumber;
    private String manufacturer;
    private int baseCost;
    private String saleStatus;

    public Vehicle(String make, String model, int year, int serialNumber, String manufacturer, int baseCost, String saleStatus) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
        this.saleStatus = saleStatus;
    }

    public void printInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: €" + baseCost);
        System.out.println("Sale Status: " + saleStatus);
    }
}