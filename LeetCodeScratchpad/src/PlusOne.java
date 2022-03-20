/*
@author Jon Biolette
@date 03/20/22
 */

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
        String numS = "";

        //Convert to string to combine all index's
        for(int i = 0; i < digits.length;i++){
            numS += Integer.toString(digits[i]);
        }
        //try parsInt catch if long / BigInteger
        //test case 9876543210
        try {
            int numI = Integer.parseInt(numS);
            numI += 1;
            numS = Integer.toString(numI);
        }catch(NumberFormatException e){
            try {
                Long numI = Long.parseLong(numS);
                numI += 1;
                numS = Long.toString(numI);
            }catch(NumberFormatException f){
                BigInteger numI = new BigInteger(numS);
                BigInteger one = new BigInteger("1");
                BigInteger sum = numI.add(one);
                numS = sum.toString();


            }
        }


        //if last index is 9, add additional index to array
        //test case 999 -> 1000
        if(numS.length() != digits.length){
            int[] arr = new int[digits.length+1];
            digits = arr;
        }

        //add everything back into digits
        for(int j = 0; j < digits.length; j++){
            String num = Character.toString(numS.charAt(j));
            digits[j] = Integer.parseInt(num);
        }
        return digits;
    }
}

