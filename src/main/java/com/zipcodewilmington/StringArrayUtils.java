package com.zipcodewilmington;

import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean outcome = false;
        for (String checkIndex : array) {
            if (checkIndex == value){
                outcome = true;
            }
        }
        return outcome;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++){
            result[array.length - 1 - i] = array[i];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean outcome = false;
        String[] result =  reverse(array);
        if (Arrays.equals(result, array)){
            outcome = true;
        }
        return outcome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean outcome = false;
        String english = "abcdefghijklmnopqrstuvwxyz";
        int englishCount = 0;
        String myArray = Arrays.toString(array).toLowerCase();

        for (int i = 0; i < english.length(); i++ ){
            for(int j = 0; j < myArray.length(); j++){
                if(english.charAt(i) == myArray.charAt(j)){
                    englishCount++;
                    break;
                }
            }
        }
        if(englishCount == 26){
            outcome = true;
        }
        return outcome;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for (String n : array) {
            if (n == value){
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] result = new String[array.length-1];
        int counter = 0;
        for(String n : array){
            if(!n.equals(valueToRemove)){
                result[counter] = n;
                counter++;
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] temp = new String[array.length];
        int k = 0;
        for(int i = 0; i < array.length-1; i++){
            String currentString = array[i];
            if(!currentString.equals(array[i + 1])){
                temp[k] = currentString;
                k++;
            }
        }
        String[] result = new String[k+1];
        for(int j = 0; j <= k; j++){
            result[j] = temp[j];
        }
        result[k] = array[array.length-1];
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String myArray = "";
        for (int i = 0; i < array.length-1; i++) {
            if (!array[i].equals(array[i + 1])){
                myArray += array[i];
                myArray +=  " ";
            } else { myArray+= array[i];}
        }
        myArray += array[array.length-1];
        String[] result = myArray.split(" ");
        return result;
    }
}
