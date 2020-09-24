import java.util.HashMap;
import java.util.Map;

public class Non_Repeat_Character {
    //题目：无重复字符串
    //解法：滑动窗口
    public static void main(String[] args) {
        String s = "pwwke";
        int res = 0;
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for (int start = 0,end = 0;end<n;end++){
            char last=s.charAt(end);
            if(map.containsKey(last)){
                start=Math.max(map.get(last),start);
            }
            res=Math.max(res,end-start+1);
            map.put(s.charAt(end),end+1);


        }
        System.out.println(res);
    }
    static class Solution {

    }
}
