import java.util.HashMap;

public class CommonElement {
    public static void printCommonElement(int arr[], int arr2[]) {
        //first one arr we will store in the hash map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, 1);
        }
        //then in next loop of arr2 i will check if that int is present or not if it is then we will print that
        for (int i : arr2) {
            if (map.containsKey(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
int arr[]={1,2,3,6,4,8,5,9};
int arr2[]={10,20,3,60,4,80,5,90};
printCommonElement(arr,arr2);
    }
}
