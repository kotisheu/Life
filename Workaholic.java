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

    public String talk() {
  	String r = "I'm so glad I could take time out of my schedule for this...";
  	return r;
    }
  
    public String Q1() {
	String s = "";
	s = "Hi! Would you help me grab a couple of papers from my desk? I'm going to be late for the meeting!";
	return s;
    }

    public String Q1C1() {
	String s = "yes";
	return s;
    }
    // setAff( getAff() + 10);
    public String Q1A1() {
	String s = "Thank you so, so much! I owe it to you!";
	return s;
    }

    public String Q1C2() {
	String s = "no";
	return s;
    }
    //setAff( getAff() - 10 );
    public String Q1A2() {
	String s = "Oh, well I suppose you're busy too. It's okay, I'll get someone else to get it for me.";
	return s;
    }

    public String intro() {
	String s = "Oh, by the way, I'm " + getName() + ".";
	return s;
    }

    public String Q2() {
	String s = "Are you going to the meeting, too? I'm new here, and I'm so nervous! Any words of advice?";
	return s;
    }
    
    public String Q2C1() {
	String s = "1: Be calm. Have what you have to say in mind, but don't be afraid to improvise as you see fit." ;
	return s;
    }
    //setAff(getAff() + 5);
    public String Q2A1() {
	String s = "Be calm... All right. I got this. Thanks!";
	return s;
    }

    public String Q2C2() {
	String s = "2: Have all your papers ready... Just kidding! What's important is how you present yourself.";
	return s;
    }
    //setAff(getAff() + 15);
    public String Q2A2() {
	String s = "Haha! Okay, I'll just pretend I'm talking to you! You don't mind if I do, right?";
	return s;
    }

    public String Q2C3() {
	String s = "3: Live in the moment and pay attention. If you aren't confident, don't talk.";
	return s;
    }
    //setAff(getAff() - 5);
    public String Q2A3() {
	String s = "Paying attention I can do, but doesn't not talking defeat the purpose of a meeting? What have you been doing?";
	return s;
    }

    public String Q3() {
	String s = "Where are you going for lunch? Maybe we can meet up.";
	return s;
    }
    
    public String Q3C1() {
	String s = "1: I'm behind on my work, so I'm staying in my office. Otherwise, I would say where ever you wanted" ;
	return s;
    }
    //setAff(getAff() - 10);
    public String Q3A1() {
	String s = "Oh, I won't bother you, then! I guess I'll just have to talk to more people, make more friends here.";
	return s;
    }

    public String Q3C2() {
	String s = "2: The coffee shop just across the block. The line sometimes gets long during lunch, though, because their lattes are divine.";
	return s;
    }
    //setAff(getAff() + 5);
    public String Q3A2() {
	String s = "I'm always in for a comfy place to sit and take a break. Let's go!";
	return s;
    }

    public String Q3C3() {
	String s = "3: The fast food restaurant or deli. Quick and easy is efficient.";
	return s;
    }
    //setAff(getAff() - 5);
    public String Q3A3() {
	String s = "Efficiency really does define you! But is eating that often healthy?";
	return s;
    }
    
    public String end() {
	String s = "I'll keep in mind what you told me. Wish my luck!";
	return s;  
    }

}
