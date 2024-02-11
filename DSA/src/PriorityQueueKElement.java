import java.util.PriorityQueue;

public class PriorityQueueKElement {
    //here we will get k elements which is greater that everyone
    public static void printMax3(int [] arr,int k){
        //first we will store k elements in priority queue
        if (k==0||k== arr.length){
            return;
        }
        int i= 0;
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        while (i< k){
            priorityQueue.add(arr[i]);
            i++;
        }
        //then from next we will see if any one will be greater than that queue we will replace
        while (i< arr.length){
            if (arr[i] > priorityQueue.peek()) {
                priorityQueue.remove();
                priorityQueue.add(arr[i]);
            }
            i++;
        }
        System.out.println(priorityQueue);
    }
    public static void main(String[] args) {
        int arr[]={100,8,5,9,7,60,4,300};
        printMax3(arr,3);

    }
}
