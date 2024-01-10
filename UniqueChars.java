/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = "back tohefur";
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String string = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (string.indexOf(c)==-1) {
             string = string + c;
            }
        }
        return string;
    }
}