public class afterHours{
    //interface for each place
    // interest method
    //etc.
    //each place- chances of meeting other character, dialouge per character, effects
    //choose place, goes to that class, performs place-specific events
  
    public afterHours(){
    }
    //from highest chance to lowest chance
  
    public String school(Player A, Student stu){
	//(+int, -hp, +mm),only if route A-> Student,
	String retStr = "";
	A.setInt( A.getInt() + 5 );
	retStr += "\nSchool is good for the brain! +5 Intelligence";
	A.setHP( A.getHP() - 2 );
	retStr += "\nSchool = no sleep + stress = -2 HP";
	A.setMo( A.getMo() + 5 );
	retStr += "\nArguing with teachers and classmates makes you more apt at talking. +5 Mouth meter";
	if (A.getRoute() == "A") {
	    int boo = (int) ( 5 * Math.random() );
	    if (( boo == 0) &&( stu.getMet() == false )) {
		retStr += "\nOh, you bumped into Person2!";
		stu.setMet(true);
		// stu.firstTalk();
	    }
	    else if (( boo == 0 )&&( stu.getMet()== true )) {
		retStr += "\nYou bumped into " + stu.getName()+"!";
		retStr += "\n" + stu.talk();
	    }
	    stu.setAff( stu.getAff() + 2 );
	    retStr += "\n+2 Affinity!";
	}
	return retStr;
    }
  
    public String gym(Player A, Buffy buf, Pretty pret, Workaholic work){ 
	//(++str, -$),buffy,pretty,work
	String retStr = "";
	A.setStr( A.getStr() + 5 );
	retStr += "\nWorking out... what doesn't kill you makes you stronger! +5 Strength";
	A.setMoo( A.getMoo() - 10 );
	retStr += "\n...Gym membership isn't free, ya know! - $10";
	int boo = (int) ( 5 * Math.random() );
	if ( (boo == 0 )&& (buf.getMet() == false )) {
	    buf.setMet(true);
	    // buf.firstTalk();
	}
	else if ( (boo == 0) &&( buf.getMet()== true) ) {
	    retStr += "\nYou bumped into " + buf.getName()+"!";
	    retStr += "\n" + buf.talk();
	    buf.setAff( buf.getAff() + 2 );
	    retStr += "\n+2 Affinity!";
	}
	else if ( (int) ( 15 * Math.random() ) == 0  ) {
	    if ( pret.getMet() == true ) 
		retStr += "\nYou bumped into " + pret.getName()+"!";
	    else 
		retStr += "\n You bumped into Person4!";
	    retStr += "\n" + pret.talk();
	    pret.setAff( pret.getAff() + 1 );
	    retStr += "\n+1 Affinity!";
	}
	else if ( (int) ( 25 * Math.random() ) == 0  ) {
	    if ( work.getMet() == true ) 
		retStr += "\nYou bumped into " + work.getName()+"!";
	    else 
		retStr += "\n You bumped into Person5!";
	    retStr += "\n" + work.talk();
	    work.setAff( work.getAff() + 1 );
	    retStr += "\n+1 Affinity!";
	}
	return retStr;
    }
  
    public String library (Player A, Nerd ner, Student stu){
	//(++int),smart,student(unable to raise interest if not route A)
	String retStr = "";
	A.setInt( A.getInt() + 10 );
	retStr += "\nReading books gives you smarts. +10 Intelligence";
	int boo = (int) ( 5 * Math.random() );
	if ( boo == 0 && ner.getMet() == false ) {
	    retStr += "You bumped into Person3!";
	    ner.setMet(true);
	    //  ner.firstTalk();
	}
	else if (( boo == 0 )&&( ner.getMet()== true )) {
	    retStr += "You bumped into " + ner.getName() +"!";
	    retStr += "\n" + ner.talk();
	    ner.setAff( ner.getAff() + 2 );
	    retStr += "\n+2 Affinity!";
	}
	else if ( ((int) ( 15 * Math.random() ) == 0) && (A.getRoute().contains("A")) ) {
	    if ( stu.getMet() == true ) 
		retStr += "\nYou bumped into " + stu.getName() + "!";
	    else 
		retStr += "\n You bumped into Person2!";
	    retStr += "\n" + stu.talk();
	    stu.setAff( stu.getAff() + 1 );
	    retStr += "\n+1 Affinity!";
	}
	return retStr;
    }
  
    public String mall(Player A, Pretty pret, Workaholic work, Buffy buf){
	//(+att , --$)pretty, work, buffy
	String retStr = "";
	A.setAtt( A.getAtt() + 10 );
	retStr += "\nYou got prettier! +10 Attractiveness";
	A.setMoo( A.getMoo() - 10 );
	retStr += "\nBut beauty comes at a price... - $10";
	int boo = (int) ( 5 * Math.random() );
	if ( (boo == 0) && (pret.getMet() == false )) {
	    retStr += "You bumped into Person4!";
	    pret.setMet(true);
	    // pret.firstTalk();
	}
	else if (( boo == 0 )&&( pret.getMet()== true) ) {
	    retStr += "\nYou bumped into " + pret.getName() +"!";
	    retStr += "\n" + pret.talk();
	    pret.setAff( pret.getAff() + 2 );
	    retStr += "\n+2 Affinity";
	}
	else if ( (int) ( 15 * Math.random() ) == 0  ) {
	    if ( work.getMet() == true ) 
		retStr += "\nYou bumped into " + work.getName() + "!";
	    else 
		retStr += "\n You bumped into Person5!";
	    retStr += "\n" + work.talk();
	    work.setAff( work.getAff() + 1 );
	    retStr += "\n+1 Affinity";
	}
	else if ( (int) ( 25 * Math.random() ) == 0  ) {
	    if ( buf.getMet() == true ) 
		retStr += "\nYou bumped into " + buf.getName() + "!";
	    else 
		retStr += "\n You bumped into Person1!";
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
	retStr += "\nYou're feeling good, and looking even better! +5 Attractiveness";
	A.setMoo( A.getMoo() - 5 );
	retStr += "\nYou look like a beauty, and pay like one too. - $5";
	int boo = (int) ( 10 * Math.random() );
	if ( boo == 0 ) {
	    if ( pret.getMet() == true ) 
		retStr += "\nYou bumped into " + pret.getName()+ "!";
	    else 
		retStr += "\n You bumped into Person4!";
	    retStr += "\n" + pret.talk();
	    pret.setAff( pret.getAff() + 1 );
	    retStr += "\n+1 Affinity!";
	}
	else if ( (int) ( 25 * Math.random() ) == 0  ) {
	    if ( ner.getMet() == true ) 
		retStr += "\nYou bumped into " + ner.getName()+ "!";
	    else 
		retStr += "\n You bumped into Person3!";
	    retStr += "\n" + ner.talk();
	    ner.setAff( ner.getAff() + 1 );
	    retStr += "\n+1 Affinity!";
	}
	return retStr;
    }
  
    public String work(Player A, Workaholic work){
	//( ++$, -happi, -hp),workaholic
	String retStr = "";
	A.setStr( A.getHappi() - 10 );
	retStr += "\nWorking over time is a bummer... -10 Happiness";
	A.setHP( A.getHP() - 2 );
	retStr += "\nYour head is spinning from the work! -2 HP";
	A.setMoo( A.getMoo() + 15 );
	retStr += "\nYou made some extra bucks! +$15";
	int boo = (int) ( 10 * Math.random() );
	if ( (boo == 0 )&&( work.getMet() == false) ) {
	    retStr += "\nYou bumped into Person5!";
	    work.setMet(true);
	    // work.firstTalk();
	}
	else if ( (boo == 0) &&( work.getMet() == true )) {
	    retStr += "\nYou bumped into " + work.getName() + "!";
	    retStr += "\n" + work.talk();
	    work.setAff( work.getAff() + 2 );
	    retStr += "\n+2 Affinity!";
	}
	return retStr;
    }
  
    public String walk(Player A, Royals roy){
	//(+happi, +hp),none,royal
	String retStr = "";
	A.setHappi( A.getHappi() + 5 );
	retStr += "\nIt's a beautiful day out! +5 Happiness";
	if ( A.getHP() < 16 )
	    A.setHP( A.getHP() + 5 );
	else
	    A.setHP(20);
	retStr += "\nTaking a breath of fresh air and soaking up vitamin D is amazing! +5 HP";
	int boo = (int) ( 100 * Math.random() );
	if (( boo == 0) && (roy.getMet() == false )) {
	    retStr += "\nYou bumped into Person6!";
	    roy.setMet(true);
	    // roy.firstTalk();
	}
	else if (( boo == 0) && (roy.getMet()== true) ) {
	    retStr += "\nYou bumped into " + roy.getName() + "!";
	    retStr += "\n" + roy.talk();
	    roy.setAff( roy.getAff() + 1 );
	    retStr += "\n+1 Affinity!";
	}
	return retStr;
    }
    // public void date(){
    //(--$, ++happi), choose who, names are  generic if havent met( ie, Girl1, Girl2, Emily, Girl4,Bob)
    // if interest if higher than x amount, they accept, Causes + interest depending on how it goes
    //}
    // interest is raised by a) having higer stats than the character(+ 25(?)), 
    //b. meeting the character more often(non-date) (-3 to +3 , depending on the dialogue),
    //and C. Asking them on a date(+/- 1/5/10, depending on calibur of date, aka randomly :D

}
