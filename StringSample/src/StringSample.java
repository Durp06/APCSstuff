
public class StringSample {

	public static void main(String[] args) {
		String name = "John";
		name = "Frank";
		String fname = new String("Roger");
		String lname = "Rabbit";
		String full=fname+" "+lname;
		System.out.println(full.length());
		System.out.println(full.charAt(full.length()-1));
		
		for(int i = 0; i < full.length(); i++) {
			System.out.println(full.charAt(i));
		}
		System.out.println(full.substring(6));
		System.out.println(full.substring(6,11));
		System.out.println(full.substring(0,5));
		System.out.println("");
		
		for (int i=0; i<full.length(); i++) {
			if(full.charAt(i)== ' ') {
				System.out.println(full.substring(0,i));
			}
		}
	}
}