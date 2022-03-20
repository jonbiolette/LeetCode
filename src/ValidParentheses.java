public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        int paraCount = 0;
        int bracketCount = 0;
        int curlyCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (Character.compare(letter, '(') == 0 || Character.compare(letter, ')') == 0) {
                paraCount++;
            } else if (Character.compare(letter, '{') == 0 || Character.compare(letter, '}') == 0) {
                bracketCount++;
            } else if (Character.compare(letter, '[') == 0 || Character.compare(letter, ']') == 0) {
                curlyCount++;
            }
        }
        if (paraCount % 2 == 0 && bracketCount % 2 == 0 && curlyCount % 2 == 0) {
            return true;
        }
        return false;
    }
}
