public class Buffy extends Character { 

  public Buffy(Player a) {
    
    // set gender of the Buff person opposite of the player
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Luke");
    }
    else {
      setGen(true);
      setName("Mia");
    }
    
    // set each of the attributes to a random number between 0 and 25
    setInt( (int) 25 * Math.random() );
    setMo( (int) 25 * Math.random() );
    setAtt( (int) 25 * Math.random() );
    // Remember: the intelligence of the nerd is higher than 50
    setStr( 50 + (int) ( 50 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet("false");
    setAff(0);
  }

}
