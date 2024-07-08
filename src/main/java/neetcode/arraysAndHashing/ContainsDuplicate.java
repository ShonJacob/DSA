package neetcode.arraysAndHashing;

import java.util.HashSet;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println((hasDuplicate(new int[]{1,2,3,3})));
    }

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int num : nums){
            if(map.contains(num)){
                return true;
            }
            else{
                map.add(num);
            }
        }
        return false;
    }
}
