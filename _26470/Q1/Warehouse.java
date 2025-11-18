package Id_26470.Q1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String phone;

    public Warehouse(int id, String createdDate, String updatedDate, String warehouseName, String location, String phone) {
        super(id, createdDate, updatedDate);
        this.warehouseName = warehouseName;
        this.location = location;
        this.phone = phone;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        if (warehouseName == null || warehouseName.trim().isEmpty()) throw new IllegalArgumentException("Warehouse name cannot be empty.");
        this.warehouseName = warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}"))throw new IllegalArgumentException("Phone must be a 10-digit number.");
        this.phone = phone;
    }
}
