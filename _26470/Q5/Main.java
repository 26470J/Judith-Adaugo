package Id_26470.Q5;

import java.util.Scanner;

public class Main {
    public static final String STUDENT_ID = "26470";

    public static void main(String[] args) throws AttendanceDataException {
        Scanner sc = new Scanner(System.in);

        // ---------------- INITIALIZE VARIABLES ----------------
        int id = 0;
        String createdDate = null;
        String updatedDate = null;
        String institutionName = null;
        String code = null;
        String address = null;
        String departmentName = null;
        String departmentHead = null;
        String courseName = null;
        String courseCode = null;
        int credits = 0;
        String instructorName = null;
        String email = null;
        String phone = null;
        String studentName = null;
        String studentID = null;
        int age = 0;
        String sessionDate = null;
        String topic = null;
        String sessionID = null;
        String  status = null;
        int attendanceCount = 0;
        String requestDate = null;
        String   reason = null;
        boolean approved = false;
        String reportDate = null;
        int totalPresent = 0;
        int totalAbsent = 0;
        int totalSessions= 0;

        AttendanceSummary summary = new AttendanceSummary(
                id,createdDate,updatedDate,institutionName,
                code,address,departmentName,departmentHead,courseName,courseCode,
                credits,instructorName,email,phone,studentName,studentID,age,sessionDate,
                topic,sessionID,status,requestDate,reason,approved,
                reportDate,totalPresent,totalAbsent,totalSessions);

        System.out.println("=== ATTENDANCE MANAGEMENT SYSTEM DATA ENTRY - " + STUDENT_ID + " ===");

        // ---------------- ENTITY ----------------
        while (true) {
            try {
                System.out.println("Enter ID (>0): - " + STUDENT_ID);
                id = safeNextInt(sc);
                summary.setId(id);

                System.out.println("Enter Created Date (YYYY-MM-DD): - " + STUDENT_ID);
                createdDate = sc.nextLine();
                summary.setCreatedDate(createdDate);

                System.out.println("Enter Updated Date (YYYY-MM-DD): - " + STUDENT_ID);
                updatedDate = sc.nextLine();
                summary.setUpdatedDate(updatedDate);
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- INSTITUTION ----------------
        while (true) {
            try {
                System.out.println("Enter Institution Name: - " + STUDENT_ID);
                institutionName = sc.nextLine();
                summary.setInstitutionName(institutionName);

                System.out.println("Enter Institution Code (>=3 chars): - " + STUDENT_ID);
                code = sc.nextLine();
                summary.setCode(code);

                System.out.println("Enter Institution Address: - " + STUDENT_ID);
                address = sc.nextLine();
                summary.setAddress(address);
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- DEPARTMENT ----------------
        while (true) {
            try {
                System.out.println("Enter Department Name: - " + STUDENT_ID);
                departmentName = sc.nextLine();
                summary.setDepartmentName(departmentName);

                System.out.println("Enter Department Head: - " + STUDENT_ID);
                departmentHead = sc.nextLine();
                summary.setDepartmentHead(departmentHead);
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- COURSE ----------------
        while (true) {
            try {
                System.out.println("Enter Course Name: - " + STUDENT_ID);
                courseName = sc.nextLine();
                summary.setCourseName(courseName);

                System.out.println("Enter Course Code: - " + STUDENT_ID);
                courseCode = sc.nextLine();
                summary.setCourseCode(courseCode);

                System.out.println("Enter Credits (>0): - " + STUDENT_ID);
                credits = safeNextInt(sc);
                summary.setCredits(credits);
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- INSTRUCTOR ----------------
        while (true) {
            try {
                System.out.println("Enter Instructor Name: - " + STUDENT_ID);
                instructorName = sc.nextLine();
                summary.setInstructorName(instructorName);

                System.out.println("Enter Instructor Email: - " + STUDENT_ID);
                email = sc.nextLine();
                summary.setEmail(email);

                System.out.println("Enter Instructor Phone (10 digits): - " + STUDENT_ID);
                phone = sc.nextLine();
                summary.setPhone(phone);
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- STUDENT ----------------
        while (true) {
            try {
                System.out.println("Enter Student Name: - " + STUDENT_ID);
                studentName = sc.nextLine();
                summary.setStudentName(studentName);

                System.out.println("Enter Student ID: - " + STUDENT_ID);
                studentID = sc.nextLine();
                summary.setStudentID(studentID);

                System.out.println("Enter Student Age (>0): - " + STUDENT_ID);
                age = safeNextInt(sc);
                summary.setAge(age);
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- CLASS SESSION ----------------
        while (true) {
            try {
                System.out.println("Enter Session Date (YYYY-MM-DD): - " + STUDENT_ID);
                sessionDate = sc.nextLine();
                summary.setSessionDate(sessionDate);

                System.out.println("Enter Session Topic: - " + STUDENT_ID);
                topic = sc.nextLine();
                summary.setTopic(topic);
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- ATTENDANCE RECORDS ----------------
        while (true) {
            try {
                System.out.println("How many attendance entries do you want to add? (int >=1): - " + STUDENT_ID);
                attendanceCount = safeNextInt(sc);
                for (int i = 1; i <= attendanceCount; i++) {
                    System.out.println("Entry " + i + " - Enter StudentID: - " + STUDENT_ID);
                    String sId = sc.nextLine();

                    System.out.println("Entry " + i + " - Enter SessionID: - " + STUDENT_ID);
                    String sessId = sc.nextLine();

                    System.out.println("Entry " + i + " - Enter Status (Present/Absent): - " + STUDENT_ID);
                    status = sc.nextLine();

                    // Use setter on summary object
                    summary.addAttendanceEntry(sId, sessId, status);
                }
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- LEAVE REQUEST (optional) ----------------
        while (true) {
            try {
                System.out.println("Do you want to add a leave request? (yes/no): - " + STUDENT_ID);
                String yn = sc.nextLine().trim().toLowerCase();
                if (yn.equals("yes")) {
                    System.out.println("Enter Leave Request Date (YYYY-MM-DD): - " + STUDENT_ID);
                    requestDate = sc.nextLine();
                    summary.setRequestDate(requestDate);

                    System.out.println("Enter Reason for Leave: - " + STUDENT_ID);
                    reason = sc.nextLine();
                    summary.setReason(reason);

                    System.out.println("Is the leave approved? (true/false): - " + STUDENT_ID);
                    String appr = sc.nextLine();
                    approved = appr.equalsIgnoreCase("true");
                    summary.setApproved(approved);
                }
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- REPORT META ----------------
        while (true) {
            try {
                System.out.println("Enter Report Date (YYYY-MM-DD): - " + STUDENT_ID);
                reportDate = sc.nextLine();
                summary.setReportDate(reportDate);
                break;
            } catch (AttendanceDataException e) {
                System.out.println("Error: " + e.getMessage() + " - " + STUDENT_ID);
            }
        }

        // ---------------- OUTPUT ----------------
        summary.displayAllData();
        summary.generateSummary();

        sc.close();
    }

    // safe int reader
    private static int safeNextInt(Scanner sc) {
        while (true) {
            String line = sc.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (Exception e) {
                System.out.println("Please enter a valid integer - " + STUDENT_ID);
            }
        }
    }
}
