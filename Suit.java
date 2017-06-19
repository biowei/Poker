/* 
enum Suit class from the Poker project of the subject COMP90041



*/
public enum Suit {
/* We defined an enum type to handle the suits, and 
 * we add an instance variable codeSuit to handle the
 * way the cards will be passed as input on the 
 * command line.
 */
	CLUBS ("C"),
	DIAMONDS ("D"),
	HEARTS ("H"),
	SPADES ("S");
	
	private final String codeSuit;
	
	private Suit(String codeSuit){
		this.codeSuit = codeSuit; 
	}
	public String getCodeSuit() { 
		return codeSuit ;
	}
}
