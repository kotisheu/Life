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
  
  public void talk() {
    String r = "";
    r = "I thought I'd take a step outside... The world really is wonderous..."
    System.out.println(r);
  }

  public void firstTalk() {
      isr = new InputStreamReader( System.in );
      in = new BufferedReader(isr);

    String s = "";
    s = "S-sorry! I didn't see you there! Must have been too caught up in my reading... Is that a book in your hands?";
    System.out.println(s);
    try {
        String response = in.readLine();
    }
    catch( IOException e ) {}
    if (response == "yes") {
      setAff( getAff() + 10 );
      System.out.println("Oh! It's fantastic, especially the end, when...! Oops, I won't spoil it for you...");
    }
    else if (response == "no") {
      setAff( getAff() - 10 );
      System.out.println("Well, you should read it anyway! It's good for the brain. But I guess all books are...");
    }
    
    s = "Wait, I forgot to introduce myself! I'm " + getName() + ". Pleased to meet you.";
    System.out.println(s);
    
    s = "Hey! Since you're here, anyway, help me decide which one to check out. The fictional piece or the nonfiction?\n";
    s += "\t1: It's up to you--I'm bad with decisions.";
    s += "\t2: Both! The more, the better!";
    s += "\t3: Fictional--let your mind go on adventures!";
    s += "\t4: Nonfiction--learn about the fascinating truths and tragedies of reality."
    System.out.println(s);
    String choice = in.readLine();
    if (choice == "1") {
      setAff( getAff() -10 );
      System.out.println("At least we have a commonality in that! Hmm, this won't do... which one to choose?!");
    }
    else if (choice == "2") {
      setAff( getAff() -5 );
      System.out.println("Great idea! But... I only asked because I won't have time to read both...");
    }
    else if (choice == "3") {
      setAff( getAff() + 10 );
      System.out.println("Great idea! I was in need of a break from reality, anyway.");
    }
    else if (choice == "4") {
      setAff( getAff() + 10 )
      System.out.println("You know what, I like that! Nature and society both have their own mystical secrets, don't they?")
    }
    
    s = "You know, I'm actually thinking of attending night school... So unfortunately, I won't be here that often anymore.\n";
    s += "\t1: Aw, I was looking so forward to seeing you again.";
    s += "\t2: Good luck with that! I'm sure you'll do phenomenally.";
    s += "\t3: Don't sweat it! As long as you have a book in your hands and knowledge in your head, you'll be fine!";
    choice = in.readLine();
    System.out.println(s);
    if (choice == "1") {
      setAff( getAff() + 5 );
      System.out.println("Dont worry! I'll still try to be here whenever I can!");
    }
    else if (choice == "2") {
      setAff( getAff() + 5 );
      System.out.println("You think so? I would hope so, but I'm not too sure...");
    }
    else if (choice == "3") {
      setAff( getAff() + 15 );
      System.out.println("Haha! I like that! And I'll definitely keep it in mind.");
    }
    
    s = "It was so nice to have met you, but I have to go now or I'll be late. Wish me the best!";
    s += "/nOh, and, definately check that book out!";
    System.out.println(s);
    
  }

}
