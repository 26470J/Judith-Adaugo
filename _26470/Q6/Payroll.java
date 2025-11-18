package Id_26470.Q6;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll() { super(); }

    // compute gross and net given current structure
    public void computePayroll() throws PayrollDataException {
        double basic = getBasicPay();
        if (basic < 0) throw new PayrollDataException("basicPay must be set");
        double allowances = getTransportAllowance() + getHousingAllowance() + computeOvertimePay() + getBonus();
        this.grossSalary = round2(basic + allowances);

        // ensure RSSB computed
        computeRssb();

        // if PAYE not set, compute a default PAYE as 10% of basic (simple rule)
        if (getPayeTax() == 0) {
            setPayeTax(round2(basic * 0.10));
        }

        this.totalDeductions = round2(getRssbContribution() + getPayeTax() + getLoanDeduction());
        this.netSalary = round2(grossSalary - totalDeductions);
        if (netSalary < 0) netSalary = 0;
    }

    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }

    private double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }
}
