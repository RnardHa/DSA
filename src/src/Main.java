import ArrayAndHashing.*;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++ + ". Contains duplicate: " + new ContainsDuplicate().solution());
        System.out.println(i++ + ". Valid anagram: " + new ValidAnagram().solution());
        System.out.println(i++ + ". Two sum: " + Arrays.toString(new TwoSum().solution()));
        System.out.println(i++ + ". Group anagrams: " + new GroupAnagrams().solution());
        System.out.println(i++ + ". Top k freq element: " + Arrays.toString(new TopKFrequentElements().solution()));
        System.out.println(i++ + ". Product of array except self: " + Arrays.toString(new ProductOfArrayExceptSelf().solution()));
    }
}