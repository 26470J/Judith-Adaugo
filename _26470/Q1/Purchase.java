package Id_26470.Q1;

public class Purchase extends StockItem{
    private String purchaseDate;
    private int purchasedQuantity;

    public Purchase(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone,
                    String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName,
                    double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel, String purchaseDate, int purchasedQuantity) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        if (purchaseDate == null) throw new IllegalArgumentException("Purchase date cannot be null.");
        this.purchaseDate = purchaseDate;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0)throw new IllegalArgumentException("Purchased quantity must be greater than 0.");

        this.purchasedQuantity = purchasedQuantity;
    }
}
