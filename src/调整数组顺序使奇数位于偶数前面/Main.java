package 调整数组顺序使奇数位于偶数前面;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 */
public class Main {

    public void reOrderArray(int [] array) {
        int length = array.length;
        int[] array1 = new int[length];
        int tmp = 0;
        int tmp2 = 0;
        for(int i=0;i<length;i++){
            if(array[i]%2 ==0){
                array1[tmp2] = array[i];
                tmp2++;
            }else{
                array[tmp] = array[i];
                tmp++;
            }
        }
        for(int i=0;i<tmp-1;i++){
            array[tmp+i] = array1[i];
        }
    }

    public static void main(String[] args){

    }

}
