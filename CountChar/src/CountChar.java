public class CountChar {
    public static int count(String s, char c) {
        if (s == null) return 0;
        int count = 0;
        for (char letter : s.toCharArray()) {
            if (letter == c) {
                count++;
            }
        }
        return count;
    }
}

// optional using for-loop
//public class CountChar {
//    public static int count(String s, char c) {
//        if (s == null) return 0;
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt[i] == c) {
//                count++;
//            }
//        }
//        return count;
//    }
//}