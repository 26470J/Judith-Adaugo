package Id_26470.Q5;

public class AttendanceRecord extends ClassSession {
    private String sessionID;
    private String status; // Present or Absent

    public AttendanceRecord(int id, String createdDate, String updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, String sessionDate, String topic, String sessionID, String status) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic);
        this.sessionID = sessionID;
        this.status = status;
    }

    public String getSessionID() { return sessionID; }
    public void setSessionID(String sessionID) throws AttendanceDataException {
        if (sessionID == null || sessionID.trim().isEmpty())
            throw new AttendanceDataException("sessionID cannot be empty");
        this.sessionID = sessionID;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) throws AttendanceDataException {
        if (status == null) throw new AttendanceDataException("status cannot be null");
        String s = status.trim();
        if (!s.equalsIgnoreCase("Present") && !s.equalsIgnoreCase("Absent"))
            throw new AttendanceDataException("status must be 'Present' or 'Absent'");
        this.status = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
