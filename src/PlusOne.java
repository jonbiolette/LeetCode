/*
@author Jon Biolette
@date 03/20/22
 */

import java.math.BigInteger;
import java.util.Arrays;

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

