package Id_26470.Q3;

public class TaxRecord extends Payment{
    private String receiptNo;
    private double totalTax;
    private double credits;


    public TaxRecord(int id, String createdDate, String updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, String assessmentDate, double assessedTax, String paymentDate, double paymentAmount, String receiptNo, double totalTax, double credits) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
        this.credits = credits;
    }

    public String getReceiptNo() { return receiptNo; }
    public void setReceiptNo(String receiptNo) throws TaxDataException {
        if (receiptNo == null || receiptNo.trim().isEmpty())
            throw new TaxDataException("receiptNo cannot be empty");
        this.receiptNo = receiptNo;
    }

    public double getTotalTax() { return totalTax; }

    public void setTotalTax(double totalTax) throws TaxDataException{
        this.totalTax = totalTax;
    }

    public double getCredits() { return credits; }
    public void setCredits(double credits) throws TaxDataException {
        if (credits < 0) throw new TaxDataException("credits cannot be negative");
        this.credits = credits;
    }

    public double computeTax() throws TaxDataException {
        double salary = getSalary();
        double rate = getRate();
        if (rate <= 0) throw new TaxDataException("tax rate must be > 0 to compute tax");
        double computed = (salary * rate) - credits;
        if (computed < 0) computed = 0;
        this.totalTax = computed;
        return salary;
    }
}
