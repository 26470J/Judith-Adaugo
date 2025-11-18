package Id_26470.Q4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;




    public int getId() { return id; }
    public void setId(int id) throws ProcurementDataException {
        if (id <= 0) throw new ProcurementDataException("id must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws ProcurementDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new ProcurementDataException("createdDate cannot be null/empty");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws ProcurementDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new ProcurementDataException("updatedDate cannot be null/empty");
        this.updatedDate = updatedDate;
    }
}
