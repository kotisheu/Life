public class Pretty extends Character { 

  public Pretty(Player a) {
    
    // set the gender of the pretty person opposite the player
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Damon");
    }
    else {
      setGen(true);
      setName("Vivian");
    }
    
    // set each of the attributes to a random number between 0 and 25
    setStr( (int) (25 * Math.random()) );
    setMo( (int) (25 * Math.random()) );
    setInt( (int) (25 * Math.random()) );
    // Remember: the intelligence of the nerd is higher than 50
    setAtt( 50 + (int) ( 50 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet(false);
    setAff(0);
  }
  
    public String talk() {
  	String r = "A word of advice? Kick back, relax, and look good!";
  	return r;
    }
  
    public String Q1() {
	String s = "";
	s = "You need help with all those bags?";
	return s;
    }

    public String Q1C1() {
	String s = "yes";
	return s;
    }
    // setAff( getAff() + 5 );
    public String Q1A1() {
	String s = "No problem. I'm happy to help. That's wayyy too much for one person to handle.";
	return s;
    }

    public String Q1C2() {
	String s = "no";
	return s;
    }
    //setAff( getAff() + 20 );
    public String Q1A2() {
	String s = "Used to it? I am myself, but here, let me take some anyway. It's much easier, believe me.";
	return s;
    }

    public String intro() {
	String s = "What was that? Oh, I'm just a person that shares your pain of too many bags. " + getName() + ".";
	return s;
    }

    public String Q2() {
	String s = "Where are we off to?";
	return s;
    }
    
    public String Q2C1() {
	String s = "1: On to the next store! I'm just getting started! Bags can't weigh me down!" ;
	return s;
    }
    //setAff(getAff() + 15);
    public String Q2A1() {
	String s = "I love your mentality! Let's go! I'm ready when you are.";
	return s;
    }

    public String Q2C2() {
	String s = "2: I was just about to leave... Then you won't have to carry anything for me.";
	return s;
    }
    //setAff(getAff() - 5);
    public String Q2A2() {
	String s = " Thanks for being considerate, but a couple of bags won't break me!";
	return s;
    }

    public String Q2C3() {
	String s = "3: Maybe just one more store... And after that, home.";
	return s;
    }
    //setAff(getAff() + 20);
    public String Q2A3() {
	String s = " Hmm, someone who has control! I like that. Let's go for coffee afterwards!";
	return s;
    }

    public String Q3() {
	String s = " Hey, look at those stores! Which one matches your sense of style?";
	return s;
    }
    
    public String Q3C1() {
	String s = "1: Casual and natural. That way, people can see you for who you are." ;
	return s;
    }
    //setAff(getAff() + 10);
    public String Q3A1() {
	String s = " Clothes do tell a lot about you! I see a cheerful, calm person in you!";
	return s;
    }

    public String Q3C2() {
	String s = "2: Dressy's my thing! It's never bad to look your best.";
	return s;
    }
    //setAff(getAff() + 15);
    public String Q3A2() {
	String s = " Looking your best at all times is hard work! But I agree, it really makes a difference!";
	return s;
    }

    public String Q3C3() {
	String s = "3: Different! I like to stand out of the crowd!";
	return s;
    }
    //setAff(getAff() + 5);
    public String Q3A3() {
	String s = " As long as you can pull it off!";
	return s;
    }
    
    public String end() {
	String s = "I like your taste! It's amazing how shopping can bring people together. Maybe I'll bump into you again next time. But you're carrying my bags, okay?";
	return s;  
    }

}
