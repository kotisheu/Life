public class Royals extends Character { 

  public Royals(Player a) {
    
    // set gender opposite that of player
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Prince Will");
    }
    else {
      setGen(true);
      setName("Princess Tatiana");
    }
    
    // set each of the attributes to a random number between 75 and 100 because they're royalty-- super high stats
    setInt( 75 + (int) ( 25 * Math.random() ) );
    setMo( 75+ (int) ( 25 * Math.random() ) );
    setAtt( 75 + (int) ( 25 * Math.random() ) );
    setStr( 75 + (int) ( 25 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet(false);
    setAff(0);
  }
  
    public String talk() {
  	String r = "Just talking a walk outside makes me feel so free!";
  	return r;
    }
  
    public String Q1() {
	String s = "";
	s = "Excuse me, have we met before?";
	return s;
    }

    public String Q1C1() {
	String s = "yes";
	return s;
    }
    // setAff( getAff() - 10 );
    public String Q1A1() {
	String s = "Oh? Is that true? I don't recall... I really don't think I've seen you, though.";
	return s;
    }

    public String Q1C2() {
	String s = "no";
	return s;
    }
    //setAff( getAff() + 2 );
    public String Q1A2() {
	String s = "Well, we most certainly have now. It's a wonder we didn't before.";
	return s;
    }

    public String intro() {
	String s = "Delighted to make your acquaintance. I'm " + getName() + ".";
	return s;
    }

    public String Q2() {
	String s = "I'm afraid I don't go to town often... Where do you suppose I shoud visit?";
	return s;
    }
    
    public String Q2C1() {
	String s = "1: The library! It's gorgeous and full of volumes and volumes of books to capture your attention!" ;
	return s;
    }
    //setAff(getAff() - 10);
    public String Q2A1() {
	String s = "How silly you are! Did you think the palace didn't have books galore for me to read?";
	return s;
    }

    public String Q2C2() {
	String s = "2: The circus or magic show! The tricks they perform are captivating!";
	return s;
    }
    //setAff(getAff() + 2);
    public String Q2A2() {
	String s = "I'm sure it would be entertaining! Sleights of hands and tricks... That would be a good idea!";
	return s;
    }

    public String Q2C3() {
	String s = "3: The amusement park is the best place to be. Nothing's more fun! The food, the rides... You'll love it!";
	return s;
    }
    //setAff(getAff() + 5);
    public String Q2A3() {
	String s = "Perfect! A place to let it go and get away from the stuffy high life! Of course, you'll accompany me, won't you?";
	return s;
    }

    public String Q3() {
	String s = "Oh, what was that? A question? Ask away.";
	return s;
    }
    
    public String Q3C1() {
	String s = "1: What's it like, with all the parties and luxuries of royalty?" ;
	return s;
    }
    //setAff(getAff() - 10);
    public String Q3A1() {
	String s = "Oh, you've been reading too many books or watching too many movies. It's rather boring, actually. You can come one day if you'd like.";
	return s;
    }

    public String Q3C2() {
	String s = "2: Do you get tired of being so restrained?";
	return s;
    }
    //setAff(getAff() + 5);
    public String Q3A2() {
	String s = "It is tiring. It's nice to see someone understands. That's why I had to step out for a walk among the normal people. Not that you're normal.";
	return s;
    }

    public String Q3C3() {
	String s = "3: I was thinking of other places you might like. How about the aquarium or zoo? Do you like animals?";
	return s;
    }
    //setAff(getAff() + 1);
    public String Q3A3() {
	String s = "I adore animals. They're simply so astounding.";
	return s;
    }
    
    public String end() {
	String s = "Oh, that must be a servant asking for me... I should like to be back when I can. You'll be here when I do, won't you? Take care, my friend.";
	return s;  
    }

}
