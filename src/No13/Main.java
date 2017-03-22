package No13;

/**
 * Created by Administrator on 2017/3/22.
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
