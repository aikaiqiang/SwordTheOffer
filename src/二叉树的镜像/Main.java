package 二叉树的镜像;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
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
    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
    public static void main(String[] args){

    }
}
