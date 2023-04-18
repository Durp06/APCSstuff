public class Mystery {
    public static void main(String[] args) {
        System.out.println(mystery(5));
    }

    public static int mystery(int w){
        if(w<0)
            return 0;
        int x = mystery (w-2);
        return w-x;
    }
}
