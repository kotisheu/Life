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

  public void talk() {
      isr = new InputStreamReader( System.in );
      in = new BufferedReader(isr);

    String s = "";
    s = "Hi! Would you help me grab a couple of papers from my desk? I'm going to be late for the meeting!";
    System.out.println(s);
    try {
        String response = in.readLine();
    }
    catch( IOException e ) {}
    if (response == "yes") {
      setAff( getAff() + 10 );
      System.out.println("Thank you so, so much! I owe it to you!");
    }
    else if (response == "no") {
      setAff( getAff() - 10 );
      System.out.println("Oh, well I suppose you're busy too. It's okay, I'll get someone else to get it for me.");
    }
    
    s = "Oh, by the way, I'm " + getName() + ".";
    System.out.println(s);
    
    s = "Are you going to the meeting, too? I'm new here, and I'm so nervous! Any words of advice?\n";
    s += "\t1: Be calm. Have what you have to say in mind, but don't be afraid to improvise as you see fit.";
    s += "\t2: Have all your papers ready... Just kidding! What's important is how you present yourself.";
    s += "\t3: Live in the moment and pay attention. If you aren't confident, don't talk.";
    System.out.println(s);
    String choice = in.readLine();
    if (choice == "1") {
      setAff( getAff() + 5 );
      System.out.println("Be calm... All right. I got this. Thanks!");
    }
    else if (choice == "2") {
      setAff( getAff() + 15 );
      System.out.println("Haha! Okay, I'll just pretend I'm talking to you! You don't mind if I do, right?");
    }
    else if (choice == "3") {
      setAff( getAff() - 5 );
      System.out.println("Paying attention I can do, but doesn't not talking defeat the purpose of a meeting? What have you been doing?");
    }
    
    s = "Where are you going for lunch? Maybe we can meet up.\n";
    s += "\t1: I'm behind on my work, so I'm staying in my office. Otherwise, I would say where ever you wanted.";
    s += "\t2: The coffee shop just across the block. The line sometimes gets long during lunch, though, because their lattes are divine.";
    s += "\t3: The fast food restaurant or deli. Quick and easy is efficient.";
    choice = in.readLine();
    System.out.println(s);
    if (choice == "1") {
      setAff( getAff() - 10 );
      System.out.println("Oh, I won't bother you, then! I guess I'll just have to talk to more people, make more friends here.");
    }
    else if (choice == "2") {
      setAff( getAff() + 5 );
      System.out.println("I'm always in for a comfy place to sit and take a break. Let's go!");
    }
    else if (choice == "3") {
      setAff( getAff() - 5 );
      System.out.println("Efficiency really does define you! But is eating that often healthy?");
    }
    
    s = "I'll keep in mind what you told me.";
    s = "/nWish me luck!";
    System.out.println(s);
    
  }

}
