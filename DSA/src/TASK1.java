import java.util.HashMap;
import java.util.Map;

public class TASK1 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int majorityElement(final int[] A) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:A){
            if(map.containsKey(a)){
                int i=map.get(a);
                map.put(a,i+1);
            }else{
                map.put(a,1);
            }
        }
        int half=A.length/2;
        for(Integer i:map.keySet()){
            if(map.get(i)>half){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]  ints={2,1,2};
        System.out.println(majorityElement(ints));
    }
}
