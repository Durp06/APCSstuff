import java.util.*;
import java.util.ArrayList;

public class StartArrayLists {
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>(); // 0 length
    names.add("John");
    names.size(); //size now 1
    names.add(0, "Logan");//at index 0
    names.add(1,"John");//at index 1
    names.remove(0);//removes logan, John now at index 0, size still 2
    System.out.print(names.size());

    
    }
}
