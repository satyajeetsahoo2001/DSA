public class CountSort {
    public static void main(String[] args) {
        int arr[]={10,8,5,9,7,6,4,3};
        //first i will get the hightest element and that element size array i will create
        int high=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (high<arr[i]){
                high=arr[i];
            }
        }
        int [] arr2=new int[high+1];
        for (int i = 0; i <arr.length ; i++) {
            arr2[arr[i]]++;
        }
        int j=0;
        for (int i = 0; i < arr2.length ; i++) {
            while (arr2[i]>0){
                arr[j]=i;
                arr2[i]--;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
