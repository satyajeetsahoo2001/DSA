import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,8,5,9,7,6,4,3};
        for (int i = 0; i < arr.length; i++) {
            //so we will pick this index and we will put a correct value
            int value=arr[i];
            int smallestValueIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                //from next index i will search if i can get smaller element that the value then i will store that index
                //and in last i will swap the smallest one with that index
                if (value>arr[j]){
                    smallestValueIndex=j;
                }
            }
            int temp=arr[smallestValueIndex];
            arr[smallestValueIndex]=value;
            arr[i]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
