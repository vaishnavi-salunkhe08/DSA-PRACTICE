package GeekForGeeks;

public class SecondLargestElement {
    public static int secondLargestElement(int arr[]){
        int largestElement = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largestElement){
                secondLargest = largestElement;
                largestElement = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] < largestElement){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
    public static void main(String args[]){
        int arr[] = {10 , 10 , 10};
        int result = secondLargestElement(arr);
        System.out.println("second largest element is " + result);
    }
    
}
