package No1;

/**
 * Created by Administrator on 2017/3/22.
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
