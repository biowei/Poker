/* 
 * Card class from the Poker project of the subject COMP90041

 */

public class Card{

/* 
 * This class defines the basic object Card of the project.
 * Each object Card has a final instance variable rank of type Rank and
 * a final instance variable suit of type Suit. Those 2 types are enum and
 * defined in their own class.
 */        
        
	private final Rank rank;
	private final Suit suit;
	
	public Card(Rank rank, Suit suit){
	        this.suit=suit;
	        this.rank=rank;
	}
	
	public Rank getRank(){
		return rank ;
	}
	public Suit getSuit(){
		return suit;
	}
		
		
	

}
