public class afterHours{
  //interface for each place
  // interest method
  //etc.
  //each place- chances of meeting other character, dialouge per character, effects
  //choose place, goes to that class, performs place-specific events
  
  public afterHours(){
  }
  //from highest chance to lowest chance
  
  public Sting school(Player A, Student stu){
    //(+int, -hp, +mm),only if route A-> Student,
    String retStr = "";
    A.setInt( A.getInt() + 5 );
    retStr += "School is good for the brain! +5 Intelligence";
    A.setHP( A.getHP() - 2 );
    retStr += "\nSchool = no sleep + stress = -2 HP";
    A.setMo( A.getMo() + 5 );
    retStr += "\nArguing with teachers and classmates makes you more apt at talking. +5 Mouth meter";
    if (A.getRoute() == "A") {
      int boo = (int) ( 5 * Math.random() );
      if (( boo == 0) &&( stu.getMet() == false )) {
        stu.setMet(true);
	// stu.firstTalk();
      }
      else if (( boo == 0 )&&( stu.getMet()== true ))
        retStr += "\n" + stu.talk();
        stu.setAff( stu.getAff() + 5 );
        retStr += "\n+5 Affinity!";
    }
    return retStr;
  }
  
  public String gym(Player A, Buffy buf, Pretty pret, Workaholic work){ 
    //(++str, -$),buffy,pretty,work
    String retStr = "";
    A.setStr( A.getStr() + 5 );
    retStr += "Working out... what doesn't kill you makes you stronger! +5 Strength";
    A.setMoo( A.getMoo() - 10 );
    retStr += "\n...Gym membership isn't free, ya know! - $10";
    int boo = (int) ( 5 * Math.random() );
    if ( (boo == 0 )&& (buf.getMet() == false )) {
      buf.setMet(true);
      // buf.firstTalk();
    }
    else if ( (boo == 0) &&( buf.getMet()== true) ) {
      retStr += "\n" + buf.talk();
      buf.setAff( buf.getAff() + 5 );
      retStr += "\n+5 Affinity!";
    }
    else if ( (int) ( 15 * Math.random() ) == 0  ) {
      retStr += "\n" + pret.talk();
      pret.setAff( pret.getAff() + 1 );
      retStr += "\n+1 Affinity!";
    }
    else if ( (int) ( 25 * Math.random() ) == 0  ) {
      retStr += "\n" + work.talk();
      work.setAff( work.getAff() + 1 );
      retStr += "\n+1 Affinity!";
    }
  }
  
  public String library (Player A, Nerd ner, Student stu){
  //(++int),smart,student(unable to raise interest if not route A)
    String retStr = "";
    A.setInt( A.getInt() + 5 );
    retStr += "Reading books gives you smarts. +5 Intelligence";
    int boo = (int) ( 5 * Math.random() );
    if ( boo == 0 && ner.getMet() == false ) {
      ner.setMet(true);
      //  ner.firstTalk();
    }
    else if (( boo == 0 )&&( ner.getMet()== true )) {
      retStr += "\n" + ner.talk();
      ner.setAff( ner.getAff() + 5 );
      retStr += "\n+5 Affinity!";
    }
    else if ( ((int) ( 15 * Math.random() ) == 0) && (A.getRoute().contains("A")) ) {
      retStr += "\n" + stu.talk();
      stu.setAff( stu.getAff() + 1 );
      retStr += "\n+1 Affinity!";
    }
    return retStr;
  }
  
  public String mall(Player A, Pretty pret, Workaholic work, Buffy buf){
  //(+att , --$)pretty, work, buffy
    String retStr = "";
    A.setAtt( A.getAtt() + 5 );
    retStr += "You got prettier! +5 Attractiveness";
    A.setMoo( A.getMoo() - 10 );
    retStr += "\nBut beauty comes at a price... - $10";
    int boo = (int) ( 5 * Math.random() );
    if ( (boo == 0) && (pret.getMet() == false )) {
      pret.setMet(true);
      // pret.firstTalk();
    }
    else if (( boo == 0 )&&( pret.getMet()== true) ) {
      retStr += "\n" + pret.talk();
      pret.setAff( pret.getAff() + 5 );
      retStr += "\n+5 Affinity";
    }
    else if ( (int) ( 15 * Math.random() ) == 0  ) {
      retStr += "\n" + work.talk();
      work.setAff( work.getAff() + 1 );
      retStr += "\n+1 Affinity";
    }
    else if ( (int) ( 25 * Math.random() ) == 0  ) {
      retStr += "\n" + buf.talk();
      buf.setAff( buf.getAff() + 1 );
      retStr += "\n+1 Affinity";
    }
    return retStr;
  }
  
  public String beautySalon(Player A, Pretty pret, Nerd ner){
  //(++att, -$) pretty, smart
    String retStr = "";
    A.setAtt( A.getStr() + 5 );
    retStr += "You're feeling good, and looking even better! +5 Attractiveness";
    A.setMoo( A.getMoo() - 10 );
    retStr += "\nYou look like a beauty, and pay like one too. - $10";
    int boo = (int) ( 10 * Math.random() );
    if ( boo == 0 ) {
      retStr += "\n" + pret.talk();
      pret.setAff( pret.getAff() + 1 );
      retStr += 
    }
    else if ( (int) ( 25 * Math.random() ) == 0  ) {
      ner.talk();
      ner.setAff( ner.getAff() + 1 );
    }
  }
  public void work(Player A, Workaholic work){
  //( ++$, -happi, -hp),workaholic
    A.setStr( A.getStr() + 5 );
    A.setMoo( A.getMoo() - 10 );
    int boo = (int) ( 10 * Math.random() );
    if ( (boo == 0 )&&( work.getMet() == false) ) {
      work.setMet(true);
      // work.firstTalk();
    }
    else if ( (boo == 0) &&( work.getMet() == true )) {
      work.talk();
      work.setAff( work.getAff() + 5 );
    }
  }
  
  public void walk(Player A, Royals roy){
  //(+happi, +hp),none,royal
    A.setStr( A.getStr() + 5 );
    A.setMoo( A.getMoo() - 10 );
    int boo = (int) ( 100 * Math.random() );
    if (( boo == 0) && (roy.getMet() == false )) {
      roy.setMet(true);
      // roy.firstTalk();
    }
    else if (( boo == 0) && (roy.getMet()== true) ) {
      roy.talk();
      roy.setAff( roy.getAff() + 2 );
  }
    // public void date(){
  //(--$, ++happi), choose who, names are  generic if havent met( ie, Girl1, Girl2, Emily, Girl4,Bob)
  // if interest if higher than x amount, they accept, Causes + interest depending on how it goes
  }
  // interest is raised by a) having higer stats than the character(+ 25(?)), 
  //b. meeting the character more often(non-date) (-3 to +3 , depending on the dialogue),
  //and C. Asking them on a date(+/- 1/5/10, depending on calibur of date, aka randomly :D

}
