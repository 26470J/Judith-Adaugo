package Id_26470.Q4;

import java.util.ArrayList;
import java.util.List;

public class ProcurementReport extends Invoice{
    private final Entity entity = new Entity();
    private final Organization organization = new Organization();
    private final Department department = new Department();
    private final Supplier supplier = new Supplier();
    private final Product product = new Product();
    private final PurchaseOrder purchaseOrder = new PurchaseOrder();
    private final Delivery delivery = new Delivery();
    private final Inspection inspection = new Inspection();
    private final List<Invoice> invoices = new ArrayList<>();

    private String reportDate;
    private String summary;

    public Entity getEntity() { return entity; }
    public Organization getOrganization() { return organization; }
    public Department getDepartment() { return department; }
    public Supplier getSupplier() { return supplier; }
    public Product getProduct() { return product; }
    public PurchaseOrder getPurchaseOrder() { return purchaseOrder; }
    public Delivery getDelivery() { return delivery; }
    public Inspection getInspection() { return inspection; }
    public List<Invoice> getInvoices() { return invoices; }

    public String getReportDate() { return reportDate; }
    public void setReportDate(String reportDate) throws ProcurementDataException {
        if (reportDate == null || reportDate.trim().isEmpty())
            throw new ProcurementDataException("reportDate cannot be empty");
        this.reportDate = reportDate;
    }

    public String getSummary() { return summary; }
    public void setSummary(String summary) throws ProcurementDataException {
        if (summary == null) summary = "";
        this.summary = summary;
    }

    // calculateTotal(): sum of all invoice amounts
    public double calculateTotal() {
        double sum = 0;
        for (Invoice inv : invoices) {
            sum += inv.getInvoiceAmount();
        }
        return sum;
    }
}
