package GeekForGeeks;

public class MoveAllZeroToEnd {
    public static void movezero(int arr[]){
        int j = 0 ; // position to store next non zero element
        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j < arr.length){
            arr[j] = 0;
            j++;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,0,4,3,0,5,0};
        movezero(arr);
        for(int i = 0; i < arr.length ; i++){
            System.err.print(arr[i] + " ");
        }
    }
    
}
