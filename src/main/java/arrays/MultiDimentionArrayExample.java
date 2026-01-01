package arrays;

public class MultiDimentionArrayExample {
	
	
	//Array : Array  can store multiple values of similar data types

	public static void main(String[] args) {		
		
		//2D Array : Array of multiple 1D Arrays
		
		// There are 2 projects in a company , and each project has 3 employees
		
		String [][] company = {
								{"John", "Jane", "Doe"},   // Project 1 employees
								{"Alice", "Bob", "Charlie"} // Project 2 employees								
							  };
		
		// 2D Array Creation when we don't know the values
		String [][] newCompany = new String[2][3]; // 2 Projects and each project has 3 employees
		newCompany[0][0] = "John";
		newCompany[1][2] = "Charlie";
		
		// Accessing values from 2D Array
		System.out.println("Employee from Project 1: "+company[0][1]); // Jane
		
		//3D Array : Array of multiple 2D Arrays
		String [][][] bigCompany = {   //company 1
										{
											{"John", "Jane"},    // Project 1 employees in Company 1
											{"Doe", "Smith"}     // Project 2 employees in Company 1
										},
										
										//company 2
										{
											{"Alice", "Bob"},    // Project 1 employees in Company 2
											{"Charlie", "David"} // Project 2 employees in Company 2
										}										
								    };
		
		// When we don't know the values
		String [][][] newBigCompany = new String[2][2][2]; // 2 Companies, each company has 2 projects, each project has 2 employees
		newBigCompany[0][1][1] = "Smith";
			
		
		
	}

}
