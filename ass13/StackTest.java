package ass13;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(20);
        stack.push(39);
        stack.push(57);
        System.out.println(stack);
        stack.pop();
        System.out.println("top element in stack"+stack.peek());
        stack.pop();
        System.out.println("top elements in stack" +stack.peek());
        System.out.println(stack);


    }
}
