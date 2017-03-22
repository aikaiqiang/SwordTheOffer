package No11;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Main {

    public int NumberOf1(int n) {
        int tmp = 0;
        while (n!=0){
            tmp++;
            n = n & (n-1);
        }
        return tmp;
    }

    public static void main(String[] args){

    }

}
