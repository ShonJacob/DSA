package levelup.arraysandvectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumUsingHashmap {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumFunc(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)) {
        }, 7)));
    }

    private static int[] twoSumFunc(ArrayList<Integer> arr, Integer target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            Integer value = arr.get(i);
            if(map.containsKey(target-value)){
                return new int[]{target-value, arr.get(i)};
            }
            else{
                map.put(value, i);
            }
        }
        return new int[0];
    }
}
