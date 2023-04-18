public class Recursion {
    public static void main(String[] args) {
        int n=10;
        int f=repeat(n);
        System.out.println("Main:" + n + " " + f);

    }

    public static int repeat (int n){
        if(n==1)
            return 1;
        else
            System.out.println("Pass" + repeat(n-1));
            return n;
    }
}
