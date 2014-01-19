public class Player extends Character {

   public Player() {
	setName("poo");
	setRoute("");
	setTile(0);
	setHappi(50);
	setStr(10);
	setInt(10);
	setMo(10);
	setAtt(10);
	setHP(20);
	setMoo(500);
	setGen(false);
   }

   public Player ( String nombre, boolean gender ) {
	setName(nombre);
	setGen(gender);
   }
   
   public String setRoute(String a){
       String oldRoute = _route;
	_route += a;
	return oldRoute;
   }

   public String playEv(int x) {
	String retStr = "";
	if( x >= 0 && x < 5 ) {
	    getCold();
	    retStr = "Achoo! You got a cold! -5 HP, -5 Strength";
	}
	else if ( x >= 5 && x < 10 ) {
	    findFive();
	    retStr = "Hooray! You found $5! +5$";
	}
	else if ( x >= 10 && x < 15 ) {
	    findTen();
	    retStr = "Hooray! You found $10! +10$";
	}
	else if ( x >= 15 && x < 20 ) {
	    findFifteen();
	    retStr = "Hooray! You found $15! +15$";
	}
	else if ( x >= 20 && x < 25 ) {
	    loseFive();
	    retStr = "Uh oh... You lost $5! -5$";
	}
	else if ( x >= 25 && x < 30 ) {
	    loseTen();
	    retStr = "Uh oh... You lost $10! -10$";
	}
	else if ( x >= 30 && x < 35 ) {
	    loseFifteen();
	    retStr = "Uh oh... You lost $15! -15$";
	}
	else if ( x >= 35 && x < 40 ) {
	    snowday();
	    retStr = "Relax! It's a snow day! +5 HP, +5 Happiness";
	}
	else if ( x >= 40 && x < 45 ) {
	    trafficJam();
	    retStr = "Beep Beep! Traffic jam keeps you waiting! -5 Happiness";
	}
	else if ( x >= 45 && x < 50 ) {
	    friendBday();
	    retStr = "It's your friend's birthday! Time to buy a present and celebrate! -10$, +10 Happiness";
	}
	else if ( x >= 50 && x < 55 ) {
	    party();
	    retStr = "Hang out at a party! Whoo! -15$, +15 Happiness, +5 Attractiveness";
	}
	else if ( x >= 55 && x < 60 ) {
	    fall();
	    retStr = "You were walking down the street when you took a tumble! Oh, the embarrassment! -5 HP, -10 Happiness";
	}
	else if ( x >= 60 && x < 65 ) {
	    slipOnIce();
	    retStr = "You walk on ice and go flying! Ouch! -5 HP, -10 Happiness";
	}
	else if ( x >= 65 && x < 70 ) {
	    coffeeBreak();
	    retStr = "Nothing like a coffee break with friends! -5$, +10 Happiness";
	}
	else if ( x >= 70 && x < 75 ) {
	    reunion();
	    retStr = "Don't you love reunions? Seeing everyone again... -2$, +5 Happiness";
	}
	else if  ( x >= 75 && x < 80 ) {
	    getYell();
	    retStr = "Your boss is in a bad mood today, so of course you have to take the blame for the mistake. Getting yelled at by the boss hurts. -20 Happiness";
	}
	else if ( x >= 80 && x < 85 ) {
	    getPresent();
	    retStr = "You get a present randomly in the mail! +15 Happiness";
	}
	else if ( x >= 85 && x < 90 ) {
	    favSong();
	    retStr = "Your favorite song comes on. Sing along! +2 Happiness";
	}
	else if ( x >= 95 && x < 100 ) {
	    dance();
	    retStr = "Unwind, pump up the music, and dance like no one's watching! +2 Happiness";
	}
	else if ( x >= 100 && x < 105 ) {
	    spillCoffee();
	    retStr = "You just brought a cup of coffee... and it spills! Uh Oh! At least you'll smell like coffee for the rest of the day... -2 Happiness, -5$";
	}
	else if ( x >= 105 && x < 110 ) {
	    familyGather();
	    retStr = "Your family's all gathered together! The food--Yum! +5 Happiness, +5 HP";
	}
	else if ( x >= 110 && x < 115 ) {
	    readNews();
	    retStr = "You pick up a newspaper and read it! +5 Intelligence";
	}
	else if ( x >= 115 && x < 120 ) {
	    lift();
	    retStr = "You lift, bro? You better believe you do! +5 Strength";
	}
	else if ( x >= 120 && x < 125 ) {
	    buyBook();
	    retStr = "Don't you just love the smell of bookstores? Buy a book! +2 Intelligence, -5$";
	}
	else if ( x >= 125 && x < 130 ) {
	    readBook();
	    retStr = "Finished an amazing book! +5 Intelligence";
	}
	else if ( x >= 130 && x < 135 ) {
	    hitOnHead();
	    retStr = "Thud! Hit on the head and lost brain cells. -5 HP, -10 Intelligence";
	}
	else if ( x >= 135 && x < 140 ) {
	    flatTire();
	    retStr = "A flat tire...?! -5 Happiness, -20$";
	}
	else if ( x >= 140 && x < 145 ) {
	    iceCream();
	    retStr = "Ice cream on a hot day! Mmmm... +5 Happiness, -2$, +2 HP";
	}
	else if ( x >= 145 && x < 150 ) {
	    cookies();
	    retStr = "Free cookie from grandma! +5 Happiness, +2 HP";
	}
	else if ( x >= 150 && x < 155 ) {
	    goodHaircut();
	    retStr = "Nice haircut! Feeling good! +5 Attractiveness, -5$";
	}
	else if ( x >= 155 && x < 160 ) {
	    badHair();
	    retStr = "Wake up to a bad hair day. -10 Attractiveness";
	}
	else if ( x >= 160 && x < 165 ) {
	    ripShirt();
	    retStr = "Your shirt is too tight, it rips! -5 Attractiveness, -5 Happiness";
	}
	else if ( x >= 165 && x < 170 ) {
	    ripPants();
	    retStr = "You bend over and your pants rip! Ahh! -5 Attractiveness, -10 Happiness";
	}
	else if ( x >= 170 && x < 175 ) {
	    giveSpeech();
	    retStr = "Give a well written speech. +10 Mouth Meter";
	}
	else if ( x >= 175 && x < 180 ) {
	    flubAnthem();
	    retStr = "Just when you thought you knew the anthem, you flub it! -10 Mouth Meter";
	}
	else if ( x >= 180 && x < 185 ) {
	    breakArm();
	    retStr = "Ouch! You broke your arm! -5 HP, -10 Happiness, -10 Strength";
	}
	else if ( x >= 185 && x < 190 ) {
	    breakLeg();
	    retStr = "Ouch! You broke your leg! -5 HP, -10 Happiness, -15 Strength";
	}
	else if ( x >= 190 && x < 195 ) {
	    kickBox();
	    retStr = "Attend a kickboxing class. +20 Strength";
	}
	else if ( x >= 195 && x < 198 ) {
	    winGC();
	    retStr = "Congratulations! You won a gift card! +25$";
	}
	else if ( x == 198 ) {
	    winLotto();
	    retStr = "Congratulations! You won the lottery! +5000$";
	}
	else if ( x == 199 ) {
	    winGamble();
	    retStr = "You took a gamble and won! Hooray! +2500$";
	}
	else if ( x == 200 ) {
	    loseGamble();
	    retStr = "You took a gamble and you lost... -2500$";
	}
	return retStr;
    }
    
    public int getCold() {
	int oldHP = getHP();
	int oldStr = getStr();
	setHP(oldHP - 5);
	setStr(oldStr - 5);
	return oldHP;
	return oldStr;
    }

    public int findFive() {
	int oldMoo = getMoo();
	setMoo(oldMoo + 5);
	return oldMoo;
    }

    public int findTen() {
	int oldMoo = getMoo();
	setMoo(oldMoo + 10);
	return oldMoo;
    }

    public int findFifteen() {
	int oldMoo = getMoo();
	setMoo(oldMoo + 15);
	return oldMoo;
    }

    public int loseFive() {
	int oldMoo = getMoo();
	setMoo(oldMoo - 5);
	return oldMoo;
    }

    public int loseTen() {
	int oldMoo = getMoo();
	setMoo(oldMoo - 10);
	return oldMoo;
    }

    public int loseFifteen() {
	int oldMoo = getMoo();
	setMoo(oldMoo - 15);
	return oldMoo;
    }

    public int snowday() {
	int oldHP = getHP();
	int oldHappi = getHappi();
	if (oldHP < 16 ) 
	    setHP(oldHP + 5);
	else 
	    setHP(20);
	setHappi(oldHappi + 5);
	return oldHP;
	return oldHappi;
    }

    public int trafficJam() {
	int oldHappi = getHappi();
	setHappi(oldHappi - 5);
	return oldHappi;
    }

    public int friendBday() {
	int oldMoo = getMoo();
	int oldHappi = getHappi();
	setMoo(oldMoo - 10);
	setHappi(oldHappi + 10);
	return oldMoo;
	return oldHappi;
    }

    public int party() {
	int oldMoo = getMoo();
	int oldHappi = getHappi();
	int oldAtt = getAtt();
	setMoo(oldMoo - 15);
	setHappi(oldHappi + 15);
	setAtt(oldAtt + 5);
	return oldMoo;
	return oldHappi;
	return oldAtt;
    }

    public int fall() {
	int oldHP = getHP();
	int oldHappi = getHappi();
	setHP(oldHP - 5);
	setHappi(oldHappi - 10);
	return oldHP;
	return oldHappi;
    }

    public int slipOnIce() {
	int oldHP = getHP();
	int oldHappi = getHappi();
	setHP(oldHP - 5);
	setHappi(oldHappi - 10);
	return oldHP;
	return oldHappi;
    }

    public int coffeeBreak() {
	int oldMoo = getMoo();
	int oldHappi = getHappi();
	int oldHP = getHP();
	setMoo(oldMoo - 5);
	setHappi(oldHappi + 10);
	if ( oldHP < 16 ) 
	    setHP(oldHP + 5);
	else 
	    setHP(20);
	return oldMoo;
	return oldHappi;
	return oldHP;
    }

    public int reunion() {
	int oldMoo = getMoo();
	int oldHappi = getHappi();
	setMoo(oldMoo - 2);
	setHappi(oldHappi + 5);
	return oldMoo;
	return oldHappi;
    }

    public int getYell() {
	int oldHappi = getHappi();
	setHappi(oldHappi - 20);
	return oldHappi;
    }

    public int getPresent() {
	int oldHappi = getHappi();
	setHappi(oldHappi + 15);
	return oldHappi;
    }

    public int favSong() {
	int oldHappi = getHappi();
	setHappi(oldHappi + 2);
	return oldHappi;
    }

    public int dance() {
	int oldHappi = getHappi();
	setHappi(oldHappi + 2);
	return oldHappi;
    }

    public int spillCoffee() {
	int oldHappi = getHappi();
	int oldMoo = getMoo();
	setHappi(oldHappi - 2);
	setMoo(oldMoo - 5);
	return oldHappi;
	return oldMoo;
    }

    public int familyGather() {
	int oldHP = getHP();
	int oldHappi = getHappi();
	setHappi(oldHappi + 5);
	if ( oldHP < 16 ) 
	    setHP(oldHP + 5);
	else 
	    setHP(20);
    }

    public int winGC() {
	int oldMoo = getMoo();
	setMoo(oldMoo + 25);
	return oldMoo;
    }

    public int winLotto() {
	int oldMoo = getMoo();
	setMoo(oldMoo + 5000);
	return oldMoo;
    }

    public int winGamble() {
	int oldMoo = getMoo();
	setMoo(oldMoo + 1000);
	return oldMoo;
    }

    public int loseGamble() {
	int oldMoo = getMoo();
	setMoo(oldMoo - 2500);
	return oldMoo;
    }

    public int readNews() {
	int oldInt = getInt();
	setInt(oldInt + 5);
	return oldInt;
    }

    public int lift() {
	int oldStr = getStr();
	setStr(oldStr + 5);
	return oldStr;
    }

    public int buyBook() {
	int oldInt = getInt();
	int oldMoo = getMoo();
	setInt(oldInt + 2);
	setMoo(oldMoo - 5);
	return oldInt;
	return oldMoo;
    }

    public int readBook() {
	int oldInt = getInt();
	setInt(oldInt + 5);
	return oldInt;
    }

    public int hitOnHead() {
	int oldHP = getHP();
	int oldInt = getInt();
	setHP(oldHP - 5);
	setInt(oldInt - 10);
	return oldHP;
	return oldInt;
    }

    public int flatTire() {
	int oldHappi = getHappi();
	int oldMoo = getMoo();
	setHappi(oldHappi - 5);
	setMoo(oldMoo - 20);
	return oldHappi;
	return oldMoo;
    }

    public int iceCream() {
	int oldHappi = getHappi();
	int oldMoo = getMoo();
	int oldHP = getHP();
	setHappi(oldHappi + 5);
	setMoo(oldMoo - 2);
	if (oldHP < 19)
	    setHP(oldHP + 2);
	else
	    setHP(20);
	return oldHappi;
	return oldMoo;
	return oldHP;
    }

    public int cookies() {
	int oldHappi = getHappi();
	int oldHP = getHP();
	setHappi(oldHappi + 5);
	if (oldHP < 19)
	    setHP(oldHP + 2);
	else
	    setHP(20);
	return oldHappi;
	return oldHP;
    }

    public int goodHaircut() {
	int oldAtt = getAtt();
	int oldMoo = getMoo();
	setAtt(oldAtt + 5);
	setMoo(oldMoo - 5);
	return oldAtt;
	return oldMoo;
    }

    public int badHair() {
	int oldAtt = getAtt();
	setAtt(oldAtt - 10);
	return oldAtt;
    }

    public int ripShirt() {
	int oldAtt = getAtt();
	int oldHappi = getHappi();
	setAtt(oldAtt - 5);
	setHappi(oldHappi - 5);
	return oldAtt;
	return oldHappi;
    }

    public int ripPants() {
	int oldAtt = getAtt();
	int oldHappi = getHappi();
	setAtt(oldAtt - 5);
	setHappi(oldHappi - 10);
	return oldAtt;
	return oldHappi;
    }

    public int giveSpeech() {
	int oldMo = getMo();
	setMo(oldMo + 10);
	return oldMo;
    }

    public int flubAnthem() {
	int oldMo = getMo();
	setMo(oldMo - 10);
	return oldMo;
    }

    public int breakArm() {
	int oldHP = getHP();
	int oldHappi = getHappi();
	int oldStr = getStr();
	setHP(oldHP - 5);
	setHappi(oldHappi - 10);
	setStr(oldStr - 10);
	return oldHP;
	return oldHappi;
	return oldStr;
    }

    public int breakLeg() {
	int oldHP = getHP();
	int oldHappi = getHappi();
	int oldStr = getStr();
	setHP(oldHP - 5);
	setHappi(oldHappi - 10);
	setStr(oldStr - 15);
	return oldHP;
	return oldHappi;
	return oldStr;
    }

    public int kickBox() {
	int oldStr = getStr();
	setStr(oldStr + 20);
	return oldStr;
    }

}
