package Id_26470.Q1;

public class Sale extends Purchase{
    private String saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName,
                String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable,
                int reorderLevel, String purchaseDate, int purchasedQuantity, String saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity);
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        if (saleDate == null) throw new IllegalArgumentException("Sale date cannot be null.");
        this.saleDate = saleDate;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity <= 0)throw new IllegalArgumentException("Sold quantity must be greater than 0.");

        this.soldQuantity = soldQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
