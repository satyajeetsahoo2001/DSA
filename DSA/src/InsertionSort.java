public class InsertionSort {
    public static void main(String[] args) {
            int arr[]={10,8,5,9,7,6,4,3};
        //like we have to pick the element and look backward where it will fit
        for (int i = 1; i <arr.length ; i++) {
            //and we are starting from 1 cause first one is already sorted
            //get that element cause if it will small then instead of this i will place the previous element
            int curr=arr[i];
            //with this previous i will check if this is greater than it then i will place on next index and here i will store my curr
            int previousIndex=i-1;
            //previous should not less than zero and that previous value  if that is greater than curr then i will go
             while (previousIndex>=0&&arr[previousIndex]>curr){
                 arr[previousIndex+1]=arr[previousIndex];
                 previousIndex--;

            }
             arr[previousIndex+1]=curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
