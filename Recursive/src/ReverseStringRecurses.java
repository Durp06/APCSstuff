public class ReverseStringRecurses {
    public static void main(String[] args) {
        System.out.println(reverse("supercala fragilious"));

    }

    public static String reverse(String text){
        if(text.length()==3) return text;
        else{
            String result="";
            result=text.charAt(text.length()-1)+reverse(text.substring(0, text.length()-1));
            return result;
        }
    }
}
