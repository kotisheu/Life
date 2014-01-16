public class Student extends Character { 

  public Student(Player a) {
    
    // set the Student as the opposite gender of the Player
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Sebastian");
    }
    else {
      setGen(true);
      setName("Alyssa");
    }
    
    // school is at beginning of game -- lower stats required
    setInt( (int) ( 25 * Math.random() ) );
    setMo( (int) ( 25 * Math.random() ) );
    setAtt( (int) ( 25 * Math.random() ) );
    setStr( (int) ( 25 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet("false");
    setAff(0);
    
  }

}
