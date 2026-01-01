package streamsApi;

import java.util.ArrayList;
import java.util.List;

public class NormalMap {

	public static void main(String[] args) {
		// There are multiple numbers stored in the list, and get the output as the cube of each and every number.
		//List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> cubeNumbersList = new ArrayList<Integer>();
		
		for(Integer number : numbers) {
			int cube = number * number * number; // calculate cube
			cubeNumbersList.add(cube);
		}
		
		System.out.println("Cube of Numbers: " + cubeNumbersList);

	}

}
