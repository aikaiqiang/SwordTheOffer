package 重建二叉树;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
 *
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Main {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int i=0;
        if(pre.length!=in.length||pre.length==0||in.length==0)
            return null;
        TreeNode root = new TreeNode(pre[0]);
        while(in[i]!=root.val)
            i++;
        int[] preLeft = new int[i];
        int[] inLeft = new int[i];
        int[] preRight = new int[pre.length-i-1];
        int[] inRight = new int[in.length-i-1];
        for(int j = 0;j<in.length;j++) {
            if(j<i) {
                preLeft[j] = pre[j+1];
                inLeft[j] = in[j];
            } else if(j>i) {
                preRight[j-i-1] = pre[j];
                inRight[j-i-1] = in[j];
            }
        }
        root.left = reConstructBinaryTree(preLeft,inLeft);
        root.right = reConstructBinaryTree(preRight,inRight);
        return root;
    }

    public static void main(String[] args){

    }

}
