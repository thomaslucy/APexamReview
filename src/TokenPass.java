public class TokenPass {

    private int[] board;
    private int currentPlayer;

    public TokenPass(int[] b, int c){
        this.board = b;
        this.currentPlayer = c;
    }
    public int[] getBoard() {
        return board;
    }

    public void setBoard(int[] board) {
        this.board = board;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    /** Creates the board array to be of size playerCount and fills it with
     * random integer values from 1 to 10, inclusive. Initializes currentPlayer to a
     * random integer value in the range between 0 and playerCount-1, inclusive.
     * @param playerCount the number of players
     */
    public TokenPass(int playerCount) {
        currentPlayer = (int)(Math.random()*(playerCount-1)) + 1;
        board = new int[playerCount];
        for (int i = 0; i < playerCount; i++){
            board[i] = (int)((Math.random()*10) + 1);
        }
    }

    /** Distributes the tokens from the current player's position one at a time to each player in
     * the game. Distribution begins with the next position and continues until all the tokens
     * have been distributed. If there are still tokens to distribute when the player at the
     * highest position is reached, the next token will be distributed to the player at position 0.
     * Precondition: the current player has at least one token.
     * Postcondition: the current player has not changed.
     */
    public void distributeCurrentPlayerTokens() {
        int token = board[currentPlayer];
        board[currentPlayer] = 0;
        int place = currentPlayer + 1;
        while (token != 0){
            if (place >= board.length)
                place = 0;
            token--;
            board[place]++;
            place++;
        }
    }

}
