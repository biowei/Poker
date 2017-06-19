/* 
 * HandClassification class from the Poker project of the subject COMP90041
 
 */

public class HandClassification {
 
/*         
 * This class contains a set of boolean methods, each one assessing a 
 * potential classification for a poker hand. They take into parameters 
 * a sorted array of  the ranks of the cards of a given poker hand.
 */
	
	
	
	
	public static boolean isStraight(Rank[] ranksArray){
		
		for (int i=0;i<ranksArray.length-1;i++){
			if(ranksArray[i+1].ordinal() != 
			   ranksArray[i].ordinal()+1)
				return false;
		}
		return true;
	}
	
		public  static boolean isPair (Rank[]ranksArray) {
			
			
			for (int i=0; i< ranksArray.length-1;i++){
				if (ranksArray[i].equals(ranksArray[i+1]))
					return true;
			}
			return false;
		}

		public  static boolean isDoublePair(Rank[] ranksArray){
			if (ranksArray[0].equals(ranksArray[1]))
				return ranksArray[2].equals(ranksArray[3])||
				       ranksArray[3].equals(ranksArray[4]);
			else
				return ranksArray[1].equals(ranksArray[2]) && 
				       ranksArray[3].equals(ranksArray[4]);
		
		}
		
		public static boolean isThreeOfAKind(Rank[] ranksArray){
			
			for (int i=0; i< ranksArray.length-2;i++){
				if (ranksArray[i].equals(ranksArray[i+1]) && 
				    ranksArray[i].equals(ranksArray[i+2]))
					return true;
			}
			return false;
		}
		
		public static boolean isFlush(Suit[]suitsArray){
			
		        for (int i=0;i<suitsArray.length-1;i++){
		                if (!suitsArray[i].equals(suitsArray[i+1]))
					return false;
			}
			return true;
		}
		
		public static boolean isFull(Rank[] ranksArray){
			if (ranksArray[0]!=ranksArray[1] ||
			    ranksArray[3]!=ranksArray[4])
					return false;
			else
				return ranksArray[1]==ranksArray[2]||
				       ranksArray[2]==ranksArray[3];
				
		}
		
		public static boolean isFourOfAKind(Rank[] ranksArray){
			
			for (int i=0; i< ranksArray.length-3;i++){
				if (ranksArray[i].equals(ranksArray[i+1]) && 
				    ranksArray[i].equals(ranksArray[i+2]) &&
				    ranksArray[i].equals(ranksArray[i+3]))
					return true;
			}
			return false;	
		}
		
}
