package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	 public static void main(String args[]){  
		  List<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Red");//Adding object in arraylist  
		  list.add("Blue");  
		  list.add("Green");  
		  list.add("Yellow");  
		  
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	 
	 //searching an element
			boolean search=list.contains("Yellow");
			
			System.out.println("**********************");
			if(search){
				System.out.println("Element found");
			}else
			{System.out.println("Element not found");}
			
			System.out.println("****************************");
			
			
	//reversing list

			System.out.println("Reverse order:");
		    Collections.reverse(list);
			for(String str: list){
				 System.out.println(str);
			 }
}
}