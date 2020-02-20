
public class TennisGame2 implements TennisGame
{
	
	private static final int _FORTY = 3;
	private static final int _THIRTY = 2;
	private static final int _FIFTEEN = 1;
	private static final int _LOVE = 0;
	public int player1Points = 0;
    public int player2Points = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;
    
    
    public int P1point = 0;
    public int P2point = 0;
    

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
    	String literalScore="";
		if (isNormal())
			literalScore=getLiteral(player1Points) + "-" + getLiteral(player2Points);  
		if (isTie())
		    literalScore = getLiteral(player1Points) + "-All";
		if (isDeuce())
			literalScore = "Deuce";
		if (isInAdvantageOver(player1Points, player2Points))
		    literalScore = "Advantage player1";
		if (isInAdvantageOver(player2Points, player1Points))
		    literalScore = "Advantage player2";
		if (isWinnerOver(player1Points,player2Points))
		    literalScore = "Win for player1";
		if (isWinnerOver(player2Points,player1Points))
		    literalScore = "Win for player2";
        return literalScore;
    }

    private boolean isNormal() {
		return player1Points!=player2Points;
	}

	private String getLiteral(int p1point2) {
		String result="";
		if (p1point2==_LOVE)
			result="Love";
		if (p1point2==_FIFTEEN)
			result= "Fifteen";
		if (p1point2==_THIRTY)
			result= "Thirty";
		if (p1point2==_FORTY)
			result= "Forty";
		return result;
	}

	private boolean isTie() {
		return player1Points == player2Points && player1Points < 4;
	}

	private boolean isWinnerOver(int fistPlayerPoints, int secondPlayerPoints) {
		return fistPlayerPoints>=4 && secondPlayerPoints>=0 && (fistPlayerPoints-secondPlayerPoints)>=2;
	}

	private boolean isInAdvantageOver(int fistPlayerPoints, int secondPlayerPoints) {
		return fistPlayerPoints > secondPlayerPoints && secondPlayerPoints >= 3;
	}

	private boolean isDeuce() {
		return player1Points==player2Points && player1Points>=3;
	}
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        player1Points++;
    }
    
    public void P2Score(){
        player2Points++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}