package collectionsConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework {
	
	public static void main(String[] args) {
		
		//Array: Array is a non-primitive datatype. Array can store multiple values with similar datatypes together at one place.
		
		String[] empNames = new String[3];
		empNames[0] = "Bharath Reddy";
		empNames[1] = "Mayuri";
		empNames[2] = "Ravi";

		System.out.println(empNames.length);
		
		/**********CHALLENGES WITH ARRAYS**********/
		
		//1. Fixed Size: Once the array is created, we cannot change its size.
		//2. Homogeneous Data: Arrays can only store elements of the same datatype.
		//3. An array follows static memory allocation, and it can consume memory at the very beginning itself.
		//4. Array won't allow modifications to structure during runtime.
		
		/**********COLLECTIONS FRAMEWORK**********/
		
		//Benefits of Collections Framework over Arrays:
		
		//1. Dynamic Size: Collections can grow and shrink in size as needed.
		//2. Heterogeneous Data: Collections can store elements of different datatypes together.
		//3. Collections follow dynamic memory allocation, and memory is allocated as needed during runtime.
		//4. Collections allow modifications to structure during runtime.
		
		//Major 3  categories of collections that we are going to use in our day-to-day automation life cycle.
		
		//1. List ==> ArrayList, LinkedList
		//   List can store multiple values with similar datatypes together at one place dynamically.
		//   List allows duplicate values.
		//   List follows dynamic memory allocation.
		//   List allows modifications to structure during runtime.		
		
		//2. Set ==> HashSet, LinkedHashSet, TreeSet
		//   Set can store multiple values with similar datatypes together at one place dynamically.
		//   Set won't allow duplicate values.
		//   Set follows dynamic memory allocation.
		//   Set allows modifications to structure during runtime.	
				
		//3. Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
		//   Map can store multiple values with different datatypes together in key-value pairs at one place dynamically.
		//   Map won't allow duplicate keys but allows duplicate values.
		//   Map follows dynamic memory allocation.
		//   Map allows modifications to structure during runtime.		
		
		
		/****************SYNTAX TO STORE VALUES IN COLLECTIONS****************/ // (), {}, [], <>
		//COLLECTION<DataType> variable = new COLLECTION<DataType>();
		//Only Non-primitive datatypes are allowed in Collections Framework.		
		
		//Wrapper Class ==> Class form of primitive datatypes. int -> Integer 
		//Wrapper classes: Integer, Character, Double, Boolean, Float, Long, Short, Byte
		
		
		/*****************************DIFFERENCE BETWEEN EACH SUB-CATEGORY OF LIST, SET & MAP*****************************/		
		// 1. Order of storing values : insertion order ,random order,ascending order.
		// 2. Allowing null values : allowed, not allowed.
		// 3. Memory  Allocation : contiguous memory allocation, non-contiguous memory allocation.		
		
		/*****************************ORDER OF STORING*****************************/
		//Hash ==> Random Order
		//Link ==> Insertion Order
		//Tree ==> Ascending Order
		
		/*****************************ArrayList*****************************/
		System.out.println("**********ArrayList**********");
		// Syntax to create an ArrayList: List<DataType> variable = new ArrayList<DataType>();
		// Syntax to add values : variable.add(value);
		// Syntax to remove values : variable.remove(value/index);
		// Syntax to access values : variable.get(index);
		// Syntax to get size : variable.size();
		
		//Order : ArrayList follows insertion order
		//Nulls : ArrayList allows null values
		//Memory  Allocation : contiguous memory allocation
		
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Bharath Reddy");
		empNamesArrayList.add("Mayuri");
		empNamesArrayList.add("Ravi");
		empNamesArrayList.add("Mayuri");
		empNamesArrayList.add("Hari");
		empNamesArrayList.remove("Bharath Reddy");
		empNamesArrayList.add(null);
		System.out.println(empNamesArrayList.size());
		System.out.println(empNamesArrayList.get(2));
		System.out.println(empNamesArrayList);
		
		/*****************************LinkedList*****************************/
		System.out.println("**********LinkedList**********");
		// Syntax to create an LinkedList: List<DataType> variable = new LinkedList<DataType>();
		// Syntax to add values : variable.add(value);
		// Syntax to remove values : variable.remove(value/index);
		// Syntax to access values : variable.get(index);
		// Syntax to get size : variable.size();
		
		//Order : LinkedList follows insertion order
		//Nulls : LinkedList allows null values
		//Memory  Allocation : non-contiguous memory allocation
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Bharath Reddy");
		empNamesLinkedList.add("Mayuri");
		empNamesLinkedList.add("Ravi");
		empNamesLinkedList.add("Mayuri");
		empNamesLinkedList.add("Hari");
		empNamesLinkedList.remove("Bharath Reddy");
		empNamesLinkedList.add(null);
		System.out.println(empNamesLinkedList.size());
		System.out.println(empNamesLinkedList.get(2));
		System.out.println(empNamesLinkedList);
		
		
		/*****************************HashSet*****************************/
		System.out.println("**********HashSet**********");
		// Syntax to create an HashSet: Set<DataType> variable = new HashSet<DataType>();
		// Syntax to add values : variable.add(value);
		// Syntax to remove values : variable.remove(value/index);
		// Syntax to access values : variable.get(index);//won't work as Set doesn't have index
		// Syntax to get size : variable.size();
		
		//Order : HashSet follows random order
		//Nulls : HashSet allows null values
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Bharath Reddy");
		empNamesHashSet.add("Mayuri");
		empNamesHashSet.add("Ravi");
		empNamesHashSet.add("Mayuri");
		empNamesHashSet.add("Hari");
		empNamesHashSet.remove("Bharath Reddy");
		empNamesHashSet.add(null);
		System.out.println(empNamesHashSet.size());
		System.out.println(empNamesHashSet);
		
		/*****************************LinkedHashSet*****************************/
		System.out.println("**********LinkedHashSet**********");
		// Syntax to create an LinkedHashSet: Set<DataType> variable = new LinkedHashSet<DataType>();
		// Syntax to add values : variable.add(value);
		// Syntax to remove values : variable.remove(value/index);
		// Syntax to access values : variable.get(index);
		// Syntax to get size : variable.size();
		
		//Order : LinkedHashSet follows insertion order
		//Nulls : LinkedHashSet allows null values
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Bharath Reddy");
		empNamesLinkedHashSet.add("Mayuri");
		empNamesLinkedHashSet.add("Ravi");
		empNamesLinkedHashSet.add("Mayuri");
		empNamesLinkedHashSet.add("Hari");
		empNamesLinkedHashSet.remove("Bharath Reddy");
		empNamesLinkedHashSet.add(null);
		System.out.println(empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);
		
		/*****************************TreeSet*****************************/
		System.out.println("**********TreeSet**********");
		// Syntax to create an TreeSet: Set<DataType> variable = new TreeSet<DataType>();
		// Syntax to add values : variable.add(value);
		// Syntax to remove values : variable.remove(value/index);
		// Syntax to access values : variable.get(index);
		// Syntax to get size : variable.size();
		
		//Order : TreeSet follows Ascending order
		//Nulls : TreeSet not allows null values
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Bharath Reddy");
		empNamesTreeSet.add("Mayuri");
		empNamesTreeSet.add("Ravi");
		empNamesTreeSet.add("Mayuri");
		empNamesTreeSet.add("Hari");
		empNamesTreeSet.remove("Bharath Reddy");
		//empNamesTreeSet.add(null); //NullPointerException
		System.out.println(empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);
		
		

		/*****************************HashMap*****************************/
		System.out.println("**********HashMap**********");
		// Syntax to create an HashMap: Map<DataType(key),DataType(value)> variable = new HashMap<DataType,DataType>();
		// Syntax to add values : variable.put(key,value);
		// Syntax to remove values : variable.remove(key);
		// Syntax to access values : variable.get(key);
		// Syntax to get size : variable.size();
		
		//Order : HashMap follows random order of keys
		//Nulls : HashMap allows null keys as well as null values
		
		Map<String, Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("Bharath Reddy", 101);
		empNamesHashMap.put("Mayuri", 102);
		empNamesHashMap.put("Ravi", 103);
		empNamesHashMap.put("Mayuri", 104);
		empNamesHashMap.put("Hari", 105);
		empNamesHashMap.put("Rekha", 105);
		empNamesHashMap.remove("Bharath Reddy");
		empNamesHashMap.put("Kewal", null);
		empNamesHashMap.put(null, 108);
		System.out.println(empNamesHashMap.size());
		System.out.println(empNamesHashMap.get("Ravi"));
		System.out.println(empNamesHashMap);
		
		
		/*****************************LinkedHashMap*****************************/
		System.out.println("**********LinkedHashMap**********");
		// Syntax to create an LinkedHashMap: Map<DataType(key),DataType(value)> variable = new LinkedHashMap<DataType,DataType>();
		// Syntax to add values : variable.put(key,value);
		// Syntax to remove values : variable.remove(key);
		// Syntax to access values : variable.get(key);
		// Syntax to get size : variable.size();
		
		//Order : LinkedHashMap follows insertion order of keys
		//Nulls : LinkedHashMap allows null keys as well as null values
		
		Map<String, Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
		empNamesLinkedHashMap.put("Bharath Reddy", 101);
		empNamesLinkedHashMap.put("Mayuri", 102);
		empNamesLinkedHashMap.put("Ravi", 103);
		empNamesLinkedHashMap.put("Mayuri", 104);
		empNamesLinkedHashMap.put("Hari", 105);
		empNamesLinkedHashMap.put("Rekha", 105);
		empNamesLinkedHashMap.remove("Bharath Reddy");
		empNamesLinkedHashMap.put("Kewal", null);
		empNamesLinkedHashMap.put(null, 108);
		System.out.println(empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap.get("Ravi"));
		System.out.println(empNamesLinkedHashMap);
		
		
		/*****************************TreeMap*****************************/
		System.out.println("**********TreeMap**********");
		// Syntax to create an TreeMap: Map<DataType(key),DataType(value)> variable = new TreeMap<DataType,DataType>();
		// Syntax to add values : variable.put(key,value);
		// Syntax to remove values : variable.remove(key);
		// Syntax to access values : variable.get(key);
		// Syntax to get size : variable.size();
		
		//Order : TreeMap follows ascending order of keys
		//Nulls : TreeMap allows null values , but not allows null keys
		
		Map<String, Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("Bharath Reddy", 101);
		empNamesTreeMap.put("Mayuri", 102);
		empNamesTreeMap.put("Ravi", 103);
		empNamesTreeMap.put("Mayuri", 104);
		empNamesTreeMap.put("Hari", 105);
		empNamesTreeMap.put("Rekha", 105);
		empNamesTreeMap.remove("Bharath Reddy");
		empNamesTreeMap.put("Kewal", null);//null values are allowed
		//empNamesTreeMap.put(null, 108);
		System.out.println(empNamesTreeMap.size());
		System.out.println(empNamesTreeMap.get("Ravi"));
		System.out.println(empNamesTreeMap);
		
		
		/*****************************Hashtable*****************************/
		System.out.println("**********Hashtable**********");
		// Syntax to create an Hashtable: Map<DataType(key),DataType(value)> variable = new Hashtable<DataType,DataType>();
		// Syntax to add values : variable.put(key,value);
		// Syntax to remove values : variable.remove(key);
		// Syntax to access values : variable.get(key);
		// Syntax to get size : variable.size();
		
		//Order : Hashtable follows random order of keys
		//Nulls : Hashtable allows null values , but not allows null keys
				
		Map<String, Integer> empNamesHashtable = new Hashtable<String,Integer>();
		empNamesHashtable.put("Bharath Reddy", 101);
		empNamesHashtable.put("Mayuri", 102);
		empNamesHashtable.put("Ravi", 103);
		empNamesHashtable.put("Mayuri", 104);
		empNamesHashtable.put("Hari", 105);
		empNamesHashtable.put("Rekha", 105);
		empNamesHashtable.remove("Bharath Reddy");
		//empNamesHashtable.put("Kewal", null);//null values are not allowed
		//empNamesHashtable.put(null, 108);//null keys are not allowed
		System.out.println(empNamesHashtable.size());
		System.out.println(empNamesHashtable.get("Ravi"));
		System.out.println(empNamesHashtable);
		

	}

}
