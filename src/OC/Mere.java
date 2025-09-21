package OC;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;


public class Mere{

    List<String> maListe = new ArrayList<String>();

    

    public void affichemap(String pays,Map<String,String> country){

        System.out.println("La capitale du pays est -> "+country.get(pays));

    }



    public void stock(String mot){

        maListe.add(mot);

    }

    public void affiche(int i){

        System.out.println(maListe.get(i));

    }

    public void print(String mot){
        System.out.println(mot);
    }

    public void user(String valeur){

        System.out.println(valeur);

    }

    public void verification(int i){

        if(i > maListe.size()){
            print("Erreur, Merci de saisir un index inferieur");
        }
    }

}
