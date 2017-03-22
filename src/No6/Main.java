package No6;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Main {
    public int minNumberInRotateArray(int [] array) {
        int result = 0;
        if(array.length!=0){
            result = array[0];
            for(int i=0;i<array.length;i++){
                if(result > array[i]){
                    result = array[i];
                }
            }
        }
        return result;
    }
    public static void main(String[] args){

    }
}
