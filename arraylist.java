//This program shows about every operation performed on arraylist

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
       
        //add operation
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(3);
        System.out.println(list);
    
        //Remove operation->it takes index of the integer you want to delete
        list.remove(0);
        System.out.println(list);

        //get operation->this operation is used to get a specific element to perform some operations on it,we pass index here also
        int element=list.get(2);
        System.out.println(element);

        //operation to insert elements in between we first pass the index and then the element
        list.add(1,20);
        System.out.println(list);

        //if we want to change a number at any index to desired number ->
        list.set(2,60);
        System.out.println(list);

        //opertion to get size of list
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        //Sorting the list -> for sorting the list we use a function called "Collections" , which we have to import
        Collections.sort(list);
        System.out.println(list);


    }
    
}
