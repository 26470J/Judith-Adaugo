package Id_26470.Q3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws TaxDataException {

            Scanner sc = new Scanner(System.in);
            int id = 0;
            String createdDate = null;
            String updatedDate = null;
            String authorityName = null;
            String region = null;
            String email = null;
            String categoryName = null;
            double rate = 0;
            String code = null;
            String tin = null;
            String taxpayerName = null;
            String address = null;
            String employerName = null;
            String employerTIN = null;
            String contact = null;
            String employeeName = null;
            double salary = 0;
            String employeeTIN = null;
            String declarationMonth = null;
            double totalIncome = 0;
            String assessmentDate = null;
            double assessedTax = 0;
            String paymentDate = null;
            double paymentAmount = 0;
            String receiptNo = null;
            double totalTax = 0;
            double credits = 0;

            TaxRecord record = new TaxRecord(id, createdDate, updatedDate,
                    authorityName, region, email, categoryName, rate, code,
                    tin, taxpayerName, address, employerName, employerTIN, contact,
                    employeeName, salary, employeeTIN, declarationMonth, totalIncome,
                    assessmentDate, assessedTax, paymentDate, paymentAmount,
                    receiptNo, totalTax, credits);

            System.out.println("=== TAX ADMINISTRATION DATA ENTRY - 26470 ===");

            // ---------------- ENTITY ----------------


            while (true) {
                try {
                    System.out.println("Enter ID (>0): - 26470");
                    id = sc.nextInt();
                    sc.nextLine();
                    record.setId(id);

                    System.out.println("Enter Created Date (YYYY-MM-DD): - 26470");
                    createdDate = sc.nextLine();
                    record.setCreatedDate(createdDate);

                    System.out.println("Enter Updated Date (YYYY-MM-DD): - 26470");
                    updatedDate = sc.nextLine();
                    record.setUpdatedDate(updatedDate);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }

            // ---------------- TAX AUTHORITY ----------------

            while (true) {
                try {
                    System.out.println("Enter Tax Authority Name: - 26470");
                    authorityName = sc.nextLine();
                    record.setAuthorityName(authorityName);

                    System.out.println("Enter Region: - 26470");
                    region = sc.nextLine();
                    record.setRegion(region);

                    System.out.println("Enter Email: - 26470");
                    email = sc.nextLine();
                    record.setEmail(email);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }

            // ---------------- TAX CATEGORY ----------------

            while (true) {
                try {
                    System.out.println("Enter Tax Category Name: - 26470");
                    categoryName = sc.nextLine();
                    record.setCategoryName(categoryName);

                    System.out.println("Enter Tax Rate (>0): - 26470");
                    rate = sc.nextDouble();
                    sc.nextLine();
                    record.setRate(rate);

                    System.out.println("Enter Category Code (>=3 chars): - 26470");
                    code = sc.nextLine();
                    record.setCode(code);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }

            // ---------------- TAXPAYER ----------------

            while (true) {
                try {
                    System.out.println("Enter Taxpayer TIN (9 digits): - 26470");
                    tin = sc.nextLine();
                    record.setTin(tin);

                    System.out.println("Enter Taxpayer Name: - 26470");
                    taxpayerName = sc.nextLine();
                    record.setTaxpayerName(taxpayerName);

                    System.out.println("Enter Taxpayer Address: - 26470");
                    address = sc.nextLine();
                    record.setAddress(address);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }

            // ---------------- EMPLOYER ----------------

            while (true) {
                try {
                    System.out.println("Enter Employer Name: - 26470");
                    employerName = sc.nextLine();
                    record.setEmployerName(employerName);

                    System.out.println("Enter Employer TIN (9 digits): - 26470");
                    employerTIN = sc.nextLine();
                    record.setEmployerTIN(employerTIN);

                    System.out.println("Enter Employer Contact (10 digits): - 26470");
                    contact= sc.nextLine();
                    record.setContact(contact);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }

            // ---------------- EMPLOYEE ----------------

            while (true) {
                try {
                    System.out.println("Enter Employee Name: - 26470");
                    employeeName = sc.nextLine();
                    record.setEmployeeName(employeeName);

                    System.out.println("Enter Employee Salary (>0): - 26470");
                    salary = sc.nextDouble();
                    sc.nextLine();
                    record.setSalary(salary);

                    System.out.println("Enter Employee TIN (9 digits): - 26470");
                    employeeTIN = sc.nextLine();
                    record.setEmployeeTIN(employeeTIN);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }

            // ---------------- TAX DECLARATION ----------------

            while (true) {
                try {
                    System.out.println("Enter Declaration Month: - 26470");
                    declarationMonth = sc.nextLine();
                    record.setDeclarationMonth(declarationMonth);

                    System.out.println("Enter Total Income (>=0): - 26470");
                    totalIncome = sc.nextDouble();
                    sc.nextLine();
                    record.setTotalIncome(totalIncome);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }

            // ---------------- TAX ASSESSMENT ----------------

            while (true) {
                try {
                    System.out.println("Enter Assessment Date: - 26470");
                    assessmentDate = sc.nextLine();
                    record.setAssessmentDate(assessmentDate);

                    System.out.println("Enter Assessed Tax (>=0): - 26470");
                    assessedTax = sc.nextDouble();
                    sc.nextLine();
                    record.setAssessedTax(assessedTax);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }


            while (true) {
                try {
                    System.out.println("Enter Payment Date: - 26470");
                    paymentDate = sc.nextLine();
                    record.setPaymentDate(paymentDate);

                    System.out.println("Enter Payment Amount (>0): - 26470");
                    paymentAmount = sc.nextDouble();
                    sc.nextLine();
                    record.setPaymentAmount(paymentAmount);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }


            while (true) {
                try {
                    System.out.println("Enter Receipt Number: - 26470");
                    receiptNo= sc.nextLine();
                    record.setReceiptNo(receiptNo);

                    System.out.println("Enter Tax Credits (>=0): - 26470");
                    credits = sc.nextDouble();
                    sc.nextLine();
                    record.setCredits(credits);

                    break;
                } catch (TaxDataException e) {
                    System.out.println("Error: " + e.getMessage() + " - 26470");
                }
            }

            // ---------------- GENERATE TAX REPORT ----------------
            System.out.println("\n=== GENERATED TAX RECORD - 26470 ===");
            double finalTax = record.computeTax();
            System.out.println("TOTAL TAX PAYABLE: " + finalTax + " - 26470");

            sc.close();
        }


}


