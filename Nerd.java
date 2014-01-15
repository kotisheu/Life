public class Nerd extends Character { 

  public Nerd(Player a) {
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Felix");
    }
    else {
      setGen(true);
      setName("Fiona");
    }
    //figure out the rest of the attributes
  }

}
