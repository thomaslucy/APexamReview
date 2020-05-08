import java.util.ArrayList;

public class RepairSchedule
{
    /** Each element represents a repair by an individual mechanic
     in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;


/** Constructs a RepairSchedule object.
 *  Precondition: n >= 0
 */
    public RepairSchedule(int n) {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }


/** Attempts to schedule a repair by a given mechanic in a
  * given bay as described in part (a).
  * Precondition: 0 <= m < numberOfMechanics and b >= 0
  */
    public boolean addRepair(int m, int b) {
        boolean repair = true;
        for (int i = 0; i < schedule.size(); i++){
            if (schedule.get(i).getMechanicNum() == m || schedule.get(i).getBayNum() == b){
                repair = false;
                break;
            }
        }
        if (repair)
            schedule.add(new CarRepair(m,b));
        return repair;
    }


 /** Returns an ArrayList containing the mechanic identifiers of
  * all available mechanics,
  * as described in part (b).
  */
 public ArrayList<Integer> availableMechanics() {
     ArrayList<Integer> list = new ArrayList<>();
     int m = 0;
     for (int i = 0; i < numberOfMechanics; i++){
         m++;
         list.add(m);
     }
     for (int j = 0; j < schedule.size(); j++){
         list.remove(schedule.get(j).getMechanicNum());
     }
     return list;
 }


 /** Removes an element from schedule when a repair is complete
  * Only to be used by the driver
  */
    public void carOut(int b) {
        for (int i=schedule.size()-1; i>=0; i--) {
            if (schedule.get(i).getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }
    
}

