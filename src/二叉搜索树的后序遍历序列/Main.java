package 二叉搜索树的后序遍历序列;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 */
public class Main {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        if(sequence.length==1)
            return true;
        return ju(sequence, 0, sequence.length-1);
    }
    public boolean ju(int[] a,int star,int root){
        if(star>=root)
            return true;
        int i = root;
        while(i>star&&a[i-1]>a[root])
            i--;
        for(int j = star;j<i-1;j++)
            if(a[j]>a[root])
                return false;;
                return ju(a,star,i-1)&&ju(a, i, root-1);
    }

    public static void main(String[] args){

    }

}
