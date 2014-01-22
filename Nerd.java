public class Nerd extends Character { 

  public Nerd(Player a) {
    
    // set the gender of the nerd the opposite of the player
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Felix");
    }
    else {
      setGen(true);
      setName("Fiona");
    }
    
    // set each of the attributes to a random number between 0 and 25
    setStr( (int) (25 * Math.random()) );
    setMo( (int) (25 * Math.random()) );
    setAtt( (int) (25 * Math.random()) );
    // Remember: the intelligence of the nerd is higher than 50
    setInt( 50 + (int) ( 50 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet(false);
    setAff(0);
  }

    public String talk() {
  	String r = "The world really is wonderous, as in the books...";
  	return r;
    }
  
    public String Q1() {
	String s = "";
	s = "S-sorry! I didn't see you there! Must have been too caught up in my reading... Is that a book in your hands?";
	return s;
    }

    public String Q1C1() {
	String s = "yes";
	return s;
    }
    // setAff( getAff() + 10 );
    public String Q1A1() {
	String s = "Oh! It's fantastic, especially the end, when...! Oops, I won't spoil it for you...";
	return s;
    }

    public String Q1C2() {
	String s = "no";
	return s;
    }
    //setAff( getAff() - 10 );
    public String Q1A2() {
	String s = "Well, you should read it anyway! It's good for the brain. But I guess all books are...";
	return s;
    }

    public String intro() {
	String s = "Wait, I forgot to introduce myself! I'm " + getName() + ". Pleased to meet you.";
	return s;
    }

    public String Q2() {
	String s = "Hey! Since you're here, anyway, help me decide which one to check out. The fictional piece or the nonfiction?";
	return s;
    }
    
    public String Q2C1() {
	String s = "1: Both! The more, the better!" ;
	return s;
    }
    //setAff(getAff() - 5);
    public String Q2A1() {
	String s = "Great idea! But... I only asked because I won't have time to read both...";
	return s;
    }

    public String Q2C2() {
	String s = "2: Fictional--let your mind go on adventures!";
	return s;
    }
    //setAff(getAff() + 10);
    public String Q2A2() {
	String s = "Great idea! I was in need of a break from reality, anyway.";
	return s;
    }

    public String Q2C3() {
	String s = "3: Nonfiction--learn about the fascinating truths and tragedies of reality.";
	return s;
    }
    //setAff(getAff() + 10);
    public String Q2A3() {
	String s = "You know what, I like that! Nature and society both have their own mystical secrets, don't they?";
	return s;
    }

    public String Q3() {
	String s = "You know, I'm actually thinking of attending night school... So unfortunately, I won't be here that often anymore.";
	return s;
    }
    
    public String Q3C1() {
	String s = "1: Aw, I was looking so forward to seeing you again." ;
	return s;
    }
    //setAff(getAff() + 5);
    public String Q3A1() {
	String s = "Dont worry! I'll still try to be here whenever I can!";
	return s;
    }

    public String Q3C2() {
	String s = "2: Good luck with that! I'm sure you'll do phenomenally.";
	return s;
    }
    //setAff(getAff() + 5);
    public String Q3A2() {
	String s = "You think so? I would hope so, but I'm not too sure...";
	return s;
    }

    public String Q3C3() {
	String s = "3: Don't sweat it! As long as you have a book in your hands and knowledge in your head, you'll be fine!";
	return s;
    }
    //setAff(getAff() + 15);
    public String Q3A3() {
	String s = "Haha! I like that! And I'll definitely keep it in mind.";
	return s;
    }
    
    public String end() {
	String s = "It was so nice to have met you, but I have to go now or I'll be late. Wish me the best! Oh, and, definately check that book out!";
	return s;  
    }

}
