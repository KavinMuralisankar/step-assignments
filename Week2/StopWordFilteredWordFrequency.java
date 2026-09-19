import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StopWordFilteredWordFrequency {
    static void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] words = cleaned.trim().split("\\s+");
        Set<String> stopWords = new HashSet<>();
        String[] stops = {"the", "was", "and", "a", "is", "of", "in"};
        for (String stop : stops) stopWords.add(stop);

        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (!stopWords.contains(word)) frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequency.entrySet());
        entries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        for (Map.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
