/**
 * 
 */
package testReversed;

/**
 * @author Prasadani
 *
 */
public class TestReversedList {
	 
    class Node{
    	
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    public Node firstNode = null;     
    public Node lastNode = null;    
        
       
    public void addNode(int data) {     
        Node node = new Node(data);    
        if(firstNode == null) {    
        	firstNode = node;   
        }    
        else {    
        	lastNode.next = node; 
        }  
        lastNode = node;   
    }    
        
    
    public void display() {    
        Node current = firstNode;    
            
        if(firstNode == null) {    
            System.out.println("List is empty");    
            return;    
        }   
        while(current != null) {
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }  
    
  
    public void reverseSingularList(){
        if(firstNode != null && lastNode != null){
            Node current = firstNode;
            Node previousNode = lastNode;
            Node nextNode = null;

            while(current != previousNode){
                previousNode.next = current;
                firstNode = current.next;
                lastNode = current;
                current.next = null;
                if (nextNode != null) {
                	lastNode.next = nextNode;
                }
                current = firstNode;
                nextNode = previousNode.next;
            }
        }
    }

        
    public static void main(String[] args) {    
            
    	TestReversedList list = new TestReversedList();    
               
        list.addNode(4);    
        list.addNode(2);    
        list.addNode(1);  
        list.addNode(6);  
        list.addNode(7);  
        list.addNode(5);  
        list.addNode(3);    
             
        System.out.println("Current Link List ");
        list.display();
        list.reverseSingularList();
        System.out.println("Reversed Order Link List");
        list.display();
    }    

}
