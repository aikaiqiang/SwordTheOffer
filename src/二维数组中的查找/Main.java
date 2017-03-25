package 二维数组中的查找;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 *
 */
public class Main {
        public boolean Find(int target, int [][] array) {
            boolean b = false;
            if(!(array.length == 0)){
                for(int i=0;i<array.length;i++){
                    for(int j=0;j<array[0].length;j++){
                        if(array[i][j] == target)
                            b = true;
                    }
                }
            }

            return b;
        }
        public static  void main(String[] args){

        }
}
