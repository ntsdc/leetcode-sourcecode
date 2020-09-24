public class Palindrome_number {
    public static void main(String[] args) {
        //题目：整数翻转
        int x = 100;

        String s =  String.valueOf(x);

        int length = s.length();
        String reverse = "";
        for (int i = 0; i < length; i++)
            reverse = s.charAt(i) + reverse;
        boolean res = reverse==s;

        return;

    }
}
