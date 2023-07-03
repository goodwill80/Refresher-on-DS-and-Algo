package DataAlgo.AlgoPatterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    // Return count of each word in a sentence
    public static void countOfWordsInSentence(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        List<String> words = Arrays.stream(sentence.split(" "))
                .filter(word-> (word instanceof String))
                .toList();
        for(String word:words) {
            String lowerCap = word.toLowerCase();
            wordCount.put(lowerCap, wordCount.containsKey(lowerCap)?wordCount.get(lowerCap) + 1: 1);
        }
        System.out.println(wordCount.toString());
    }
}
