package 从上往下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Main {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return result;
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            result.add(treeNode.val);
            if(treeNode.left!=null)
                queue.offer(treeNode.left);
            if(treeNode.right!=null)
                queue.offer(treeNode.right);
        }
        return result;
    }

    public static void main(String[] args){

    }

}
