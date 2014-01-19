public class Student extends Character { 

  public Student(Player a) {
    
    // set the Student as the opposite gender of the Player
    if ( a.getGen() == true ) {
      setGen(false);
      setName("Sebastian");
    }
    else {
      setGen(true);
      setName("Alyssa");
    }
    
    // school is at beginning of game -- lower stats required
    setInt( (int) ( 25 * Math.random() ) );
    setMo( (int) ( 25 * Math.random() ) );
    setAtt( (int) ( 25 * Math.random() ) );
    setStr( (int) ( 25 * Math.random() ) );
    // initially, you have not met, so hasMet = false, & affinity(interest) is therefore 0
    setMet(false);
    setAff(0);
    
  }
  
  public void talk() {
    String r = "";
    r = "Hey! Come on, I saved you a seat!";
    System.out.println(r);
  }

  public void firstTalk() {
      isr = new InputStreamReader( System.in );
      in = new BufferedReader(isr);

    String s = "";
    s = "What's up? Haven't I seen you around in my classes?\n";
    System.out.println(s);
    try {
        String response = in.readLine();
    }
    catch( IOException e ) {}
    if (response == "yes") {
      setAff( getAff() + 5 );
      System.out.println("Of course! How could I forget? The teacher loves you!");
    }
    else if (response == "no") {
      setAff( getAff() - 2 );
      System.out.println("Huh. I thought we did... Maybe it was someone else who looks like you.");
    }
    
    s = "You don't know me? I'm " + getName() + ".";
    System.out.println(s);
    
    s = "Are you new here? What do you think of this place?\n";
    s += "\t1: The teachers are nice, and the kids are so helpful. I wouldn't want to be anywhere else.";
    s += "\t2: I just can't wait to graduate and get out of here!";
    s += "\t3: It's a school. What more is there to it than the people?";
    System.out.println(s);
    String choice = in.readLine();
    if (choice == "1") {
      setAff( getAff() + 15 );
      System.out.println("Right? This school really does have amazing people, if you get to know them.");
    }
    else if (choice == "2") {
      setAff( getAff() - 15 );
      System.out.println("Woah, slow down! I get you, but you'll never make it anywhere with that attitude!");
    }
    else if (choice == "3") {
      setAff( getAff() + 5 );
      System.out.println("True, but the people you meet...! They'll definitely get you places.");
    }
    
    s = "What are you doing after shcool? I was thinking of showing you around.\n";
    s += "\t1: I'd love to, but I have to get home to finish a compsci project. I'm so sorry!";
    s += "\t2: I actually have practice after school. Coach would kill me if I didn't go.";
    s += "\t3: Nothing, really. At least, nothing I can't put off.";
    choice = in.readLine();
    System.out.println(s);
    if (choice == "1") {
      setAff( getAff() - 5 );
      System.out.println("Oh well. I applaud you for being responsible. But just remember, there is more to school than grades!");
    }
    else if (choice == "2") {
      setAff( getAff() + 15 );
      System.out.println("You're right, you shouldn't skip out on practice! When's your next game? I'd love to come!");
    }
    else if (choice == "3") {
      setAff( getAff() - 10 );
      System.out.println("A procrastinator! Are you shure you won't put off my meeting? Just make sure you stay afloat everything!");
    }
    
    s = "The bell! Ahh! I'll be late!";
    s = "/nLater!";
    System.out.println(s);
    
  }

}
