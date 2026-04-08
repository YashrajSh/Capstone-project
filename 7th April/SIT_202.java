//uses floyds algorithm to detect cycle-->Cycle detection and remove the cycle 
//this node class represening the the single node in our linkedlist.
import java.util.*;
class Node_SIT{
    int data;
    Node_SIT next;
     Node_SIT(int data){
        this.data = data;
        this.next = null;
     }
    
    


}
public class SIT_202 {
    public static void main(String[] args) {
        Node_SIT head = new Node_SIT(10);
        head.next = new Node_SIT(20);
        head.next.next = new Node_SIT(30);
        head.next.next.next = new Node_SIT(40);
        head.next.next.next.next= new Node_SIT(50);

        head.next.next.next.next.next = head.next; // creating a cycle..Node 50 points to the node 20
        
        //boolean hasCycle = detectCycle(head);
        printList(head);

    }
    static boolean detectCycle(Node_SIT head){
        Node_SIT slow = head;
        Node_SIT fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; // move slow by 1 step
            fast = fast.next.next; // move fast by 2 steps

            if(slow == fast){ // cycle detected
                System.out.println("Cycle detected at node with data: " + slow.data);
                removeCycle(slow, head); // remove the cycle
                return true;
            }
        }

        

    }

    static void printList(Node_SIT head){
        Node_SIT current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
}
