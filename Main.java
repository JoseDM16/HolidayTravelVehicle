public class Main {
    public static void main(String[] args) {
        //Vehicle test
        String make = "Audi";
        String model = "R8";
        int year = 2020;
        int serialNumber = 123456;
        String manufacturer = "Toyota Motor Corporation";
        int baseCost = 20000;
        String saleStatus = "sold";

        //New vehicle
        Vehicle myVehicle = new Vehicle(make, model, year, serialNumber, manufacturer, baseCost, saleStatus);

        //Vehicle information
        myVehicle.printInfo();
    }
}