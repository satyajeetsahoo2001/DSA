import java.util.HashSet;

public class FirstRepeatingCharHashSet {
    public static char printTheRepeatingChar(String data){
        //in loop we will get one one char and then that we will check if that char is already in that hash set then that will be our ans
        HashSet<Character> characters=new HashSet<>();
        for (int i = 0; i < data.length(); i++) {
            char c=data.charAt(i);
            if (characters.contains(c)){
                return c;
            }else {
                characters.add(c);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(printTheRepeatingChar("satyajeet"));
    }
}
