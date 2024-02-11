public class RemoveConsiqutiveChar
{
    public static void main(String[] args) {
        String data="aaabbbcc";
        int count =1;
        char[] ch=data.toCharArray();
        int j=0;//candidate
        String s="";
        int i=1;
        for (i = 1; i <data.length() ; i++) {

            if (ch[i]==ch[j]){
                count++;

            }else {
//                    System.out.println(count);
                if (count==3){
                    s+=ch[j];
                    j=i;//where i will get the mismatch i will update the candidate after adding that candidate
                    count=1;
                }
                else {
                    for (int k = j; k <i ; k++) {
                        s+=ch[j];//if it is not 2 then we have to add the all
                    }
                     j=i;   //where i will get the mismatch candidate i will update the candidate after adding that datas
                    count=1;
                }
            }
        }
        if (count==3){
            s+=ch[j];
//            j=i;//where i will get the mismatch i will update the candidate after adding that candidate
//            count=1;
        }
        else {
            for (int k = j; k <i ; k++) {
                s+=ch[j];//if it is not 2 then we have to add the all
            }
//            j=i;   //where i will get the mismatch candidate i will update the candidate after adding that datas
//            count=1;
        }
            System.out.println(s);
    }
}
