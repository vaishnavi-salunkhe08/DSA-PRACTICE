package GeekForGeeks;

public class RotateArray {
    public static void rotate(int arr[] , int d){
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d-1); // reverse the d element
        reverse(arr, d, n-1); //reverse the remaiing element
        reverse(arr, 0, n-1); // reverse whole array
    }

    public static void reverse(int arr[] , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int d = 2;
        rotate(arr, d);

         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
