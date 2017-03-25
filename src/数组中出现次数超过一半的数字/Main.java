package 数组中出现次数超过一半的数字;

import java.util.Arrays;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 */
public class Main {
    public int MoreThanHalfNum_Solution(int [] array) {
        int result = 0;
        Arrays.sort(array);
        int l = array.length;
        for(int i=l/2;i<l;i++){
            if(array[i-l/2] == array[i])
                result = array[i];
        }
        return result;
    }
}
