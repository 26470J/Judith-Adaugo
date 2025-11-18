package Id_26470.Q5;


public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age; // >0

    public Student(int id, String createdDate, String updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone);
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) throws AttendanceDataException {
        if (studentName == null || studentName.trim().isEmpty())
            throw new AttendanceDataException("studentName cannot be empty");
        this.studentName = studentName;
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) throws AttendanceDataException {
        if (studentID == null || studentID.trim().isEmpty())
            throw new AttendanceDataException("studentID cannot be empty");
        this.studentID = studentID;
    }

    public int getAge() { return age; }
    public void setAge(int age) throws AttendanceDataException {
        if (age <= 0) throw new AttendanceDataException("age must be > 0");
        this.age = age;
    }
}

