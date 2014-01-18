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

    // school is at beginning of game -- lower stats required
    setInt( (int) ( 75 * Math.random() ) );
    setMo( (int) ( 75 * Math.random() ) );
    setAtt( (int) ( 75 * Math.random() ) );
    setStr( (int) ( 75 * Math.random() ) );
  }

}
