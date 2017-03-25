package 二叉搜索树与双向链表;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
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
    ArrayList<Integer> value = new ArrayList<>();
    ArrayList<TreeNode> nodes = new ArrayList<>();
    public void getvalue(TreeNode pRootOfTree){
        if(pRootOfTree.left!=null)
            getvalue(pRootOfTree.left);
        value.add(pRootOfTree.val);
        nodes.add(pRootOfTree);
        if(pRootOfTree.right != null)
            getvalue(pRootOfTree.right);
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        this.getvalue(pRootOfTree);
        Collections.sort(value);
        TreeNode result = nodes.get(0);
        if(value.size() != 1){
            for(int i=0;i<nodes.size();i++){
                if(i==0){
                    nodes.get(i).left = null;
                    nodes.get(i).val = value.get(0);
                    nodes.get(i).right = nodes.get(i+1);
                } else if (i==(nodes.size()-1)){
                    nodes.get(i).right = null;
                    nodes.get(i).val = value.get(i);
                    nodes.get(i).left = nodes.get(i-1);
                } else {
                    nodes.get(i).val = value.get(i);
                    nodes.get(i).left = nodes.get(i-1);
                    nodes.get(i).right = nodes.get(i+1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args){

    }

}
