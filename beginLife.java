::::::::::::::::::::::
::::::::BETA::::::::::
::::v.VERYEARLY:::::::
::::::::::::::::::::::

//import keyboard/cs1/java.util/swing/???
public class beginLife{
// MODIFY TEXT, NEATIFY THIS
\\\\\\\\\\\\\\\\\\\
 \\\\\PREGAME\\\\\\\
  \\\\\\\\\\\\\\\\\\\
  Player person;
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
  
  
// insert gui board stuff images (...)
  //////////////
 //CHARACTERS//
//////////////
  Buffy buffOne= new Buffy(person);
  Student stuOne= new Student(person);
  Nerd smartOne= new Nerd(person);
  Pretty preOne= new Pretty(person);
  Workaholic workOne= new Workaholic(person);
  Royal royOne= new Royal(person);
  
  //Fuctions
  public int rollDice(){
    return (int)(Math.random()* 7)
  }
  public int move(Player a){
    int D= rollDice();
    a.setTile(a.getTile+ D);
    return D;
  }
  public void turn(Player a){
    move(a);
    if (person.getHp()>5){
      afterHours.choosePlace()// CREATE AFTERHOURS INTERFACE/ EACH PLACE AND THIS FUNCT. 
                              //EACH PLACE CONTAINS THE POSSIBLITITES FOR MEETING AND INTEREST.
    }
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
    ns= a.getname()+ score;
    return ns;
}
    
|||||||||||||  
||LIFEBEGIN||
|||||||||||||
 public void main start{String {}args){
  boolean gameOn = true;
  
  while(gameOn==true){
    //TURNS- CREATE DICE,MOVE, MINIEVENT TRIGGER,
    
    //(if (person.getHp()>3){AFTERHOURS(PLACESSS!! esp DATE( list of  other characters, 
    //named only if met/ interest over x, accept only if interest >??));}, MEETCHARACTER
    //CREATE (and note tiles/routes of)MAJOR EVENT "SPLITS", DIALOUGUES, CHOICES, GUI, AHHH
    endlife();
    //repeat until cond is met.
  public void endLife(){  
  if (person.getTile()==250(???)){
    gameOn=false;}
  else if (person.getHp()<1){
    gameOn=false;}
  else if (person.getHappi()<1){
    gameOn=false;}//EACH SHOULD RETURN TEXT THAT CORRESPONDS TO HOW GAME ENDED ( IE, " Congrats ~~~" or " You couldn't take the pressure and suicided"
                    //or "You fell ill and died"
  calcScore();// CREATE THIS,PRINTS OUT THE CALCULATIONS AS WELL.
  }


