public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max)
    {
        int result = (int)(Math.random() * max);

        return result;
    }
    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int playerspin = spin(1,10);
        int computerspin = spin(2,8);
        if (computerspin > playerspin)
            System.out.println("You lose. " + (playerspin - computerspin) + " points");
        else if (playerspin > computerspin)
            System.out.println("You win! " + (playerspin - computerspin) + " points");
        else {
            int playerspinn = spin(1,10);
            int computerspinn = spin(2,8);
            if (playerspin + playerspinn < computerspin + computerspinn)
                System.out.println("You lose. -1 point");
            else if (playerspin + playerspinn > computerspin + computerspinn)
                System.out.println("You win! 1 point");
            else
                System.out.println("Tie. 0 points");
        }
    }
}
