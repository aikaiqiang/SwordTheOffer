package 替换空格;

/**
 * Created by Administrator on 2017/3/22.
 *
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
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
