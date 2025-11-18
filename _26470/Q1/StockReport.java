package Id_26470.Q1;

public class StockReport extends Inventory{
    private String reportDate;
    private String remarks;

    public StockReport(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable, int reorderLevel, String purchaseDate, int purchasedQuantity, String saleDate, int soldQuantity, String customerName, int totalItems, double stockValue, String reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, saleDate, soldQuantity, customerName, totalItems, stockValue);
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {

        this.reportDate = reportDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    //method:

    public void generateReport() {

        String id = "26470";

        System.out.println("----- STOCK REPORT -----" + " _ " + id);
        System.out.println("Report Date: " + reportDate + " _ " + id);
        System.out.println("Product: " + getProductName() + " _ " + id);
        System.out.println("Total Items: " + getTotalItems() + " _ " + id);
        System.out.println("Stock Value: " + getStockValue() + " _ " + id);
        System.out.println("Remarks: " + remarks + " _ " + id);
    }
}
