package 字符串的排列;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Class:Main.
 * Created by Satra on 2017/3/25.
 *
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 */
public class Main {
    private char [] seqs;
    private Integer [] book;
    private HashSet<String> result = new HashSet<String>();
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> arrange = new ArrayList<String>();
        if(str == null || str.isEmpty()) return arrange;
        char[] strs = str.toCharArray();
        seqs = new char[strs.length];
        book = new Integer[strs.length];
        for (int i = 0; i < book.length; i++) {
            book[i] = 0;
        }
        dfs(strs, 0);
        arrange.addAll(result);
        Collections.sort(arrange);
        return arrange;
    }
    private void dfs(char[] arrs, int step){
        if(arrs.length == step){
            String str = "";
        for (int i = 0; i < seqs.length; i++) {
            str += seqs[i];
        }
        result.add(str);
        return;
        }
        for (int i = 0; i < arrs.length; i++) {
            if(book[i] == 0){
                seqs[step] = arrs[i];
                book[i] = 1;
                dfs(arrs, step + 1);
                book[i] = 0;
            }
        }
    }
}
