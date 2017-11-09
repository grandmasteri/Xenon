
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete[] players;

    /**
     * Constructor for objects of class Team
     */
    public Team(String name, int size)
    {
        // initialise instance variables
        this.teamName = name;
        players = new Athlete[size];
    }
    
    public String toString() {
        String output = "This is the team roster:\n";
        for (Athlete a : players) {
        output += a + "\n";  
        }
        return output;
    }
    public void addAthlete(int index, Athlete a) {
        players[index] = a;
    }
}
