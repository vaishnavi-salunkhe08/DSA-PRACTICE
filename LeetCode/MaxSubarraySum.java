package LeetCode;

public class MaxSubarraySum {
    public static int maxsubarraysum(int num[]){
        int maxsum = num[0];
        int currsum = num[0];

        for(int i = 0 ; i < num.length ; i++){
            currsum = Math.max(num[i] , currsum + num[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }

    public static void main(String args[]){
        int num[] = {-2 , 1 , -3 , 4 , -1 , 2 , 1 , -5 , 4};
        System.out.print(maxsubarraysum(num));
    }
    
}
