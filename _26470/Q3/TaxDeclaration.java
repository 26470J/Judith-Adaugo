package Id_26470.Q3;

public class TaxDeclaration extends Employee{
    private String declarationMonth; // e.g., 2025-01
    private double totalIncome;


    public TaxDeclaration(int id, String createdDate, String updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }
    public String getDeclarationMonth() { return declarationMonth; }
    public void setDeclarationMonth(String declarationMonth) throws TaxDataException {
        if (declarationMonth == null || declarationMonth.trim().isEmpty())
            throw new TaxDataException("declarationMonth cannot be empty");
        this.declarationMonth = declarationMonth;
    }

    public double getTotalIncome() { return totalIncome; }
    public void setTotalIncome(double totalIncome) throws TaxDataException {
        if (totalIncome < 0) throw new TaxDataException("totalIncome cannot be negative");
        this.totalIncome = totalIncome;
    }
}
