//This program show how to use liked list through collection frameworks as we
// cannot builed a linkedlist always from scratch
import java.util.*;
 public class linkedlistthroughcollectionframework {
    public static void main(String args[]){
        LinkedList<String> Name = new LinkedList<String>();

        //to add an element at first
       Name.addFirst("a");
       Name.addFirst("is");
       

       //to add an element at last
        Name.addLast("List");
        //if we type only add then alsop the element got added at last
        Name.add("->null");
        System.out.println(Name);

        //printing size of list
        System.out.println(Name.size());

        //printing the list
        for(int i=0;i<Name.size();i++){
        System.out.print(Name.get(i) + "->");
       }
        
        //Deleting first element 
        Name.removeFirst();
        System.out.println(Name);
        
        //deleting/removing last element
        Name.removeLast();
        System.out.println(Name);
         
        //Deleting an element at index i
        Name.remove(1);
        System.out.println(Name);


    }
    
}
