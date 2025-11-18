package Id_26470.Q1;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String createdDate, String updatedDate,
                    String warehouseName, String location,
                    String phone, String categoryName, String categoryCode, String supplierName,
                    String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, phone, categoryName, categoryCode);
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        if (supplierEmail == null || !supplierEmail.contains("@")) throw new IllegalArgumentException("Invalid email.");
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}")) throw new IllegalArgumentException("Supplier phone must be 10 digits.");
        this.supplierPhone = supplierPhone;
    }
}
