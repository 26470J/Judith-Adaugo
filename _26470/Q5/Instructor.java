package Id_26470.Q5;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone; // 10 digits

    public Instructor(int id, String createdDate, String updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }

    public String getInstructorName() { return instructorName; }
    public void setInstructorName(String instructorName) throws AttendanceDataException {
        if (instructorName == null || instructorName.trim().isEmpty())
            throw new AttendanceDataException("instructorName cannot be empty");
        this.instructorName = instructorName;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws AttendanceDataException {
        if (email == null || !email.contains("@"))
            throw new AttendanceDataException("invalid instructor email");
        this.email = email;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) throws AttendanceDataException {
        if (phone == null || !phone.matches("\\d{10}"))
            throw new AttendanceDataException("instructor phone must be 10 digits");
        this.phone = phone;
    }
}

