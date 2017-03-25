package 斐波那契数列;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 *
 */
public class Main {

    public int Fibonacci(int n) {
        int result = 0;
        if(n >= 0){
            int f1 = 1;
            int f2 = 1;
            for(int i=0;i<n;i++){
                if(i==0||i==1){
                    result = 1;
                } else {
                    result = f1 + f2;
                    f1 = f2;
                    f2 = result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){

    }

}
