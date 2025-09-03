public class UnitConverter {
    public static String convert(String[] args) {
        if (args.length != 3) return "ERROR";

        double value;
        try {
            value = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            return "ERROR";
        }

        String key = args[0].toLowerCase() + "-" + args[1].toLowerCase();

        switch (key) {
            case "fahrenheit-celsius":
                return String.format("%.2f", (value - 32) * 5 / 9);
            case "celsius-fahrenheit":
                return String.format("%.2f", value * 9 / 5 + 32);
            case "kilometers-miles":
                return String.format("%.2f", value * 0.621371);
            case "miles-kilometers":
                return String.format("%.2f", value * 1.60934);
            case "pounds-kilograms":
                return String.format("%.2f", value * 0.45359237);
            default:
                return "ERROR";
        }
    }
}