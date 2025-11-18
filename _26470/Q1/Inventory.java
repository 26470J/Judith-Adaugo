package Id_26470.Q1;

public class Inventory extends Sale{
    private int totalItems;
    private double stockValue;


    public Inventory(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel,
                     String purchaseDate, int purchasedQuantity, String saleDate, int soldQuantity, String customerName, int totalItems, double stockValue) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, saleDate, soldQuantity, customerName);
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        if (totalItems < 0) throw new IllegalArgumentException("Total items cannot be negative.");
        this.totalItems = totalItems;
    }

    public double getStockValue() {
        return stockValue;
    }

    public void setStockValue(double stockValue) {
        if (stockValue < 0) throw new IllegalArgumentException("Stock value cannot be negative.");

        this.stockValue = stockValue;
    }
}
