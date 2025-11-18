package Id_26470.Q3;

public class TaxAssessment extends TaxDeclaration{
    private String assessmentDate;
    private double assessedTax;

    public TaxAssessment(int id, String createdDate, String updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, String assessmentDate, double assessedTax) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome);
        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }
    public String getAssessmentDate() { return assessmentDate; }
    public void setAssessmentDate(String assessmentDate) throws TaxDataException {
        if (assessmentDate == null || assessmentDate.trim().isEmpty())
            throw new TaxDataException("assessmentDate cannot be empty");
        this.assessmentDate = assessmentDate;
    }

    public double getAssessedTax() { return assessedTax; }
    public void setAssessedTax(double assessedTax) throws TaxDataException {
        if (assessedTax < 0) throw new TaxDataException("assessedTax cannot be negative");
        this.assessedTax = assessedTax;
    }
}
