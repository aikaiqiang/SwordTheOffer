package No14;

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

    public ListNode FindKthToTail(ListNode head,int k) {

        if(head==null||k<=0){
            return null;

        }

        ListNode pre=head;

        ListNode last=head;
        for(int i=1;i<k;i++){

            if(pre.next!=null){

                pre=pre.next;

            }else{

                return null;

            }

        }

        while(pre.next!=null){

            pre = pre.next;

            last=last.next;

        }

        return last;

    }

    public static void main(String[] args){

    }

}
