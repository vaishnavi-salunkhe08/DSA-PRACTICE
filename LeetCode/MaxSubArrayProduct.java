package LeetCode;

public class MaxSubArrayProduct {
    public static int maxproduct(int nums[]){
        int maxpro = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i < n ; i++){
            int product = 1;
            for(int j = i ; j < n ; j ++){
                product *= nums[j];
                maxpro = Math.max(maxpro, product);
            }
        }
        return maxpro;
    }
    public static void main(String args[]){
        int nums[] = {2,3,-2,4};
        int result = maxproduct(nums);
        System.out.println(result);
    }
    
}
