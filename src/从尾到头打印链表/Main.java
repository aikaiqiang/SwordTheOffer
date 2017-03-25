package 从尾到头打印链表;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *
 */
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class Main {

    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

    public static void main(String[] args){

    }

}
