import java.time.LocalDate;

public class Appointment {

    // Private Instance Variables
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    // Constructor
    public Appointment(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Check if the appointment occurs on a given date.
     *
     * @param date date to be checked.
     * @return true if date >= start date and <= end date.
     */

    public boolean occursOn(LocalDate date) {

        if (date.isAfter(startDate)) {

            if (date.isBefore(endDate)) {
                return true;
            } else if (date.isEqual(endDate)) {
                return true;
            }
        } else if (date.isEqual(startDate)) {

            return true;
        }

        return false;
    }
}
