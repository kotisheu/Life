import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;

public class Gooey extends JFrame{
    String name=""; 
    boolean gen= false;
    Player person;

    JFrame frame=new JFrame(); 
    JButton c1= new JButton("Yes");
    JButton c2=new JButton("No");
    JButton enter=new JButton("Enter");
    JPanel panel= new JPanel();
    JPanel panel2= new JPanel();
    JTextArea text= new JTextArea(10, 50);
    JTextField playbox= new JTextField(20);
    JScrollPane scroller= new JScrollPane(text);
    public Gooey(){
    }


    public void pregame() {
      
	
	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	text.setLineWrap(true);
	frame.setTitle( "Life: The game" );//title?
        frame.setSize( 1000,800);  
        frame.setLocation( 100, 100 );
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE ); 
	panel.setBackground(Color.pink);
	panel2.setBackground(Color.white);
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
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	    text.append ("\nNow for the final question:\nWould you like to attend college or begin work?");
	    c1= new JButton("College");
	    c2= new JButton("Work");
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
	    panel.setVisible(false);
	    panel.remove(c1);
	    panel.remove(c2);
	    text.append ("\nNow for the final question:\nWould you like to attend college or begin work?");
	    c1= new JButton("College");
	    c2= new JButton("Work");
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
	}
    }
    class Wor implements ActionListener{
	public void actionPerformed(ActionEvent event){
	    person.setRoute("B");
	}
    }

    // //Fuctions
    // public int rollDice(){
    // 	return (int)(Math.random()* 7);
    // 	    }
    // public int move(Player a){
    // 	int D= rollDice();
    // 	int i=0;
    // 	while( i<D){
    // 	    a.setTile(a.getTile()+ 1);
    // 	    // if(a.getTile()==200 && a.getRoute().contains(A)||a.getRoute().contains(B)){
    // 	    // 	Branchess\.marry();
    // 	    // 	i=D;//stop
    // 	    // }
    // 	    // // repeaaaaaaaaaaaaaat ^
    // 	    i++;
    // 	}
    // 	return D;
    // }
    // public void turn(Player a){
    // 	move(a);
    // 	int e= (int)(Math.random() *201);
    // 	System.out.println(a.playEv(e));
    // 	//move character in gui as well<--------- !!
   
    // }
    // public String calcScore(Player a){
    // 	int score;
    // 	String ns="";
    // 	score+= a.getHap*50;
    // 	score+= a.getMoo*50;
    // 	if (a.getRoute().contains(A)){//SCHOOL
    // 	    score+=250;
    // 		}
    // 	if (a.getRoute().contains(B)){//WORK
    // 	    score+=100;
    // 		}
    // 	if (a.getRoute().contains(C)){//MARRIAGE
    // 	    score+=1000;
    // 		}
    // 	if (a.getRoute().contains(D)){//SINGLE
    // 	    score-=500;
    // 		}
    // 	if (a.getRoute().contains(E)){//CHILD1
    // 	    score+=500;
    // 		}
    // 	if (a.getRoute().contains(F)){//NO CHILD
    // 	    score-=100;
    // 		}
    // 	if (a.getRoute().contains(G)){//HOUSE
    // 	    score+=500;
    // 		}
    // 	if (a.getRoute().contains(H)){//NO HOUSE
    // 	    score-=100;
    // 		}
    // 	if (a.getRoute().ontains(I)){//CHILD2
    // 	    score+=250;
    // 		}
    // 	if (a.getRoute().contains(J)){//NO CHILD2
    // 	    score-=100;
    // 		}
    // 	if (a.getRoute().contains(K)){//CAR
    // 	    score+=200;
    // 		}
    // 	if (a.getRoute().contains(L)){//NO CAR
    // 	    score-=100;
    // 		}
    // 	if (a.getRoute().contains(M)){//BUSINESS
    // 	    score+=600;
    // 		}
    // 	if (a.getRoute().contains(N)){//NO BUSINESS
    // 	    score-=200;
    // 		}
    // 	if (a.getRoute().contains(O)){//TRAVEL
    // 	    score+=1000;
    // 		}
    // 	if (a.getRoute().contains(P)){//NO TRAVEL
    // 	    score-=400;
    // 		}
    // 	ns= a.getname()+": "+ score;
    // 	return ns;
    // }
    // public String endLife(Player a, Gooey b){  
    // 	if (a.getTile()==365){
    // 	    gameOn=false;}
    // 	else if (a.getHp()<1){
    // 	    gameOn=false;}
    // 	else if (a.getHappi()<1){
    // 	    gameOn=false;
    // 	}
    // }
  // private Buffy buffOne= new Buffy(person);
  // private Student stuOne= new Student(person);
  // private Nerd smartOne= new Nerd(person);
  // private Pretty preOne= new Pretty(person);
  // private Workaholic workOne= new Workaholic(person);
  // private Royal royOne= new Royal(person);
   public static void main( String[] args ) {
       Gooey gui= new Gooey();
       gui.pregame();
 
    

    }

}
