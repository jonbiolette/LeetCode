public class PalindromeNumber {
    public static void main(String[] args) {
        int num = -121;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        String newNumber = "";
        for (int i = 0; i < num.length(); i++) {
            char index = num.charAt(i);
            newNumber = index + newNumber;
        }
        try {
            if (x == Integer.parseInt(newNumber)) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
