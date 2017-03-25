package 跳台阶;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 */
public class Main {

    public int JumpFloor(int target) {
        int result = 0;
        if(target == 1)
            result = 1;
        else if(target == 2)
            result = 2;
        else {
            result = JumpFloor(target-1) + JumpFloor(target-2);
        }
        return result;
    }

    public static void main(String[] args){

    }
}
