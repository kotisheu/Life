::::::::::::::::::::::
::::::::BETA::::::::::
::::v.VERYEARLY:::::::
::::::::::::::::::::::

//import keyboard/cs1/java.util/swing/???
public class beginLife{
   
// insert gui board stuff images (...)

  private Buffy buffOne= new Buffy(person);
  private Student stuOne= new Student(person);
  private Nerd smartOne= new Nerd(person);
  private Pretty preOne= new Pretty(person);
  private Workaholic workOne= new Workaholic(person);
  private Royal royOne= new Royal(person);
  private Player person;

  
  
  //Fuctions
  public int rollDice(){
    return (int)(Math.random()* 7)
  }
  public int move(Player a){
    int D= rollDice();
    int i=0;
    while( i<D){
    a.setTile(a.getTile()+ 1);
      if(a.getTile()==200 && a.getRoute().contains(A)||a.getRoute().contains(B)){
      Branchess.marry();
      i=D;//stop
      }
      // repeaaaaaaaaaaaaaat ^
      i++;
    }
    return D;
  }
  public void turn(Player a){
    move(a);
    int e= (int)(Math.random() *201);
    System.out.println(a.playEv(e));
   //move character in gui as well<--------- !!
   
  }
public String ___ calcScore(Player a){
 int score;
 String ns="";
 score+= a.gethappiness*50;
 score+= a.getmoo*50;
    if (a.getroute().contains(A)){//SCHOOL
    score+=250
    }
    if (a.getroute().contains(B)){//WORK
     score+=100
    }
    if (a.getroute().contains(C)){//MARRIAGE
     score+=1000
    }
    if (a.getroute().contains(D)){//SINGLE
    score-=500
    }
    if (a.getroute().contains(E)){//CHILD1
     score+=500
    }
    if (a.getroute().contains(F)){//NO CHILD
    score-=100
    }
    if (a.getroute().contains(G)){//HOUSE
     score+=500
    }
    if (a.getroute().contains(H)){//NO HOUSE
    score-=100
    }
    if (a.getroute().ontains(I)){//CHILD2
     score+=250
    }
    if (a.getroute().contains(J)){//NO CHILD2
    score-=100
    }
    if (a.getroute().contains(K)){//CAR
     score+=200
    }
    if (a.getroute().contains(L)){//NO CAR
    score-=100
    }
    if (a.getroute().contains(M)){//BUSINESS
     score+=600
    }
    if (a.getroute().contains(N)){//NO BUSINESS
    score-=200
    }
    if (a.getroute().contains(O)){//TRAVEL
     score+=1000
    }
    if (a.getroute().contains(P)){//NO TRAVEL
    score-=400
    }
    ns= a.getname()+": " score;
    return ns;
}
  public String endLife(){  
  if (person.getTile()==250(???)){
    gameOn=false;
    return "Congratulations! You have lived your life and survived in the process! Now, the question is, have you lived it well?"}
  else if (person.getHp()<1){
    gameOn=false;
    return "You fell ill due to overworking or bad health and take to the bed until an angel collects you. Unfortunately, your life must draw to a close. Will you be remembered?"}
  else if (person.getHappi()<1){
    gameOn=false;
    return "You sink under the pressure and into the deep crags of despair. You have not made the most of your life in terms of happiness, and for that, you bring it to the end."}
    //EACH SHOULD RETURN TEXT THAT CORRESPONDS TO HOW GAME ENDED ( IE, " Congrats ~~~" or " You couldn't take the pressure and suicided"
                    //or "You fell ill and died"

   public static void main {String [] args){
 //PREGAME 
  String s;
  s=" Welcome to the beginning of your new life! Let's see how sucessful you are this time.\n";
  s+="What would you like your name to be?";
  System.out.print(s);
  String n= in.readLine();
  s=" Hmm, interesting. Now, would you like to be male or female?";
  System.out.print(s);
  String g= in.readLine();
  boolean m;
  if (g== "male"){
    m=false;}]
  else if ( g=="female"){
    m=true;
  }
  person= Player( n, m); //<- CREATE THIS CONSTRU.
  s="Now for the final question:\n";
  s+="Would you like to attend college or begin work?";
  System.out.print(s);
  String r= in.readLine();
  if(r==" college"){
    person.setRoute("A");
    }
  else{
    person.setRoute("B");
    }
  s="Thank you for your input, we shall begin creating your new life immediately.";
  System.out.print(s);
  //STARTGAME
  boolean gameOn = true;
  int turns;
  while(gameOn==true){
    //TURNS- CREATE DICE,MOVE, MINIEVENT TRIGGER,
    turn(person);
  if (person.getHp()>5){
  //choose place
  s=" Choose place: gym, work, etcccc."
  System.out.print (s);
  String p=in.readLine();
   if ( p== "gym" )
      afterHours.gym(person, buffOne, preOne, workOne); //isthishowyoucallthis .....
   else if ( p == "library") 
      afterHours.library(person, smartOne, stuOne);
   else if ( p == "mall" )
      afterHours.mall(person, preOne, workOne, buffOne);
   else if ( p == "beauty salon" )
      afterHours.beautySalon(person, preOne, smartOne);
   else if ( p == "work" )
      afterHours.work(person, workOne);
   else if ( p == "walk" )
      afterHours.walk(person, royOne);
   //^ repeaaaaaat
  }

    turns ++;
    endlife();
    //repeat until cond is met.
    calcScore(person,turns)
}
}


