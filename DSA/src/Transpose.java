public class Transpose {
    public static class Node{
        int value;
        Node next;
        Node (int value){
            this.value=value;
        }
    }
    static Node head;//this is the head
    public static void main(String[] args) {
        //here every row willbe column and every column will be row
//        int[][] arr = {{1, 2, 3, 4},
//                       {5, 6, 7, 8},
//                       {9, 10, 11, 12},
//                      {13, 14, 15, 16}};
        //method 1
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr.length ; j++) {
//                if (i==j){
//                    break;
//                }
//                //swapped
//                arr[i][j]=arr[i][j]+arr[j][i];//6+4=10
//                arr[j][i]=arr[i][j]-arr[j][i];//10-4=6
//                arr[i][j]=arr[i][j]-arr[j][i];//10-6=4
//            }
//        }
         //method 2
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr.length ; j++) {
//                if (i>j){
//                    //swapped
//                    arr[i][j]=arr[i][j]+arr[j][i];//6+4=10
//                    arr[j][i]=arr[i][j]-arr[j][i];//10-4=6
//                    arr[i][j]=arr[i][j]-arr[j][i];//10-6=4
//                }
//
//            }
//        }
//        for (int i = 0; i <arr.length ; i++) {
//
//            for (int j = 0; j <arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }


                Node n1=new Node(10);
                Node n2=new Node(20);
                Node n3=new Node(30);
                n1.next=n2;
                n2.next=n3;
                head=n1;
//print
        Node temp=head    ;
                while(temp!=null){
                    System.out.println(temp.value);
                    temp=temp.next;
            }

    }
}
