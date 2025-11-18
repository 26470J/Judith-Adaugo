package Id_26470.Q5;

import java.util.ArrayList;
import java.util.List;

public final class AttendanceSummary extends LeaveRequest {
    private String reportDate;
    private int totalPresent;
    private int totalAbsent;
    private int totalSessions;

    // store raw entries so we can display all inserted data
    private final List<String> attendanceEntries = new ArrayList<>();

    public AttendanceSummary(int id, String createdDate, String updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, String sessionDate, String topic, String sessionID, String status, String requestDate, String reason, boolean approved, String reportDate, int totalPresent, int totalAbsent, int totalSessions) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, sessionID, status, requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
        this.totalSessions = totalSessions;
    }

    public String getReportDate() { return reportDate; }
    public void setReportDate(String reportDate) throws AttendanceDataException {
        if (reportDate == null || reportDate.trim().isEmpty())
            throw new AttendanceDataException("reportDate cannot be empty");
        this.reportDate = reportDate;
    }

    public int getTotalPresent() { return totalPresent; }
    public int getTotalAbsent() { return totalAbsent; }
    public int getTotalSessions() { return totalSessions; }

    // add a recorded attendance entry (studentID, sessionID, status)
    public void addAttendanceEntry(String studentID, String sessionID, String status) throws AttendanceDataException {
        if (studentID == null || studentID.trim().isEmpty())
            throw new AttendanceDataException("studentID cannot be empty for attendance entry");
        if (sessionID == null || sessionID.trim().isEmpty())
            throw new AttendanceDataException("sessionID cannot be empty for attendance entry");
        if (status == null) throw new AttendanceDataException("status cannot be null");
        String s = status.trim();
        if (!s.equalsIgnoreCase("Present") && !s.equalsIgnoreCase("Absent"))
            throw new AttendanceDataException("status must be 'Present' or 'Absent'");

        // normalize status
        String normalized = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        attendanceEntries.add("StudentID: " + studentID + " | SessionID: " + sessionID + " | Status: " + normalized);

        // update totals
        totalSessions++;
        if (normalized.equals("Present")) totalPresent++;
        else totalAbsent++;
    }

    // generateSummary: returns percentage present (totalPresent / totalSessions * 100)
    public double generateSummary() throws AttendanceDataException {
        if (totalSessions == 0) throw new AttendanceDataException("No attendance records to summarize");
        return ((double) totalPresent / (double) totalSessions) * 100.0;
    }

    // returns a copy of entries for display
    public List<String> getAttendanceEntries() {
        return new ArrayList<>(attendanceEntries);
    }

    public void displayAllData() {

    }
}
