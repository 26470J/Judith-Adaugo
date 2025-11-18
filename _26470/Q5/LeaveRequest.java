package Id_26470.Q5;

public class LeaveRequest extends AttendanceRecord {
    private String requestDate;
    private String reason;
    private boolean approved;

    public LeaveRequest(int id, String createdDate, String updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, String sessionDate, String topic, String sessionID, String status, String requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, sessionID, status);
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }

    public String getRequestDate() { return requestDate; }
    public void setRequestDate(String requestDate) throws AttendanceDataException {
        if (requestDate == null || requestDate.trim().isEmpty())
            throw new AttendanceDataException("requestDate cannot be empty");
        this.requestDate = requestDate;
    }

    public String getReason() { return reason; }
    public void setReason(String reason) throws AttendanceDataException {
        if (reason == null || reason.trim().isEmpty())
            throw new AttendanceDataException("reason cannot be empty");
        this.reason = reason;
    }

    public boolean isApproved() { return approved; }
    public void setApproved(boolean approved) { this.approved = approved; }
}
