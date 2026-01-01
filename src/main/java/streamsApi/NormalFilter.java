package streamsApi;

import java.util.ArrayList;
import java.util.List;

public class NormalFilter {

	public static void main(String[] args) {
		// There are multiple numbers. Store them in a list, and finally separate the even numbers from this particular list (1,2,3,4,5,6,7,8,9,10)
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		for(Integer number : numbers) {
			if(number % 2 == 0) { //check even number
				evenNumbersList.add(number);
			}
		}
		
		System.out.println("Even Numbers: " + evenNumbersList);

	}

}
