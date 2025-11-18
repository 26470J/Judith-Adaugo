package Id_26470.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String createdDate = null;
        String updatedDate = null;
        String warehouseName = null;
        String location = null;
        String phone = null;
        String categoryName = null;
        String categoryCode = null;
        String supplierName = null;
        String supplierEmail = null;
        String supplierPhone = null;
        String productName = null;
        double unitPrice = 0;
        int stockLimit = 0;
        int quantityAvailable = 0;
        int reorderLevel = 0;
        String purchaseDate = null;
        int purchasedQuantity = 0;
        String saleDate = null;
        int soldQuantity = 0;
        String customerName = null;
        int totalItems = 0;
        double stockValue = 0;
        String reportDate = null;
        String remarks = null;

        StockReport report = new StockReport(id, createdDate, updatedDate, warehouseName, location, phone, categoryName,
                categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel, purchaseDate, purchasedQuantity, saleDate, soldQuantity, customerName, totalItems,
                stockValue, reportDate, remarks);

        System.out.println("=== STOCK REPORT DATA ENTRY ===");

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
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- WAREHOUSE ----------------
        while (true) {
            try {
                System.out.println("Enter Warehouse Name: ");
                warehouseName = sc.nextLine();
                report.setWarehouseName(warehouseName);

                System.out.println("Enter Warehouse Location: ");
                location = sc.nextLine();
                report.setLocation(location);

                System.out.println("Enter Warehouse Phone (10 digits): ");
                phone = sc.nextLine();
                report.setPhone(phone);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- CATEGORY ----------------
        while (true) {
            try {
                System.out.println("Enter Category Name: ");
                categoryName = sc.nextLine();
                report.setCategoryName(categoryName);

                System.out.println("Enter Category Code (≥3 chars, alphanumeric): ");
                categoryCode = sc.nextLine();
                report.setCategoryCode(categoryCode);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- SUPPLIER ----------------
        while (true) {
            try {
                System.out.println("Enter Supplier Name: ");
                supplierName = sc.nextLine();
                report.setSupplierName(supplierName);

                System.out.println("Enter Supplier Email: ");
                supplierEmail = sc.nextLine();
                report.setSupplierEmail(supplierEmail);

                System.out.println("Enter Supplier Phone (10 digits): ");
                supplierPhone = sc.nextLine();
                report.setSupplierPhone(supplierPhone);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.");
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

                System.out.println("Enter Stock Limit (>=0): ");
                stockLimit = sc.nextInt();
                report.setStockLimit(stockLimit);
                sc.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                sc.nextLine();
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- STOCK ITEM ----------------
        while (true) {
            try {
                System.out.println("Enter Quantity Available (>=0): ");
                quantityAvailable = sc.nextInt();
                report.setQuantityAvailable(quantityAvailable);

                System.out.println("Enter Reorder Level (>=0): ");
                reorderLevel = sc.nextInt();
                report.setReorderLevel(reorderLevel);
                sc.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                sc.nextLine();
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- PURCHASE ----------------
        while (true) {
            try {
                System.out.println("Enter Purchase Date (YYYY-MM-DD): ");
                purchaseDate = sc.nextLine();
                report.setPurchaseDate(purchaseDate);

                System.out.println("Enter Purchased Quantity (>0): ");
                purchasedQuantity = sc.nextInt();
                report.setPurchasedQuantity(purchasedQuantity);
                sc.nextLine();

                System.out.println("Enter Supplier Name for Purchase: ");
                supplierName = sc.nextLine();
                report.setSupplierName(supplierName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- SALE ----------------
        while (true) {
            try {
                System.out.println("Enter Sale Date (YYYY-MM-DD): ");
                saleDate = sc.nextLine();
                report.setSaleDate(saleDate);

                System.out.println("Enter Sold Quantity (>0): ");
                soldQuantity = sc.nextInt();
                report.setSoldQuantity(soldQuantity);
                sc.nextLine();

                System.out.println("Enter Customer Name: ");
                customerName = sc.next();
                report.setCustomerName(customerName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- INVENTORY ----------------
        while (true) {
            try {
                System.out.println("Enter Total Items (>=0): ");
                totalItems = sc.nextInt();
                report.setTotalItems(totalItems);

                System.out.println("Enter Stock Value (>=0): ");
                stockValue = sc.nextInt();
                report.setStockValue(stockValue);
                sc.nextLine();
                break;
            } catch (IllegalArgumentException e) {
                sc.nextLine();
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- REPORT ----------------
        while (true) {
            try {
                System.out.println("Enter Report Date (YYYY-MM-DD): ");
                reportDate = sc.next();
                report.setReportDate(reportDate);

                System.out.println("Enter Remarks: ");
                remarks = sc.nextLine();
                report.setRemarks(remarks);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }

        // ---------------- GENERATE REPORT ----------------
        System.out.println("\n=== GENERATED STOCK REPORT === -26470 ");
    }
}