//sort a stack using another stack..sort stack in ascending order using another temp stack
//input--> 34 3 31 98 92 23
// import java.util.*;

// public class SIT_201 {
//     public static void main(String[] args) {
        
//         int[] inputStack = {34, 3, 31, 98, 92, 23};
//         int[] tempStack = new int[6];
        
        
//         int inputTop = 5;  
//         int tempTop = -1;  
        
      
//         while (inputTop >= 0) {
            
//             int current = inputStack[inputTop--];
            
            
//             while (tempTop >= 0 && tempStack[tempTop] < current) {
//                 inputStack[++inputTop] = tempStack[tempTop--];
//             }
            
            
//             tempStack[++tempTop] = current;
//         }
        
        
//         System.out.println("Sorted stack (ascending order, top to bottom):");
//         for (int i = tempTop; i >= 0; i--) {
//             System.out.print(tempStack[i] + " ");
//         }
//         System.out.println();
        
        
//         System.out.println("Popping in ascending order:");
//         while (tempTop >= 0) {
//             System.out.print(tempStack[tempTop--] + " ");
//         }
//         System.out.println();
//     }
// }

import java.util.*;
public class SIT_201 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
       stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Input : " + stack);
        sort(stack);
        System.out.println("Output : " + stack);


    }
static void sort(Stack<Integer> stack){
Stack<Integer> tempStack = new Stack<>();
//loop run until the original stack becomes empty.
while(!stack.isEmpty()){

    int temp = stack.pop();//pop the top element from the original stack and store it in a temporary variable.
    //while tempstack is not empty and the top element of tempstack is greater than temp , move back to the original stack.
    while(!tempStack.isEmpty() && tempStack.peek()>temp){
        stack.push(tempStack.pop());

    }
    tempStack.push(temp);//push temp into tempstack
}
while(!tempStack.isEmpty()){
    stack.push(tempStack.pop());
}
}}