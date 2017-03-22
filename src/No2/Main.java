package No2;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Main {

    public String replaceSpace(StringBuffer str) {
        String result = str.toString();
        result = result.replaceAll("\\s","%20");
        return result;
    }

    public static void main(String[] args){

    }

}
