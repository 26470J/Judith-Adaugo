package Id_26470.Q4;

public class Delivery extends PurchaseOrder{
    private String deliveryDate;
    private String deliveredBy;

    public String getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(String deliveryDate) throws ProcurementDataException {
        if (deliveryDate == null || deliveryDate.trim().isEmpty())
            throw new ProcurementDataException("deliveryDate cannot be empty");
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveredBy() { return deliveredBy; }
    public void setDeliveredBy(String deliveredBy) throws ProcurementDataException {
        if (deliveredBy == null || deliveredBy.trim().isEmpty())
            throw new ProcurementDataException("deliveredBy cannot be empty");
        this.deliveredBy = deliveredBy;
    }
}
