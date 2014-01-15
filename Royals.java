public class Royals extends Character { 

  public Royals(Player a) {
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Will");
    }
    else {
      setGen(true);
      setName("Tatiana");
    }
    //figure out the rest of the attributes
  }

}
