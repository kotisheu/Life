public class Branches{
  public Branches(person a){
     }
  public void marry(person a){ //tile200 routeA/B preReq interest with any character > 50
    /*choice1-marry-> Choose which character to marry,
    only accepts if that is the one with interest >50,
    need way to keep track*/
    a.setRoute(C);
    //choice2-nomarry
     a.setRoute(D);
     }
     
  public void child1(person a){ //tile2 routeAC/BC preReq still married,interest >60 
    /*choice1-yes
    a.setRoute(E);
    */choice2-no
     a.setRoute(F);
     }
     
     public void house(person a){ //tile routeACE/ACF/BCE/BCF preReq money> ???
    /*choice1-yes
    a.setRoute(G);
    */choice2-nom
     a.setRoute(H);
     }
     
     public void child2(person a){ //tile routeACEG/ACFG/BCEG/BCFG/ADKO/ADKP/ADLM/ADLN/BDKO/BDKP/BDLM/BDLN preReq stillmarried, interest > 70
    /*choice1-yes
    a.setRoute(I);
    */choice2-no
     a.setRoute(J);
     }
     
     public void car(person a){ //tile routeAD/BD/ACEGI/ACEGJ/ACEH/ACFGI/ACFGJ/ACFH preReq money>??? 
    /*choice1-yes
    a.setRoute(K);
    */choice2-no
     a.setRoute(L);
     }
     
     public void business(person a){ //tile routeADL/BDL/ACEGI/ACEGJK/ACEHK/ACFGIK/ACFGJK/ACFHK/ACEGIL/ACEGJL/ACEHL/ACFGIL/ACFGJL/ACFHL preReq 
    /*choice1-yes
    a.setRoute(M);
    */choice2-no
     a.setRoute(N);
     }
     
     public void travel(person a){ //tile routeADK/BDK preReq 
    /*choice1-yes
    a.setRoute(O);
    */choice2-no
     a.setRoute(P);
     }
     }
