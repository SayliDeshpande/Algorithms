package ArrayandString.PerformStringShifts;

public class Solution {
    public static void main(String[] args) {
        String s = "abc";
        int[][]shift = {{0,1},{1,2}};
        System.out.println(stringShift(s, shift));
    }
    public static String stringShift(String s, int[][] shift) {
        // calculate total number of shifts
        int totalShifts = 0;
        for (int i = 0 ; i < shift.length ; i++){
            totalShifts = shift[i][0] == 0 ? totalShifts - shift[i][1] : totalShifts + shift[i][1];
        }

        totalShifts = totalShifts % s.length();
        StringBuffer sb = new StringBuffer(s);
        if(totalShifts > 0 ){ // right shift
            return sb.substring(sb.length()-totalShifts,sb.length()) + sb.substring(0,sb.length()-totalShifts);
        }else if(totalShifts<0){
            totalShifts=totalShifts*-1;
            return sb.substring(totalShifts,sb.length()) + sb.substring(0,totalShifts);
        }else{
            return sb.toString();
        }
    }
}
