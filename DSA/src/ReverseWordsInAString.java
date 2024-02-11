import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInAString {
    public static void main(String[] args) {

        String s=" string a in words the replacing am i here";
        //methos 1
//        String[] str = s.split(" ");
//        Collections.reverse(Arrays.asList(str));
//        String ans = String.join(" ", str);
//        System.out.println(ans); ;
        //method 2 approach is that ki we will rotate all the string then when space wil come from there we have to rotate the word
            char[] chars=s.toCharArray();
            int i =0;
            int j =chars.length-1;
            //rever the whole string with the chars
            while(i<j){
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;
                j--;
            }
            int z=0;
        for (int k = 0; k <chars.length ; k++) {
            if (chars[k]==' '){
                reverse(chars,z,k-1);
                z=k+1;
            }
        }
            System.out.println(chars);
            //when space will comme reverse the

    }
    public static void reverse(char[] chars,int start,int end){
        while (start<end){
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
    }
}
