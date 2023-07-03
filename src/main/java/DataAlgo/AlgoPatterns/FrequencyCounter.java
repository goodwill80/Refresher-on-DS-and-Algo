package DataAlgo.AlgoPatterns;

import java.util.*;

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

    // Write a function which accept 2 arrays
    // it should return true if the opposing array has its corresponding  value squared as compared
    // to the other
    public static boolean compareSqArrays(int[] arr1, int[]arr2) {
        if(arr1.length != arr2.length) return false;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        // Populate map1
        for(int num: arr1) {
            map1.put(num, map1.containsKey(num)?map1.get(num) + 1 : 1);
        }
        // Populate map2
        for(int num : arr2) {
            map2.put(num, map2.containsKey(num)?map2.get(num) + 1 : 1);
        }
        // Check for same key and same value for both hashmaps
        for(int num: arr1) {
            if(!map2.containsKey(num * num)){
                return false;
            }
            if(!Objects.equals(map1.get(num), map2.get(num * num))) {
                return false;
            }
        }
        return true;
    }

}
