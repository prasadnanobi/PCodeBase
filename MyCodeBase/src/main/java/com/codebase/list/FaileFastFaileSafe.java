package com.codebase.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FaileFastFaileSafe {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    //Adding elements to list
	     
	    list.add(1452);
	     
	    list.add(6854);
	     
	    list.add(8741);
	     
	    list.add(6542);
	     
	    list.add(3845);
	     
	    //Getting an Iterator from list
	    
	    /*for(int i=0; i<list.size();i++){
	    	  //list.add(8457); 
	    	  list.remove(i);
	    }*/
	 /*   ListIterator<Integer> it= list.listIterator();
	    while (it.hasNext()){
	        Integer integer = (Integer) it.next(); 
	        System.out.println(integer);
	        it.next();
	        //it.
	        it.previous();
	      //  it.remove();
	        //list.remove(integer);      //This will throw ConcurrentModificationException
	    }
	     */
	   Iterator<Integer> it = list.iterator();
	    while (it.hasNext()){
	        Integer integer = (Integer) it.next();
	        it.remove();
	       // list.add(8457);      //This will throw ConcurrentModificationException
	    }*/
	}
	
	/*public static void main(String[] args) {
		List <String> cityList = new CopyOnWriteArrayList<String>();
		  cityList.add("New York City");
		  cityList.add("New Delhi");
		  cityList.add("Newark");
		  cityList.add("Newport");  
		  Iterator<String> itr = cityList.iterator();
		  while (itr.hasNext())
		         {         
		          System.out.println(itr.next());
		          cityList.add("NewCity");
		          cityList.remove("NewCity");
		         }
		  System.out.println(cityList);
		 }
*/
	
	
}
