package Id_26470.Q2;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;


    public Entity(int id, String createdDate, String updatedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID must be greater than 0");
        this.id = id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        if (createdDate == null)
            throw new IllegalArgumentException("Dates cannot be null");

        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        if (updatedDate == null)
            throw new IllegalArgumentException("Dates cannot be null");
        this.updatedDate = updatedDate;
    }
}
