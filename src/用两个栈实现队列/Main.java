package 用两个栈实现队列;

import java.util.Stack;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
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
