public class Combinatorics {

    /** Precondition: n is between 1 and 12, inclusive.
     * Returns the factorial of n, as described in part (a). */
    public static int factorial(int n){
        int factorial = 0;
        if (n == 1)
            factorial = 1;
        else
            factorial = n*factorial(n-1);
        return factorial;
    }


    /** Precondition: n and r are between 1 and 12, inclusive. * Determines the number of ways r items can be selected
     * from n choices and prints the result, as described in part
     (b). */
    public static void numCombinations(int n, int r) {
        int combination = 0;
        if (r > n)
            combination = 0;
        else
            combination = factorial(n)/(factorial(r)*factorial(n-r));
    }
}
