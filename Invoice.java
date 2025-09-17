public class Invoice{
    private String invoiceNumber;
    private String customerName;
    private int totalPrice;
    private int Taxes;
    private int vehicleSerialNumber;
    private String customerSignature;

    public Invoice(String invoiceNumber, String customerName, int totalPrice, int Taxes, int vehicleSerialNumber, String customerSignature) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.Taxes = Taxes;
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.customerSignature = customerSignature;
    }

    public void printInvoice() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Price: €" + totalPrice);
        System.out.println("Taxes: €" + Taxes);
        System.out.println("Vehicle Serial Number: " + vehicleSerialNumber);
        System.out.println("Customer Signature: " + customerSignature);
    }
}