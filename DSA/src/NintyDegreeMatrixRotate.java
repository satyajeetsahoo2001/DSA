    public class NintyDegreeMatrixRotate {
        public static void main(String[] args) {

            //13 9 5 1
            //14 10 6 2
            //15 11 7 3
            //16 12 8 4    out put
            //here every row willbe column and every column will be row
            int[][] arr = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
           //for rotate an array 90 degree we have to go through 2 steps ->1->transpose 2->reverse each row
            //method 2
            for (int i = 0; i < arr.length; i++) {
                //here we will get
                // 1 5 9 13
                //2 6 10 14
                //3 7 11 15
                //4 8 12 16  made each row to column
                for (int j = 0; j <arr.length ; j++) {
                    if (i>j){
                        //swapped
                        arr[i][j]=arr[i][j]+arr[j][i];//6+4=10
                        arr[j][i]=arr[i][j]-arr[j][i];//10-4=6
                        arr[i][j]=arr[i][j]-arr[j][i];//10-6=4
                    }

                }
            }
            //now reverse the each row
            for (int i = 0; i <arr.length ; i++) {//row
                //arr[fixed as i][we have to increase and decrease] as per need
                int start=0;//start index of i row arr[i][start]
                int end=arr[i].length-1;//end index if i row arr[i][end]
                while (start<end){
                    //swapping
                    arr[i][start]=arr[i][start]+arr[i][end];
                    arr[i][end]=arr[i][start]-arr[i][end];
                    arr[i][start]=arr[i][start]-arr[i][end];
                    start++;
                    end--;
                }
            }
            for (int i = 0; i <arr.length ; i++) {

                for (int j = 0; j <arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

