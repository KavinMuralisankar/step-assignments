public class TypingAccuracyChecker {
    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0, firstMismatch = -1;
        int length = Math.min(original.length(), typed.length());
        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) matched++;
            else if (firstMismatch == -1) firstMismatch = i;
        }
        int total = original.length();
        double accuracy = total == 0 ? 100.0 : (matched * 100.0) / total;
        if (original.length() != typed.length() && firstMismatch == -1) firstMismatch = length;
        if (firstMismatch == -1)
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n", matched, total, accuracy);
        else {
            char expected = firstMismatch < original.length() ? original.charAt(firstMismatch) : '-';
            char actual = firstMismatch < typed.length() ? typed.charAt(firstMismatch) : '-';
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n", matched, total, accuracy, firstMismatch + 1, expected, actual);
        }
    }
    public static void main(String[] args) { checkTypingAccuracy("hello world", "hello worlt"); }
}
