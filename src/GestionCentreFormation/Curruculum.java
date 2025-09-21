package GestionCentreFormation;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Curruculum {

    //Varaiables de la classe
    private String id;
    private Map<String,Integer> Mod_Coef = new HashMap<String,Integer>();

    //Constructeur avec des parametres

    public Curruculum(String id, Map<String,Integer> Mod_Coef){
        this.id = id;
        this.Mod_Coef.putAll(Mod_Coef);
    }

    //Constructeur sans parametres

    public Curruculum(){

    }

    //Getteur Id
    public String getId(){
        return id;
    }
    
    //Setteur Id
    public void setId(String id){
        this.id = id;
    }

    //Getteur Map
    public Map<String,Integer> getMod_Coef(){
        return Mod_Coef;
    }

    //Setteur Map
    public void setMod_Coef(Map<String,Integer> Mod_Coef){
        this.Mod_Coef.putAll(Mod_Coef);
    }

    //Ajouter un nouveau module et son coefficient

    public void addModCoef(String mod, int coef){
        this.Mod_Coef.put(mod.toUpperCase(), coef);
    }

    //Récupérer le coefficient du module mod passé en paramétre

    public int getCoef_mod(String mod){
        return this.Mod_Coef.get(mod.toUpperCase());
    }

    //Retourner un ensemble avec tous les noms des modules

    public Set<String> getModSet(){
        return Mod_Coef.keySet();
    }

    //override la methode toString

    public String toString(){

        return "Curruculum [ id=  "+ id +" ,  Mod coef "+Mod_Coef+"]";

    }

}
