package 二叉树中和为某一值的路径;

import java.util.ArrayList;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
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
    int sum = 0;
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null)
            return result;
        sum += root.val;
        path.add(root.val);
        if(root.left == null && root.right == null && sum == target){
            result.add(path);
            ArrayList<Integer> tmp= new ArrayList<>();
            for(int i:path){
                tmp.add(i);
            }
            path = tmp;
            sum -= root.val;
            path.remove(path.size()-1);
            return result;
        } else if(root.left == null && root.right == null){
            sum -= root.val;
            path.remove(path.size()-1);
            return result;
        }
        if(root.left != null){
            FindPath(root.left,target);
        }
        if(root.right != null){
            FindPath(root.right,target);
            sum -= root.val;
            path.remove(path.size()-1);
        }
        return result;
    }
    public static void main(String[] args){

    }
}
