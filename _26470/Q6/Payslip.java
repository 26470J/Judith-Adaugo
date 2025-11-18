package Id_26470.Q6;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private String issueDate;

    public Payslip() { super(); }

    public String getPayslipNumber() { return payslipNumber; }
    public void setPayslipNumber(String payslipNumber) throws PayrollDataException {
        if (payslipNumber == null || payslipNumber.trim().isEmpty())
            throw new PayrollDataException("payslipNumber cannot be empty");
        this.payslipNumber = payslipNumber;
    }

    public String getIssueDate() { return issueDate; }
    public void setIssueDate(String issueDate) throws PayrollDataException {
        if (issueDate == null || issueDate.trim().isEmpty())
            throw new PayrollDataException("issueDate cannot be empty");
        this.issueDate = issueDate;
    }


    public double generatePayslip() throws PayrollDataException {
        // compute everything
        computePayroll();
        return getNetSalary();
    }
}
