public class Buffy extends Character { 

    public Buffy(Player a) {
    
	// set gender of the Buff person opposite of the player
	if ( a.getGen() == true ) {
	    setGen(false);
	    setName("Luke");
	}
	else {
	    setGen(true);
	    setName("Mia");
	}
    
	// set each of the attributes to a random number between 0 and 25
	setInt( (int) ( 25 * Math.random() ) );
	setMo( (int) ( 25 * Math.random() ) );
	setAtt( (int) ( 25 * Math.random() ) );
	// Remember: the strength of the buff person is higher than 50
	setStr( 50 + (int) ( 50 * Math.random() ) );
	// initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
	setMet(false);
	setAff(0);

    }
  
    public String talk() {
  	String r = "Nice to see you have a life outside the gym, too!";
  	return r;
    }
  
    public String Q1() {
	String s = "";
	s = "Hey, I've seen you around. You come here a lot?";
	return s;
    }

    public String Q1C1() {
	String s = "yes";
	return s;
    }
    // setAff( getAff() + 10 );
    public String Q1A1() {
	String s = "Awesome. I'll be seeing you more, then. I'll keep a lookout for you.";
	return s;
    }

    public String Q1C2() {
	String s = "no";
	return s;
    }
    //setAff( getAff() - 10 );
    public String Q1A2() {
	String s = "That's too bad. You should come more often.";
	return s;
    }

    public String intro() {
	String s = "Oh, by the way, I'm " + getName() + ".";
	return s;
    }

    public String Q2() {
	String s = "Why are you here? Most people don't bother with exercise.";
	return s;
    }
    
    public String Q2C1() {
	String s = "1: Yeah, well, I felt bad about sitting on the couch all the time. I wanted a change of environment." ;
	return s;
    }
    //setAff(getAff() + 5);
    public String Q2A1() {
	String s = "At least you found the right state of mind now! You'll like it, you'll see.";
	return s;
    }

    public String Q2C2() {
	String s = "2: The temperature in the gym is much more consistent than outside, so it's better for me to work out here.";
	return s;
    }
    //setAff(getAff() + 10);
    public String Q2A2() {
	String s = "Outside is its own different world. It's not bad, but I have to agree with you. Smart thinking!";
	return s;
    }

    public String Q2C3() {
	String s = "3: I'm always in the gym. Exercise is how I let go and relax!";
	return s;
    }
    //setAff(getAff() + 20);
    public String Q2A3() {
	String s = "We share the same thought process, then! The gym is how I let off steam myself.";
	return s;
    }

    public String Q3() {
	String s = "Are you interested in sports? What's your favorite?";
	return s;
    }
    
    public String Q3C1() {
	String s = "1: No, I'm not the sporty type of person." ;
	return s;
    }
    //setAff(getAff() - 10);
    public String Q3A1() {
	String s = "Why not? Think of all the excitement and motion!";
	return s;
    }

    public String Q3C2() {
	String s = "2: I don't play sports, but I love to watch! Basketball's my favorite!";
	return s;
    }
    //setAff(getAff() + 5);
    public String Q3A2() {
	String s = "Really? Basketball's my favorite, too! Playing is much more fun, though. I can teach you!";
	return s;
    }

    public String Q3C3() {
	String s = "3: Of course! I love being in action! I don't have a favorite, I love them so much!";
	return s;
    }
    //setAff(getAff() + 15);
    public String Q3A3() {
	String s = "I guess we'll have to have a little competition someday, then. huh? Winner treats for lunch.";
	return s;
    }
    
    public String end() {
	String s = "Well, I'll see you around. Don't hurt yourself, okay?";
	return s;  
    }

}
