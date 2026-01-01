package streamsApi;

import java.util.List;

public class StreamsMap {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> cubeNumbersList = numbers.stream().map(x->x*x*x).toList();
		System.out.println("Cube Numbers List: " + cubeNumbersList);

	}

}
