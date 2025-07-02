package LeetCode;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicate(int num[]){
        int k = 0;
        for(int i = 0; i < num.length; i++){
            if(i == 0 || num[i] != num[i-1]){
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int num[] = {1,1,2};
        int result = removeDuplicate(num);
       for (int i = 0; i < result; i++) {
        System.out.print(num[i] + " ");
    }
    }
    
}
