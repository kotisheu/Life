public class Buffy extends Character { 

  public Buffy(Player a) {
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Luke");
    }
    else {
      setGen(true);
      setName("Mia");
    }
    //figure out the rest of the attributes
  }

}
