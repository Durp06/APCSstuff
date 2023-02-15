import java.util.*;
import java.io.*;
public class MAIN {
	public static void main(String[] args) {
		System.out.println(findFirst("I am a bad, bad boy", "bad", "good"));
		System.out.println(findAll("I am a bad, bad boy", "bad", "good"));
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a filepath: ");
	String filepath = input.nextLine();
	String temp = "";
	String newSentance = "";
	try {
	Scanner contents = new Scanner (new File("src/" + filepath));
	
	System.out.print("Enter word to be replaced: ");
	String search1 = input.nextLine();
	System.out.print("Enter word to replace " + search1 + " with: ");
	String replaced1 = input.nextLine();
	System.out.print("Do you want to replace only the first instance of this word (Y/N)");
	String method = input.nextLine();
	method = method.toLowerCase();
	
	
	while(contents.hasNextLine()){
        String file = contents.nextLine();
        if (method.equals("y") || method.equals("yes")) {
        	temp = findFirst(file, search1, replaced1);
        }
        else if (method.equals("n") || method.equals("no")) {
        	temp = findAll(file, search1, replaced1);
        }
        else {
        	System.out.println("That is not a valid input, must be yes, no, Y, N");
    		System.exit(0);
        }
        
        newSentance += temp + "/n";
        temp = "";
        
	}
      contents.close();
    
      File file = new File ("newSentance.txt");
      FileWriter fw = new FileWriter(file.getAbsoluteFile());
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(newSentance);
      bw.close();
      fw.close();
      
	}
	catch(Exception FileNotFoundException) {
		System.out.println("Unrecognized filepath");
	}
	
	}
	public static String findFirst(String original, String search, String replaced) {
		
		String sentance = original;
		
		if (sentance.indexOf(search) != -1) {
		sentance = original.substring(0, original.indexOf(search)) + replaced + original.substring(original.indexOf(search)+ search.length());
		
		return sentance;
		}
		
		else
		return original;
		}

public static String findAll(String original, String search, String replaced) {
		
		String sentance = original;
		
		while (sentance.contains(search)) {
		sentance = findFirst(sentance, search, replaced);
		}
		return sentance;
}

	
}
