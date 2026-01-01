package keywords;

//enum is a special class that represents a group of constants (unchangeable variables, like final variables).(public static final variables)

enum directions {
	NORTH, SOUTH, EAST, WEST
}

enum Days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum  Operation {
	
	ADD {
		public int result(int a, int b) {
			return a + b;
		}
	},
	SUBTRACT {
		public int result(int a, int b) {
			return a - b;
		}
	},
	MULTIPLY {
		public int result(int a, int b) {
			return a * b;
		}
	},
	DIVIDE {
		public int result(int a, int b) {
			return a / b;
		}
	};
	
	public abstract int result(int a, int b);
	
}

public class EnumExamples {

	public static void main(String[] args) {
		System.out.println(Operation.ADD.result(1,2));

	}

}
