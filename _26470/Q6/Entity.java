package Id_26470.Q6;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity() {}

    public Entity(int id, String createdDate, String updatedDate) throws PayrollDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("id must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws PayrollDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new PayrollDataException("createdDate cannot be null/empty");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws PayrollDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new PayrollDataException("updatedDate cannot be null/empty");
        this.updatedDate = updatedDate;
    }
}
