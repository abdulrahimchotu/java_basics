import java.util.*;

abstract class Transport {
    protected String id;
    protected String name;
    protected int totalSeats;
    protected int bookedSeats;

    public Transport(String id, String name, int totalSeats) {
        this.id = id;
        this.name = name;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public boolean bookTicket(int quantity) {
        if (availableSeats() >= quantity) {
            bookedSeats += quantity;
            return true;
        }
        return false;
    }

    public boolean cancelTicket(int quantity) {
        if (bookedSeats >= quantity) {
            bookedSeats -= quantity;
            return true;
        }
        return false;
    }

    public int availableSeats() {
        return totalSeats - bookedSeats;
    }

    public abstract String getType();

    public String getDetails() {
        return getType() + " | ID: " + id + " | Name: " + name + " | Seats: " + bookedSeats + "/" + totalSeats;
    }
}

class Bus extends Transport {
    public Bus(String id, String name, int totalSeats) {
        super(id, name, totalSeats);
    }

    public String getType() {
        return "Bus";
    }
}

class Train extends Transport {
    public Train(String id, String name, int totalSeats) {
        super(id, name, totalSeats);
    }

    public String getType() {
        return "Train";
    }
}

class Flight extends Transport {
    public Flight(String id, String name, int totalSeats) {
        super(id, name, totalSeats);
    }

    public String getType() {
        return "Flight";
    }
}

class BookingSystem {
    private List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public void displayAllTransports() {
        for (Transport t : transports) {
            System.out.println(t.getDetails());
        }
    }

    public Transport getTransportById(String id) {
        for (Transport t : transports) {
            if (t.id.equals(id)) {
                return t;
            }
        }
        return null;
    }
}

public class Assignment {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();
        system.addTransport(new Bus("B101", "Express Bus", 40));
        system.addTransport(new Train("T201", "Superfast Train", 100));
        system.addTransport(new Flight("F301", "AirJet", 60));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Transport Booking System ---");
            System.out.println("1. Show all transports");
            System.out.println("2. Book ticket");
            System.out.println("3. Cancel ticket");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    system.displayAllTransports();
                    break;
                case 2:
                    System.out.print("Enter Transport ID: ");
                    String bookId = sc.next();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    Transport t = system.getTransportById(bookId);
                    if (t != null && t.bookTicket(qty)) {
                        System.out.println("Ticket booked successfully.");
                    } else {
                        System.out.println("Booking failed. Not enough seats.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Transport ID: ");
                    String cancelId = sc.next();
                    System.out.print("Enter quantity to cancel: ");
                    int cancelQty = sc.nextInt();
                    Transport ct = system.getTransportById(cancelId);
                    if (ct != null && ct.cancelTicket(cancelQty)) {
                        System.out.println("Ticket cancelled successfully.");
                    } else {
                        System.out.println("Cancellation failed. Check your request.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
