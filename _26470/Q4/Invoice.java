package Id_26470.Q4;

public class Invoice extends Inspection{
    private String invoiceNo;
    private double invoiceAmount; // >0

    public String getInvoiceNo() { return invoiceNo; }
    public void setInvoiceNo(String invoiceNo) throws ProcurementDataException {
        if (invoiceNo == null || invoiceNo.trim().isEmpty())
            throw new ProcurementDataException("invoiceNo cannot be empty");
        this.invoiceNo = invoiceNo;
    }

    public double getInvoiceAmount() { return invoiceAmount; }
    public void setInvoiceAmount(double invoiceAmount) throws ProcurementDataException {
        if (invoiceAmount <= 0) throw new ProcurementDataException("invoiceAmount must be > 0");
        this.invoiceAmount = invoiceAmount;
    }
}
