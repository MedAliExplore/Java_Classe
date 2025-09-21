package Map;

import java.util.Map;
import java.util.HashMap;

public class Corp{



final static String mcle = "Merci de saisir ta clé : ";

final static String mvaleur = "Merci de saisir ta valeur : ";
static String reponse = "oui";
static Map<String,String> countries = new HashMap<>();


    public static void main(String[] args){ 
        
        
        Prince obj = new Prince();
        
       
        try{
        do{
        Map<String,String> lasaisie = obj.saisie();
        obj.affiche(lasaisie);
        obj.search("France",lasaisie);
        obj.stock(lasaisie);
        reponse = obj.continuer();
        }while(reponse.equals("oui"));
     }catch(Exception e){
        System.out.println("il ya une erreur quelques part");
    }
        obj.affiche(obj.mpsaisie);
    }


}
