package No5;

import java.util.Stack;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Main {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int result = 0;
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        result = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return result;
    }

    public static void main(String[] args){

    }

}
