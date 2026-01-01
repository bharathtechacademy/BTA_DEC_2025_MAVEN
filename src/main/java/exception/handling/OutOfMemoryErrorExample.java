package exception.handling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		while(1>0) {
			list.add(10);		
			list.add("Bharath");
		}

	}

}
