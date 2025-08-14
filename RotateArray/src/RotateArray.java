public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        int n = arr.length;
        if (n == 0 || rotationCount % n == 0)
            return arr.clone(); // return a copy

        // Normalize the rotationCount
        rotationCount = rotationCount % n;
        // convert left rotation to equivalent right rotation
        if (rotationCount < 0)
            rotationCount = rotationCount + n;

        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + rotationCount) % n;
            result[newIndex] = arr[i];
        }
        return result;
    }
}
// Positive rotation (right rotation)
// Negative rotation (left rotation)