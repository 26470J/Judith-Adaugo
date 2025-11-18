package Id_26470.Q6;

public class Allowance extends Deduction {
    private double overtimeHours; // >=0
    private double overtimeRate;  // >=0
    private double bonus;         // >=0

    public Allowance() { super(); }

    public double getOvertimeHours() { return overtimeHours; }
    public void setOvertimeHours(double overtimeHours) throws PayrollDataException {
        if (overtimeHours < 0) throw new PayrollDataException("overtimeHours cannot be negative");
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() { return overtimeRate; }
    public void setOvertimeRate(double overtimeRate) throws PayrollDataException {
        if (overtimeRate < 0) throw new PayrollDataException("overtimeRate cannot be negative");
        this.overtimeRate = overtimeRate;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) throws PayrollDataException {
        if (bonus < 0) throw new PayrollDataException("bonus cannot be negative");
        this.bonus = bonus;
    }

    // convenience: compute overtime pay
    public double computeOvertimePay() {
        return overtimeHours * overtimeRate;
    }
}
