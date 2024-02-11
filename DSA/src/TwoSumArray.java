import java.util.HashMap;

public class TwoSumArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 4, 7, 8};
        int target=8;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
        int tar=target-arr[i];//8-1 =7 I HAVE TO FIND 7 SO I WILL CHECK IN HASH MAP IF IT IS THERE THEN GREAT // OR ELSE ADD IN MAP
            if (map.containsKey(tar)){
                System.out.println(map.get(tar)+"-"+i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}