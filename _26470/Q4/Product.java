package Id_26470.Q4;

public class Product extends Supplier{
    private String productName;
    private double unitPrice; // >0
    private int quantity;     // >=0

    public String getProductName() { return productName; }
    public void setProductName(String productName) throws ProcurementDataException {
        if (productName == null || productName.trim().isEmpty())
            throw new ProcurementDataException("productName cannot be empty");
        this.productName = productName;
    }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) throws ProcurementDataException {
        if (unitPrice <= 0) throw new ProcurementDataException("unitPrice must be > 0");
        this.unitPrice = unitPrice;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) throws ProcurementDataException {
        if (quantity < 0) throw new ProcurementDataException("quantity cannot be negative");
        this.quantity = quantity;
    }
}
