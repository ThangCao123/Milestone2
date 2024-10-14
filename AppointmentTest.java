
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class AppointmentTest {

    @Test
    public void testOccursBeforeStartDate() {
        Appointment appointment = new Appointment("Meeting", LocalDate.of(2024, 4, 22), LocalDate.of(2024, 5, 13));
        LocalDate testDate = LocalDate.of(2024, 4, 21);
        boolean result = appointment.occursOn(testDate);
        assertFalse(result);
    }

    @Test
    public void testOccursOnStartDate() {
        Appointment appointment = new Appointment("Meeting", LocalDate.of(2024, 4, 22), LocalDate.of(2024, 5, 13));
        LocalDate testDate = LocalDate.of(2024, 4, 22);
        boolean result = appointment.occursOn(testDate);
        assertTrue(result);
    }

    @Test
    public void testOccursBetweenStartAndEndDate() {
        Appointment appointment = new Appointment("Meeting", LocalDate.of(2024, 4, 22), LocalDate.of(2024, 5, 13));
        LocalDate testDate = LocalDate.of(2024, 5, 5);
        boolean result = appointment.occursOn(testDate);
        assertTrue(result);
    }

    @Test
    public void testOccursOnEndDate() {
        Appointment appointment = new Appointment("Meeting", LocalDate.of(2024, 4, 22), LocalDate.of(2024, 5, 13));
        LocalDate testDate = LocalDate.of(2024, 5, 13);
        boolean result = appointment.occursOn(testDate);
        assertTrue(result);
    }

    @Test
    public void testOccursAfterEndDate(){
        Appointment appointment = new Appointment("Meeting", LocalDate.of(2024, 4, 22), LocalDate.of(2024, 5, 13));
        LocalDate testDate = LocalDate.of(2024, 5, 14);
        boolean result = appointment.occursOn(testDate);
        assertFalse(result);
    }
}
