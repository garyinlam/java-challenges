package com.nology.collections_05;

import java.util.*;

public class Challenge {

    // -------------- FOUNDATION --------------

    /**
     * Converts a comma-separated-list into a List
     *
     * @param csv - The csv string we are converting e.g. Andy,Sam,Bex,Ollie
     * @return Converted List
     */
    public List<String> csvToList(String csv) {
        return Arrays.asList(csv.split(","));
    }

    /**
     * Slices a list given a start & stop indexes. Make sure the indexes are within the bounds of the array
     *
     * @param items - list we are slicing
     * @param start - Start Index
     * @param stop - Stop Index
     * @return Sliced list from start to stop indexes
     */
    public List<String> getSlicedArray(List<String> items, int start, int stop) {
        ArrayList<String> tempList = new ArrayList<>();

        if(start > items.size() || stop > items.size()){
            return new ArrayList<>();
        }

        for (int i = start; i <= stop; i++) {
            tempList.add(items.get(i));
        }
        return tempList;
    }

    /**
     * Swaps two items in an array
     * @param items - The list we are swapping elements in. e.g. [
     * @param first - First index
     * @param second
     * @return List with swapped elements
     */
    public List<String> swapElements(List<String> items, int first, int second) {
        String temp = items.get(first);
        items.set(first,items.get(second));
        items.set(second,temp);
        return items;
    }

    // -------------- INTERMEDIATE --------------

    /**
     * Removes all odd numbers from a list of integers
     *
     * @param numbers - The list we are filtering
     * @return List of even numbers
     */
    public List<Integer> removeOddNumbers(List<Integer> numbers) {
        ArrayList<Integer> retVal = new ArrayList<>();
        numbers.forEach(integer -> {
            if (integer % 2 == 0) {
                retVal.add(integer);
            }
        });
        return retVal;
    }

    /**
     * Filter a list to only return unique/distinct items in an array without using a Set
     *
     * Extension: How would you do this using sets?
     *
     * @param items - The list we are filtering
     * @return The distinct/unique items in the list
     */
    public  List<String> getUniqueItems(List<String> items) {
        ArrayList<String> retVal = new ArrayList<>();
        //Set<String> strSet = new HashSet<>();


        items.forEach(s -> {
            if (!retVal.contains(s)){
                retVal.add(s);
            }
            //strSet.add(s);
        });

        //return new ArrayList<>(strSet);
        return retVal;
    }

    /**
     * Using a Hash Map, create a binary translator for the first 5 letters of the alphabet. If the letter doesn't exist, return -1
     *
     * @param letter - Letter we are translating
     * @return The binary code translation
     */
    public int getBinaryTranslation(char letter) {
        HashMap<Character, Integer> binaryMap = new HashMap<>();
        binaryMap.put('a',01100001);
        binaryMap.put('b',01100010);
        binaryMap.put('c',01100011);
        binaryMap.put('d',01100100);
        binaryMap.put('e',01100101);

        return binaryMap.getOrDefault(Character.toLowerCase(letter), -1);
    }

    // -------------- ADVANCED --------------

    /**
     * Without using any helper functions. Implement a binary search algorithm to search for an item in a sorted array.
     * A binary search uses a "Divide and Conquer" approach. It should divide an array in two, check if the middle value is the searchItem,
     * else if the searchItem is greater than the middle, repeat the same process in the top half of the array, and vise versa for
     * the lower half if the searchItem is less than the middle
     *
     * EXTENSION: Once you've completed this without recursion. Consider how this could be done using recursion, you can even alter the method declaration ;)
     *
     * @param sortedArr
     * @param searchItem
     * @return The number of iterations required to find the item
     */
    public int findItem(List<Integer> sortedArr, int searchItem) {
        int middle = sortedArr.get(sortedArr.size()/2);
        if (middle == searchItem) {
            return 1;
        } else {
            if (middle > searchItem) {
                return findItem(sortedArr.subList(0,sortedArr.size()/2),searchItem) + 1;
            } else {
                return findItem(sortedArr.subList(sortedArr.size()/2,sortedArr.size()),searchItem) + 1;
            }
        }
    }
}
