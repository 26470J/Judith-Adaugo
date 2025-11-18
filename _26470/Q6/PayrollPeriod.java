package Id_26470.Q6;

public class PayrollPeriod extends Employee {
    private int month; // 1-12
    private int year;  // >=2000
    private String startDate;
    private String endDate;

    public PayrollPeriod() { super(); }

    public int getMonth() { return month; }
    public void setMonth(int month) throws PayrollDataException {
        if (month < 1 || month > 12) throw new PayrollDataException("month must be 1-12");
        this.month = month;
    }

    public int getYear() { return year; }
    public void setYear(int year) throws PayrollDataException {
        if (year < 2000) throw new PayrollDataException("year must be >= 2000");
        this.year = year;
    }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) throws PayrollDataException {
        if (startDate == null || startDate.trim().isEmpty())
            throw new PayrollDataException("startDate cannot be null/empty");
        this.startDate = startDate;
    }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) throws PayrollDataException {
        if (endDate == null || endDate.trim().isEmpty())
            throw new PayrollDataException("endDate cannot be null/empty");
        this.endDate = endDate;
    }
}
