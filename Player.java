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

    /*    public playEv(int x) {
	if( x == 0 )
	    getCold();
	else if ( x == 1 )
	    findFive();
	else if ( x == 2 )
	    findTen();

	    }*/
public void setRoute(String a){
	Route+=a;
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

    public int lostTen() {
	int oldMoo = getMoo();
	setMoo(oldMoo - 10);
	return oldMoo;
    }

    public int loseFifteen() {
	int oldMoo = getMoo();
	setMoo(oldMoo - 15);
	return oldMoo;
    }

    public int Snowday() {
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
	int oldaHappi = getHappi();
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

    public int hitInHead() {
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
