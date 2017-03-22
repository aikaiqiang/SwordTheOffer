package No10;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Main {

    public int RectCover(int target) {
        if(target <= 0){
            return 0;
        } else if(target == 2 || target == 1){
            return target;
        } else {
            return RectCover(target-1) + RectCover(target - 2);
        }
    }

    public static void main(String[] args){

    }

}
