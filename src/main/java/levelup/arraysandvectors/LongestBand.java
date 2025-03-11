package levelup.arraysandvectors;

import java.util.*;

// To find the longest subsequence of consecutive numbers
// In general, every array has 2^N subsets
// We can do this easily by sorting and then iterating and checking if numbers are subsequent in O(NlogN) + O(N) time
// A more efficient approach is to go through each element
// and lookup if it is the start of a band and iterate through it in O(N) + O(N) time
public class LongestBand {

    public static void main(String[] args) {
        System.out.println(LongestBandFunc(new int[]{5, 1, 2, 3, 7, 9, 11}));
    }

    private static List<Integer> LongestBandFunc(int[] ints) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int largestBand = 0;
        for(int n: ints){
            set.add(n);
        }
        for(int n: set){
            //check if it is a starting of a band
            if(!set.contains(n-1)){
                List<Integer> newBand = new ArrayList<>();
                newBand.add(n);
                int count = 1;
                while(set.contains(n++)){
                    newBand.add(n);
//                    n++;
                    count++;
                }
                if(count>largestBand){
                    largestBand = count;
                    result = newBand;
                }
            }
        }
        System.out.println("Largest Band is :"+ largestBand);
        return result;
    }
}
