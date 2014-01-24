import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Gooey extends JFrame{
    String name=""; 
    boolean gen= false;
    Player person;
    private Buffy buffOne;
    private Student stuOne;
    private Nerd smartOne;
    private Pretty preOne;
    private Workaholic workOne;
    private Royals royOne;

    boolean gameOn= false;
    int turns=0;


    JFrame frame=new JFrame(); 
    JButton c1= new JButton("Yes");
    JButton c2=new JButton("No");
    JLabel directions= new JLabel("See Text Box, then choose:");
    JButton enter=new JButton("Enter");
    JPanel panel= new JPanel();
    JPanel panel2= new JPanel();
    JTextArea text= new JTextArea(10, 50);
    JTextField playbox= new JTextField(20);
    JScrollPane scroller= new JScrollPane(text);


    JButton dice= new JButton("Roll Dice");
    JPanel dicebox= new JPanel();

    JTextArea stats=new JTextArea(10,10);
    JPanel span=new JPanel();

    afterHours AH= new afterHours();
    JPanel afterHours= new JPanel();
    JButton A= new JButton("Gym");
    JButton B= new JButton("Library");
    JButton C= new JButton("School");
    JButton D= new JButton("Work");
    JButton E= new JButton("Walk"); 
    JButton F= new JButton("Mall");
    JButton G= new JButton("Beauty Parlor");
    JButton H= new JButton("Date");
    JLabel Q= new JLabel(" Where would you like to go today?");
    JButton D1= new JButton("Person 1");
    JButton D2= new JButton("Person 2");
    JButton D3= new JButton("Person 3");
    JButton D4= new JButton("Person 4");
    JButton D5= new JButton("Person 5");
    JButton D6= new JButton("Person 6");

    JPanel calpan=new JPanel();
    BufferedImage mon= null;
    
    JPanel panel3 = new JPanel();


 
    public Gooey(){
    }

    public void pregame() {
      
	
	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	text.setLineWrap(true);
	text.setEditable(false);
	frame.setTitle( "Life: The game" );//title?
        frame.setSize( 1000,800);  
        frame.setLocation( 100, 100 );
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE ); 
	panel.setBackground(Color.pink);
	panel2.setBackground(Color.white);
	panel.add(directions);
	panel.add(c1);
	panel.add(c2);
	panel2.add(scroller);
	panel2.add(playbox);
	panel2.add(enter);
	frame.getContentPane().add(BorderLayout.SOUTH,panel2);
	frame.getContentPane().add(BorderLayout.NORTH,panel);
	panel.setVisible(false);
	frame.setVisible(true);
	panel2.setVisible(true);

	text.append("Welcome to the beginning of your new life! Let's see how sucessful you are this time.\nWhat would you like your name to be?");
	enter.addActionListener(new EnterName());

	
    }
    class EnterName implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    name=playbox.getText();
	    panel.remove(c1);
	    panel.remove(c2);
	    c1= new JButton("Yes");
	    c2= new JButton("No");
	    panel.add(c1);
	    panel.add(c2);
	    text.append("\n So your name is "+name+" Correct?");
	    panel.setVisible(true);
	    c1.addActionListener(new YesName());
	    c2.addActionListener(new Rename());
	
	}
    }
    class Rename implements ActionListener{
	public void actionPerformed(ActionEvent event){
	   
	    text.append("\nWhat would you like your name to be?");
	    enter.addActionListener(new EnterName());
	}
    }

    class YesName implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	    enter.setVisible(false);
	    playbox.setVisible(false);
	    text.append("\n Hmm, interesting. Now, would you like to be male or female?");
	    c1= new JButton("Female");
	    c2= new JButton("Male");
	    panel.add(c1);
	    panel.add(c2);
	    panel.setVisible(true);
	    c1.addActionListener(new Mal());
	    c2.addActionListener(new Fem());
	  

	}
    }
    class Mal implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    gen=false;
	    person= new Player(name,gen);
	    buffOne= new Buffy(person);
	    stuOne= new Student(person);
	    smartOne= new Nerd(person);
	    preOne= new Pretty(person);
	    workOne= new Workaholic(person);
	    royOne= new Royals(person);


	    panel.setVisible(false);
	    frame.getContentPane().add(BorderLayout.CENTER,panel);
	    panel.remove(c1);
	    panel.remove(c2);
	    text.append ("\nNow for the final question:\nYou have recieved an acceptance letter in the mail from a top college!\n Is it time to quit the old job and go back to school?");
	    c1= new JButton("Yes! I can't wait to go back and start over! The excitement! The oppotunity! Bring it on! When do I start?(College)");
	    c2= new JButton("No, going to school will just leave me in debt... And I'm not exactly making a bad living right now.(Work)");
	    panel.add(c1);
	    panel.add(c2);
	    panel.setVisible(true);
	    c1.addActionListener(new Col());
	    c2.addActionListener(new Wor());
	   

	}
    }
    class Fem implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    gen=true;
	    person= new Player(name,gen);
	    buffOne= new Buffy(person);
	    stuOne= new Student(person);
	    smartOne= new Nerd(person);
	    preOne= new Pretty(person);
	    workOne= new Workaholic(person);
	    royOne= new Royals(person);

	    panel.setVisible(false);
	    frame.getContentPane().add(BorderLayout.CENTER,panel);
	    panel.remove(c1);
	    panel.remove(c2);
	    text.append ("\nNow for the final question:\nYou have recieved an acceptance letter in the mail from a top college!\n Is it time to quit the old job and go back to school?");
	    c1= new JButton("Yes! I can't wait to go back and start over! The excitement! The oppotunity! Bring it on! When do I start?(College)");
	    c2= new JButton("No, going to school will just leave me in debt... And I'm not exactly making a bad living right now.(Work)");
	    panel.add(c1);
	    panel.add(c2);
	    panel.setVisible(true);
	    c1.addActionListener(new Col());
	    c2.addActionListener(new Wor());
	   
	}
    }
    class Col implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("A");
	    gameOn=true;
	    panel.setVisible(false);
	    game();
	}
    }
    class Wor implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("B");
	    gameOn=true;
	    panel.setVisible(false);
	    game();	
	}
    }

    // //Fuctions
    public int rollDice(){
	int D= (int)(Math.random()* 7);
	text.append ("\n You roll a "+D+".");
	return D;
    }
    public int move(Player a){
     	int D= rollDice();
     	int i=0;
	frame.getContentPane().add(BorderLayout.CENTER,panel);
     	while( i<D){
     	    a.setTile(a.getTile()+ 1);
	    //changeCal(a);
	    //tile200 routeA/B preReq interest with any character > 50
	    if(a.getTile()==200){
		panel.setVisible(false);
		panel.remove(c1);
		panel.remove(c2);
		text.append (" You're in your own perfect fairy tale world with the love of your life. Is it time to take your relationship down the aisle and to the next level?\nThere has never been a more perfect moment and I am confident our love will only grow stronger the closer we are. Not to mention the party...\nI'm not sure I'm ready for this... I know that we're in love, but what happens if the road we're walking on gets bumpy later on? I don't want to lose what we have. ");
		c1= new JButton("Okay!");
		c2= new JButton("Nope.");
		if (buffOne.getAff()>100||stuOne.getAff()>100||smartOne.getAff()>100||preOne.getAff()>100||workOne.getAff()>100||royOne.getAff()>100){
		    panel.add(c1);}
		panel.add(c2);
		panel.setVisible(true);
		c1.addActionListener(new Mar());
		c2.addActionListener(new Sing());
		i=D;//stop
	    }
	    if(a.getTile()==235){
		if( a.getRoute().contains("C")){
		    //tile235 routeAC/BC preReq still married,interest >60 
		    panel.setVisible(false);
		    panel.remove(c1);
		    panel.remove(c2);
		    text.append ("Your family is the living definition of happily ever after, but does happily ever after include a little bundle of joy?\n It'll be hard rasing a child, but worth it! You can just imagine it, watching your baby girl or boy take his or her first steps towards you... \n Raising a child takes resources and attention, more than you have in your schedule! Besides, your family is the perfect size now!");
		    c1= new JButton("Okay!");
		    c2= new JButton("Nope.");
		    if (buffOne.getAff()>150||stuOne.getAff()>150||smartOne.getAff()>150||preOne.getAff()>150||workOne.getAff()>150||royOne.getAff()>150){
			panel.add(c1);}
		    panel.add(c2);
		    panel.setVisible(true);
		    c1.addActionListener(new YC1());
		    c2.addActionListener(new NC1());
		    i=D;//stop
		}
	    }
	    if(((a.getTile()== 265)&&( a.getRoute().contains("C")))||((a.getTile()==330)&&( a.getRoute().contains("D")))){
		//tile265/330 routeACE/ACF/BCE/BCF preReq money> ???
		panel.setVisible(false);
		panel.remove(c1);
		panel.remove(c2);
		text.append ("You're walking down the road, on your way to the apartment, when you see a big for sale sign on the house you've had your eye on. Is it time to buy?\nDefinitely! You've had your eye on it, haven't you? It's perfect, just the right size, and overall, your dream house come true.\nIt's so expensive... The rent of your apartment is nothing in comparison. Besides, you don't need a house right now. You need stability and money. ");
		c1= new JButton("Okay!");
		c2= new JButton("Nope.");
		if (person.getMoo()>5000){
		    panel.add(c1);}
		panel.add(c2);
		panel.setVisible(true);
		c1.addActionListener(new Hou());
		c2.addActionListener(new Apt());
		i=D;//stop
	    }

	    if(a.getTile()==295){
		//tile295 routeACEG/ACFG/BCEG/BCFG/ADKO/ADKP/ADLM/ADLN/BDKO/BDKP/BDLM/BDLN preReq stillmarried, interest > 70
		if( a.getRoute().contains("C") &&  a.getRoute().contains("G")){
		    //tile235 routeAC/BC preReq still married,interest >60 
		    panel.setVisible(false);
		    panel.remove(c1);
		    panel.remove(c2);
		    text.append ("Your family is the living definition of happily ever after, but does happily ever after include a little bundle of joy?\nIt'll be hard rasing a child, but worth it! You can just imagine it, watching your baby girl or boy take his or her first steps towards you...\n Raising a child takes resources and attention, more than you have in your schedule! Besides, your family is the perfect size now!");
		    c1= new JButton("Okay!");
		    c2= new JButton("Nope.");
		    if (buffOne.getAff()>175||stuOne.getAff()>175||smartOne.getAff()>175||preOne.getAff()>175||workOne.getAff()>175||royOne.getAff()>175){
			panel.add(c1);}
		    panel.add(c2);
		    panel.setVisible(true);
		    c1.addActionListener(new YC2());
		    c2.addActionListener(new NC2());
		    i=D;//stop
		}
	    }

	    if(((a.getTile()==320)&&( a.getRoute().contains("C")))||((a.getTile()==235)&&( a.getRoute().contains("D")))) {

		//tile320/235 routeAD/BD/ACEGI/ACEGJ/ACEH/ACFGI/ACFGJ/ACFH preReq money>??? 

		panel.setVisible(false);
		panel.remove(c1);
		panel.remove(c2);
		text.append (" Your friend invites you to a car show, where you see all the latest models... and one just happens to catch your eye! Buying it's only a signature away...\n Sign and drive it away into the horizon! I'm sick of public transportation, with all its waiting and grime! Time for me to get my own ride!.\nWill it be worth it? Statistically, I know the most travel injuries come from cars... Refueling it will cost more than public transportation, too!");
		c1= new JButton("Okay!");
		c2= new JButton("Nope.");
		if (person.getMoo()>2000){
		    panel.add(c1);}
		panel.add(c2);
		panel.setVisible(true);
		c1.addActionListener(new Car());
		c2.addActionListener(new Bus());
		i=D;//stop
	    }
	 
	    if(((a.getTile()==345)&&( a.getRoute().contains("C")))||((a.getTile()==255)&&(a.getRoute().contains("D")))){
		//tile345/255 routeADL/BDL/ACEGI/ACEGJK/ACEHK/ACFGIK/ACFGJK/ACFHK/ACEGIL/ACEGJL/ACEHL/ACFGIL/ACFGJL/ACFHL preReq $$>
		panel.setVisible(false);
		panel.remove(c1);
		panel.remove(c2);
		text.append ("You've had this business idea for years, just simmering in your head. It's now or never. Why not embrace the idea and make millions? What do you have to lose?\nGo for it! I have a gut feeling that it won't fail. Time to bring home the big bucks and make myself a name that'll go down in history! I can't wait to be my own boss!\nAm I sure it's not just a phase? Where else would all this confidence come out of? If it fails, I'll be bankrupt, and there are plenty of holes in my plan I didn't think through... It's not worth the risk.");
		c1= new JButton("Okay!");
		c2= new JButton("Nope.");
		if (person.getMoo()>1000 && person.getInt()>75){
		    panel.add(c1);}
		panel.add(c2);
		panel.setVisible(true);
		c1.addActionListener(new Ybn());
		c2.addActionListener(new Nbn());
		i=D;//stop
	    }
		
	    if(a.getTile()==255){
		//tile routeADK/BDK preReq $$>??
		if (a.getRoute().contains("D") && a.getRoute().contains("K")){
		    panel.setVisible(false);
		    panel.remove(c1);
		    panel.remove(c2);
		    text.append (" You're at the doctor's office, waiting and flipping through magazines when you come across an ad for a vacation! Should you put everything behind you and have the journey of your life around the world?\nYes! My job can wait and my family will support me without a doubt! My bags are packed and I'm ready to go! ...Right after this appointment. \nWhat would your boss say?! It would be a great experience, but you would be missing your family, too. Missing your mom's apple pie and red velvet cake is not worth it. All you ever wanted is at home!");
		    c1= new JButton("Okay!");
		    c2= new JButton("Nope.");
		    if (person.getMoo()>1500 && person.getStr()>75){
			panel.add(c1);}
		    panel.add(c2);
		    panel.setVisible(true);
		    c1.addActionListener(new Ytr());
		    c2.addActionListener(new Ntr());
		    i=D;//stop
		}
	
	    }
	    i++;
	}
	return D;
    }
    public void changeCal(Player a){
	if (a.getTile()<=31){

	    try {
		mon = ImageIO.read(new File("mon1.jpg"));
	    } catch (IOException e) {
	    }
	}
	else if (a.getTile()<=59){

	    try {
		mon = ImageIO.read(new File("mon2.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=89){

	    try {
		mon = ImageIO.read(new File("mon3.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=120){

	    try {
		mon = ImageIO.read(new File("mon4.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=152){

	    try {
		mon = ImageIO.read(new File("mon5.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=181){

	    try {
		mon = ImageIO.read(new File("mon6.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=212){

	    try {
		mon = ImageIO.read(new File("mon7.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=243){

	    try {
		mon = ImageIO.read(new File("mon8.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=273){

	    try {
		mon = ImageIO.read(new File("mon9.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=304){

	    try {
		mon = ImageIO.read(new File("mon10.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=334){

	    try {
		mon = ImageIO.read(new File("mon11.jpg"));
	    } catch (IOException e) {
	    }
	}

	else if (a.getTile()<=365){

	    try {
		mon = ImageIO.read(new File("mon12.jpg"));
	    } catch (IOException e) {
	    }
	}
    

    JLabel calLabel = new JLabel(new ImageIcon(mon));

    calpan.add(calLabel);
    frame.getContentPane().add(BorderLayout.CENTER,calpan);
    calpan.setVisible(true);
}

    class Mar implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("C");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Sing implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("D");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class YC1 implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("E");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class NC1 implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("F");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Hou implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("G");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Apt implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("H");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class YC2 implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("I");

	}
    }
    class NC2 implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("J");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Car implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("K");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Bus implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("L");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Ybn implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("M");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Nbn implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("N");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Ytr implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("O");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
    class Ntr implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("P");
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	}
    }
   
        
    public void turn(Player a){
     	move(a);
	int e= (int)(Math.random() *201);
	text.append("\n"+a.playEv(e));
	turns++;
	// 	//move character in gui as well<--------- !!
   
    }
    public String calcScore(Player a){
    	int score=0;
    	String ns="";
    	score+= a.getHappi()*50;
    	score+= a.getMoo()*50;
    	if (a.getRoute().contains("A")){//SCHOOL
    	    score+=250;
	}
    	if (a.getRoute().contains("B")){//WORK
    	    score+=100;
	}
    	if (a.getRoute().contains("C")){//MARRIAGE
    	    score+=1000;
	}
    	if (a.getRoute().contains("D")){//SINGLE
    	    score-=500;
	}
    	if (a.getRoute().contains("E")){//CHILD1
    	    score+=500;
	}
    	if (a.getRoute().contains("F")){//NO CHILD
    	    score-=100;
	}
    	if (a.getRoute().contains("G")){//HOUSE
    	    score+=500;
	}
    	if (a.getRoute().contains("H")){//NO HOUSE
    	    score-=100;
	}
    	if (a.getRoute().contains("I")){//CHILD2
    	    score+=250;
	}
    	if (a.getRoute().contains("J")){//NO CHILD2
    	    score-=100;
	}
    	if (a.getRoute().contains("K")){//CAR
    	    score+=200;
	}
    	if (a.getRoute().contains("L")){//NO CAR
    	    score-=100;
	}
    	if (a.getRoute().contains("M")){//BUSINESS
    	    score+=600;
	}
    	if (a.getRoute().contains("N")){//NO BUSINESS
    	    score-=200;
	}
    	if (a.getRoute().contains("O")){//TRAVEL
    	    score+=1000;
	}
    	if (a.getRoute().contains("P")){//NO TRAVEL
    	    score-=400;
	}
    	ns= a.getName()+": "+ score;
    	return ns;
    }
    public String endLife(Player a){  
	if (a.getTile()==365){
	    gameOn=false;
	    return "Congratulations! You have lived your life and survived in the process! Now, the question is, have you lived it well?";}
	else if (a.getHP()<1){
	    gameOn=false;
	    return "You fell ill due to overworking or bad health and take to the bed until an angel collects you. Unfortunately, your life must draw to a close. Will you be remembered?";}
	else if (a.getHappi()<1){
     	    gameOn=false;
	    return "You sink under the pressure and into the deep crags of despair. You have not made the most of your life in terms of happiness, and for that, you bring it to the end.";}
	return "";
    }
    public void game(){
	showStats();
	dicebox.add(dice);
	dicebox.setBackground(Color.GRAY);
	frame.getContentPane().add(BorderLayout.EAST,dicebox);
	text.append("\nNow beginning your new life...");
	dice.addActionListener(new takeTurn());
	endLife(person);

    }
  
    class takeTurn implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    panel3.removeAll();
	    panel3.setVisible(false);
	    turn(person);
	    showStats();
	    if (person.getHP()>4){
		afterH();
	    }
	    else{
		afterHours.setVisible(false);
	    }
	    
	}
    }
    public void showStats(){
	stats.setText("");
	span.add(stats);
	stats.setEditable(false);
	frame.getContentPane().add(BorderLayout.WEST,span);
	span.setVisible(true);
	stats.append("Stats:\nName:" +person.getName()
		     +"\nHappiness:"+ person.getHappi()
		     +"\nHp:"+person.getHP()
		     +"\nMoney:"+ person.getMoo()
		     +"\nStrength:" +person.getStr()
		     +"\nIntelligence:" +person.getInt()
		     +"\nMouthMeter:" +person.getMo()
		     +"\nAttractiveness:" +person.getAtt()
		     +"\nTile:" +person.getTile()
		     +"\nRoute:" +person.getRoute()
		     );
		 
	span.setBackground(Color.darkGray);
    }
    
    public void afterH(){
	afterHours.add(A);
	afterHours.add(B);
	afterHours.add(C);
	afterHours.add(D);
	afterHours.add(E);
	afterHours.add(F);
	afterHours.add(G);
	afterHours.add(H);
	frame.getContentPane().add(BorderLayout.NORTH,afterHours);
	afterHours.setVisible(true);
	afterHours.setBackground(Color.PINK);
	afterHours.add(Q);
	A.addActionListener(new Gym());
	B.addActionListener(new Lib());
	C.addActionListener(new Sch());
	D.addActionListener(new Work());
	E.addActionListener(new Wal());
	F.addActionListener(new Mall());
	G.addActionListener(new BeP());
	H.addActionListener(new Dato());
    }
    class Gym implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    afterHours.setVisible(false);
	    afterHours.remove(A);
	    afterHours.remove(B);
	    afterHours.remove(C);
	    afterHours.remove(D);
	    afterHours.remove(E);
	    afterHours.remove(F);
	    afterHours.remove(G);
	    afterHours.remove(H);
	    afterHours.remove(Q);
	    text.append(AH.gym(person, buffOne,preOne,workOne));
	    showStats();
	    frame.getContentPane().add(BorderLayout.CENTER,panel3);

	    BufferedImage gympic = null;
	    try {
		gympic = ImageIO.read(new File("Gym.jpg"));
	    } catch (IOException e) {
	    }

	    JLabel picLabel = new JLabel(new ImageIcon(gympic));

	    panel3.add(picLabel);

	    panel3.setVisible(true);
	}
    }
    class Lib implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    afterHours.setVisible(false);
	    afterHours.remove(A);
	    afterHours.remove(B);
	    afterHours.remove(C);
	    afterHours.remove(D);
	    afterHours.remove(E);
	    afterHours.remove(F);
	    afterHours.remove(G);
	    afterHours.remove(H);
	    afterHours.remove(Q);
	    text.append(AH.library(person,smartOne,stuOne));
	    showStats();

	    BufferedImage libpic = null;
	    try {
		libpic = ImageIO.read(new File("Library.jpg"));
	    } catch (IOException e) {
	    }

	    JLabel picLabel = new JLabel(new ImageIcon(libpic));

	    panel3.add(picLabel);

	    panel3.setVisible(true);
	}
    }
    class Sch implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    afterHours.setVisible(false);
	    afterHours.remove(A);
	    afterHours.remove(B);
	    afterHours.remove(C);
	    afterHours.remove(D);
	    afterHours.remove(E);
	    afterHours.remove(F);
	    afterHours.remove(G);
	    afterHours.remove(H);
	    afterHours.remove(Q);
	    text.append(AH.school(person,stuOne)); 
	    showStats();

	    BufferedImage schpic = null;
	    try {
		schpic = ImageIO.read(new File("School.jpg"));
	    } catch (IOException e) {
	    }

	    JLabel picLabel = new JLabel(new ImageIcon(schpic));

	    panel3.add(picLabel);

	    panel3.setVisible(true);
	}
    }
    class Work implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    afterHours.setVisible(false);
	    afterHours.remove(A);
	    afterHours.remove(B);
	    afterHours.remove(C);
	    afterHours.remove(D);
	    afterHours.remove(E);
	    afterHours.remove(F);
	    afterHours.remove(G);
	    afterHours.remove(H);
	    afterHours.remove(Q);
	    text.append(AH.work(person,workOne));
	    showStats();

	    BufferedImage worpic = null;
	    try {
		worpic = ImageIO.read(new File("Office.jpg"));
	    } catch (IOException e) {
	    }

	    JLabel picLabel = new JLabel(new ImageIcon(worpic));

	    panel3.add(picLabel);

	    panel3.setVisible(true);
	}
    }
    class Wal implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    afterHours.setVisible(false);
	    afterHours.remove(A);
	    afterHours.remove(B);
	    afterHours.remove(C);
	    afterHours.remove(D);
	    afterHours.remove(E);
	    afterHours.remove(F);
	    afterHours.remove(G);
	    afterHours.remove(H);
	    afterHours.remove(Q);
	    text.append(AH.walk(person,royOne));
	    showStats();

	    BufferedImage walkpic = null;
	    try {
		walkpic = ImageIO.read(new File("Walk.jpg"));
	    } catch (IOException e) {
	    }

	    JLabel picLabel = new JLabel(new ImageIcon(walkpic));

	    panel3.add(picLabel);
	    panel3.setVisible(true);
	}
    }
    class Mall implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    afterHours.setVisible(false);
	    afterHours.remove(A);
	    afterHours.remove(B);
	    afterHours.remove(C);
	    afterHours.remove(D);
	    afterHours.remove(E);
	    afterHours.remove(F);
	    afterHours.remove(G);
	    afterHours.remove(H);
	    afterHours.remove(Q);
	    text.append(AH.mall(person,preOne,workOne,buffOne));
	    showStats();

	    BufferedImage mallpic = null;
	    try {
		mallpic = ImageIO.read(new File("Mall.jpg"));
	    } catch (IOException e) {
	    }

	    JLabel picLabel = new JLabel(new ImageIcon(mallpic));

	    panel3.add(picLabel);
	    panel3.setVisible(true);
	}
    }
    class BeP implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    afterHours.setVisible(false);
	    afterHours.remove(A);
	    afterHours.remove(B);
	    afterHours.remove(C);
	    afterHours.remove(D);
	    afterHours.remove(E);
	    afterHours.remove(F);
	    afterHours.remove(G);
	    afterHours.remove(H);
	    afterHours.remove(Q);
	    text.append(AH.beautySalon(person,preOne,smartOne)); 
	    showStats();

	    BufferedImage bspic = null;
	    try {
		bspic = ImageIO.read(new File("BeautySalon.jpg"));
	    } catch (IOException e) {
	    }

	    JLabel picLabel = new JLabel(new ImageIcon(bspic));

	    panel3.add(picLabel);
	    panel3.setVisible(true);
	}
    }
    class Dato implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    afterHours.setVisible(false);
	    afterHours.remove(A);
	    afterHours.remove(B);
	    afterHours.remove(C);
	    afterHours.remove(D);
	    afterHours.remove(E);
	    afterHours.remove(F);
	    afterHours.remove(G);
	    afterHours.remove(H);
	    afterHours.remove(Q);
	    if (buffOne.getMet()){
		D1=new JButton(buffOne.getName());}
	    if(stuOne.getMet()){
		D2=new JButton(stuOne.getName());}
	    if (smartOne.getMet()){
		D3=new JButton(smartOne.getName());}
	    if(preOne.getMet()){
		D4=new JButton(preOne.getName());}
	    if (workOne.getMet()){
		D5=new JButton(workOne.getName());}
	    if(royOne.getMet()){
		D6=new JButton(royOne.getName());}
	    afterHours.add(D1);
	    afterHours.add(D2);
	    afterHours.add(D3);
	    afterHours.add(D4);
	    afterHours.add(D5);
	    afterHours.add(D6);
	    afterHours.setVisible(true);
	    showStats();
	    D1.addActionListener(new gymD());//buff
	    D2.addActionListener(new libD());//smart
	    D3.addActionListener(new schD());//student
	    D4.addActionListener(new worD());//work
	    D5.addActionListener(new walD());//royals
	    D6.addActionListener(new malD());//pretty

	}
	class gymD implements ActionListener{
	    public void actionPerformed(ActionEvent event){
		afterHours.setVisible(false);
		afterHours.remove(D1);
		afterHours.remove(D2);
		afterHours.remove(D3);
		afterHours.remove(D4);
		afterHours.remove(D5);
		afterHours.remove(D6);
		if (calcAff(buffOne)>30){}
	    }
	}
	class libD implements ActionListener{
	    public void actionPerformed(ActionEvent event){
		afterHours.setVisible(false);
		afterHours.remove(D1);
		afterHours.remove(D2);
		afterHours.remove(D3);
		afterHours.remove(D4);
		afterHours.remove(D5);
		afterHours.remove(D6);
		if (calcAff(smartOne)>30){}

	    }
	}
	class schD implements ActionListener{
	    public void actionPerformed(ActionEvent event){
		afterHours.setVisible(false);
		afterHours.remove(D1);
		afterHours.remove(D2);
		afterHours.remove(D3);
		afterHours.remove(D4);
		afterHours.remove(D5);
		afterHours.remove(D6);
		if (calcAff(stuOne)>30){}

	    }
	}
	class worD implements ActionListener{
	    public void actionPerformed(ActionEvent event){
		afterHours.setVisible(false);
		afterHours.remove(D1);
		afterHours.remove(D2);
		afterHours.remove(D3);
		afterHours.remove(D4);
		afterHours.remove(D5);
		afterHours.remove(D6);
		if (calcAff(workOne)>30){}

	    }
	}
	class walD implements ActionListener{
	    public void actionPerformed(ActionEvent event){
		afterHours.setVisible(false);
		afterHours.remove(D1);
		afterHours.remove(D2);
		afterHours.remove(D3);
		afterHours.remove(D4);
		afterHours.remove(D5);
		afterHours.remove(D6);
		if (calcAff(royOne)>50){}


	    }
	}
	class malD implements ActionListener{
	    public void actionPerformed(ActionEvent event){
		afterHours.setVisible(false);
		afterHours.remove(D1);
		afterHours.remove(D2);
		afterHours.remove(D3);
		afterHours.remove(D4);
		afterHours.remove(D5);
		afterHours.remove(D6);
		if (calcAff(preOne)>30){
		}
	    }
	}
	public int calcAff(Character a){
	    int I=0;   
	    if (a instanceof Buffy){
		I+= person.getStr()-a.getStr();
		I+=(int)(( person.getAtt()-a.getAtt())/3);
		I+=a.getAff();
	    }
	    if (a instanceof Nerd){
		I+= person.getInt()-a.getInt();
		I+=(int)(( person.getMo()-a.getMo())/3);
		I+=a.getAff();
	    }
	    if (a instanceof Pretty){
		I+= person.getAtt()-a.getAtt();
		I+= (int)((person.getMoo()-1000)/4);
		I+=a.getAff();
	    }
	    if (a instanceof Workaholic){
		I+= person.getMo()-a.getMo();
		I+= (int)((person.getMoo()-1000)/3);
		I+=a.getAff();
	    }
	    if (a instanceof Student){
		I+= person.getInt()-a.getInt();
		I+=(int)(( person.getAtt()-a.getAtt())/3);
		I+=(int)(( person.getMo()-a.getMo())/4);
		I+=a.getAff();
	    }
	
	    if (a instanceof Royals){
		I+= person.getAtt()-a.getAtt();
		I+=(int)(( person.getMo()-a.getMo())/4);
		I+=(int)((person.getInt()-a.getInt())/4);
		I+=a.getAff();
	    }
	    return I; 
	}
    }

    public static void main( String[] args ) {
	Gooey gui= new Gooey();
	gui.pregame();    

    }

    
}
