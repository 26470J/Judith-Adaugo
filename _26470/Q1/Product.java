package Id_26470.Q1;

public class Product extends Supplier{
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, String createdDate, String updatedDate, String warehouseName,
                   String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail,
                   String supplierPhone, String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) throw new IllegalArgumentException("Unit price must be greater than 0.");
        this.unitPrice = unitPrice;
    }

    public int getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(int stockLimit) {
        if (stockLimit < 0)throw new IllegalArgumentException("Stock limit cannot be negative.");
        this.stockLimit = stockLimit;
    }
}
