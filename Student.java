public class Student extends Character { 

  public Student(Player a) {
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Sebastian");
    }
    else {
      setGen(true);
      setName("Alyssa");
    }
    //figure out the rest of the attributes
  }

}
