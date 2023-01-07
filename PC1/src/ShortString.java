
public class ShortString {

	public static void main(String[] args) {
		
		System.out.println(shortString( "Red",  "Yellow"));

	}
		
   public static String shortString(String x, String y) {
	   
	   if (x.charAt(0) < y.charAt(0)) 
		   return x;
	   
	   else if (x.charAt(0) == y.charAt(0)) {
		   if (x.length() < y.length()) 
			   return x;
		   else return y;
	   } else return y;
   
   }

			/*   int first =0, second =0;
	   for (int i =0; i < ab.lenght (); i++) {
		   if (ab.charAt(i) == x.charAt(0) first =i);
		   if (ab.charAt(i) == y.charAt(0) second =i);
	   }
			   if (first == second) {
				   if(x.length() < y.length())return x;
				   else return y
				   else if (first < second)return x;
				   else return y
			   }
		
   }*/
}
