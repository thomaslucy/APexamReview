public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        int length = 0;
        while (n != 1){
            if (n % 2 != 0)
                n = 3*n +1;
            else if (n % 2 == 0)
                n = n/2;
            length ++;
        }
        return length + 1;
    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        int length = hailstoneLength(n);
        boolean l = false;
        if (n < length)
            l = true;
        else
            l = false;
        return l;
    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        int l = 0;
        double percent = 0.0;
        for (int i = 1; i <= n; i++) {
            if (isLongSeq(i)) {
                l++;
            }
            percent = (double)l/n;
        }
        return percent;
    }

    // There may be instance variables, constructors, and methods not shown.
}
