package link;
import java.util.LinkedList; 
import java.util.Queue;

public class LinkedListFIFO {
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
		  //public interface Queue<E> extends Collection<E>  by using this we declare the queue in linked list
        Queue<String> myQueuelist = new LinkedList<String>();
   //here created LinkedList  of string type implementing queue
        myQueuelist.add("Superman");     
        //inserting elements in the myqueuelist objects 
        myQueuelist.add("Batman");
        myQueuelist.add("Ironman");
        myQueuelist.offer("Antman");
         
        for(String element : myQueuelist){                   
//  here it  inserts the specified element into the queue by using the
       //for each loop and prints the elements in the myqueuelist
            System.out.println("Elements are : " + element);
        }
        
        System.out.println("Queue : " + myQueuelist);        
        // element() this method retrieves the head of the queue.
        
        System.out.println(myQueuelist.peek());                     
        // here this peek() method retrieves the head of this queue, returning null if this queue is empty.
        System.out.println("After peek : " + myQueuelist);
        
        System.out.println(myQueuelist.poll());
        System.out.println("After poll : " + myQueuelist);          
        // this poll() method retrieves and removes the head of this queue or it  return null if this queue is empty.
        
        System.out.println(myQueuelist.remove());                 
        // here this remove() method retrieves and removes the head of this queue.
        
        System.out.println("After remove : " + myQueuelist); 
        //here first it checks the elements and remove the first element by peek method of the queue and makes it as empty
           
	}

}
