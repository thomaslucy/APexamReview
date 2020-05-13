public class StudentRecord {

    private int[] scores; // contains scores.length values. scores.length > 1

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    /** Returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     * Method is marked public for testing purposes.
     */
    public double average(int first, int last) {
        double average = 0.0;
        for (int i = first; i <= last; i++){
            average += scores[i];
        }
        average = average / (last-first+1);
        return average;
    }

    /** Returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * Method marked public for testing purposes.
     */
    public boolean hasImproved() {
        int improved = scores[0];
        for (int i = 1; i < scores.length; i++){
            if (scores[i] >= improved){
                improved = scores[i];
            }
            else {
                return false;
            }
        }
        return true;
    }

    /** If the values in scores have improved, returns the average of the elements in scores
     * with indexes greater than or equal to scores.length/2;
     * otherwise, returns the average of all the values in scores
     */
    public double finalAverage() {
        double a = 0;
        if (hasImproved()){
            int score = scores.length;
            int n = scores.length/2;
            a = average(n, scores.length-1);
        }
        else {
            a = average(0, scores.length-1);
        }
        return a;
    }
    }
