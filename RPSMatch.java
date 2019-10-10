
/**
 * Write a description of class RSPMatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RPSMatch
{
    // instance variables - replace the example below with your own
    private int compSign;
    private int humanSign;
    private int compWins;
    private int humanWins;
    private int ties;
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;
    /**
     * Constructor for objects of class RPSMatch
     */
    public RPSMatch()
    {
        compWins = 0;
        humanWins = 0;
        ties = 0;
    }


    public int getHumanSign()
    {
        return humanSign;
    }
    
    public void setHumanSign(int sign)
    {
       humanSign = sign;
    }
    
    public int getCompSign()
    {
        return compSign; 
    }
      
    public void setCompSign()
    {
        compSign = (int)(Math.random() * 3);
    }
    
    public String getCompText()
    {
        if (compSign == 0)
        {
            return ("Rock");
        }
        else if (compSign == 1)
        {
            return ("Paper");
        }
        else
        {
            return ("Scissors");
        }
    }
    
    public int getCompWins()
    {
        return compWins;
    }
    
    public int getHumanWins()
    {
        return humanWins;
    }
    
    public int getTies()
    {
        return ties;
    }
    
    public int getResult()
    {
        if ((humanSign == 0 && compSign == 1) || (humanSign == 1 && compSign == 2) || (humanSign == 2 && compSign == 0))
        {
            compWins = compWins + 1;
            return compWins;
        }
        else if (humanSign == compSign)
        {
            ties = ties + 1;
            return ties;
        }
        else
        {
            humanWins = humanWins + 1;
            return humanWins;
        }
    }
}
