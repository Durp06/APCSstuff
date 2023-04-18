public class Recurse{
    public static void main (String[] args){
        System.out.println("Main" + Reduck(4));
    }

    public static int Reduck (int x){
        if (x>0)
            System.out.println("Pass" + Reduck(x-1));
        return x+2;
    }
}