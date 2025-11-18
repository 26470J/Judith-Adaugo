package Id_26470.Q6;

import java.util.Scanner;

public class Main {

    public static final String STUDENT_ID = "26470";

    public static void main(String[] args) throws PayrollDataException {

        Scanner sc = new Scanner(System.in);


        // ENTITY
        int id = 0;
        String createdDate = null;
        String updatedDate = null;

        // ORGANIZATION
        String orgName = null;
        String orgCode = null;
        String rssbNumber = null;
        String contactEmail = null;

        // DEPARTMENT
        String deptName = null;
        String deptCode = null;
        String managerName = null;

        // EMPLOYEE
        int employeeID = 0;
        String fullName = null;
        String position = null;
        double baseSalary = 0.0;
        String rssbRegisteredInput = null;

        // PAYROLL PERIOD
        int month = 0;
        int year = 0;
        String startDate = null;
        String endDate = null;

        // SALARY STRUCTURE
        double basicPay = 0.0;
        double transportAllowance = 0.0;
        double housingAllowance = 0.0;

        // DEDUCTIONS
        double payeTax = 0.0;
        double loanDeduction = 0.0;

        // ALLOWANCES
        double overtimeHours = 0.0;
        double overtimeRate = 0.0;
        double bonus = 0.0;

        // PAYSLIP
        String payslipNumber = null;
        String issueDate = null;

        Payslip ps = new Payslip();

        System.out.println("=== PAYROLL MANAGEMENT SYSTEM (RSSB) DATA ENTRY - " + STUDENT_ID + " ===");

        System.out.println("Enter Entity ID (>0): - " + STUDENT_ID);
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        ps.setId(id);

        System.out.println("Enter Created Date (YYYY-MM-DD): - " + STUDENT_ID);
        createdDate = sc.nextLine();
        ps.setCreatedDate(createdDate);

        System.out.println("Enter Updated Date (YYYY-MM-DD): - " + STUDENT_ID);
        updatedDate = sc.nextLine();
        ps.setUpdatedDate(updatedDate);

        // ---------------- ORGANIZATION ----------------
        System.out.println("Enter Organization Name: - " + STUDENT_ID);
        orgName = sc.nextLine();
        ps.setOrgName(orgName);

        System.out.println("Enter Organization Code (>=3 chars): - " + STUDENT_ID);
        orgCode = sc.nextLine();
        ps.setOrgCode(orgCode);

        System.out.println("Enter RSSB Number (8 digits): - " + STUDENT_ID);
        rssbNumber = sc.nextLine();
        ps.setRssbNumber(rssbNumber);

        System.out.println("Enter Organization Contact Email: - " + STUDENT_ID);
        contactEmail = sc.nextLine();
        ps.setContactEmail(contactEmail);

        // ---------------- DEPARTMENT ----------------
        System.out.println("Enter Department Name: - " + STUDENT_ID);
        deptName = sc.nextLine();
        ps.setDeptName(deptName);

        System.out.println("Enter Department Code (>=3 chars): - " + STUDENT_ID);
        deptCode = sc.nextLine();
        ps.setDeptCode(deptCode);

        System.out.println("Enter Manager Name: - " + STUDENT_ID);
        managerName = sc.nextLine();
        ps.setManagerName(managerName);

        // ---------------- EMPLOYEE ----------------
        System.out.println("Enter Employee ID (>=1000): - " + STUDENT_ID);
        employeeID = sc.nextInt();
        sc.nextLine();
        ps.setEmployeeID(employeeID);

        System.out.println("Enter Employee Full Name: - " + STUDENT_ID);
        fullName = sc.nextLine();
        ps.setFullName(fullName);

        System.out.println("Enter Position: - " + STUDENT_ID);
        position = sc.nextLine();
        ps.setPosition(position);

        System.out.println("Enter Base Salary (>0): - " + STUDENT_ID);
        baseSalary = sc.nextDouble();
        sc.nextLine();
        ps.setBaseSalary(baseSalary);

        System.out.println("Is RSSB Registered? (true/false): - " + STUDENT_ID);
        boolean rssbRegistered = sc.nextBoolean();
        sc.nextLine();
        ps.setRssbRegistered(rssbRegistered);

        // ---------------- PAYROLL PERIOD ----------------
        System.out.println("Enter Payroll Month (1-12): - " + STUDENT_ID);
        month = sc.nextInt();
        sc.nextLine();
        ps.setMonth(month);

        System.out.println("Enter Payroll Year (>=2000): - " + STUDENT_ID);
        year = sc.nextInt();
        sc.nextLine();
        ps.setYear(year);

        System.out.println("Enter Period Start Date (YYYY-MM-DD): - " + STUDENT_ID);
        startDate = sc.nextLine();
        ps.setStartDate(startDate);

        System.out.println("Enter Period End Date (YYYY-MM-DD): - " + STUDENT_ID);
        endDate = sc.nextLine();
        ps.setEndDate(endDate);

        // ---------------- SALARY STRUCTURE ----------------
        System.out.println("Enter Basic Pay (>=0): - " + STUDENT_ID);
        basicPay = sc.nextDouble();
        sc.nextLine();
        ps.setBasicPay(basicPay);

        System.out.println("Enter Transport Allowance (>=0): - " + STUDENT_ID);
        transportAllowance = sc.nextDouble();
        sc.nextLine();
        ps.setTransportAllowance(transportAllowance);

        System.out.println("Enter Housing Allowance (>=0): - " + STUDENT_ID);
        housingAllowance = sc.nextDouble();
        sc.nextLine();
        ps.setHousingAllowance(housingAllowance);

        // ---------------- DEDUCTIONS ----------------
        ps.computeRssb();
        System.out.println("RSSB Contribution (5% of basic) computed automatically: " + ps.getRssbContribution() + " - " + STUDENT_ID);

        System.out.println("Enter PAYE tax (0 for default 10% of basic): - " + STUDENT_ID);
        payeTax = sc.nextDouble();
        sc.nextLine();
        ps.setPayeTax(payeTax);

        System.out.println("Enter Loan Deduction (>=0): - " + STUDENT_ID);
        loanDeduction = sc.nextDouble();
        sc.nextLine();
        ps.setLoanDeduction(loanDeduction);

        // ---------------- ALLOWANCES ----------------
        System.out.println("Enter Overtime Hours (>=0): - " + STUDENT_ID);
        overtimeHours = sc.nextDouble();
        sc.nextLine();
        ps.setOvertimeHours(overtimeHours);

        System.out.println("Enter Overtime Rate (>=0): - " + STUDENT_ID);
        overtimeRate = sc.nextDouble();
        sc.nextLine();
        ps.setOvertimeRate(overtimeRate);

        System.out.println("Enter Bonus (>=0): - " + STUDENT_ID);
        bonus = sc.nextDouble();
        sc.nextLine();
        ps.setBonus(bonus);

        // ---------------- PAYSLIP META ----------------
        System.out.println("Enter Payslip Number: - " + STUDENT_ID);
        payslipNumber = sc.nextLine();
        ps.setPayslipNumber(payslipNumber);

        System.out.println("Enter Issue Date (YYYY-MM-DD): - " + STUDENT_ID);
        issueDate = sc.nextLine();
        ps.setIssueDate(issueDate);

        // ---------------- GENERATE PAYSLIP ----------------
        double netSalary = ps.generatePayslip();
        System.out.println("Payslip generated successfully. Net Salary: " + netSalary + " - " + STUDENT_ID);

        sc.close();
    }

}