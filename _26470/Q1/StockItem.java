package Id_26470.Q1;

public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone,
                     String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit);
        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable < 0) throw new IllegalArgumentException("Quantity available cannot be negative.");
        this.quantityAvailable = quantityAvailable;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel < 0) throw new IllegalArgumentException("Reorder level cannot be negative.");
        this.reorderLevel = reorderLevel;
    }
}
