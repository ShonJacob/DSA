package neetcode.arraysAndHashing;

import java.util.HashMap;

//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//
//An anagram is a string that contains the exact same characters as another string,
// but the order of the characters can be different.
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("shon", "hons"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> str1 = new HashMap<>(), str2 = new HashMap<>();
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

//        put in 1 single for loop because they are the same length. Else put in 2 different for loops
        for(int i=0;i<charArray1.length;i++){
            if(str1.containsKey(charArray1[i])){
                Integer counter = str1.get(charArray1[i]);
                str1.put(charArray1[i], ++counter);
            }
            else{
                str1.put(charArray1[i], 1);
            }
            if(str2.containsKey(charArray2[i])){
                Integer counter = str2.get(charArray2[i]);
                str2.put(charArray2[i], ++counter);
            }
            else{
                str2.put(charArray2[i], 1);
            }
        }
        return str1.equals(str2);
    }

}
