package No16;

/**
 * Created by Administrator on 2017/3/22.
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {

    public ListNode Merge(ListNode list1,ListNode list2) {


        ListNode node1;
        ListNode node2;
        ListNode tmp = null;
        node1 = list1;
        node2 = list2;
        while (node2!=null){
            while(node1!=null && node2.val>=node1.val) {
                tmp = node1;
                node1 = node1.next;
            }
            tmp.next = node2;
            node2 = node2.next;
            tmp.next.next = node1;
            node1 = tmp.next;
        }
        return list1;
    }

    public static void main(String[] args){

    }

}
