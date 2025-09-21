package Map;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Prince{

    String cle = "";
    String valeur = "";
    private static Scanner val = new Scanner(System.in);
    Map<String,String> mpsaisie = new HashMap<>();

public Prince(){

}

public Map<String,String> saisie(){
    
    
    message(Corp.mcle);
    cle = val.nextLine();
    message(Corp.mvaleur);
    valeur = val.nextLine();
    mpsaisie.put(cle,valeur);
    return mpsaisie;
}

public String continuer(){
  
   
    System.out.println("Souhaitez vous continuer :");
    Corp.reponse = val.nextLine();
    return Corp.reponse;
}

public void message(String message){

    System.out.println(message);

}

public void affiche(Map<String,String> countries){

    for(Map.Entry<String,String> actuelcouple : countries.entrySet()){
        System.out.println(actuelcouple.getKey() + "  ->  " + actuelcouple.getValue());
    }
}

public void search(String pays, Map<String,String> mamap){
    String capitale = mamap.get(pays);
    System.out.println(pays +" -> " +capitale);

}

public void stock(Map<String,String> mamape){
    mpsaisie.putAll(mamape);
}


}