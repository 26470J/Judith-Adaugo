package Id_26470.Q4;

public class PurchaseOrder extends Product{
    private String poNumber;
    private String orderDate;
    private double totalAmount; // >0

    public String getPoNumber() { return poNumber; }
    public void setPoNumber(String poNumber) throws ProcurementDataException {
        if (poNumber == null || poNumber.trim().isEmpty())
            throw new ProcurementDataException("poNumber cannot be empty");
        this.poNumber = poNumber;
    }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) throws ProcurementDataException {
        if (orderDate == null || orderDate.trim().isEmpty())
            throw new ProcurementDataException("orderDate cannot be empty");
        this.orderDate = orderDate;
    }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) throws ProcurementDataException {
        if (totalAmount <= 0) throw new ProcurementDataException("totalAmount must be > 0");
        this.totalAmount = totalAmount;
    }
}
