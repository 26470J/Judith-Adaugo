package Id_26470.Q4;

public class Department extends Organization{
    private String deptName;
    private String deptCode; // alphanumeric, >=3 chars

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) throws ProcurementDataException {
        if (deptName == null || deptName.trim().isEmpty())
            throw new ProcurementDataException("deptName cannot be empty");
        this.deptName = deptName;
    }

    public String getDeptCode() { return deptCode; }
    public void setDeptCode(String deptCode) throws ProcurementDataException {
        if (deptCode == null || deptCode.trim().length() < 3)
            throw new ProcurementDataException("deptCode must be at least 3 characters");
        if (!deptCode.matches("[a-zA-Z0-9]+"))
            throw new ProcurementDataException("deptCode must be alphanumeric");
        this.deptCode = deptCode;
    }
}
