

/* 
HandEvaluation class from the Poker project of the subject COMP90041


*/

import java.util.Arrays;
public class HandEvaluation{
 
/* 
 * In this class we use the methods of HandClassification and 
 * HandDescription to fully evaluate a poker hand. This evaluation 
 * is done by the evaluateHand 
 * method.This method will first call the different methods 
 * of HandClassification to find the right classification 
 * for the hand. When this is done, the appropriate method from 
 * HandDescription is called. Finally we print the correct output 
 * given the information of description. Note that we use 
 * the outputRank variable of the type Rank to display the rank
 * in the appropriate way
 
 * We also find here the methods createRanksArray and createSuitsArray that
 * take an array  of objects Card in parameters and return respectively an array 
 * of Ranks of the cards and an array of Suits of the cards.
 */

	
	
	private final static int NUMBER_OF_CARDS =5;
	
	
	
	public static Rank[] createRanksArray (Card[]hand){
		
		Rank[] ranksArray = new Rank[NUMBER_OF_CARDS];
		for (int i =0 ; i<hand.length ;i++){
			ranksArray[i]= hand[i].getRank();
		}
		return ranksArray;
	}
	
	public static Suit[] createSuitsArray(Card[]hand){
		
		Suit[] suitsArray = new Suit[NUMBER_OF_CARDS];
		for (int i =0 ; i<hand.length ;i++){
			suitsArray[i]= hand[i].getSuit();
		}
		return suitsArray;
	}
	
	public static void evaluateHand (Card[]hand){
	        // we first create the arrays of Ranks and suits
	        // and we sort the array of ranks
		Rank[] ranksArray= createRanksArray(hand);
		Arrays.sort(ranksArray);
		Suit [] suitsArray = createSuitsArray(hand);
		/*
		the case of the straight flush is handled by checking
		for both a flush AND a straight. The additional description
		will be the same as a straight, only the highest card rank
		matters
		*/
		
		if(HandClassification.isFlush(suitsArray)&& 
		                HandClassification.isStraight(ranksArray)){
		        Rank[]extra_info =
			HandDescription.describeStraight(ranksArray);
			System.out.println("Player 1: "
			+extra_info[0].getOutputRank()+"-high straight flush");
			
		}
		
		
			
			
		else if(HandClassification.isFourOfAKind(ranksArray)){
			Rank[]extra_info = 
			HandDescription.describeFourOfAKind(ranksArray);
			System.out.println("Player 1: Four "+
			extra_info[0].getOutputRank()+"s");
		}
			
		else if(HandClassification.isFull(ranksArray)){
			Rank[]extra_info= 
			HandDescription.describeFull(ranksArray);
			System.out.println("Player 1: "+
			extra_info[0].getOutputRank()+"s full of "+
			extra_info[1].getOutputRank()+"s");
			System.exit(0);
		}
			
		else if(HandClassification.isFlush(suitsArray)){
			Rank[]extra_info= 
			HandDescription.describeStraight(ranksArray);
			System.out.println("Player 1: "+
			extra_info[0].getOutputRank()+"-high flush");
			System.exit(0);
		}
		
		else if(HandClassification.isStraight(ranksArray)){
			Rank[]extra_info= 
			HandDescription.describeStraight(ranksArray);
			System.out.println("Player 1: "+
			extra_info[0].getOutputRank()+"-high straight");
			System.exit(0);
		}
		
		else if(HandClassification.isThreeOfAKind(ranksArray)){
			Rank[]extra_info=
			HandDescription.describeThreeOfAKind(ranksArray);
			System.out.println("Player 1: Three " +
			extra_info[0].getOutputRank()+"s");
			System.exit(0);
		}
		
		else if(HandClassification.isDoublePair(ranksArray)){
			Rank[]extra_info=
			HandDescription.describeDoublePair(ranksArray);
			System.out.println("Player 1: "+
			extra_info[0].getOutputRank()+"s over "+
			extra_info[1].getOutputRank()+"s");
			System.exit(0);
		}
			
		else if(HandClassification.isPair(ranksArray)){
			Rank[]extra_info=
			HandDescription.describePair(ranksArray);
			System.out.println("Player 1: Pair of "+
			extra_info[0].getOutputRank()+"s");
			System.exit(0);
		}
		else{
		 // if no match has been found, we have an high card-hand
		 // the description is the same as a Straight only the rank
		 // of the highest card matters.
			Rank[]extra_info=
			HandDescription.describeStraight(ranksArray);
			System.out.println("Player 1: "+
			extra_info[0].getOutputRank()+"-high");
		
		}
			
	}
}
	
	
			
				
			
			
	



