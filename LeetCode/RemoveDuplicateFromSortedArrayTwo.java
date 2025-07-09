package LeetCode;

public class RemoveDuplicateFromSortedArrayTwo {
    public static int duplicateRemove(int num[]){
        int k = 2;
        for(int i = 2 ; i < num.length ; i++){
            if(num[i] != num[k-2]){
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int num[] = {1,1,1,2,2,3};
        duplicateRemove(num);
        for(int i = 0 ; i < num.length ; i++){
            System.out.print(num[i] + " ");
        }
    }
    
}
