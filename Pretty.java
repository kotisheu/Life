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
  
  public void talk() {
    String r = "";
    r = "A word of advice? Kick back, relax, and look good!";
    System.out.println(r);
  }

  public void firstTalk() {
      isr = new InputStreamReader( System.in );
      in = new BufferedReader(isr);

    String s = "";
    s = "You need help with all those bags?";
    System.out.println(s);
    try {
        String response = in.readLine();
    }
    catch( IOException e ) {}
    if (response == "yes") {
      setAff( getAff() + 5 );
      System.out.println("No problem. I'm happy to help. That's wayyy too much for one person to handle.");
    }
    else if (response == "no") {
      setAff( getAff() + 20 );
      System.out.println("Used to it? I am myself, but here, let me take some anyway. It's much easier, believe me.");
    }
    
    s = "What was that? Oh, I'm just a person that shares your pain of too many bags. " + getName() + ".";
    System.out.println(s);
    
    s = "Where are we off to?\n";
    s += "\t1: On to the next store! I'm just getting started! Bags can't weigh me down!";
    s += "\t2: I was just about to leave... Then you won't have to carry anything for me.";
    s += "\t3: Maybe just one more store... And after that, home.";
    System.out.println(s);
    String choice = in.readLine();
    if (choice == "1") {
      setAff( getAff() + 15 );
      System.out.println("I love your mentality! Let's go! I'm ready when you are.");
    }
    else if (choice == "2") {
      setAff( getAff() - 5 );
      System.out.println("Thanks for being considerate, but a couple of bags won't break me!");
    }
    else if (choice == "3") {
      setAff( getAff() + 20 );
      System.out.println("Hmm, someone who has control! I like that. Let's go for coffee afterwards!");
    }
    
    s = "Hey, look at those stores! Which one matches your sense of style?\n";
    s += "\t1: Casual and natural. That way, people can see you for who you are.";
    s += "\t2: Dressy's my thing! It's never bad to look your best.";
    s += "\t3: Different! I like to stand out of the crowd!";
    choice = in.readLine();
    System.out.println(s);
    if (choice == "1") {
      setAff( getAff() + 10 );
      System.out.println("Clothes do tell a lot about you! I see a cheerful, calm person in you!");
    }
    else if (choice == "2") {
      setAff( getAff() + 15 );
      System.out.println("Looking your best at all times is hard work! But I agree, it really makes a difference!");
    }
    else if (choice == "3") {
      setAff( getAff() + 5 );
      System.out.println("As long as you can pull it off!");
    }
    
    s = "I like your taste! It's amazing how shopping can bring people together.";
    s = "/Maybe I'll bump into you again next time. But you're carrying my bags, okay?";
    System.out.println(s);
    
  }

}
