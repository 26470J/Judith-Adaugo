package Id_26470.Q4;

public class Inspection extends Delivery{
    private String inspectorName;
    private String status; // Passed/Failed
    private String remarks;

    public String getInspectorName() { return inspectorName; }
    public void setInspectorName(String inspectorName) throws ProcurementDataException {
        if (inspectorName == null || inspectorName.trim().isEmpty())
            throw new ProcurementDataException("inspectorName cannot be empty");
        this.inspectorName = inspectorName;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) throws ProcurementDataException {
        if (status == null) throw new ProcurementDataException("status cannot be null");
        String s = status.trim();
        if (!s.equalsIgnoreCase("Passed") && !s.equalsIgnoreCase("Failed"))
            throw new ProcurementDataException("status must be 'Passed' or 'Failed'");
        this.status = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) throws ProcurementDataException {
        if (remarks == null) remarks = "";
        this.remarks = remarks;
    }
}
