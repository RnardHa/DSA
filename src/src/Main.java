import ArrayAndHashing.*;
import SlidingWindow.BestTimeToBuyAndSellStock;
import SlidingWindow.LongestSubstringWithoutRepeatingCharacter;
import TwoPointers.ContainerWithTheMostWater;
import TwoPointers.ThreeSum;
import TwoPointers.TwoSumII;
import TwoPointers.ValidPalindrome;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i = 1;
        // Arrays and Hashing
        System.out.println(i++ + ". Contains duplicate: " + new ContainsDuplicate().solution());
        System.out.println(i++ + ". Valid anagram: " + new ValidAnagram().solution());
        System.out.println(i++ + ". Two sum: " + Arrays.toString(new TwoSum().solution()));
        System.out.println(i++ + ". Group anagrams: " + new GroupAnagrams().solution());
        System.out.println(i++ + ". Top k freq element: " + Arrays.toString(new TopKFrequentElements().solution()));
        System.out.println(i++ + ". Product of array except self: " + Arrays.toString(new ProductOfArrayExceptSelf().solution()));
        System.out.println(i++ + ". Longest consecutive sequence: " + new LongestConsecutiveSequence().solution());

        // Two pointers
        System.out.println(i++ + ". Valid palindrome: " + new ValidPalindrome().solution());
        System.out.println(i++ + ". Two sum II: " + Arrays.toString(new TwoSumII().solution()));
        System.out.println(i++ + ". Three sum: " + new ThreeSum().solution());
        System.out.println(i++ + ". Container with the most water: " + new ContainerWithTheMostWater().solution());

        // Sliding Window
        System.out.println(i++ + ". Best time to buy and sell stock: " + new BestTimeToBuyAndSellStock().solution());
        System.out.println(i++ + ". Longest Substring Without Repeating Characters: " + new LongestSubstringWithoutRepeatingCharacter().solution());
    }
}