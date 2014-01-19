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
  
  public void talk() {
    String r = "";
    r = "Just talking a walk outside makes me feel so free!";
    System.out.println(r);
  }

  public void firstTalk() {
      isr = new InputStreamReader( System.in );
      in = new BufferedReader(isr);

    String s = "";
    s = "Excuse me, have we met before?";
    System.out.println(s);
    try {
        String response = in.readLine();
    }
    catch( IOException e ) {}
    if (response == "yes") {
      setAff( getAff() - 10 );
      System.out.println("Oh? Is that true? I don't recall... I really don't think I've seen you, though.");
    }
    else if (response == "no") {
      setAff( getAff() + 2 );
      System.out.println("Well, we most certainly have now. It's a wonder we didn't before.");
    }
    
    s = "Delighted to make your acquaintance. I'm " + getName() + ".";
    System.out.println(s);
    
    s = "I'm afraid I don't go to town often... Where do you suppose I shoud visit?\n";
    s += "\t1: The library! It's gorgeous and full of volumes and volumes of books to capture your attention!";
    s += "\t2: The circus or magic show! The tricks they perform are captivating!";
    s += "\t3: The amusement park is the best place to be. Nothing's more fun! The food, the rides... You'll love it!";
    System.out.println(s);
    String choice = in.readLine();
    if (choice == "1") {
      setAff( getAff() - 10 );
      System.out.println("How silly you are! Did you think the palace didn't have books galore for me to read?");
    }
    else if (choice == "2") {
      setAff( getAff() + 2 );
      System.out.println("I'm sure it would be entertaining! Sleights of hands and tricks... That would be a good idea!");
    }
    else if (choice == "3") {
      setAff( getAff() + 5 );
      System.out.println("Perfect! A place to let it go and get away from the stuffy high life! Of course, you'll accompany me, won't you?");
    }
    
    s = "Oh, what was that? A question? Ask away.\n";
    s += "\t1: What's it like, with all the parties and luxuries of royalty?";
    s += "\t2: Do you get tired of being so restrained?";
    s += "\t3: I love your horse. Do you like animals?";
    choice = in.readLine();
    System.out.println(s);
    if (choice == "1") {
      setAff( getAff() - 10 );
      System.out.println("Oh, you've been reading too many books or watching too many movies. It's rather boring, actually. You can come one day if you'd like.");
    }
    else if (choice == "2") {
      setAff( getAff() + 5 );
      System.out.println("It is tiring. It's nice to see someone understands. That's why I had to step out for a walk among the normal people. Not that you're normal.");
    }
    else if (choice == "3") {
      setAff( getAff() + 1 );
      System.out.println("I adore animals. They're simply so astounding.");
    }
    
    s = "Oh, that must be a servant asking for me... I should like to be back when I can. You'll be here when I do, won't you?";
    s = "/nUntil next time, my friend.";
    System.out.println(s);
    
  }

}
