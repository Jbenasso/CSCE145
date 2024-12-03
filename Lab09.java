// Name: Josefa Benasso

public class Concert {

    // Attributes
    private String bandName;
    private int capacity;
    private int numTicketsSoldByPhone;
    private int numTicketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

    // Default constructor
    public Concert() {
        this.bandName = "No name yet";
        this.capacity = 0;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    // Constructor with band name, capacity, and ticket prices
    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Constructor with all attributes
    public Concert(String bandName, int capacity, int numTicketsSoldByPhone, int numTicketsSoldAtVenue, double priceByPhone, double priceAtVenue) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.numTicketsSoldByPhone = numTicketsSoldByPhone;
        this.numTicketsSoldAtVenue = numTicketsSoldAtVenue;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Accessors
    public String getBandName() {
        return bandName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumTicketsSoldByPhone() {
        return numTicketsSoldByPhone;
    }

    public int getNumTicketsSoldAtVenue() {
        return numTicketsSoldAtVenue;
    }

    public double getPriceByPhone() {
        return priceByPhone;
    }

    public double getPriceAtVenue() {
        return priceAtVenue;
    }

    // Mutators
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void setCapacity(int capacity) {
        if (capacity >= totalNumberOfTicketsSold()) {
            this.capacity = capacity;
        } else {
            System.out.println("New capacity must be greater than or equal to tickets sold.");
        }
    }

    public void setPriceByPhone(double priceByPhone) {
        if (priceByPhone >= 0) {
            this.priceByPhone = priceByPhone;
        } else {
            System.out.println("Price by phone must be non-negative.");
        }
    }

    public void setPriceAtVenue(double priceAtVenue) {
        if (priceAtVenue >= 0) {
            this.priceAtVenue = priceAtVenue;
        } else {
            System.out.println("Price at venue must be non-negative.");
        }
    }

    // Methods
    public int totalNumberOfTicketsSold() {
        return numTicketsSoldByPhone + numTicketsSoldAtVenue;
    }

    public int ticketsRemaining() {
        return capacity - totalNumberOfTicketsSold();
    }

    public void buyTicketsAtVenue(int numTickets) {
        if (numTickets > 0 && totalNumberOfTicketsSold() + numTickets <= capacity) {
            numTicketsSoldAtVenue += numTickets;
        } else {
            System.out.println("Cannot buy tickets. Either invalid number or sold out.");
        }
    }

    public void buyTicketsByPhone(int numTickets) {
        if (numTickets > 0 && totalNumberOfTicketsSold() + numTickets <= capacity) {
            numTicketsSoldByPhone += numTickets;
        } else {
            System.out.println("Cannot buy tickets. Either invalid number or sold out.");
        }
    }

    public double totalSales() {
        return (numTicketsSoldByPhone * priceByPhone) + (numTicketsSoldAtVenue * priceAtVenue);
    }
}
