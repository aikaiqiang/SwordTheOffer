package 包含min函数的栈;

import java.util.*;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 *
 */
public class Main {
    Stack<Integer> statck = new Stack<>();
    List<Integer> array = new ArrayList<>();

    public void push(int node) {
        array.add(node);
        statck.push(node);
    }

    public void pop() {
        array.remove(array.size()-1);
        statck.pop();
    }

    public int top() {
        return statck.peek();
    }

    public int min() {
        List<Integer> tmp = new ArrayList<Integer>(Arrays.asList(new Integer[array.size()]));
        Collections.copy(tmp,array);
        Collections.sort(tmp);
        return tmp.get(0);
    }

    public static void main(String[] args){

    }

}
