package Id_26470.Q6;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department() { super(); }

    public Department(int id, String createdDate, String updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        setDeptName(deptName);
        setDeptCode(deptCode);
        setManagerName(managerName);
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) throws PayrollDataException {
        if (deptName == null || deptName.trim().isEmpty())
            throw new PayrollDataException("deptName cannot be empty");
        this.deptName = deptName;
    }

    public String getDeptCode() { return deptCode; }
    public void setDeptCode(String deptCode) throws PayrollDataException {
        if (deptCode == null || deptCode.trim().length() < 3)
            throw new PayrollDataException("deptCode must be at least 3 characters");
        this.deptCode = deptCode;
    }

    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) throws PayrollDataException {
        if (managerName == null || managerName.trim().isEmpty())
            throw new PayrollDataException("managerName cannot be empty");
        this.managerName = managerName;
    }
}
