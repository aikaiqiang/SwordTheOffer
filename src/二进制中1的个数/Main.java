package 二进制中1的个数;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 */
public class Main {

    public int NumberOf1(int n) {
        int tmp = 0;
        while (n!=0){
            tmp++;
            n = n & (n-1);
        }
        return tmp;
    }

    public static void main(String[] args){

    }

}
