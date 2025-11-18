package Id_26470.Q1;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String phone,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, phone);
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || categoryCode.length() < 3) throw new IllegalArgumentException("Category code must be 3+ characters.");

        if (!categoryCode.matches("[a-zA-Z0-9]+")) throw new IllegalArgumentException("Category code must be alphanumeric.");
        this.categoryCode = categoryCode;
    }
}
