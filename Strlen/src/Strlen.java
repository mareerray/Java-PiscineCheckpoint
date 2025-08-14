public class Strlen {
    public static int strlen(String s) {
        if (s == null) return 0;
        return s.length();
    }
}

// implement strlen manually without using String.length() directly
//public class Strlen {
//    public static int strlen(String s) {
//        if (s == null) return 0;
//        int counter = 0;
//        //  loop over each char and increment a counter.
//        for (char c : s.toCharArray()) {
//          // s.toCharArray() makes an array of char from the string.
//            counter++;
//        }
//        return counter;
//    }
//}