package Id_26470.Q6;
public class SalaryStructure extends PayrollPeriod {
    private double basicPay;           // >=0
    private double transportAllowance; // >=0
    private double housingAllowance;   // >=0

    public SalaryStructure() { super(); }

    public double getBasicPay() { return basicPay; }
    public void setBasicPay(double basicPay) throws PayrollDataException {
        if (basicPay < 0) throw new PayrollDataException("basicPay cannot be negative");
        this.basicPay = basicPay;
    }

    public double getTransportAllowance() { return transportAllowance; }
    public void setTransportAllowance(double transportAllowance) throws PayrollDataException {
        if (transportAllowance < 0) throw new PayrollDataException("transportAllowance cannot be negative");
        this.transportAllowance = transportAllowance;
    }

    public double getHousingAllowance() { return housingAllowance; }
    public void setHousingAllowance(double housingAllowance) throws PayrollDataException {
        if (housingAllowance < 0) throw new PayrollDataException("housingAllowance cannot be negative");
        this.housingAllowance = housingAllowance;
    }
}
