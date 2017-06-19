/* 
 * HandDescription class from the Poker project of the subject COMP90041

 */

public class HandDescription{
 
/* 
This class contains the methods that will describe and return
the extra information of each hand, given its classification.
For each potential classification we have a specific method that will
return an array of ranks ( description) containing the appropriate extra info
(ranks of both pairs for a double pair, ranks of pair and 3 of a kind
for a full etc)

*/
	
	
	
	
	public static Rank[] describeFull(Rank[]ranksArray){

		Rank[]description = new Rank[2];
		if (ranksArray[0].equals(ranksArray[2])){
			description[0]=ranksArray[0];
			description[1]=ranksArray[3];
		
		
		}else{
			description[0]=ranksArray[2];
			description[1]=ranksArray[0];
		}
		return description;
	}
		
	public static Rank[] describePair (Rank[]ranksArray){
		Rank[]description = new Rank[1];
		for(int i=0 ; i<ranksArray.length-1;i++){
			if (ranksArray[i].equals(ranksArray[i+1]))
					description[0]=ranksArray[i];				
		}
		return description;
	}
	
	public static Rank[] describeDoublePair(Rank[]ranksArray){
		Rank[]description = new Rank[2];
		if (ranksArray[0]==ranksArray[1]){
			description[1]=ranksArray[0];
			if(ranksArray[2]==ranksArray[3])
				description[0]=ranksArray[2];
			else
				description[0]=ranksArray[3];
		}else
			description[1]=ranksArray[1];
			description[0]=ranksArray[3];
			
		return description;
		 
				
	}
	public static Rank[] describeThreeOfAKind(Rank[]ranksArray){
		Rank[]description = new Rank[1];
		if (ranksArray[0].equals(ranksArray[2]))
			description[0]=ranksArray[0];
		else
			description[0]=ranksArray[2];
		return description;	
		
	}
	public static Rank[] describeFourOfAKind(Rank[]ranksArray){
		Rank[]description = new Rank[1];
		if (ranksArray[0].equals(ranksArray[1]))
			description[0]=ranksArray[0];
		else
			description[0]=ranksArray[1];
		return description;	
	}
	public static Rank[] describeStraight(Rank[]ranksArray){
		Rank[]description = new Rank[1];
		description[0]=ranksArray[4];
		return description;
	}
	
		
		
	
	
}
