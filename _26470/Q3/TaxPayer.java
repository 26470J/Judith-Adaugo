package Id_26470.Q3;

public class TaxPayer extends TaxCategory {
    private String tin; // 9 digits
    private String taxpayerName;
    private String address;


    public TaxPayer(int id, String createdDate, String updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) throws TaxDataException {
        if (tin == null || !tin.matches("\\d{9}"))
            throw new TaxDataException("TIN must be exactly 9 digits");
        this.tin = tin;
    }

    public String getTaxpayerName() {
        return taxpayerName;
    }

    public void setTaxpayerName(String taxpayerName) throws TaxDataException {
        if (taxpayerName == null || taxpayerName.trim().isEmpty())
            throw new TaxDataException("taxpayerName cannot be empty");
        this.taxpayerName = taxpayerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws TaxDataException {
        if (address == null || address.trim().isEmpty())
            throw new TaxDataException("address cannot be empty");
        this.address = address;
    }
}
