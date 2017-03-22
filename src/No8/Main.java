package No8;

/**
 * Created by Administrator on 2017/3/22.
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
