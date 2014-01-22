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
    setMet(false);
    setAff(0);
    
  }
  
    public String talk() {
  	String r = " Hey! Come on, I saved you a seat!";
  	return r;
    }
  
    public String Q1() {
	String s = "";
	s = "What's up? Haven't I seen you around in my classes?";
	return s;
    }

    public String Q1C1() {
	String s = "yes";
	return s;
    }
    // setAff( getAff() + 5);
    public String Q1A1() {
	String s = "Of course! How could I forget? The teacher loves you!";
	return s;
    }

    public String Q1C2() {
	String s = "no";
	return s;
    }
    //setAff( getAff() - 2 );
    public String Q1A2() {
	String s = "Huh. I thought we did... Maybe it was someone else who looks like you.";
	return s;
    }

    public String intro() {
	String s = "You don't know me? I'm " + getName() + ".";
	return s;
    }

    public String Q2() {
	String s = "Are you new here? What do you think of this place?";
	return s;
    }
    
    public String Q2C1() {
	String s = "1: The teachers are nice, and the kids are so helpful. I wouldn't want to be anywhere else." ;
	return s;
    }
    //setAff(getAff() + 15);
    public String Q2A1() {
	String s = "Right? This school really does have amazing people, if you get to know them.";
	return s;
    }

    public String Q2C2() {
	String s = "2: I just can't wait to graduate and get out of here!";
	return s;
    }
    //setAff(getAff() - 15);
    public String Q2A2() {
	String s = "Woah, slow down! I get you, but you'll never make it anywhere with that attitude!";
	return s;
    }

    public String Q2C3() {
	String s = "3: It's a school. What more is there to it than the people?";
	return s;
    }
    //setAff(getAff() + 5);
    public String Q2A3() {
	String s = "True, but the people you meet...! They'll definitely get you places.";
	return s;
    }

    public String Q3() {
	String s = "What are you doing after school? I was thinking of showing you around.";
	return s;
    }
    
    public String Q3C1() {
	String s = "1: I'd love to, but I have to get home to finish a compsci project. I'm so sorry!" ;
	return s;
    }
    //setAff(getAff() - 5);
    public String Q3A1() {
	String s = "Oh well. I applaud you for being responsible. But just remember, there is more to school than grades!";
	return s;
    }

    public String Q3C2() {
	String s = "2: I actually have practice after school. Coach would kill me if I didn't go.";
	return s;
    }
    //setAff(getAff() + 15);
    public String Q3A2() {
	String s = "You're right, you shouldn't skip out on practice! When's your next game? I'd love to come!";
	return s;
    }

    public String Q3C3() {
	String s = "3: Nothing, really. At least, nothing I can't put off.";
	return s;
    }
    //setAff(getAff() - 10);
    public String Q3A3() {
	String s = "A procrastinator! Are you sure you won't put off my meeting? Just make sure you stay afloat everything!";
	return s;
    }
    
    public String end() {
	String s = "The bell! Ahh! I'll be late! Later!";
	return s;  
    }

}
