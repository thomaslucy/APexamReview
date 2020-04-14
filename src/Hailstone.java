public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        int length = 0;
        while (n != 1){
            if (n % 2 != 0)
                n += 3*n +1;
            else if (n % 2 == 0)
                n += n/2;
            length ++;
        }
        return length;
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
        double i = 0;
            if (isLongSeq(n) == true)
                i++;
        return i;
    }

    // There may be instance variables, constructors, and methods not shown.
}
