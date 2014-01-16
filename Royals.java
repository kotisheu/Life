public class Royals extends Character { 

  public Royals(Player a) {
    
    // set gender opposite that of player
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Will");
    }
    else {
      setGen(true);
      setName("Tatiana");
    }
    
    // set each of the attributes to a random number between 75 and 100 because they're royalty-- super high stats
    setInt( 75 + (int) ( 25 * Math.random() ) );
    setMo( 75+ (int) ( 25 * Math.random() ) );
    setAtt( 75 + (int) ( 25 * Math.random() ) );
    setStr( 75 + (int) ( 25 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet("false");
    setAff(0);
  }

}
