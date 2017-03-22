package No9;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Main {

    public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }

    public static void main(String[] args){

    }

}
