public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(6));
        int n = 100;
        for (int i=1; i<=n; i++){
            int f = fib(i);
            System.out.println("fib(" + i + ") = " + f);
        }
        System.exit(0);
    }

    public static int fib (int n){
        if (n<=2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
}
