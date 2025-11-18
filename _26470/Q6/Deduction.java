package Id_26470.Q6;

public class Deduction extends SalaryStructure {
    private double rssbContribution; // = 5% of basicPay
    private double payeTax;          // >=0
    private double loanDeduction;    // >=0

    public Deduction() { super(); }

    // compute RSSB from basic pay
    public void computeRssb() throws PayrollDataException {
        double basic = getBasicPay();
        if (basic < 0) throw new PayrollDataException("basicPay must be set before computing RSSB");
        this.rssbContribution = round2(basic * 0.05);
    }

    public double getRssbContribution() { return rssbContribution; }

    public double getPayeTax() { return payeTax; }
    public void setPayeTax(double payeTax) throws PayrollDataException {
        if (payeTax < 0) throw new PayrollDataException("payeTax cannot be negative");
        this.payeTax = payeTax;
    }

    public double getLoanDeduction() { return loanDeduction; }
    public void setLoanDeduction(double loanDeduction) throws PayrollDataException {
        if (loanDeduction < 0) throw new PayrollDataException("loanDeduction cannot be negative");
        this.loanDeduction = loanDeduction;
    }

    private double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }
}
