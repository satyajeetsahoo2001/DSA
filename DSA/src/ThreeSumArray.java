import java.util.Arrays;

public class ThreeSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 4, 7, 8};
        Arrays.sort(arr);
        int target = 12;//arr[i]+arr[j]+arr[k]=target; so target-arr[i]=arr[j]+arr[k];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                int tar = target - arr[i];//target-arr[i] in first i need 11 now
                int j = i + 1;//next index
                int k = arr.length - 1;//last index
                while (j<k){
                    if (arr[j]+arr[k]==tar){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        //ignoring duplicates
                        while (j<k&&arr[j]==arr[j+1])j++;
                        while (j<k&&arr[k]==arr[k-1])k--;
                        j++;
                        k--;
                    } else if (arr[j]+arr[k]<tar) {
                        j++;
                    }else {
                        k--;
                    }
                }

            }

        }

    }
}
