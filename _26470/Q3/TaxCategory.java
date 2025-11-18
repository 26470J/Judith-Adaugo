package Id_26470.Q3;

public class TaxCategory extends TaxAuthority{
    private String categoryName;
    private double rate; // > 0
    private String code; // >= 3 chars


    public TaxCategory(int id, String createdDate, String updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }
    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) throws TaxDataException {
        if (categoryName == null || categoryName.trim().isEmpty())
            throw new TaxDataException("categoryName cannot be empty");
        this.categoryName = categoryName;
    }

    public double getRate() { return rate; }
    public void setRate(double rate) throws TaxDataException {
        if (rate <= 0) throw new TaxDataException("rate must be > 0");
        this.rate = rate;
    }

    public String getCode() { return code; }
    public void setCode(String code) throws TaxDataException {
        if (code == null || code.trim().length() < 3)
            throw new TaxDataException("code must be at least 3 characters");
        this.code = code;
    }
}
