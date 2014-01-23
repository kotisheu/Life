public class afterHours{
  //interface for each place
  // interest method
  //etc.
  //each place- chances of meeting other character, dialouge per character, effects
  //choose place, goes to that class, performs place-specific events
  
  public afterHours(){
  }
  //from highest chance to lowest chance
  
  public void school(Player A, Student stu){
    //(+int, -hp, +mm),only if route A-> Student,
    A.setInt( A.getInt() + 5 );
    A.setHP( A.getHP() - 2 );
    A.setMo( A.getMo() + 5 );
    if (A.getRoute() == "A") {
      int boo = (int) ( 5 * Math.random() );
      if (( boo == 0) &&( stu.getMet() == false )) {
        stu.setMet(true);
	// stu.firstTalk();
      }
      else if (( boo == 0 )&&( stu.getMet()== true ))
        stu.talk();
        stu.setAff( stu.getAff() + 5 );
    }
  }
  
  public void gym(Player A, Buffy buf, Pretty pret, Workaholic work){ 
    //(++str, -$),buffy,pretty,work
    A.setStr( A.getStr() + 5 );
    A.setMoo( A.getMoo() - 10 );
    int boo = (int) ( 5 * Math.random() );
    if ( (boo == 0 )&& (buf.getMet() == false )) {
      buf.setMet(true);
      // buf.firstTalk();
    }
    else if ( (boo == 0) &&( buf.getMet()== true) ) {
      buf.talk();
      buf.setAff( buf.getAff() + 5 );
    }
    else if ( (int) ( 15 * Math.random() ) == 0  ) {
      pret.talk();
      pret.setAff( pret.getAff() + 1 );
    }
    else if ( (int) ( 25 * Math.random() ) == 0  ) {
      work.talk();
      work.setAff( work.getAff() + 1 );
    }
  }
  
  public void library (Player A, Nerd ner, Student stu){
  //(++int),smart,student(unable to raise interest if not route A)
    A.setInt( A.getInt() + 5 );
    int boo = (int) ( 5 * Math.random() );
    if ( boo == 0 && ner.getMet() == false ) {
      ner.setMet(true);
      //  ner.firstTalk();
    }
    else if (( boo == 0 )&&( ner.getMet()== true )) {
      ner.talk();
      ner.setAff( ner.getAff() + 5 );
    }
    else if ( ((int) ( 15 * Math.random() ) == 0) && (A.getRoute().contains("A")) ) {
      stu.talk();
      stu.setAff( stu.getAff() + 1 );
    }
  }
  
  public void mall(Player A, Pretty pret, Workaholic work, Buffy buf){
  //(+att , --$)pretty, work, buffy
    A.setAtt( A.getAtt() + 5 );
    A.setMoo( A.getMoo() - 10 );
    int boo = (int) ( 5 * Math.random() );
    if ( (boo == 0) && (pret.getMet() == false )) {
      pret.setMet(true);
      // pret.firstTalk();
    }
    else if (( boo == 0 )&&( pret.getMet()== true) ) {
      pret.talk();
      pret.setAff( pret.getAff() + 5 );
    }
    else if ( (int) ( 15 * Math.random() ) == 0  ) {
      work.talk();
      work.setAff( work.getAff() + 1 );
    }
    else if ( (int) ( 25 * Math.random() ) == 0  ) {
      buf.talk();
      buf.setAff( buf.getAff() + 1 );
    }
  }
  
  public void beautySalon(Player A, Pretty pret, Nerd ner){
  //(++att, -$) pretty, smart
    A.setAtt( A.getStr() + 5 );
    A.setMoo( A.getMoo() - 10 );
    int boo = (int) ( 10 * Math.random() );
    if ( boo == 0 ) {
      pret.talk();
      pret.setAff( pret.getAff() + 1 );
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
