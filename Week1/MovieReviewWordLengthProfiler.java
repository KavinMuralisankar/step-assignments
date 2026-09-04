public class MovieReviewWordLengthProfiler {
    static void classifyWordLengths(String review) {
        int shortWords = 0, mediumWords = 0, longWords = 0;
        String[] words = review.trim().split("\\s+");
        for (String word : words) {
            String clean = word.replaceAll("[^A-Za-z]", "");
            int length = clean.length();
            if (length >= 1 && length <= 4) shortWords++;
            else if (length <= 8) mediumWords++;
            else if (length >= 9) longWords++;
        }
        System.out.println("Short: " + shortWords + " | Medium: " + mediumWords + " | Long: " + longWords);
    }
    public static void main(String[] args) { classifyWordLengths("This movie was absolutely fantastic and thrilling"); }
}
