public class Workaholic extends Character { 

  public Workaholic(Player a) {
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Jayce");
    }
    else {
      setGen(true);
      setName("Hazel");
    }
    //figure out the rest of the attributes
  }

}
