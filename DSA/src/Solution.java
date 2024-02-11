import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        //first i will check if the number (target-int[]) available in that map then i will get the answer{}

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int minorTarget=target-nums[i];
            if(map.containsKey(minorTarget)){
                int[] iii={i,map.get(minorTarget)};
                return iii;
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[2];
    }

    public static void main(String[] args) {
        int[] ints={1,2,3,4,5,6};
        System.out.println(Arrays.toString(twoSum(ints, 9)));
    }
}