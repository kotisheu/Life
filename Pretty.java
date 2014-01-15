public class Pretty extends Character { 

  public Pretty(Player a) {
    
    // set the gender of the pretty person opposite the player
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Damon");
    }
    else {
      setGen(true);
      setName("Vivian");
    }
    
    // set each of the attributes to a random number between 0 and 25
    setStr( (int) 25 * Math.random() );
    setMo( (int) 25 * Math.random() );
    setInt( (int) 25 * Math.random() );
    // Remember: the intelligence of the nerd is higher than 50
    setAtt( 50 + (int) ( 50 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet("false");
    setAff(0);
  }

}
