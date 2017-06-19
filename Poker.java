/* 
 *Poker class from the Poker project of the subject COMP90041

 */ 

public class Poker{
        
/* 
 * This class is the main class of the program. We find the main method 
 * who will first check validity of the input with a checkInput method, 
 * before calling the createHand method and evaluate the hand created 
 * with evaluateHand from the class HandEvaluation.
*/
	
	public static void main(String[] args){
		checkInput(args);
		Card[] hand = createHand(args);
		HandEvaluation.evaluateHand(hand);	
	}
	

	/*
	 * checkInput insures that the right number of arguments are passed
	 * on the command line
	 */
	
	public static void checkInput(String[] args){
		for (int i = 0 ; i < args.length ; i++ ) {
			args[i] = args[i].toUpperCase();
		}
		
		if (args.length < 5) {
			System.out.println("Error: wrong number of arguments; "
			                + "must be a multiple of 5");
			System.exit(0);
		} else if (args.length > 5) {
			System.out.println("NOT UNDERTAKEN");
			System.exit(0);
		} else return;
		
	}
	/*
	 createHand use matchRank and matchSuit to build an array 
	of objects Card with the arguments passed on the command line
	 */
	
	public static Card[] createHand(String[] args){
		Card []hand=new Card[5];
		for (int i=0;i<args.length;i++)
			hand[i]= new Card(matchRank(args[i]),
			                matchSuit(args[i]));
		return hand;
			
	}
			
	/* 
	 matchRank and matchSuit methods use a for loop on the values of the 
	 Rank and Suit to match them with the strings passed as arguments on the 
	 command line. The match is made on the inputRank and codeSuit variables of
	 Rank and Suit has defined in their respective classes.
	 If no match found an error message will be printed.
	 */
	public  static Rank matchRank(String arg){   
		for (Rank r : Rank.values()) {
		        if (r.getInputRank().equals(arg.substring(0,1)))
		                return r;
		    		           
            } 
            System.out.println("Error: invalid card name '"+arg+"'");
            System.exit(0);
            return null;
        }
                          
                        	  
                          
     
         
	  public  static Suit matchSuit(String arg) {
	          for (Suit s : Suit.values()) {
	                  if (s.getCodeSuit().equals(arg.substring(1,2))) 
	                          return s;
                  
          }
          System.out.println("Error: invalid card name '"+arg+"'");
          System.exit(0);
          return null;
	  }
}


