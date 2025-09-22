package GestionCentreFormation;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Exec {

    public static void main(String[] args){

        Double moyenneEtudiant = 0.0;
        Map<String,ArrayList<Double>> resultats = new HashMap<>();

        //Création de la formation avec ses modules
        Curruculum formation1 = new Curruculum();
        formation1.addModCoef("PHYSIQUE", 2);
        formation1.addModCoef("MATH", 5);
        formation1.addModCoef("ANGLAIS", 2);

        //Création d'un étudiant et assignation vers une formation
        Student etudiant1 = new Student("IDETUDIANT001",formation1,resultats);
        Boolean res =  false;
        res = etudiant1.setNoteMod("PHYSIQUE",15.0);
        System.out.println("le module est-il été ajouté = "+res);
        res = etudiant1.setNoteMod("MATH", 19.0);
        System.out.println("le module est-il été ajouté = "+res);
        res = etudiant1.setNoteMod("ANGLAIS", 18.0);
        System.out.println("le module est-il été ajouté = "+res);
        
        moyenneEtudiant = etudiant1.moyenneGenerale(etudiant1,formation1 );

        System.out.println("La moyenne generale de l'étudiant est : "+moyenneEtudiant);

    }
    
}
