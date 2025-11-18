package Id_26470.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== FLIGHT BOOKING SYSTEM ===");

        int id = 0;
        String createdDate = null;
        String updatedDate = null;
        String airportName = null;
        String code = null;
        String location = null;
        String airlineName = null;
        String airlineCode = null;
        String contactEmail = null;
        String flightNumber = null;
        String departure = null;
        String destination = null;
        double baseFare = 0;
        String pilotName = null;
        String licenseNumber = null;
        int experienceYears = 0;
        String crewName = null;
        String role = null;
        String shift = null;
        String passengerName = null;
        int age = 0;
        String gender = null;
        String contact = null;
        String bookingDate = null;
        String seatNumber = null;
        String travelClass = null;
        String paymentDate = null;
        String paymentMethod = null;
        double amountPaid = 0;
        String ticketNumber = null;
        String issueDate = null;

        Ticket ticket = new Ticket(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail, flightNumber, departure, destination,
                baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift,
                passengerName, age, gender, contact, bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid, ticketNumber, issueDate);

        // ---------------- ENTITY ----------------
        while (true) {
            try {
                System.out.println("Enter Entity ID (>0): ");
                id = sc.nextInt();
                sc.nextLine();
                ticket.setId(id);

                System.out.println("Enter Created Date: ");
                createdDate = sc.nextLine();
                ticket.setCreatedDate(createdDate);

                System.out.println("Enter Updated Date: ");
                updatedDate = sc.nextLine();
                ticket.setUpdatedDate(updatedDate);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }

        // ---------------- AIRPORT ----------------
        while (true) {
            try {
                System.out.println("Enter Airport Name: ");
                airportName = sc.nextLine();
                ticket.setAirportName(airportName);

                System.out.println("Enter Airport Code (AAA): ");
                code = sc.nextLine();
                ticket.setCode(code);

                System.out.println("Enter Airport Location: ");
                location = sc.nextLine();
                ticket.setLocation(location);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- AIRLINE ----------------
        while (true) {
            try {
                System.out.println("Enter Airline Name: ");
                airlineName = sc.nextLine();
                ticket.setAirlineName(airlineName);

                System.out.println("Enter Airline Code (2–4 letters): ");
                airlineCode = sc.nextLine();
                ticket.setAirlineCode(airlineCode);

                System.out.println("Enter Airline Email: ");
                contactEmail = sc.nextLine();
                ticket.setContactEmail(contactEmail);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- FLIGHT ----------------
        while (true) {
            try {
                System.out.println("Enter Flight Number: ");
                flightNumber = sc.nextLine();
                ticket.setFlightNumber(flightNumber);

                System.out.println("Enter Departure Airport: ");
                departure = sc.nextLine();
                ticket.setDeparture(departure);

                System.out.println("Enter Destination Airport: ");
                destination = sc.nextLine();
                ticket.setDestination(destination);

                System.out.println("Enter Base Fare (>0): ");
                baseFare = sc.nextDouble();
                ticket.setBaseFare(baseFare);
                sc.nextLine();
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }

        // ---------------- PILOT ----------------
        while (true) {
            try {
                System.out.println("Enter Pilot Name: ");
                pilotName = sc.nextLine();
                ticket.setPilotName(pilotName);

                System.out.println("Enter License Number: ");
                licenseNumber = sc.nextLine();
                ticket.setLicenseNumber(licenseNumber);

                System.out.println("Enter Experience Years (>=2): ");
                experienceYears = sc.nextInt();
                ticket.setExperienceYears(experienceYears);
                sc.nextLine();
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }

        // ---------------- CABIN CREW ----------------
        while (true) {
            try {
                System.out.println("Enter Cabin Crew Name: ");
                crewName = sc.nextLine();
                ticket.setCrewName(crewName);

                System.out.println("Enter Crew Role: ");
                role = sc.nextLine();
                ticket.setRole(role);

                System.out.println("Enter Shift (Day/Night): ");
                shift = sc.nextLine();
                ticket.setShift(shift);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- PASSENGER ----------------
        while (true) {
            try {
                System.out.println("Enter Passenger Name: ");
                passengerName = sc.nextLine();
                ticket.setPassengerName(passengerName);

                System.out.println("Enter Age (>0): ");
                age = sc.nextInt();
                ticket.setAge(age);
                sc.nextLine();

                System.out.println("Enter Gender (Male/Female/Other): ");
                gender = sc.nextLine();
                ticket.setGender(gender);

                System.out.println("Enter Contact Details: ");
                contact = sc.nextLine();
                ticket.setContact(contact);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }

        // ---------------- BOOKING ----------------
        while (true) {
            try {
                System.out.println("Enter Booking Date: ");
                bookingDate = sc.nextLine();
                ticket.setBookingDate(bookingDate);

                System.out.println("Enter Seat Number: ");
                seatNumber = sc.nextLine();
                ticket.setSeatNumber(seatNumber);

                System.out.println("Enter Travel Class (Economy/Business/First): ");
                travelClass = sc.nextLine();
                ticket.setTravelClass(travelClass);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // ---------------- PAYMENT ----------------
        while (true) {
            try {
                System.out.println("Enter Payment Date: ");
                paymentDate = sc.nextLine();
                ticket.setPaymentDate(paymentDate);

                System.out.println("Enter Payment Method: ");
                paymentMethod = sc.nextLine();
                ticket.setPaymentMethod(paymentMethod);

                System.out.println("Enter Amount Paid (>0): ");
                amountPaid = sc.nextDouble();
                ticket.setAmountPaid(amountPaid);
                sc.nextLine();
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }

        // ---------------- TICKET ----------------
        while (true) {
            try {
                System.out.println("Enter Ticket Number: ");
                ticketNumber = sc.nextLine();
                ticket.setTicketNumber(ticketNumber);

                System.out.println("Enter Issue Date: ");
                issueDate = sc.nextLine();
                ticket.setIssueDate(issueDate);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n=== GENERATED TICKET === - 26470");
        System.out.println("Ticket Number: " + ticket.getTicketNumber());
        System.out.println("Passenger: " + ticket.getPassengerName());
        System.out.println("Flight: " + ticket.getFlightNumber());
        System.out.println("From: " + ticket.getDeparture());
        System.out.println("To: " + ticket.getDestination());
        System.out.println("Travel Class: " + ticket.getTravelClass());
        System.out.println("Final Fare: " + ticket.calculateFare());

        sc.close();
    }
}
