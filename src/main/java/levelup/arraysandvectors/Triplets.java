package levelup.arraysandvectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// we need 3 numbers which add to a given target and all need to be in sorted order.
// We need to find all pairs and sort them also
//The approach is to sort the array first, and then for each number,do a TwoSumUsingTwoPointer on the rest of the array
// this will result in O(N2)
public class Triplets {
    public static void main(String[] args) {
        System.out.println(TripletsFunc(new int[]{6,5,4,10,22,11,9,8,1,2,3,7,15}, 15));
    }

    private static List<List<Integer>> TripletsFunc(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(arr.length <3){
            return result;
        }

        int[] arrSorted = Arrays.stream(arr).sorted().toArray();
        for(int i=0;i<=arrSorted.length-3;i++){
            //do the twosum using two pointer
            int start = i+1;
            int end = arrSorted.length-1;
            while(start < end){
                if(arrSorted[i] + arrSorted[start] + arrSorted[end] == target){
                    List<Integer> iterationResult = new ArrayList<>();
                    iterationResult.add(arrSorted[i]);
                    iterationResult.add(arrSorted[start]);
                    iterationResult.add(arrSorted[end]);
                    result.add(iterationResult);
                    start++;
                    end--;
                }
                else if(arrSorted[i] + arrSorted[start] + arrSorted[end] > target){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return result;
    }
}
