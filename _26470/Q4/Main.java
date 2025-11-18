package Id_26470.Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcurementReport report = new ProcurementReport();

        System.out.println("=== PROCUREMENT REPORT DATA ENTRY ===");

        // ---------------- INITIALIZE VARIABLES ----------------
        int id = 0;
        String createdDate = null;
        String updatedDate = null;
        String orgName = null;
        String orgAddress = null;
        String orgEmail = null;
        String deptName = null;
        String deptCode = null;
        String supplierName = null;
        String supplierTIN = null;
        String supplierContact = null;
        String productName = null;
        double unitPrice = 0;
        int quantity = 0;
        String poNumber = null;
        String orderDate = null;
        double totalAmount = 0;
        String deliveryDate = null;
        String deliveredBy = null;
        String inspectorName = null;
        String status = null;
        String remarks = null;
        String invoiceNo = null;
        double invoiceAmount = 0;
        String reportDate = null;
        String summary = null;

        // ---------------- ENTITY ----------------
        while (true) {
            try {
                System.out.println("Enter ID (>0): ");
                id = sc.nextInt();
                sc.nextLine();
                report.setId(id);

                System.out.println("Enter Created Date (YYYY-MM-DD): ");
                createdDate = sc.nextLine();
                report.setCreatedDate(createdDate);

                System.out.println("Enter Updated Date (YYYY-MM-DD): ");
                updatedDate = sc.nextLine();
                report.setUpdatedDate(updatedDate);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- ORGANIZATION ----------------
        while (true) {
            try {
                System.out.println("Enter Organization Name: ");
                orgName = sc.nextLine();
                report.setOrgName(orgName);

                System.out.println("Enter Organization Address: ");
                orgAddress = sc.nextLine();
                report.setAddress(orgAddress);

                System.out.println("Enter Contact Email: ");
                orgEmail = sc.nextLine();
                report.setContactEmail(orgEmail);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- DEPARTMENT ----------------
        while (true) {
            try {
                System.out.println("Enter Department Name: ");
                deptName = sc.nextLine();
                report.setDeptName(deptName);

                System.out.println("Enter Department Code (≥3 chars): ");
                deptCode = sc.nextLine();
                report.setDeptCode(deptCode);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- SUPPLIER ----------------
        while (true) {
            try {
                System.out.println("Enter Supplier Name: ");
                supplierName = sc.nextLine();
                report.setSupplierName(supplierName);

                System.out.println("Enter Supplier TIN (9 digits): ");
                supplierTIN = sc.nextLine();
                report.setSupplierTIN(supplierTIN);

                System.out.println("Enter Supplier Contact (10 digits): ");
                supplierContact = sc.nextLine();
                report.setContact(supplierContact);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- PRODUCT ----------------
        while (true) {
            try {
                System.out.println("Enter Product Name: ");
                productName = sc.nextLine();
                report.setProductName(productName);

                System.out.println("Enter Unit Price (>0): ");
                unitPrice = sc.nextDouble();
                report.setUnitPrice(unitPrice);

                System.out.println("Enter Quantity (>=0): ");
                quantity = sc.nextInt();
                sc.nextLine();
                report.setQuantity(quantity);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                sc.nextLine();
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- PURCHASE ORDER ----------------
        while (true) {
            try {
                System.out.println("Enter PO Number: ");
                poNumber = sc.nextLine();
                report.setPoNumber(poNumber);

                System.out.println("Enter Order Date (YYYY-MM-DD): ");
                orderDate = sc.nextLine();
                report.setOrderDate(orderDate);

                System.out.println("Enter Total Amount (>0): ");
                totalAmount = sc.nextDouble();
                sc.nextLine();
                report.setTotalAmount(totalAmount);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                sc.nextLine();
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- DELIVERY ----------------
        while (true) {
            try {
                System.out.println("Enter Delivery Date (YYYY-MM-DD): ");
                deliveryDate = sc.nextLine();
                report.setDeliveryDate(deliveryDate);

                System.out.println("Delivered By: ");
                deliveredBy = sc.nextLine();
                report.setDeliveredBy(deliveredBy);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- INSPECTION ----------------
        while (true) {
            try {
                System.out.println("Enter Inspector Name: ");
                inspectorName = sc.nextLine();
                report.setInspectorName(inspectorName);

                System.out.println("Enter Status (Passed/Failed): ");
                status = sc.nextLine();
                report.setStatus(status);

                System.out.println("Enter Remarks: ");
                remarks = sc.nextLine();
                report.setRemarks(remarks);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- INVOICE ----------------
        while (true) {
            try {
                System.out.println("Enter Invoice Number: ");
                invoiceNo = sc.nextLine();
                report.setInvoiceNo(invoiceNo);

                System.out.println("Enter Invoice Amount (>0): ");
                invoiceAmount = sc.nextDouble();
                sc.nextLine();
                report.setInvoiceAmount(invoiceAmount);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                sc.nextLine();
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- REPORT ----------------
        while (true) {
            try {
                System.out.println("Enter Report Date (YYYY-MM-DD): ");
                reportDate = sc.nextLine();
                report.setReportDate(reportDate);

                System.out.println("Enter Summary: ");
                summary = sc.nextLine();
                report.setSummary(summary);
                break;
            } catch (IllegalArgumentException | ProcurementDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- OUTPUT ----------------
        System.out.println("\n=== PROCUREMENT REPORT OUTPUT ===");
        report.getSummary();
        report.calculateTotal();

        sc.close();

    }

}