package link;
import java.util.*;
public class LinkedListExample {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
			//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
			//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		 LinkedList<String> studentname = new LinkedList<>();      //created an interface for student namelist of type string for linkedList
	        
		  studentname.add("Sachin"); //initializing elements and creating the student namelist objects for the list
		  studentname.add("Ganguly");
		  studentname.addLast("Dravid");
		  studentname.addFirst("Laxman");
		  studentname.add("Anil Kumble");
		  System.out.println("The elements of linked list are : " ); 
              Iterator<String> iterator=studentname.iterator(); //traversing the elements of the object list  by using iterator method
		  
              //while loop is used to iterate a part of the program several times
              while(iterator.hasNext()){       //implementing the for each loop to traverse the elements
			  
		   System.out.println(iterator.next());  
		
		  }
		 
		         List<String> list = new ArrayList<>();   // adding the arrayList objects at the end of the linked list 
		
		  list.add("Dhoni");
		  list.add("Virat");
		  studentname.addAll(list); //here list.addAll() this method add  the two objects list elements and prints the values
		
		  System.out.println("The elements after joining the arraylist are : " +list); 
		  
		    ListIterator<String> listIterator=studentname.listIterator();    //here it shows all the elements which are also added 
	        while(listIterator.hasNext()){                      //and displays the elements by the iterator
	        
		   System.out.println(listIterator.next());  

		  }
		 
		    System.out.println("Traversing elements in backward direction...");    //here iterating the by reverse direction 
		  while( listIterator.hasPrevious()){   //this method will displays the elements in the backward direction 
			  
			   System.out.println( listIterator.previous());   //and prints the values

		  }
	}

}
