package levelup.arraysandvectors;

//check the peaks first and then count the slopes, we can do it in O(N)
public class Moutain {
    public static void main(String[] args) {
        System.out.println(MountainFunc(new int[]{5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4}));
    }

    private static int MountainFunc(int[] arr) {
        int largestPeak = 0;
        for(int i=1;i<arr.length-1;){
            //check both sides of i to see if both are decreasing
            if(arr[i-1] < arr[i] && arr[i+1] < arr[i]){
                //i is a peak
                int count = 1;
                int j = i;
                //count to the left
                while(j>0 && arr[j]>arr[j-1]){
                    j--;
                    count++;
                }
                //count to the right
                //using i will move the pointer without having to use another variable
                while(i<arr.length-1 && arr[i]>arr[i+1]){
                    i++;
                    count++;
                }
                largestPeak = Math.max(largestPeak, count);
            }
            else{
                //i is not a peak
                i++;
            }
        }
        return largestPeak;
    }
}
