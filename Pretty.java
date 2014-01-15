public class Pretty extends Character { 

  public Pretty(Player a) {
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Damon");
    }
    else {
      setGen(true);
      setName("Vivian");
    }
    //figure out the rest of the attributes
  }

}
