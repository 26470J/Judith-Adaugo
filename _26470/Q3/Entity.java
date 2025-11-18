package Id_26470.Q3;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;


    public Entity(int id, String createdDate, String updatedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public void setId(int id) throws TaxDataException {
        if (id <= 0) throw new TaxDataException("id must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws TaxDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new TaxDataException("createdDate cannot be null/empty");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws TaxDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new TaxDataException("updatedDate cannot be null/empty");
        this.updatedDate = updatedDate;
    }
}
