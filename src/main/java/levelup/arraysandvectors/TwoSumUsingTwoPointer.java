package levelup.arraysandvectors;

import java.util.Arrays;

//In the first approach we used Hashmap, it takes O(N) time and O(N) space
//In this approach, we want to avoid the extra space, so we need to sort it first and then use two pointer
// This will take O(NlogN) for sorting + O(N) for the two pointer
public class TwoSumUsingTwoPointer {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSumUsingTwoPointerFunc(new int[]{6, 5, 4, 3, 2, 1}, 6)));
    }

    public static int[] TwoSumUsingTwoPointerFunc(int[] arr, int target){
        int[] arrSorted = Arrays.stream(arr).sorted().toArray();
        int start = 0;
        int end = arrSorted.length-1;
        while(start != end){
            if(arrSorted[start]+arrSorted[end] == target){
                return new int[]{arrSorted[start],arrSorted[end]};
            }
            else if(arrSorted[start]+arrSorted[end] > target){
                end = end-1;
            }
            else{
                start = start+1;
            }
        }
        return new int[]{};
    }
}
