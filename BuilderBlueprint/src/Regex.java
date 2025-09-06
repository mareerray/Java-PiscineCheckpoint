import java.util.*;
// Regex class
public class Regex {
    private StringBuilder pattern;

    public Regex (List<String> component) {
       pattern = new StringBuilder();
       for (String part : component) {
           pattern.append(part);
       }
    }

    public String getPattern() {
        return pattern.toString();
    }

    @Override
    public String toString() {
        return getPattern();
    }
}