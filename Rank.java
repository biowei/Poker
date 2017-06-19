/* 
 * enum Rank class from the Poker project of the subject COMP90041

 */
public enum Rank { 
        
/* 
 * Here we defined an enum type to handle the ranks of the card.
 * We also add 2 string instances variables inputRank and outputRank.
 * inputRank will be helpul to handle the way the cards will be
 * submitted on the command line.
 * outputRank will helpful to handle the way the ranks should 
 * be displayed in the output of the program.
*/

	TWO ("2", "2"), 
	THREE ("3", "3"),
	FOUR ("4", "4"),
        FIVE ("5", "5"),
        SIX ("6", "6"),
        SEVEN ("7", "7"),
        EIGHT ("8", "8"),
        NINE ("9", "9"),
        TEN ("T", "10"),
        JACK ("J", "Jack"),
        QUEEN ("Q", "Queen"),
        KING ("K", "King"),
        ACE ("A", "Ace");
	
        private final String inputRank;
        private final String outputRank;
        
        private Rank(String inputRank, String outputRank) { 
        	this.inputRank = inputRank;
        	this.outputRank = outputRank; 
        }
        public String getInputRank() { 
        	return inputRank;
        }
        public String getOutputRank(){ 
        	return outputRank; 
        }
}


