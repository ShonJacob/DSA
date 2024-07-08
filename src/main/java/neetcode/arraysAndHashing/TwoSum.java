package neetcode.arraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;

//Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
//
//You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
//
//Return the answer with the smaller index first.
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumHashMap(new int[]{1, 2, 3}, 3)));
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        //hashmap approach
        HashMap<Integer, Integer> map = new HashMap<>();
        int i =0;
        while(i<=nums.length-1){
            int value = nums[i];
            if(map.containsKey(target-value)){
                if(map.get(target-value) != i){
                    return new int[]{map.get(target-value), i};
                }
            }
            else{
                map.put(value, i);
            }
            i++;
        }
        return new int[]{};
    }
}
