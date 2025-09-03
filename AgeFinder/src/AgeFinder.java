import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// calculate the age from a given date. The date will be provided in the format yyyy-MM-dd.
// Input: "2000-01-01"
// Output: Age: 24
// In case of any error the method calculateAge should return -1
public class AgeFinder {
    public int calculateAge(String date) {
        try {
            LocalDate startDate = LocalDate.parse(date); // Parse the input date
            LocalDate now = LocalDate.now();  // Get the current date

            if (startDate.isAfter(now)) return -1;  // Future date check

            Period p = Period.between(startDate, now); // Calculate period
            int years = p.getYears();  // Get years
            return years;

        } catch (Exception e) {
            return -1;
        }
    }
}