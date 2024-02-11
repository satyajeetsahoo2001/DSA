public class Test {

        public static  int[][] solve(int A) {
            if(A==0)return new int[0][0];
            int [][] a=new int[A][A];
            for(int i=0;i<A;i++){
                for(int j=0;j<=i;j++){
                    if(j==0||j==i){
                        a[i][j]=1;
                    }else{
                        a[i][j]=a[i-1][j-1]+a[i-1][j];
                    }

                }
            }
            return a;
        }

    public static void main(String[] args) {
            int [][] a=solve(5);
        for (int b[]: a) {
            for (int i: b) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
