package DataAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CodeChallenge {
    
    // Challenge 1 - Find length of longest unique word hidden in a string
    public static int findLengthOfLongestStr(String str) {
        int max = 0;
        for(int right = 0, left = 0; right < str.length(); right++) {
            // arr.indexOf(searchElement, fromIndex)
            // Search for the 1st occurace of char in str, starting from index at left
            int indexOfFirstAppearanceInStr = str.indexOf(str.charAt(right), left);
            
            // if the 1st occurance of char at index right is not equal to right, then there is a duplicate
            // if duplicate, then we cut the unique word and start with a new word
            if(indexOfFirstAppearanceInStr != right) {
                left = indexOfFirstAppearanceInStr + 1;
            }
            // Store the length of the last unique word and accumulate it
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    // Challenge 2 - count of the number of unique numbers in an array
    public static int countUnique(int[] nums) {
        int uniqueNum = 0;
        for(int i = 0; i < nums.length -1; i ++ ) {
            if(nums[i] < nums[i + 1]) {
                nums[uniqueNum] = nums[i + 1];
                uniqueNum++;
            }
        }
        return uniqueNum;
    }

    // Challenge 2a - count of the number of unique numbers in an array
    public static int countUnique2(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums) {
            numbers.add(num);
        }
        // System.out.println(Arrays.toString(numbers.toArray()));
        return numbers.size();
    }

    // Challenge 3
    public static int factorial(int num) {
        if(num == 1) return num;
        return num * factorial(num - 1);
    }

    // Challenge 3b
    public static int factorial2(int num) {
      int temp = 1;
      for(int i = 1; i <= num; i++) {
        temp = temp * i;
      }
      return temp;
    }

    // Challenge 4
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    // Challenge 5
    public static int[] twoSumUsingHash(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] results = new int[2];
        for(int i = 0; i < nums.length; i++) {
            
            // Setting up a listener to find a matching number that will make up the
            // remainder of (target - nums[i]) which will add up to the target
            // We need to determine whether is this contained in the Hashmap
            if(map.containsKey(target - nums[i])) {
                results[0] = map.get(target - nums[i]);
                results[1] = i;
            }
            map.put(nums[i], i);
        }
        return results;
    }

    // Challenge 6 - Palindrome Number
    public static boolean isPalindrome(int x) {
        // Convert the number to a string
        String number = String.valueOf(x);
        // Define the indexes of the string (1st and last index)
        int start = 0;
        int last = number.length() - 1;
        while(start <= last) {
            if(number.charAt(start) != number.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }

    // Challenge 7 - remove Element val from nums array
    public static int removeElement(int[] nums, int val) {
        int index = 0;
         for(int i : nums) {
             if(i != val) {
                 nums[index] = i;
                 index++;
             }
         }
         return index;
    }

    // Challenge 8 - search an array and insert a target number into
    public static int searchInsert(int[] nums, int target) {
        int temp = 0;
        // To increment the temp until it stops just nice b4 the target value
        for(int i = 0; i < nums.length; i++) {
                if(nums[i] < target) {
                   temp++;
                } 
            }
            // This is the index we wanna inset the target value into
            return temp;
     }

     // Challenge 9 - Get the length of last word in a sentence
     public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        List<String> words = new ArrayList<>();
        // Extract from array and push only nonblanks into new arraylist
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].isEmpty()) {
               words.add(strArr[i]);
            }
        }
        // Return length of last word
        return words.get(words.size() - 1).length();
    }

    // Challenge 10 - Return length of last word in a sentence
    public static int lengthOfLastWord2(String s) {
       String[] wordsArr = s.split(" ");
       return wordsArr[wordsArr.length - 1].length();
    }

    // Challenge 11
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else if(i >= 0) {
                digits[i] = 0;
            }
        }
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
       
        return newArr;
    }

    // Challenge 12 - Daily stock prices arranged in an array based on dates
    // find max profits 
    public static int maxProfit(int[] prices) {
        int maxProfits = 0;
        int currentProfits = 0;
        for(int y = 0, i = 1; i < prices.length; i++) {
            if(prices[i] > prices[y]) {
                currentProfits = prices[i] - prices[y];
            } else {
                y = i;
            }
            maxProfits = Math.max(maxProfits, currentProfits);
        }

        return maxProfits;
    }


    // Challenge 13 - find the sum of the 2 max numbers in an array
    public static int findMaxTwo(int [] numbers) {

        int max = 0;
        int sum = 0;
        // Find the max number in the array
        for(int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        // Find the 2nd max number in the array
        for(int num : numbers) {
            if(num != max) {
                sum = Math.max(sum, num + max);
            }
        }
        return sum;
    }

    // Challenge 14 -find largest number in array
    public static int findMaxIndex(int[] numbers) {
        int currentIndx = 0;
        for(int y = 0, x = 1; x < numbers.length; x++) {
            if(numbers[x] > numbers[y]) {
                currentIndx = x;
                y = x;
            }
        }
        return currentIndx;
    }

    // Challenge 15 - Find the lowest number in an array
    public static int findLowestIndex(int[] numbers) {
        int lowest = 0;
        for(int y = 0, x = 1; x < numbers.length; x++) {
            if(numbers[x] < numbers[y]) {
                y = x;
                lowest = x;
            }
        }
        return numbers[lowest];
    }

    // Challenge 16 - Check if an array contains duplicate
    public static boolean containDuplicates(int[] numbers) {
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length - 1; i ++) {
            if(numbers[i] == numbers[i+1]) {
                return true;
            }
        }
        return false;
    }

    // Challenge 17 - TwoSum 2 question
    public static int[] twoSumTwo(int[] numbers, int target) {
        int[] indexes = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])) {
                indexes[0] = i;
                indexes[1] = map.get(target - numbers[i]);
            }
            map.put(numbers[i], i);
        }

            if(indexes[0] > indexes[1]) {
                int temp = indexes[0];
                indexes[0] = indexes[1] == 0 ? 1 : indexes[1];
                indexes[1] = temp == indexes[0] ? temp + 1 : temp;
            }
        return indexes;
    }

    // Challenge 18
    public static int[] twoSumThree(int[] numbers, int target) {
        int[] indexes = new int[2];
        int start = 0;
        int end = numbers.length -1;

        while(start < end) {
            if(numbers[start] + numbers[end] == target) {
                indexes[0] = start + 1;
                indexes[1] = end + 1;
            }
            if(numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return indexes;
    }


    // Challenge 19 - Check if a string or sentence contains a palindrome, either in letters or nums
    public static boolean isPalindrome(String s) {
        // Filter the sentence and extract only letters and numbers
        StringBuilder newString = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c) || Character.isDigit(c)) {
                newString.append(c);
            }
        }
        // Covert the string to lowercase
        String newStr = newString.toString().toLowerCase();
        int start = 0;
        int end = newStr.length() -1;
        while(start < end) {
            if(newStr.charAt(start) != newStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Challenge 20 - Pascal's Triangle
    public static List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            cur.add(0, 1);
            for(int x = 1; x < cur.size() - 1; x++) {
                cur.set(x, cur.get(x) + cur.get(x + 1));
            }
            output.add(new ArrayList<>(cur));
        }
        return output;
    }

    // Challenge 21 - Palindrome Number
    public static boolean isNumPalindrome(int x) {
        if(x < 0) return false;
        String str = Integer.toString(x);
        for(int i = 0; i < str.length() / 2;  i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Challenge 22 - Write a Java program that prints a checksum letter based on the following:
    // The input will be a string of 7 digits;
    // Each character is multiplied by the weightage of its position in the string;
    // The products are summed up;
    // The total number is divided by 10;
    // Subtract the remainder of the division from 10;
    // The checksum letter is to be mapped from the table below;

    // weightage array [2, 6, 5, 7, 4, 3, 2]
    // checksum => 1 = W, 2 = X, 3 = Y, 4 = Z, 5 = A, 6 = B, 7 = C, 8 = D, 9 = E, 10 = F

    public static void checksum(String digits) {
        // Define start value of sum of products
        int sum = 0;
        // Weightage - assume that the digits always 7 in length
        int[] weightage = {2, 6, 5, 7, 4, 3, 2 };
        // Loop through the string and get memory of each num in string
        for(int i = 0; i < digits.length(); i++) {
            int number = Character.getNumericValue(digits.charAt(i));
            //  multiplied each num by its weightage in the array above, then sum the products
            sum = sum + (number * weightage[i]);
        }
        // Get the remainder of sum dvided by 10
        int remainderOfTen = sum % 10;
        // Subtract the remainder of the division from 10;
        int checkValue = 10 - remainderOfTen;

        // Since each num of the checkvalue is assigned with a letter
        // use a switch to define to output which is a char
        char myOutput = '0';
        switch(checkValue) {
            case 1:
                myOutput = 'W';
                break;
            case 2:
                myOutput = 'X';
                break;
            case 3:
                myOutput = 'Y';
                break;
            case 4:
                myOutput = 'Z';
                break;
            case 5:
                myOutput = 'A';
                break;
            case 6:
                myOutput = 'B';
                break;
            case 7:
                myOutput = 'C';
                break;
            case 8:
                myOutput = 'D';
                break;
            case 9:
                myOutput = 'E';
                break;
            case 10:
                myOutput = 'F';
                break;
            default:
                myOutput = '*';
        }

        System.out.println("The ans is " + myOutput);
    }

}
