package debugProgram;

public class DebugProgram {
	
	// Debugging : Finding and fixing errors in the program
	
	// How to debug a program :
	
	// 1.Step 1: Identify the error &  line number (first line of error will tell you the root cause, last line is where it actually failed)
	// 2.Step 2: Add breakpoints at the line before the error line (breakpoint : a marker to pause the execution at that line)
	// 3.Step 3: Run the program in debug mode (Run -> Debug As -> Java Application)

	public static void main(String[] args) {
		int i = 1;
		System.out.println("Step 1: Program starts");
		System.out.println("Step 2: Preparing to execute next step");
		System.out.println("Step 3: Performing calculations");
		int j = i + 1;
		System.out.println(i / j);
		System.out.println("Step 5: Program execution completed");
	}

}


// Debug Options in Eclipse:

// 1.Resume (F8) : Continue execution until the next breakpoint or end of program
// 2.Terminate : Stop the execution of the program
// 3.Step Into (F5) : Go into the method being called at the current line
// 4. Step Return (F7) : Complete the current method and return to the calling method
// 5. Step Over (F6) : Execute the current line and move to the next line in the same method



