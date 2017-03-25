package 最小的K个数;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 */
public class Main {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> result = new ArrayList<>();
        if(k <= input.length) {
            for (int i = 0; i < k; i++) {
                result.add(input[i]);
            }
        }
        return result;
    }
}
