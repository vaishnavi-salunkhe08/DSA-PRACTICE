package LeetCode;

public class MergeSortedArray {
    public static void merge(int num1[] , int m , int num2[] , int n){
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while(p1 >= 0 && p2 >= 0){
            if(num1[p1] > num2[p2]){
                num1[p] = num1[p1];
                p1--;
            }
            else{
                num1[p] = num2[p2];
                p2--;
            }
            p--;
        }

        while(p2 >= 0){
            num1[p] = num2[p2];
            p2--;
            p--;
        }
    }
    public static void main(String args[]){
        int num1[] = {1,2,3,0,0,0};
        int num2[] = {2,5,6};
        int m = 3;
        int n = 3;
        merge(num1, m, num2, n);
        for(int i = 0; i < num1.length ; i++){
            System.out.print(num1[i] + " ");
        }

    }
    
}
