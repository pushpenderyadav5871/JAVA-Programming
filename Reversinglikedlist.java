// This program shows how to reverse a linkedlist
public class Reversinglikedlist {
    Node head;
    private int size;
  Reversinglikedlist (){
   this.size=0;
   }
 class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        this.next = null;
    }
 } 
    //This function helps us to add a node in starting
    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
         
        newNode.next = head;
        head = newNode;
       
    }
    //Adding a node in last
    public void addLast(String data){
         Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
          size++; 
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode; 
       
    }
    //Deleting first element of list
    public void deletefirst(){
        if(head == null){
            System.out.println("The list is empty");
           return;
        }
        size--;
         head= head.next;
         
         return;
    }
    //deleting last element of list
    public void deletelast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
     }
      size--;
     if(head.next== null){
        head =null;
        return;
     }
      Node secondlast = head;
      Node lastnode = head.next;
      while(lastnode.next !=null){
        lastnode = lastnode.next;
        secondlast = secondlast.next;
      }
      secondlast.next=null;
       
    }
    
    
    //Printing list
    public void printList(){
        if(head ==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
       System.out.println("null");
    }
    public int getsize(){
        return size;
    }

    public void reverseIterate(){
        if(head==null || head.next ==null){
            return;
        }
        Node prevNode =head;
        Node currNode= head.next;
        while(currNode !=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
        
            //update 
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head = prevNode;
        
    }
 public static void main(String[] args){
    Reversinglikedlist  list = new Reversinglikedlist ();
    list.addFirst("a");
    list.addFirst("is");
    
    list.addLast("list");
    
    list.addFirst("This");
    list.printList();
    
    System.out.println(list.getsize());
    list.reverseIterate();
    list.printList();
 }

}
