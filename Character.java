public class Character {

  protected String _name;
  protected String _route;
  protected int _tileCtr;
  protected int _happi;//happiness
  protected int _str;//strength
  protected int _int;//intelligence
  protected int _mm;//mouth meter--how well can you talk?
  protected int _aff;//affinity
  protected int _att;//attractiveness
  protected int _hp;//health, needed to perform certain activities
  protected double _moo;//money
  protected boolean _hasMet;
  protected boolean _gender;//let true = girl, false = boy
  
  public Character() {
  }
  
  public String getName() {
    return _name;
  }
  
  public String setName(String newVal) {
    String oldName = _name;
    _name = newVal;
    return oldName;
  }
  
  public String getRoute() {
    return _route;
  }
  
  public String setRoute(String newVal) {
    String oldRoute = _route;
    _route = newVal;
    return oldRoute;
  }
  
  public int getTile() {
    return _tileCtr;
  }
  
  public int setTile(int newVal) {
    int oldTile = _tileCtr;
    _tileCtr = newVal;
    return oldTile;
  }
  
    public int getHappi() {
    return _happi;
  }
  
  public int setHappi(int newVal) {
    int oldHappi = _happi;
    _happi = newVal;
    return oldHappi;
  }

  public int getStr() {
    return _str;
  }

  public int setStr(int newVal) {
    int oldStr = _str;
    _str = newVal;
    return oldStr;
  }

  public int getInt() {
    return _int;
  }

  public int setInt(int newVal) {
    int oldInt = _int;
    _int = newVal;
    return oldInt;
  }
  
  public int getMo() {
    return _mm;
  }

  public int setMo(int newVal) {
    int oldMo = _mm;
    _mm = newVal;
    return oldMo;
  }
  
  public int getAff() {
    return _aff;
  }

  public int setAff(int newVal) {
    int oldAff = _aff;
    _aff = newVal;
    return oldAff;
  }
  
  public int getAtt() {
    return _att;
  }

  public int setAtt(int newVal) {
    int oldAtt = _att;
    _att = newVal;
    return oldAtt;
  }

  public int getHP() {
    return _hp;
  }

  public int setHP(int newVal) {
    int oldHP = _hp;
    _hp = newVal;
    return oldHP;
  }

  public double getMoo() {
    return _moo;
  }

  public double setMoo(double newVal) {
    double oldMoo = _moo;
    _moo = newVal;
    return oldMoo;
  }

  public boolean getMet() {
    return _hasMet;
  }

  public boolean setMet(boolean newVal) {
    boolean oldMet = _hasMet;
    _hasMet = newVal;
    return oldMet;
  }
  
  public boolean getGen() {
    return _gender;
  }

}
