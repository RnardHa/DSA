import ArrayAndHashing.*;
import BinarySearch.*;
import Heap.KClosestPointToOrigin;
import Heap.LastStoneWeight;
import SlidingWindow.BestTimeToBuyAndSellStock;
import SlidingWindow.LongestSubstringWithoutRepeatingCharacter;
import SlidingWindow.PermutationInString;
import Stack.*;
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
        System.out.println(i++ + ". Permutation is string: " + new PermutationInString().solution());

        // Stack
        System.out.println(i++ + ". Valid parentheses: " + new ValidParentheses().solution());
        System.out.println(i++ + ". Eval RPN: " + new EvaluateRPN().solution());
        System.out.println(i++ + ". Generate parentheses: " + new GenerateParentheses().solution());
        System.out.println(i++ + ". Daily temp: " + Arrays.toString(new DailyTemperature().solution()));
        System.out.println(i++ + ". Car fleet: " + new CarFleet().solution());

        //Binary Search
        System.out.println(i++ + ". Binary search: " + new BinSearch().solution());
        System.out.println(i++ + ". Search 2D matrix: " + new Search2DMatrix().solution());
        System.out.println(i++ + ". Koko eating banana: " + new KokoEatingBanana().solution());
        System.out.println(i++ + ". Find min in rotated sorted arr: " + new FindMinInRotatedSortedArr().solution());
        System.out.println(i++ + ". Search in rotated sorted arr: " + new SearchInRotatedSortedArr().solution());

        //Heap
        System.out.println(i++ + ". Last stone weight: " + new LastStoneWeight().solution());
        System.out.println(i++ + ". K closest to origin: " + Arrays.deepToString(new KClosestPointToOrigin().solution()));


    }
}