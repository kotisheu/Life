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
    setInt( (int) 25 * Math.random() );
    setMo( (int) 25 * Math.random() );
    setAtt( (int) 25 * Math.random() );
    // Remember: the strength of the buff person is higher than 50
    setStr( 50 + (int) ( 50 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet("false");
    setAff(0);
  }
  
  public void talk() {
    String s = "";
    s = "Hey, I've seen you around. You come here a lot?";
    System.out.println(s);
    String response = in.readLine();
    if (response == "yes") {
      setAff( getAff() + 10 );
      System.out.println("Awesome. I'll be seeing you more, then. I'll keep a lookout for you.")
    }
    else if (response == "no") {
      setAff( getAff() - 10 );
      System.out.println("That's too bad. You should come more often.")
    }
    
    s = "Oh, by the way, I'm " + getName() + ".";
    System.out.println(s);
    
    s = "Why are you here? Most people don't bother with exercise."
    s += "\t1: Yeah, well, I felt bad about sitting on the couch all the time. I wanted a change of environment."
    s += "\t2: The temperature in the gym is much more consistent than outside, so it's better for me to work out here."
    s += "\t3: I'm always in the gym. Exercise is how I let go and relax!"
    System.out.println(s)  
    String choice = in.readLine();
    if (choice == "1") {
      setAff( getAff() + 5 );
      System.out.println("At least you found the right state of mind now! You'll like it, you'll see.");
    }
    else if (choice == "2") {
      setAff( getAff() +10 );
      System.out.println("Outside is its own different world. It's not bad, but I have to agree with you. Smart thinking!");
    }
    else if (choice == "3") {
      setAff( getAff() + 20 );
      System.out.println("We share the same thought process, then! The gym is how I let off steam myself.");
    }
    
    s = "Are you interested in sports? What's your favorite?\n"
    s += "\t1: No, I'm not the sporty type of person."
    s += "\t2: I don't play sports, but I love to watch! Basketball's my favorite!"
    s += "\t3: Of course! I love being in action! I don't have a favorite, I love them so much!"
    System.out.println(s)  
    String choice = in.readLine();
    if (choice == "1") {
      setAff( getAff() - 10 );
      System.out.println("Why not? Think of all the excitement and motion!");
    }
    else if (choice == "2") {
      setAff( getAff() +5 );
      System.out.println("Really? Basketball's my favorite, too! Playing is much more fun, though. I can teach you!");
    }
    else if (choice == "3") {
      setAff( getAff() + 15 );
      System.out.println("I guess we'll have to have a little competition someday, then. huh? Winner treats for lunch.");
    }
    
    s = "Well, I'll see you around. Don't hurt yourself, okay?";
    s = "/nSee you around!"
    System.out.println(s);
    
  }

}
