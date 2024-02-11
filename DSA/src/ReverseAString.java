public class ReverseAString {
    public static void main(String[] args) {
        String data="satyajeet";//thne we have to make a program where i will reverse the words in a string
        char[] chs=data.toCharArray();
        int i=0;
        int j=chs.length-1;
        while (i<j){
            char temp=chs[i];
            chs[i]=chs[j];
            chs[j]=temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(chs));
    }
}
