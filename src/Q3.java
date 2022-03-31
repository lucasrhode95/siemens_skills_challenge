package src;

public class Q3 {

    public static void main(String[] args) {
        String s = "tab";
        String t = "tab";
        int k = 8;
        System.out.println(s);
        System.out.println(t);
        System.out.println(k);
        System.out.println(concatRemove(s, t, k) ? "yes" : "no");
    }

    /*
    Tells whether a string can be transformed in another in exact K operations
     */
    private static boolean concatRemove(String inputString, String desiredString, int targetOps) {
        // we're only allowed to add lowercase alpha chars
        if (!desiredString.matches("[a-z]+")) {
            System.out.println("Desired string must contain only letters");
            return false;
        }

        /*
        If the combined length is less than target operations, we can delete all characters from S and rewrite T from
        scratch, discarding extra operations (even or odd) in the 0-length string
         */
        int totalLength = inputString.length() + desiredString.length();
        if (totalLength <= targetOps) {
            return true;
        }

        /*
        If we exclude the common prefix of the two strings (if any), we'll need to:
          I.  delete the mismatching chars from inputString (needToErase); and
          II. insert the correct chars from desiredString (needToAdd).

        remaining ops == 0               : transformation is done
        remaining ops is even            : discard by adding and deleting chars
        remaining ops is odd or negative : transformation is not possible
         */
        int commonLength = commonLength(inputString, desiredString);
        int needToErase = inputString.length() - commonLength;
        int needToAdd = desiredString.length() - commonLength;
        int needOps = needToErase + needToAdd;
        int remainingOps = targetOps - needOps;

        return remainingOps >= 0 && remainingOps % 2 == 0;
    }

    /*
    Finds the length of the common prefix of two strings

    Example:
    >> a = "foobar"
    >> b = "football"
    >> output = 3
     */
    public static int commonLength(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return i;
            }
        }
        return minLength;
    }
}
