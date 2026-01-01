package loopStatement;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] empNames = new String[3];
		empNames[0] = "Alice";
		empNames[1] = "Bob";
		empNames[2] = "Charlie";
		
		//for loop
		for(int i=0; i<empNames.length ; i++) {
			System.out.println(empNames[i]);
		}
		
		//for-each loop ==> iterate for each and every value of pre-defined list
		// for ( datatype variable : list){ code}		
		for( String val :  empNames) {
			System.out.println(val);
		}
		
		//Create HashSet with 5 values
		Set<String> empSet = new HashSet<String>();
		empSet.add("David");
		empSet.add("Eva");
		empSet.add("Frank");
		empSet.add("Grace");
		empSet.add("Hannah");
		
		//for loop
		//for(int i=0; i<empSet.size() ; i++) {
		//	System.out.println(empSet.get(i)); // not possible
		//}
		
		//for-each loop
		for( String val :  empSet) {
			System.out.println(val);
		}

	}

}
