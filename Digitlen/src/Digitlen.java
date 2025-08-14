// Numeric Approach
public class Digitlen {
    public static int digitlen(long number) {
        if (number == 0) return 1; // zero has 1 digit
        if (number < 0) number = -number; // ignore the minus sign

        int count = 0;
        while (number > 0) {
            count++;   // found another digit
            number /= 10; // remove the last digit
        }
        return count;
    }
}

// String Approach
//public class Digitlen {
//    public static int digitlen(long number) {
//        String numStr = Long.toString(Math.abs(number)); // handle negatives
//        return numStr.length();
//    }
//}
// Long.toString() to turn the number into a String,
// and .length() to count its characters.