package Id_26470.Q4;

public class Supplier extends Department{
    private String supplierName;
    private String supplierTIN; // 9 digits
    private String contact;     // phone 10 digits

    public String getSupplierName() { return supplierName; }
    public void setSupplierName(String supplierName) throws ProcurementDataException {
        if (supplierName == null || supplierName.trim().isEmpty())
            throw new ProcurementDataException("supplierName cannot be empty");
        this.supplierName = supplierName;
    }

    public String getSupplierTIN() { return supplierTIN; }
    public void setSupplierTIN(String supplierTIN) throws ProcurementDataException {
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}"))
            throw new ProcurementDataException("supplierTIN must be exactly 9 digits");
        this.supplierTIN = supplierTIN;
    }

    public String getContact() { return contact; }
    public void setContact(String contact) throws ProcurementDataException {
        if (contact == null || !contact.matches("\\d{10}"))
            throw new ProcurementDataException("supplier contact must be 10 digits");
        this.contact = contact;
    }
}
