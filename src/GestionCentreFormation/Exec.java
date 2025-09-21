package GestionCentreFormation;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Exec {

    public static void main(String[] args){

        Double moyenneEtudiant = 0.0;
        Map<String,ArrayList<Double>> resultats = new HashMap<>();

        //Création d'une liste de modules avec leurs coefficient
        Map<String,Integer> listeModulesCoef = new HashMap<>();
        listeModulesCoef.put("PHYSIQUE",2);
        listeModulesCoef.put("MATH",5);
        listeModulesCoef.put("ANGLAIS",1);

        
        //Création de la formation avec ses modules
        Curruculum formation1 = new Curruculum("ETUDIANT001",listeModulesCoef);

        //ajout notes
        ArrayList<Double> listeNotes = new ArrayList<>();
        listeNotes.add(0,12.0);
        listeNotes.add(1,13.0);
        listeNotes.add(2,14.0);

        resultats.put("PHYSIQUE",listeNotes);
        resultats.put("MATH",listeNotes);
        resultats.put("ANGLAIS",listeNotes);

        //Création d'un étudiant et assignation vers une formation
        Student etudiant1 = new Student("IDETUDIANT001",formation1,resultats);


        Boolean res =  etudiant1.setNoteMod("PHYSIQUE", 10.0);
        etudiant1.setNoteMod("MATH", 19.0);
        etudiant1.setNoteMod("ANGLAIS", 15.0);
        System.out.println("le module est ajouté"+res);
        moyenneEtudiant = etudiant1.moyenneGenerale(etudiant1,formation1 );

        System.out.println("La moyenne generale de l'étudiant est : "+moyenneEtudiant);

    }
    
}
