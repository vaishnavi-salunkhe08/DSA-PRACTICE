package GeekForGeeks;

public class ReverseAnArray {
    public static void reverseArray(int num[]){
        int firstElement = 0;
        int lastElement = num.length - 1;
        while(firstElement < lastElement){
            int temp = num[firstElement];
            num[firstElement] = num[lastElement];
            num[lastElement] = temp;

            firstElement ++;
            lastElement --;
        }
    }
    public static void main(String args[]){
        int num[] = { 1, 4, 3, 2, 6, 5};
        reverseArray(num);
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    
}
