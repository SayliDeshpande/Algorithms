package ArrayandString.ConfusingNumber;

public class Solution {
    public static void main(String[] args) {
        int n = 89;
        System.out.println(confusingNumber(n));
    }

    public static boolean confusingNumber(int n) {
        StringBuffer sb = new StringBuffer();
        for(char c : String.valueOf(n).toCharArray()){
            if(c == '2' || c == '3' || c == '4' || c == '5' || c == '7'){
                return false;
            }else if (c == '6'){
                sb.append(9);
            }else if(c == '9'){
                sb.append(6);
            }else{
                sb.append(c);
            }
        }

        return !sb.reverse().toString().equals(String.valueOf(n));
    }
}
