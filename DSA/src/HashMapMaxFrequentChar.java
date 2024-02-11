import java.util.HashMap;

public class HashMapMaxFrequentChar {
    public static char checkChar(String data){
        int i=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while (i<data.length()){
        //if that is there already there then we have to improve increase by one
            if (map.containsKey(data.charAt(i))){
                int value=map.get(data.charAt(i));
                map.put(data.charAt(i),value+1);
            }else {
        //in hash map we have to store the data if that is no in hash map and in valueb we will store one
                map.put(data.charAt(i),1);
            }
            i++;
        }
        //now we have stored and now we have to check which key has bigger value that will be our answer
        char keyData=Character.MIN_VALUE;
        int value=0;
        for (Character key: map.keySet()) {
            //by one one key we will see which has bigger value that key and value we will store
            if (map.get(key)>value){
                value=map.get(key);
                keyData=key;
            }
        }
        return keyData;
    }

    public static void main(String[] args) {
    String data="bbbaaaacccccdddd";

        System.out.println(checkChar(data));
    }
}
