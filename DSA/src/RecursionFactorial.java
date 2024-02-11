public class RecursionFactorial {
    public static Long factorial(Integer n){
        if (n==0){
            return 1L;
        }
        //lets say we have 3 so that number and that previoud factorial i need mean 3*(3-1) -->2*(2-1)->1*(1-1)->0(return 1)
        return n*factorial(n-1);
    }
    public static void printUp(Integer n){//5 - 4 -3 2 1
        if (n==0){
            return;
        }
        printUp(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
//        System.out.println(factorial(3));
        printUp(5);
    }
}
