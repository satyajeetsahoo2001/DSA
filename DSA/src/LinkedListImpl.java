public class LinkedListImpl {
    //make a static node class
    public static class Node{
        int value;
        Node next;
        Node (int value){
            this.value=value;
        }

    }
    //here we will store the head
    static Node head;

    public static void main(String[] args) {
        Node  node=new Node(10);
        Node  node2=new Node(20);
        Node  node3=new Node(30);
        Node  node4=new Node(40);
        Node  node5=new Node(50);
//        now we sset the 5 nodes values
        //and now we will store the next
        node.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        head=node;
        //here we will call to add first
//        head=addFirst(head,5);
        //here we will call to add last
//        head=addLast(head,60);
        //here we will add at a index
//        head=addAt(head,25,2);
        // now we will print the linked list
        //remove first
//        head=removeFirst(head);
        //remove last
//        head=removeLast(head);
        //remove at
//        head=removeAt(head,2);
        //get the size of  the linked list
//        int count=size(head);
//        System.out.println("size is "+count);
        //finding a number is exist or not
//        System.out.println(findNum(head,50));
        //get the middle of the linked list
        //so first get the size and divided by 2 then get that index
//        int index=size(head)/2;

//        System.out.println("mid index value is "+getValueOfIndex(head,index));
        System.out.println(midValue(head));

        //printing the linked list
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    //add at first
    public static Node addFirst(Node head,int value){
        Node node=new Node(value);
        //here the new element will point to head
        node.next=head;
        //and we will make the head to this new node cause this is the first
        head=node;
        return head;
    }
    //add last in linked list
    public static Node addLast(Node head,int value){
        Node node=new Node(value);
        //get the last node first
        Node tail=head;
        while (tail.next!=null){
            //so by using this we will able to get the last element so we will find a element which next is null that element is last element
            tail=tail.next;
        }
        //then point that node to new one
        tail.next=node;
        return head;

    }
    //now we will add at a index of linked list
    public static Node addAt(Node head,int value,int index){
        //if add first
        if (index==0){
            head=addFirst(head,value);
        }
        //if add last
        //do something
        Node node=new Node(value);
        //if want to add in a particular index then get the previous index first
        Node temp=head;
        for (int i = 1; i <index ; i++) {//3 index means 2 times loop will run  //if 3 index then the 2 index we will get so 10,20,30,40 -> 10 to 20 (1 jump),-.20-30(2 jump) and after 2 jump we can find the index 2 (
            //here we will get the previous index
            temp=temp.next;
        }
        Node nextE=temp.next;//if 20 that next index means 30
        //and new node will point to next
        node.next=nextE; // it will point to next element
        //then that previous node point to new node
        temp.next=node;// means 2 index will point to next new node
        return head;
    }
    //remove first element
    public static Node removeFirst(Node head){
        head=head.next;
        return head;

    }
    //remove last element
    public static Node removeLast(Node head){
        //get the 2nd last and add next to null
        Node temp=head;
        while (temp.next.next!=null){
            //here we got the 2nd last
            temp=temp.next;
        }
        temp.next=null;
        return head;

    }
    //remove a particular index
    public static Node removeAt(Node head,int index){
        Node temp=head;
   //first got the previous of that index
        //if index 3= 0,1 will run in 0-> i will jump to
        for (int i = 0; i <index-1 ; i++) {//index 3 means loop will run for 2 time cause if we jump for 2 time we will get 2 nd index
            temp=temp.next;
        }
   ///then point to next.next element so that middle part will miss so we will able to remove that element
        temp.next=temp.next.next;
        return head;

    }
    public  static int size(Node head){
        Node temp=head;
        //check when null will come there you will stop
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    //by using this i will find that , that number is present or not
    public static boolean findNum(Node head,int value){
        Node temp =head;
        //so in loop i will try to see if  the value will match with actual value then  we will send true
        while (temp!=null){
          if (temp.value==value){
              //in first we will check
              return true;
          }else {
              //if not match then we will to to next element
              temp=temp.next;
          }
        }
        return false;
    }
    public static int getValueOfIndex(Node head,int index){
        Node temp=head;
        for (int i = 0; i <index ; i++) {//for 0 i will get the 1 index then in second jump i will get the 2 index
            temp=temp.next;
        }
        return temp.value;

    }
    public static int midValue(Node head){
    Node temp=head;
    Node s=head;
    Node f=head;
        while (f.next!=null&&f.next.next!=null){
            s=s.next;//this will be my n/2
            f=f.next.next;// and this is n
        }
        return s.value;
    }

}
