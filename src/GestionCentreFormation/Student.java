package GestionCentreFormation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    
    //Variables

    private String id;
    private Curruculum myCurruculum;
    private Map<String,ArrayList<Double>> resultat = new HashMap<>();

    //Constructeur

    public Student(String id, Curruculum c,Map<String,ArrayList<Double>> resultat ){
        this.id = id;
        myCurruculum = c;
        this.resultat = new HashMap<>(resultat);
    }

    public Student(){

    }

    //override
    //@override

    public String toString(){
        return "Student [id = "+id+", my Curruculum = "+myCurruculum+",resultats = "+resultat+"]";
    }

    //getteur id
    public String getId(){
        return id;
    }

    //get curriculum

    public Curruculum getCurruculum(){
        return myCurruculum;
    }

    //Ajout dune note pour un module donné

    public Boolean setNoteMod(String Mod, Double note ){
        Mod = Mod.toUpperCase();
         Boolean init = false;
         ArrayList<Double> notes = new ArrayList<>();
         notes.add(note);

            if(resultat.containsKey(Mod)){
                resultat.put(Mod,notes);
                init = true;
            }

        
        return init;
    }

    //Calculer la moyenne du module s

    public Double moyenneMod(String mod, ArrayList<Double> Mod_Coef){
            Double moyenne = 0.0;
            Double cumulNotes = 0.0;

            for(Double note : Mod_Coef){

                cumulNotes += note;

            }

            moyenne = cumulNotes / Mod_Coef.size();
            return moyenne;
    }

    //Calculer la moyenne generale

    public Double moyenneGenerale(Student etudiantz, Curruculum CurriculumObj){

        Double moyenneGenerale = 0.0;
        //int nombreDeModules = resultat.size();
        Double sommeMoyenne = 0.0;
        Double sommeCoef = 0.0;

        for(Map.Entry<String,ArrayList<Double>> entry : resultat.entrySet()){

            sommeMoyenne += (etudiantz.moyenneMod(entry.getKey(), entry.getValue()) * CurriculumObj.getCoef_mod(entry.getKey()));
            sommeCoef += CurriculumObj.getCoef_mod(entry.getKey());
            
        }
        if( sommeCoef == 0 ){sommeCoef = 1.0; }
        moyenneGenerale = sommeMoyenne / sommeCoef ; 

        return moyenneGenerale;

    }

    //Comparer la moyenne générale de l'étudiant avec celle passée en parametre

    //public int CompareTo(){

   // }

}
