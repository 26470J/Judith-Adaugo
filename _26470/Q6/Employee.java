package Id_26470.Q6;

public class Employee extends Department {
    private int employeeID;     // >=1000
    private String fullName;
    private String position;
    private double baseSalary;  // >0
    private boolean rssbRegistered;

    public Employee() { super(); }

    public Employee(int id, String createdDate, String updatedDate,
                    String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName);
        setEmployeeID(employeeID);
        setFullName(fullName);
        setPosition(position);
        setBaseSalary(baseSalary);
        setRssbRegistered(rssbRegistered);
    }

    public int getEmployeeID() { return employeeID; }
    public void setEmployeeID(int employeeID) throws PayrollDataException {
        if (employeeID < 1000) throw new PayrollDataException("employeeID must be >= 1000");
        this.employeeID = employeeID;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) throws PayrollDataException {
        if (fullName == null || fullName.trim().isEmpty())
            throw new PayrollDataException("fullName cannot be empty");
        this.fullName = fullName;
    }

    public String getPosition() { return position; }
    public void setPosition(String position) throws PayrollDataException {
        if (position == null || position.trim().isEmpty())
            throw new PayrollDataException("position cannot be empty");
        this.position = position;
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) throws PayrollDataException {
        if (baseSalary <= 0) throw new PayrollDataException("baseSalary must be > 0");
        this.baseSalary = baseSalary;
    }

    public boolean isRssbRegistered() { return rssbRegistered; }
    public void setRssbRegistered(boolean rssbRegistered) { this.rssbRegistered = rssbRegistered; }
}
