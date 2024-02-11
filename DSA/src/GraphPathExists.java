import java.util.ArrayList;
import java.util.List;

public class GraphPathExists {
    public static boolean DFS(List<List<Integer>> graph,Integer src,Integer target,boolean[] vis){
        //i assumed it will give me the path id exists
        //inirially i am checking ifsrc ==target returen true
        if (src==target){
            return true;
        }
        //src vis and it will never come again
        vis[src]=true;
        //get the neighbour and call randomly
        List<Integer> data=graph.get(src);
        for (Integer integer: data) {
          //call to dfs and check if your neighbour has a path for that if yes then return true
            //here i have to check if that src i have visted then iw ill not visit again
            if (vis[integer]==false) {
                if (DFS(graph, integer, target, vis)) {
                    return true;
                    //if true will come it means your neighbour has the path so yo can go as well
                }
            }
        }
        //if my neighbour not able to find the path it means there is no way
        return false;
    }
    public static void main(String[] args) {
        int A = 5;
        int src = 1;
//        int[][] B = {
//                {1, 2},
//                {2, 3},
//                {3, 4},
//                {4, 5}
//        };
        int[][] B = {
                {1, 2},
                {4, 1},
                {2, 4},
                {3, 4},
                {5, 2},
                {1, 3}
        };
        //make a list of list and there
        // Determine the number of nodes
        int maxNode = 0;
        for (int[] edge : B) {
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
        }
        int numNodes = maxNode;
        List<List<Integer>> list=new ArrayList<>();
        // Initialize the list with empty lists
        for (int i = 1; i <= numNodes+1; i++) {
            list.add(new ArrayList<>());
        }
        for (int b[] : B) {
            //this is a directed path
//            so only we will store in directed way
            list.get(b[0]).add(b[1]);
//            list.get(b[1]).add(b[0]);//for undirected path
        }
        //call dfs
        boolean[] vis=new boolean[numNodes+2];
       if( DFS(list,src,A,vis)){
           System.out.println(1);
       }else {
           System.out.println(0);
       }
    }
}
