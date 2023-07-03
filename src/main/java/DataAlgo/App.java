package DataAlgo;

import DataAlgo.AlgoPatterns.FrequencyCounter;
import DataAlgo.FunctionalProgramming.HigherOrderFunctions;
import DataAlgo.SortingAlgo.BasicSorting;
import DataAlgo.Structures.LinkedList;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        int longest = CodeChallenge.findLengthOfLongestStr("abcabcdefgabc");
        // System.out.println(longest);

        int factorial = CodeChallenge.factorial(5);
        // System.out.println(factorial);

        int countUniqueNumsInArray = CodeChallenge.countUnique(new int[]{1,1,1,1,1,2});
        // System.out.println(countUniqueNumsInArray);

        int countUniqueNumsInArray2 = CodeChallenge.countUnique2(new int[] {1,2,3,3,2,1,4,3});
        // System.out.println(countUniqueNumsInArray);

        int[] returnTwoSum = CodeChallenge.twoSum(new int[] {2,4,11,3}, 6);
        // System.out.println(Arrays.toString(returnTwoSum));

        int factorialTwo = CodeChallenge.factorial2(5);
        // System.out.println(factorialTwo);

        int[] returnTwoSumUsingHashMap = CodeChallenge.twoSumUsingHash(new int[] {2,4,11,3}, 6);
        // System.out.println(Arrays.toString(returnTwoSumUsingHashMap));

        boolean isPalindrome = CodeChallenge.isPalindrome(1231);
        // System.out.println(isPalindrome);

        int removeElement = CodeChallenge.removeElement(new int[]{ 3,2,2,3}, 3);
        // System.out.println(removeElement);

        int searchInset = CodeChallenge.searchInsert(new int[]{ 1,3,5,6}, 2);
        // System.out.println(searchInset);

        int lengthOfLastWord = CodeChallenge.lengthOfLastWord("fly me   to   the moon");
        // System.out.println(lengthOfLastWord);

        int lengthOfLastWord2 = CodeChallenge.lengthOfLastWord2("fly me   to   the moon");
        // System.out.println(lengthOfLastWord2);

        int[] plusOne = CodeChallenge.plusOne(new int[] {1,2,3});

        int profits = CodeChallenge.maxProfit(new int[] {1, 6, 2, 7, 8});
        // System.out.println(profits);

        int maxTwo = CodeChallenge.findMaxTwo(new int[] {11,3,10,6,22});
        // System.out.println(maxTwo);

        int maxIndx = CodeChallenge.findMaxIndex(new int[] {11,3,44,6,22});
        // System.out.println(maxIndx);

        int findLowest = CodeChallenge.findLowestIndex(new int[] {11,3,10,6,22});
        // System.out.println(findLowest);

        boolean containDups = CodeChallenge.containDuplicates(new int[] {4, 0, 5, 10, 3, 0});
        // System.out.println(containDups);

        int[] twoSumeTwoAns = CodeChallenge.twoSumTwo(new int[]{2,7,11,15}, 9);
        // System.out.println(twoSumeTwoAns[0]);
        // System.out.println(twoSumeTwoAns[1]);

        int[] twoSumeTwoAns2 = CodeChallenge.twoSumThree(new int[]{2,7,11,15}, 9);
        // System.out.println(twoSumeTwoAns2[0]);
        //  System.out.println(twoSumeTwoAns2[1]);
        List<List<Integer>> pascal = CodeChallenge.generatePascal(5);
        // System.out.println(pascal);

        LinkedList myLinkedList = new LinkedList(1);
        // myLinkedList.append(2);
        // myLinkedList.append(3);
        // myLinkedList.append(4);
        // myLinkedList.reverse();
        // myLinkedList.printList();

        int[] myArray = BasicSorting.bubbleSort(new int[]{4,2,6,5,1,3});
        // System.out.println(Arrays.toString(myArray));

        int[] myArray2 = BasicSorting.selectionSort(new int[] {4,2,6,5,1,3});
        // System.out.println(Arrays.toString(myArray2));

        int[] myArray3 = BasicSorting.insertionSort(new int[]{4,2,6,5,1,3});
        // System.out.println(Arrays.toString(myArray3));

        // CodeChallenge.checksum("3456123");

        // Higher Order functions
        // HigherOrderFunctions.forEachLoop(Arrays.asList("Jon", "Oliver", "Ali"));

        List<Integer> numbers = Arrays.asList(2,1,4,3,6,4,3);
        HigherOrderFunctions.sortNumbers(numbers);
        // System.out.println(numbers);

        Map<String, Integer> coffeeRatings = new HashMap<>();
        coffeeRatings.put("StarBucks", 20);
        coffeeRatings.put("CoffeeBean", 30);
        coffeeRatings.put("TimCoffee", 50);
        coffeeRatings.put("CoffeeShop", 90);
        // HigherOrderFunctions.forEachLoopMap(coffeeRatings);

        List<Double> prices = Arrays.asList(234.77, 222.99, 100.99, 44.99, 234.99);
        // HigherOrderFunctions.filterPrices(prices);

        // FrequencyCounter.countOfWordsInSentence("Hello how are you you Hello");

        Boolean compareArraysSq = FrequencyCounter.compareSqArrays(
                new int[] {2,3,4,5,6},
                new int[] {4,9,16,25,36}
        );

        System.out.println(compareArraysSq);

    }


}
