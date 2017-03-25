package 反转链表;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 输入一个链表，反转链表后，输出链表的所有元素。
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

    public ListNode ReverseList(ListNode head) {
        ListNode tmp = null;
        ListNode node = null;
        while(head!=null){
            node = head.next;
            head.next = tmp;
            tmp = head;
            head = node;
        }
        head = tmp;
        node = head;
        return head;
    }

    public static void main(String[] args){

    }

}
