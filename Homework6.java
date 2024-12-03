// Homework6.java
import java.util.Scanner;

// TimeException.java
class TimeException extends Exception {
    // Default constructor
    public TimeException() {
        super("EXCEPTION: Invalid time entered");
    }

    // Parameterized constructor
    public TimeException(String message) {
        super(message);
    }
}

// TimeConverter.java
class TimeConverter {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM; // true = AM, false = PM

    // Default constructor
    public TimeConverter() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true; // Default to AM
    }

    // Parameterized constructor
    public TimeConverter(int hours, int minutes, int seconds) throws TimeException {
        setTime(hours, minutes, seconds);
    }

    // Accessors
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isNotPM() {
        return notPM;
    }

    // Mutators with validation
    public void setHours(int hours) throws TimeException {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            throw new TimeException("Invalid value for hours!");
        }
    }

    public void setMinutes(int minutes) throws TimeException {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            throw new TimeException("Invalid value for minutes!");
        }
    }

    public void setSeconds(int seconds) throws TimeException {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            throw new TimeException("Invalid value for seconds!");
        }
    }

    // Method to set time and convert to 12-hour format
    public void setTime(int hours, int minutes, int seconds) throws TimeException {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        updateTime(hours, minutes, seconds);
    }

    // Method to convert 24-hour time to 12-hour format
    public void updateTime(int hours, int minutes, int seconds) {
        this.hours = hours % 12; // Convert to 12-hour format (0-11)
        if (hours >= 12) {
            notPM = false; // PM
        } else {
            notPM = true; // AM
        }
    }

    // Overloaded method to handle time input as a string
    public void updateTime(String time) throws TimeException {
        try {
            String[] timeParts = time.split(":");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            int seconds = Integer.parseInt(timeParts[2]);

            setTime(hours, minutes, seconds);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new TimeException("EXCEPTION: Invalid time entered!");
        }
    }

    // Display the time in 12-hour format
    public void displayTime() {
        String period = notPM ? "AM" : "PM";
        System.out.printf("%d:%02d:%02d %s\n", hours, minutes, seconds, period);
    }
}

// ClockTimeDemo.java
public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeConverter timeConverter1 = new TimeConverter();
        TimeConverter timeConverter2 = new TimeConverter();

        System.out.println("Welcome to the Time Converter!");

        // First time input: military clock (24-hour)
        while (true) {
            try {
                System.out.println("Enter the hours on the military clock:");
                int hours = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the minutes on the military clock:");
                int minutes = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the seconds on the military clock:");
                int seconds = Integer.parseInt(scanner.nextLine());

                timeConverter1.setTime(hours, minutes, seconds);
                System.out.println("12-hour clock time → ");
                timeConverter1.displayTime();
                break;
            } catch (TimeException e) {
                System.out.println(e.getMessage());
            }
        }

        // Second time input: formatted as "hours:minutes:seconds"
        while (true) {
            try {
                System.out.println("Enter 24 hour clock time in the format \"hours:minutes:seconds\"");
                String time = scanner.nextLine();

                timeConverter2.updateTime(time);
                System.out.println("12-hour clock time → ");
                timeConverter2.displayTime();
                break;
            } catch (TimeException e) {
                System.out.println(e.getMessage());
            }
        }

        // Ask if user wants to do it again
        System.out.println("Would you like to do this again? Enter “Yes” or “No”:");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("Yes")) {
            main(args); // Restart the program
        } else {
            System.out.println("Exiting the program!");
            scanner.close();
        }
    }
}
